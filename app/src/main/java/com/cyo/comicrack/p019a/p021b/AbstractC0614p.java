package com.cyo.comicrack.p019a.p021b;

import java.io.IOException;
import java.io.FileInputStream;
import com.cyo.comicrack.p019a.C0633k;
import com.cyo.comicrack.p019a.p020a.C0505b;
import java.io.File;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.p */
/* loaded from: classes.dex */
public abstract class AbstractC0614p extends AbstractC0608j {

    /* renamed from: d */
    private static InterfaceC0615q f1829d;

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: d */
    public final boolean mo1309d() {
        return true;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: f */
    public final boolean mo1311f() {
        return m1328c(this.f1821b.f1655v);
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: i */
    public long mo1314i() {
        return new File(this.f1821b.f1655v).lastModified();
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final boolean mo1302a(String str, boolean z) {
        C0505b c0505b = this.f1821b;
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return false;
        }
        StringBuilder sbAppend = new StringBuilder(String.valueOf(c0505b.m1147m())).append(strTrim);
        String str2 = c0505b.f1655v;
        int iLastIndexOf = str2.lastIndexOf(46);
        String string = sbAppend.append(iLastIndexOf != -1 ? str2.substring(iLastIndexOf) : "").toString();
        try {
            if (!new File(c0505b.f1655v).renameTo(new File(string))) {
                return false;
            }
            mo1311f();
            c0505b.f1655v = string;
            if (z) {
                c0505b.m1169a(C0633k.m1375a(c0505b.f1655v));
            }
            m1325a(new File(c0505b.f1655v));
            mo1301a(false);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0608j, com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: d */
    public final String mo1308d(int i) {
        C0505b c0505b = this.f1821b;
        if (c0505b.f1586r == 0) {
            c0505b.f1586r = mo1313h();
        }
        return String.valueOf(super.mo1308d(i)) + ":" + c0505b.f1586r;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: h */
    public final long mo1313h() {
        String str = this.f1821b.f1655v;
        if (str == null) {
            return 0L;
        }
        return new File(str).lastModified();
    }

    /* renamed from: b */
    public static File m1327b(String str) {
        return new File(String.valueOf(str) + ".xml");
    }

    /* renamed from: c */
    public static boolean m1328c(String str) {
        File file = new File(str);
        File fileM1327b = m1327b(str);
        boolean zDelete = file.delete();
        fileM1327b.delete();
        m1325a(file);
        m1325a(fileM1327b);
        return zDelete;
    }

    /* renamed from: a */
    public static boolean m1326a(String path, byte[] signature) {
        FileInputStream input = null;
        try {
            input = new FileInputStream(path);
            byte[] bytes = new byte[signature.length];
            input.read(bytes);
            return java.util.Arrays.equals(bytes, signature);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m1324a(InterfaceC0615q interfaceC0615q) {
        f1829d = interfaceC0615q;
    }

    /* renamed from: a */
    protected static void m1325a(File file) {
        if (f1829d != null) {
            f1829d.mo1329a(file);
        }
    }
}
