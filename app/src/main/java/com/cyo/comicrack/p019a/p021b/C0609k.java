package com.cyo.comicrack.p019a.p021b;

import com.cyo.comicrack.storage.ComicDocuments;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.C0633k;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p020a.C0537ce;
import com.cyo.comicrack.p019a.p020a.EnumC0539cg;
import com.cyo.common.C0951ag;
import com.cyo.common.C0971b;
import com.cyo.common.p022a.EnumC0938i;
import com.github.junrar.Archive;
import com.github.junrar.exception.RarException;
import com.github.junrar.rarfile.FileHeader;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.k */
/* loaded from: classes.dex */
public final class C0609k extends AbstractC0614p {

    /* renamed from: d */
    public static boolean f1823d;

    /* renamed from: e */
    private static Object f1824e = new Object();

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0608j, com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final void mo1300a(C0505b c0505b) {
        super.mo1300a(c0505b);
        c0505b.f1587s = 2;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: g */
    public final boolean mo1312g() {
        return !ComicDocuments.isDocument(this.f1821b.f1655v);
    }

    @Override
    /* renamed from: b */
    public final C0505b mo1303b() {
        String path = this.f1821b.f1655v;
        try (ComicDocuments.ArchiveFile archiveFile = ComicDocuments.openArchive(path);
                Archive archive = new Archive(archiveFile.file())) {
            List<C0537ce> pages = new ArrayList<>();
            for (FileHeader entry : archive.getFileHeaders()) {
                String name = entry.getFileName();
                if (!entry.isDirectory() && !entry.isEncrypted() && m1316a(name)) {
                    pages.add(C0537ce.m1182a(name, name));
                }
            }
            if (pages.isEmpty()) {
                return null;
            }

            Collections.sort(pages);
            C0505b comic = new C0505b();
            comic.m1169a(C0633k.m1375a(ComicDocuments.displayName(path)));
            comic.f1570b = C0628f.m1372e();
            comic.f1655v = path;
            comic.m1165D().addAll(pages);
            comic.f1639X = pages.size();
            comic.m1174e(comic.m1180y()).mo1184a(EnumC0539cg.FrontCover);
            comic.m1124a(C0971b.m2054a());
            return comic;
        } catch (IOException | RarException | RuntimeException e) {
            Log.w("ComicRack", "Could not read CBR archive", e);
            return null;
        }
    }

    @Override
    /* renamed from: a */
    protected final Bitmap mo1317a(C0537ce page, int requestedSize) {
        InterfaceC0612n pageData = null;
        try (ComicDocuments.ArchiveFile archiveFile = ComicDocuments.openArchive(this.f1821b.f1655v)) {
            File file = archiveFile.file();
            if (f1823d) {
                pageData = extractPage(file, page.f1665c);
            } else {
                synchronized (f1824e) {
                    pageData = extractPage(file, page.f1665c);
                }
            }
            if (pageData == null) {
                return null;
            }

            if (page.f1669g == 0 || page.f1670h == 0) {
                BitmapFactory.Options bounds = new BitmapFactory.Options();
                bounds.inJustDecodeBounds = true;
                decodePage(pageData, bounds);
                if (page.f1671i == EnumC0938i.Rotate90 || page.f1671i == EnumC0938i.Rotate180) {
                    page.f1669g = bounds.outHeight;
                    page.f1670h = bounds.outWidth;
                } else {
                    page.f1669g = bounds.outWidth;
                    page.f1670h = bounds.outHeight;
                }
            }

            int sampleSize = page.m1183a(requestedSize);
            byte[] decodeBuffer = new byte[16384];
            boolean firstAttempt = true;
            while (true) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inTempStorage = decodeBuffer;
                options.inPreferredConfig = f1816a;
                if (sampleSize > 1) {
                    options.inSampleSize = sampleSize;
                } else {
                    C0951ag.m1995a().mo2023a(options);
                }
                try {
                    return decodePage(pageData, options);
                } catch (OutOfMemoryError e) {
                    System.gc();
                    if (!firstAttempt) {
                        if (sampleSize <= 0 || sampleSize > 16) {
                            return null;
                        }
                        sampleSize *= 2;
                    }
                    firstAttempt = false;
                }
            }
        } catch (IOException | RarException | RuntimeException e) {
            Log.w("ComicRack", "Could not decode CBR page", e);
            return null;
        } finally {
            if (pageData != null) {
                pageData.mo1322b();
            }
        }
    }

    private static Bitmap decodePage(InterfaceC0612n pageData, BitmapFactory.Options options)
            throws IOException {
        try (InputStream input = pageData.mo1321a()) {
            return input == null ? null : BitmapFactory.decodeStream(input, null, options);
        }
    }

    @Override
    /* renamed from: e */
    public final boolean mo1310e() {
        if (!super.mo1310e()) {
            return false;
        }
        try (ComicDocuments.ArchiveFile archiveFile = ComicDocuments.openArchive(this.f1821b.f1655v);
                Archive archive = new Archive(archiveFile.file())) {
            return !archive.isEncrypted();
        } catch (IOException | RarException | RuntimeException e) {
            return false;
        }
    }

    private static InterfaceC0612n extractPage(File file, String name) throws IOException, RarException {
        try (Archive archive = new Archive(file)) {
            for (FileHeader entry : archive.getFileHeaders()) {
                if (!entry.isDirectory() && !entry.isEncrypted() && entry.getFileName().equals(name)) {
                    if (C0628f.f1880b || entry.getFullUnpackSize() > 8 * 1024 * 1024) {
                        File temp = File.createTempFile("cbrdata", null);
                        boolean extracted = false;
                        try {
                            try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(temp), 32000)) {
                                archive.extractFile(entry, output);
                            }
                            extracted = true;
                            return new C0610l(temp);
                        } finally {
                            if (!extracted) {
                                temp.delete();
                            }
                        }
                    }
                    ByteArrayOutputStream output = new ByteArrayOutputStream();
                    archive.extractFile(entry, output);
                    return new C0611m(output.toByteArray());
                }
            }
            return null;
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final void mo1301a(boolean z) {
        C0505b c0505b = this.f1821b;
        if (c0505b != null) {
            c0505b.f1588t = false;
        }
    }
}
