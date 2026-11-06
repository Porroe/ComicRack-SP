package com.cyo.comicrack.storage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

/** Private seekable copies of documents. A lease prevents eviction during decoding. */
final class ArchiveCache {
    private final File directory;
    private final long sizeLimit;
    private final long maxIdleMillis = TimeUnit.DAYS.toMillis(7);
    private final LongSupplier clock;
    private final Object copyLock = new Object();
    private final Map<File, Integer> leases = new HashMap<>();
    private final Map<String, Integer> pinnedSources = new HashMap<>();
    private final Set<File> retired = new HashSet<>();
    private boolean initialized;

    ArchiveCache(File directory, long sizeLimit, LongSupplier clock) {
        this.directory = directory;
        this.sizeLimit = sizeLimit;
        this.clock = clock;
    }

    interface StreamSource {
        InputStream open() throws IOException;
    }

    ComicDocuments.ArchiveFile open(String source, String revision, StreamSource streamSource) throws IOException {
        String sourceKey = hash(source) + "-";
        File destination = revision == null ? null : new File(directory, sourceKey + hash(revision) + ".archive");
        synchronized (this) {
            initialize();
            if (destination != null) {
                ComicDocuments.ArchiveFile cached = find(destination);
                if (cached != null) return cached;
            }
        }
        synchronized (copyLock) {
            synchronized (this) {
                if (destination != null) {
                    removeOldRevisions(sourceKey, destination);
                    ComicDocuments.ArchiveFile cached = find(destination);
                    if (cached != null) return cached;
                }
            }
            return copy(destination, streamSource);
        }
    }

    synchronized Runnable pin(String source) {
        String sourceKey = hash(source);
        pinnedSources.merge(sourceKey, 1, Integer::sum);
        return () -> unpin(sourceKey);
    }

    private synchronized void unpin(String sourceKey) {
        pinnedSources.computeIfPresent(sourceKey, (key, count) -> count > 1 ? count - 1 : null);
    }

    private boolean isPinned(File file) {
        String name = file.getName();
        int separator = name.indexOf('-');
        return separator == 64 && pinnedSources.containsKey(name.substring(0, separator));
    }

    private void initialize() throws IOException {
        if (initialized) return;
        if (!directory.isDirectory() && !directory.mkdirs()) {
            throw new IOException("Cannot create the comic archive cache");
        }
        for (File file : listFiles()) {
            if (file.getName().endsWith(".part") || file.getName().startsWith("transient-")) {
                remove(file);
            }
        }
        makeRoom(0);
        initialized = true;
    }

    private ComicDocuments.ArchiveFile find(File file) throws IOException {
        if (!file.isFile() || retired.contains(file)) return null;
        if (!leases.containsKey(file) && !isPinned(file) && isExpired(file)) {
            remove(file);
            return null;
        }
        return lease(file, false);
    }

    private ComicDocuments.ArchiveFile copy(File destination, StreamSource streamSource) throws IOException {
        File partial = File.createTempFile("archive-", ".part", directory);
        boolean handedOff = false;
        try {
            long copied = 0;
            try (InputStream input = streamSource.open(); FileOutputStream output = new FileOutputStream(partial)) {
                byte[] buffer = new byte[128 * 1024];
                int count;
                long reserved = 0;
                while ((count = input.read(buffer)) != -1) {
                    copied += count;
                    if (copied > sizeLimit) {
                        throw new IOException("Comic exceeds the archive cache size limit");
                    }
                    if (copied > reserved) {
                        synchronized (this) {
                            if (!makeRoom(copied)) {
                                throw new IOException("The archive cache is full of comics in use");
                            }
                            // Only one copy can grow at a time, so the remaining free space is reserved.
                            reserved = sizeLimit - archiveBytes();
                        }
                    }
                    output.write(buffer, 0, count);
                }
            }
            synchronized (this) {
                File complete = destination;
                boolean transientCopy = destination == null || retired.contains(destination);
                if (transientCopy) {
                    complete = new File(directory, "transient-" + partial.getName() + ".archive");
                }
                Files.move(partial.toPath(), complete.toPath(), StandardCopyOption.ATOMIC_MOVE,
                        StandardCopyOption.REPLACE_EXISTING);
                ComicDocuments.ArchiveFile result = lease(complete, transientCopy);
                handedOff = true;
                return result;
            }
        } finally {
            if (!handedOff) partial.delete();
        }
    }

    private ComicDocuments.ArchiveFile lease(File file, boolean transientCopy) {
        file.setLastModified(clock.getAsLong());
        leases.merge(file, 1, Integer::sum);
        if (transientCopy) retired.add(file);
        return new ComicDocuments.ArchiveFile(file, () -> release(file));
    }

    private synchronized void release(File file) {
        Integer count = leases.get(file);
        if (count == null) return;
        if (count > 1) {
            leases.put(file, count - 1);
        } else {
            leases.remove(file);
            if (retired.remove(file)) {
                file.delete();
            } else {
                file.setLastModified(clock.getAsLong());
            }
        }
    }

    private void removeOldRevisions(String sourceKey, File current) throws IOException {
        for (File file : listFiles()) {
            if (file.getName().startsWith(sourceKey) && !file.equals(current)) {
                if (leases.containsKey(file)) {
                    retired.add(file);
                } else {
                    remove(file);
                }
            }
        }
    }

    private boolean makeRoom(long bytes) throws IOException {
        File[] files = listFiles();
        Arrays.sort(files, Comparator.comparingLong(File::lastModified));
        long total = archiveBytes();
        for (File file : files) {
            if (!file.getName().endsWith(".archive") || leases.containsKey(file) || isPinned(file)) continue;
            if (isExpired(file) || total + bytes > sizeLimit) {
                long length = file.length();
                remove(file);
                total -= length;
            }
        }
        return total + bytes <= sizeLimit;
    }

    private long archiveBytes() {
        long total = 0;
        for (File file : listFiles()) {
            if (file.getName().endsWith(".archive")) total += file.length();
        }
        return total;
    }

    private boolean isExpired(File file) {
        return clock.getAsLong() - file.lastModified() >= maxIdleMillis;
    }

    private File[] listFiles() {
        File[] files = directory.listFiles();
        return files == null ? new File[0] : files;
    }

    private static void remove(File file) throws IOException {
        Files.deleteIfExists(file.toPath());
    }

    private static String hash(String value) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(value.getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder(digest.length * 2);
            for (byte part : digest) {
                hex.append(Character.forDigit((part >> 4) & 15, 16));
                hex.append(Character.forDigit(part & 15, 16));
            }
            return hex.toString();
        } catch (NoSuchAlgorithmException exception) {
            throw new AssertionError(exception);
        }
    }
}
