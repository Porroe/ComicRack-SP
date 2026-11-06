package com.cyo.comicrack.p019a.p021b;

import com.cyo.comicrack.storage.ComicDocuments;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.C0633k;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p020a.C0535cc;
import com.cyo.comicrack.p019a.p020a.C0537ce;
import com.cyo.comicrack.p019a.p020a.EnumC0539cg;
import com.cyo.common.C0951ag;
import com.cyo.common.C0971b;
import com.cyo.common.C0998bi;
import com.cyo.common.p022a.EnumC0938i;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.o */
/* loaded from: classes.dex */
public final class C0613o extends AbstractC0614p {

    /* renamed from: d */
    public static boolean f1827d = false;

    /* renamed from: e */
    private boolean f1828e;

    public C0613o(boolean z) {
        this.f1828e = z;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0608j, com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final void mo1300a(C0505b c0505b) {
        super.mo1300a(c0505b);
        c0505b.f1587s = 1;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: b */
    public final C0505b mo1303b() {
        try (ComicDocuments.ArchiveFile archiveFile = ComicDocuments.openArchive(this.f1821b.f1655v)) {
            return readComicMetadata(archiveFile.file());
        } catch (IOException | RuntimeException exception) {
            return null;
        }
    }

    private C0505b readComicMetadata(File archiveFile) {
        C0505b c0505bM1113a;
        ZipFile zipFile;
        ZipFile zipFile2;
        C0505b c0505bM1114a;
        String str = this.f1821b.f1655v;
        File fileB = m1327b(str);
        if (!ComicDocuments.isDocument(str) && fileB.exists()) {
            c0505bM1113a = C0505b.m1113a(fileB);
            if (c0505bM1113a != null && c0505bM1113a.m1166E()) {
                c0505bM1113a.f1655v = str;
                return c0505bM1113a;
            }
        } else {
            c0505bM1113a = null;
        }
        try {
            zipFile = new ZipFile(archiveFile);
        } catch (Exception e) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (c0505bM1113a != null) {
                c0505bM1113a.m1165D().clear();
                c0505bM1114a = c0505bM1113a;
            } else {
                ZipEntry zipEntryM1323a = m1323a(zipFile, "ComicInfo.xml");
                c0505bM1114a = zipEntryM1323a != null ? C0505b.m1114a(new BufferedInputStream(zipFile.getInputStream(zipEntryM1323a), C0535cc.f1615u)) : c0505bM1113a;
            }
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                String name = enumerationEntries.nextElement().getName();
                if (m1316a(name)) {
                    arrayList.add(C0537ce.m1182a(name, name));
                }
            }
            Collections.sort(arrayList);
            if (c0505bM1114a == null) {
                c0505bM1114a = new C0505b();
                c0505bM1114a.m1169a(C0633k.m1375a(ComicDocuments.displayName(str)));
            } else if (C0998bi.m2081a(c0505bM1114a.f1657x)) {
                c0505bM1114a.f1657x = C0633k.m1375a(ComicDocuments.displayName(str)).f1915a;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0537ce c0537ce = (C0537ce) arrayList.get(i);
                C0537ce c0537ceA = m1315a(c0505bM1114a, i);
                if (c0537ceA == null) {
                    c0537ce.f1666d = i;
                    c0505bM1114a.m1165D().add(c0537ce);
                } else {
                    c0537ceA.f1665c = c0537ce.f1665c;
                    c0537ce = c0537ceA;
                }
                if (!c0537ce.m1188a()) {
                    ZipEntry entry = zipFile.getEntry(c0537ce.f1665c);
                    if (f1827d) {
                        if (c0537ce.f1668f == 0) {
                            c0537ce.f1668f = entry.getSize();
                        }
                        if (c0537ce.f1670h == 0 || c0537ce.f1669g == 0) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            InputStream inputStream = zipFile.getInputStream(entry);
                            try {
                                BitmapFactory.decodeStream(inputStream, null, options);
                                c0537ce.f1669g = options.outWidth;
                                c0537ce.f1670h = options.outHeight;
                            } finally {
                                inputStream.close();
                            }
                        }
                    }
                }
                if (c0537ce.f1671i == EnumC0938i.Rotate180 || c0537ce.f1671i == EnumC0938i.Rotate90) {
                    int i2 = c0537ce.f1669g;
                    c0537ce.f1669g = c0537ce.f1670h;
                    c0537ce.f1670h = i2;
                }
            }
            if (C0998bi.m2081a(c0505bM1114a.f1570b)) {
                c0505bM1114a.f1570b = C0628f.m1372e();
            }
            c0505bM1114a.f1639X = c0505bM1114a.m1165D().size();
            c0505bM1114a.m1174e(c0505bM1114a.m1180y()).mo1184a(EnumC0539cg.FrontCover);
            c0505bM1114a.m1124a(C0971b.m2054a());
            c0505bM1114a.f1655v = str;
            try {
                zipFile.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return c0505bM1114a;
        } catch (Exception e3) {
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th) {
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0608j
    /* renamed from: a */
    protected final Bitmap mo1317a(C0537ce page, int requestedSize) {
        try (ComicDocuments.ArchiveFile archiveFile = ComicDocuments.openArchive(this.f1821b.f1655v)) {
            return decodeZipPage(archiveFile.file(), page, requestedSize);
        } catch (IOException | RuntimeException exception) {
            return null;
        }
    }

    private Bitmap decodeZipPage(File archiveFile, C0537ce c0537ce, int i) {
        ZipFile zipFile;
        ZipFile zipFile2;
        boolean z = i <= 256;
        try {
            zipFile = new ZipFile(archiveFile);
            try {
                try {
                    ZipEntry zipEntryM1323a = m1323a(zipFile, c0537ce.f1665c);
                    if (zipEntryM1323a == null) {
                        try {
                            zipFile.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return null;
                    }
                    try {
                        if (c0537ce.f1668f < 0) {
                            c0537ce.f1668f = zipEntryM1323a.getSize();
                        }
                        if (c0537ce.f1670h == 0 || c0537ce.f1669g == 0) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(zipFile.getInputStream(zipEntryM1323a), null, options);
                            c0537ce.f1669g = options.outWidth;
                            c0537ce.f1670h = options.outHeight;
                            if (c0537ce.f1671i == EnumC0938i.Rotate180 || c0537ce.f1671i == EnumC0938i.Rotate90) {
                                int i2 = c0537ce.f1669g;
                                c0537ce.f1669g = c0537ce.f1670h;
                                c0537ce.f1670h = i2;
                            }
                        }
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inTempStorage = new byte[16384];
                        options2.inPreferredConfig = f1816a;
                        if (z && this.f1828e) {
                            try {
                                ZipEntry zipEntryM1323a2 = m1323a(zipFile, "Thumbnails\\" + C0998bi.m2093h(c0537ce.f1665c, ".") + ".tb");
                                if (zipEntryM1323a2 != null) {
                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(zipFile.getInputStream(zipEntryM1323a2), null, options2);
                                    try {
                                        zipFile.close();
                                        return bitmapDecodeStream;
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                        return bitmapDecodeStream;
                                    }
                                }
                            } catch (Exception e3) {
                            }
                        }
                        int iM1183a = c0537ce.m1183a(i);
                        boolean z2 = true;
                        while (true) {
                            try {
                                if (iM1183a > 1) {
                                    options2.inSampleSize = iM1183a;
                                } else {
                                    C0951ag.m1995a().mo2023a(options2);
                                }
                                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(zipFile.getInputStream(zipEntryM1323a), null, options2);
                                try {
                                    zipFile.close();
                                    return bitmapDecodeStream2;
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                    return bitmapDecodeStream2;
                                }
                            } catch (OutOfMemoryError e5) {
                                System.gc();
                                if (!z2) {
                                    if (iM1183a <= 0 || iM1183a > 16) {
                                        try {
                                            zipFile.close();
                                        } catch (IOException e6) {
                                            e6.printStackTrace();
                                        }
                                        return null;
                                    }
                                    iM1183a <<= 1;
                                }
                                z2 = false;
                            }
                        }
                    } catch (Exception e7) {
                        try {
                            zipFile.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                        return null;
                    }
                } catch (Exception e9) {
                    zipFile2 = zipFile;
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            return null;
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final void mo1301a(boolean z) {
        if (!this.f1822c && this.f1828e && this.f1821b != null) {
            C0505b c0505b = this.f1821b;
            if (!z || c0505b.f1588t) {
                c0505b.f1577i |= c0505b.f1588t;
                c0505b.f1588t = false;
                File fileB = m1327b(this.f1821b.f1655v);
                c0505b.m1134b(fileB);
                m1325a(fileB);
            }
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: g */
    public final boolean mo1312g() {
        return !this.f1828e && !ComicDocuments.isDocument(this.f1821b.f1655v);
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0614p, com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: i */
    public final long mo1314i() {
        return this.f1828e ? m1327b(this.f1821b.f1655v).lastModified() : super.mo1314i();
    }

    /* renamed from: a */
    private static ZipEntry m1323a(ZipFile zipFile, String str) {
        if (zipFile == null) {
            return null;
        }
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            if (zipEntryNextElement.getName().equalsIgnoreCase(str)) {
                return zipEntryNextElement;
            }
        }
        return null;
    }
}
