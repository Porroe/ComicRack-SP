package com.cyo.comicrack.storage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.UriPermission;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.DocumentsContract;
import android.provider.OpenableColumns;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class ComicDocuments {
    private static final long ARCHIVE_CACHE_BYTES = 1024L * 1024 * 1024;
    private static Context appContext;
    private static ArchiveCache archiveCache;

    private ComicDocuments() {}

    public static void initialize(Context context) {
        appContext = context.getApplicationContext();
        // Wallpaper and sync use separate processes. Keep their eviction state independent.
        String processName = processName(context);
        File cacheDirectory = new File(appContext.getCacheDir(), processName.equals(context.getPackageName())
                ? "comic-archives" : "comic-archives-" + processName.replace(':', '-'));
        archiveCache = new ArchiveCache(cacheDirectory,
                ARCHIVE_CACHE_BYTES, System::currentTimeMillis);
    }

    private static String processName(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        ActivityManager manager = context.getSystemService(ActivityManager.class);
        java.util.List<ActivityManager.RunningAppProcessInfo> processes = manager.getRunningAppProcesses();
        if (processes != null) {
            for (ActivityManager.RunningAppProcessInfo process : processes) {
                if (process.pid == Process.myPid()) return process.processName;
            }
        }
        return "process-" + Process.myPid();
    }

    public static boolean isDocument(String source) {
        return source != null && source.startsWith("content://");
    }

    public static boolean hasReadGrant(String source) {
        if (!isDocument(source)) {
            return false;
        }
        Uri uri = Uri.parse(source);
        for (UriPermission grant : resolver().getPersistedUriPermissions()) {
            if (grant.isReadPermission() && grant.getUri().equals(uri)) {
                return true;
            }
        }
        return false;
    }

    public static Uri persistReadGrant(Intent result) {
        Uri uri = result == null ? null : result.getData();
        if (uri == null || !"content".equals(uri.getScheme())) {
            return null;
        }
        try {
            resolver().takePersistableUriPermission(uri, Intent.FLAG_GRANT_READ_URI_PERMISSION);
            return uri;
        } catch (SecurityException exception) {
            return null;
        }
    }

    public static String displayName(String source) {
        if (!isDocument(source)) {
            return source == null ? "" : new File(source).getName();
        }
        Uri uri = Uri.parse(source);
        if (DocumentsContract.isTreeUri(uri) && !DocumentsContract.isDocumentUri(appContext, uri)) {
            uri = DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
        }
        try (Cursor cursor = resolver().query(uri, new String[]{OpenableColumns.DISPLAY_NAME}, null, null, null)) {
            if (cursor != null && cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getString(0);
            }
        } catch (RuntimeException ignored) {
            // A provider can revoke access or go offline.
        }
        String fallback = uri.getLastPathSegment();
        return fallback == null ? "" : fallback;
    }

    public static boolean isComicName(String filename) {
        String name = filename.toLowerCase(Locale.ROOT);
        return name.endsWith(".cbz") || name.endsWith(".cbr") || name.endsWith(".cbp")
                || name.endsWith(".zip") || name.endsWith(".rar");
    }

    public static long lastModified(String source) {
        if (!isDocument(source)) {
            return source == null ? 0 : new File(source).lastModified();
        }
        try (Cursor cursor = resolver().query(Uri.parse(source),
                new String[]{DocumentsContract.Document.COLUMN_LAST_MODIFIED}, null, null, null)) {
            return cursor != null && cursor.moveToFirst() ? cursor.getLong(0) : 0;
        } catch (RuntimeException ignored) {
            return 0;
        }
    }

    public static void collectComics(String source, Collection<String> comics) {
        Uri tree = Uri.parse(source);
        if (!hasReadGrant(source) || !DocumentsContract.isTreeUri(tree)) {
            return;
        }
        ArrayDeque<String> pending = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        pending.add(DocumentsContract.getTreeDocumentId(tree));
        String[] columns = {DocumentsContract.Document.COLUMN_DOCUMENT_ID,
                DocumentsContract.Document.COLUMN_DISPLAY_NAME, DocumentsContract.Document.COLUMN_MIME_TYPE};
        while (!pending.isEmpty()) {
            String directory = pending.remove();
            if (!visited.add(directory)) {
                continue;
            }
            Uri children = DocumentsContract.buildChildDocumentsUriUsingTree(tree, directory);
            try (Cursor cursor = resolver().query(children, columns, null, null, null)) {
                while (cursor != null && cursor.moveToNext()) {
                    String documentId = cursor.getString(0);
                    String name = cursor.getString(1);
                    if (documentId == null || name == null || name.startsWith(".")) {
                        continue;
                    }
                    if (DocumentsContract.Document.MIME_TYPE_DIR.equals(cursor.getString(2))) {
                        pending.add(documentId);
                    } else if (isComicName(name)) {
                        comics.add(DocumentsContract.buildDocumentUriUsingTree(tree, documentId).toString());
                    }
                }
            } catch (RuntimeException ignored) {
                // Preserve the database records if the provider is temporarily unavailable.
            }
        }
    }

    public static InputStream openStream(String source) throws IOException {
        InputStream stream = isDocument(source) ? resolver().openInputStream(Uri.parse(source))
                : new FileInputStream(source);
        if (stream == null) {
            throw new IOException("Comic source is unavailable");
        }
        return stream;
    }

    public static Runnable pinArchive(String source) {
        return isDocument(source) ? archiveCache.pin(source) : null;
    }

    public static ArchiveFile openArchive(String source) throws IOException {
        if (!isDocument(source)) {
            return new ArchiveFile(new File(source), null);
        }
        return archiveCache.open(source, documentRevision(source), () -> openStream(source));
    }

    private static String documentRevision(String source) throws IOException {
        String[] columns = {DocumentsContract.Document.COLUMN_LAST_MODIFIED, OpenableColumns.SIZE};
        try (Cursor cursor = resolver().query(Uri.parse(source), columns, null, null, null)) {
            if (cursor == null || !cursor.moveToFirst()) {
                return null;
            }
            int modifiedColumn = cursor.getColumnIndex(columns[0]);
            int sizeColumn = cursor.getColumnIndex(columns[1]);
            long modified = modifiedColumn < 0 ? 0 : cursor.getLong(modifiedColumn);
            long size = sizeColumn < 0 || cursor.isNull(sizeColumn) ? -1 : cursor.getLong(sizeColumn);
            return modified > 0 ? modified + ":" + size : null;
        } catch (SecurityException exception) {
            throw new IOException("Comic document access is unavailable", exception);
        } catch (IllegalArgumentException exception) {
            return null;
        }
    }

    private static ContentResolver resolver() {
        return appContext.getContentResolver();
    }

    public static final class ArchiveFile implements AutoCloseable {
        private final File file;
        private Runnable release;

        ArchiveFile(File file, Runnable release) {
            this.file = file;
            this.release = release;
        }

        public File file() {
            return file;
        }

        @Override
        public synchronized void close() {
            if (release != null) {
                release.run();
                release = null;
            }
        }
    }
}
