package com.cyo.common;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c */
/* loaded from: classes.dex */
public final class C1016c {

    /* renamed from: a */
    public long f2983a;

    /* renamed from: b */
    public int f2984b;

    /* renamed from: c */
    private Map f2985c;

    /* renamed from: d */
    private File f2986d;

    /* renamed from: e */
    private boolean f2987e;

    /* renamed from: f */
    private int f2988f;

    /* renamed from: g */
    private ReadWriteLock f2989g;

    private C1016c(File file) throws IOException {
        this.f2985c = new HashMap();
        this.f2989g = new ReentrantReadWriteLock();
        this.f2984b = 16;
        this.f2987e = true;
        this.f2986d = file;
        m2117b();
        if (!file.exists() || !file.isDirectory()) {
            throw new IOException();
        }
        Map<String, C1089f> savedEntries = readCacheIndex(m2118c());
        if (savedEntries != null) {
            this.f2985c = savedEntries;
        }
        m2113a(file, this.f2985c);
    }

    public C1016c(String str) throws java.io.IOException {
        this(new File(str));
    }

    protected final void finalize() throws Throwable {
        super.finalize();
        m2115a(true);
    }

    /* renamed from: a */
    private static File m2111a(String str, String str2, File file) {
        try {
            File candidate;
            do {
                candidate = new File(file, str + UUID.randomUUID() + str2);
            } while (!candidate.createNewFile());
            return candidate;
        } catch (IOException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m2121a(String key, InterfaceC1091h writer) {
        C1089f existing;
        this.f2989g.readLock().lock();
        try {
            existing = (C1089f) this.f2985c.get(key);
            if (existing == null && !writer.mo2359a()) {
                return false;
            }
        } finally {
            this.f2989g.readLock().unlock();
        }
        if (existing != null) {
            m2112a(existing);
            return false;
        }
        this.f2989g.writeLock().lock();
        File file = null;
        try {
            m2117b();
            file = m2111a("item", ".cache", this.f2986d);
            writer.mo2358a(file);
            this.f2985c.put(key, new C1089f(key, C0971b.m2057b().getTime(),
                    file.getAbsolutePath(), (int) file.length()));
            this.f2988f++;
            m2115a(false);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (file != null) {
                file.delete();
            }
            return false;
        } finally {
            this.f2989g.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public final Object m2119a(String str, InterfaceC1090g interfaceC1090g) {
        Object objMo2357a;
        this.f2989g.readLock().lock();
        C1089f c1089f = (C1089f) this.f2985c.get(str);
        if (c1089f == null) {
            this.f2989g.readLock().unlock();
            return null;
        }
        try {
            objMo2357a = interfaceC1090g.mo2357a(new File(c1089f.f3469b));
        } catch (Exception e) {
            e.printStackTrace();
            objMo2357a = null;
        }
        this.f2989g.readLock().unlock();
        if (objMo2357a == null) {
            this.f2989g.writeLock().lock();
            this.f2985c.remove(str);
            new File(c1089f.f3469b).delete();
            this.f2988f++;
            m2115a(false);
            this.f2989g.writeLock().unlock();
            return null;
        }
        m2112a(c1089f);
        return objMo2357a;
    }

    /* renamed from: a */
    public final void m2120a() {
        this.f2989g.writeLock().lock();
        m2115a(true);
        this.f2989g.writeLock().unlock();
    }

    /* renamed from: b */
    private void m2117b() {
        if (this.f2987e && !this.f2986d.exists()) {
            this.f2986d.mkdirs();
        }
    }

    /* renamed from: a */
    private void m2115a(boolean z) {
        float f;
        if (this.f2988f != 0) {
            this.f2983a = System.currentTimeMillis();
            if (this.f2988f > 1024 || z) {
                float fM2360a = 0.0f;
                Iterator it = this.f2985c.values().iterator();
                while (true) {
                    f = fM2360a;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        fM2360a = ((C1089f) it.next()).m2360a() + f;
                    }
                }
                float f2 = f;
                while (f2 > this.f2984b) {
                    C1089f c1089f = null;
                    for (Object entry : this.f2985c.values()) {
                        C1089f c1089f2 = (C1089f) entry;
                        if (c1089f == null || c1089f.f3471d < c1089f2.f3471d) {
                            c1089f = c1089f2;
                        }
                    }
                    new File(c1089f.f3469b).delete();
                    float fM2360a2 = f2 - c1089f.m2360a();
                    this.f2985c.remove(c1089f.f3468a);
                    f2 = fM2360a2;
                }
                if (writeCacheIndex(new File(m2118c()))) {
                    this.f2988f = 0;
                    this.f2983a = 0L;
                }
            }
        }
    }

    /* renamed from: c */
    private String m2118c() {
        return this.f2986d + "/cache.idx";
    }

    private static final int CACHE_INDEX_VERSION = 2;

    private boolean writeCacheIndex(File indexFile) {
        File pendingIndex = null;
        try {
            m2117b();
            pendingIndex = File.createTempFile("cache-index-", ".tmp", this.f2986d);
            try (DataOutputStream output = new DataOutputStream(
                    new BufferedOutputStream(new FileOutputStream(pendingIndex), 32768))) {
                output.writeInt(CACHE_INDEX_VERSION);
                output.writeInt(this.f2985c.size());
                for (Object entry : this.f2985c.values()) {
                    C1089f cacheEntry = (C1089f) entry;
                    C1095l.m2371a(output, cacheEntry.f3468a);
                    C1095l.m2371a(output, cacheEntry.f3469b);
                    output.writeLong(cacheEntry.f3471d);
                    output.writeInt(cacheEntry.f3470c);
                }
            }
            Files.move(pendingIndex.toPath(), indexFile.toPath(),
                    StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException exception) {
            return false;
        } finally {
            if (pendingIndex != null) {
                pendingIndex.delete();
            }
        }
    }

    private static Map<String, C1089f> readCacheIndex(String indexPath) {
        try (DataInputStream input = new DataInputStream(
                new BufferedInputStream(new FileInputStream(indexPath), 32768))) {
            if (input.readInt() != CACHE_INDEX_VERSION) {
                return null;
            }
            int entryCount = input.readInt();
            Map<String, C1089f> entries = new HashMap<>();
            for (int index = 0; index < entryCount; index++) {
                String key = C1095l.m2367a(input);
                String thumbnailPath = C1095l.m2367a(input);
                long lastAccessTime = input.readLong();
                int byteCount = input.readInt();
                entries.put(key, new C1089f(key, lastAccessTime, thumbnailPath, byteCount));
            }
            return entries;
        } catch (IOException | RuntimeException exception) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m2113a(File file, Map map) {
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Object entry : map.keySet()) {
            String str = (String) entry;
            map2.put(((C1089f) map.get(str)).f3469b, str);
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.getName().endsWith(".cache")) {
                    String absolutePath = file2.getAbsolutePath();
                    if (!map2.containsKey(absolutePath)) {
                        file2.delete();
                    } else {
                        map3.put(absolutePath, file2);
                    }
                }
            }
        }
        for (Object entry : map2.keySet()) {
            String str2 = (String) entry;
            if (!map3.containsKey(str2)) {
                map.remove(map2.get(str2));
            }
        }
    }

    /* renamed from: a */
    private void m2112a(C1089f c1089f) {
        this.f2989g.writeLock().lock();
        c1089f.f3471d = C0971b.m2057b().getTime();
        this.f2988f++;
        m2115a(false);
        this.f2989g.writeLock().unlock();
    }
}
