package com.cyo.comicrack.p019a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.provider.Settings;
import android.text.format.Time;
import android.util.DisplayMetrics;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p021b.AbstractC0587aa;
import com.cyo.comicrack.p019a.p021b.AbstractC0614p;
import com.cyo.comicrack.p019a.p021b.C0588ab;
import com.cyo.comicrack.p019a.p021b.C0609k;
import com.cyo.comicrack.p019a.p021b.C0613o;
import com.cyo.comicrack.p019a.p021b.C0617s;
import com.cyo.comicrack.p019a.p021b.InterfaceC0606h;
import com.cyo.comicrack.viewer.AbstractC0733dc;
import com.cyo.comicrack.viewer.C0799fo;
import com.cyo.comicrack.viewer.C0806fv;
import com.cyo.comicrack.viewer.ComicWidgetCoverProvider;
import com.cyo.comicrack.viewer.ComicWidgetStackProvider;
import com.cyo.common.C0951ag;
import com.cyo.common.C0971b;
import com.cyo.common.C0998bi;
import com.cyo.common.C1013bx;
import com.cyo.common.p022a.C0913a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.f */
/* loaded from: classes.dex */
public final class C0628f {

    /* renamed from: a */
    public static int f1879a;

    /* renamed from: b */
    public static boolean f1880b;

    /* renamed from: s */
    private static Context f1897s;

    /* renamed from: t */
    private static C0477a f1898t;

    /* renamed from: u */
    private static C0913a f1899u;

    /* renamed from: v */
    private static String f1900v;

    /* renamed from: w */
    private static C0588ab f1901w;

    /* renamed from: c */
    public static int f1881c = 256;

    /* renamed from: d */
    public static int f1882d = 64;

    /* renamed from: e */
    public static int f1883e = 2048;

    /* renamed from: f */
    public static int f1884f = 0;

    /* renamed from: g */
    public static int f1885g = 0;

    /* renamed from: h */
    public static int f1886h = 0;

    /* renamed from: i */
    public static int f1887i = 0;

    /* renamed from: j */
    public static int f1888j = 0;

    /* renamed from: k */
    public static boolean f1889k = true;

    /* renamed from: l */
    public static boolean f1890l = true;

    /* renamed from: m */
    public static String f1891m = "Unknown";

    /* renamed from: n */
    public static String f1892n = "%d eComics";

    /* renamed from: o */
    public static String f1893o = "%d eComic";

    /* renamed from: p */
    public static String f1894p = "No eComics";

    /* renamed from: q */
    public static String f1895q = "of";

    /* renamed from: r */
    public static String f1896r = "#";

    /* renamed from: x */
    private static C1013bx f1902x = new C1013bx("Delayed Info Writer", 1, 1);

    /* renamed from: a */
    public static synchronized C0477a m1352a() {
        if (f1898t == null) {
            f1898t = new C0477a(f1897s);
        }
        return f1898t;
    }

    /* renamed from: b */
    public static synchronized C0588ab m1362b() {
        if (f1901w == null) {
            f1901w = new C0588ab(f1897s, "thumbnails", f1882d);
        }
        return f1901w;
    }

    /* renamed from: c */
    public static synchronized C0913a m1366c() {
        if (f1899u == null) {
            f1899u = new C0913a(f1897s);
        }
        return f1899u;
    }

    /* renamed from: d */
    public static String m1370d() {
        return f1900v;
    }

    /* renamed from: a */
    public static void m1357a(Context context) {
        f1897s = context;
        f1900v = context.getPackageName();
        f1889k = context.getResources().getBoolean(C0799fo.is_free_version);
        f1891m = context.getString(C0806fv.unknown);
        f1894p = context.getString(C0806fv.no_ecomics);
        f1893o = context.getString(C0806fv.one_ecomic);
        f1892n = context.getString(C0806fv._d_ecomics);
        f1895q = context.getString(C0806fv.f2497of);
        int[][] iArr = {new int[]{16, 96, 24, 1024, 16, 0, 0, 0}, new int[]{24, 128, 32, 1536, 16, 1, 0, 0}, new int[]{32, 128, 48, 1536, 16, 1, 0, 1}, new int[]{48, 128, 64, 1536, 32, 1, 0, 1}, new int[]{64, 192, 96, 2048, 64, 1, 1, 1}, new int[]{96, 192, 126, 2048, 64, 1, 1, 1}, new int[]{0, 192, 256, 2048, 64, 1, 1, 1}};
        int iMo2036c = C0951ag.m1995a().mo2036c(context);
        f1879a = iMo2036c;
        f1880b = iMo2036c < 24;
        for (int[] iArr2 : iArr) {
            if (iArr2[0] == 0 || f1879a <= iArr2[0]) {
                f1881c = iArr2[1];
                f1882d = iArr2[2];
                f1883e = iArr2[3];
                f1884f = iArr2[4];
                int i = iArr2[5];
                f1885g = i;
                f1886h = i;
                f1887i = iArr2[6];
                f1888j = iArr2[7];
                break;
            }
        }
        C0609k.f1823d = f1888j == 1;
    }

    /* renamed from: e */
    public static String m1372e() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: f */
    public static Time m1373f() {
        Time timeM2054a = C0971b.m2054a();
        timeM2054a.monthDay -= 14;
        timeM2054a.normalize(false);
        return timeM2054a;
    }

    /* renamed from: a */
    public static C0505b m1351a(String str) {
        try {
            return m1352a().m1101a(str);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static List m1356a(InterfaceC0630h interfaceC0630h) {
        ArrayList arrayList = new ArrayList();
        try {
            List listM1106b = m1352a().m1106b();
            Collections.shuffle(listM1106b);
            Iterator it = listM1106b.iterator();
            while (it.hasNext()) {
                C0505b c0505bM1102a = m1352a().m1102a((String) it.next(), 0L);
                if (c0505bM1102a != null) {
                    int iMo1374a = interfaceC0630h == null ? 1 : interfaceC0630h.mo1374a(c0505bM1102a);
                    if ((iMo1374a & 1) != 0) {
                        arrayList.add(c0505bM1102a);
                    }
                    if ((iMo1374a & 2) != 0) {
                        break;
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static C0505b m1350a(int i, String str) {
        List listM1356a = m1356a(new C0631i(new C0632j(i, str)));
        if (listM1356a == null || listM1356a.size() == 0) {
            return null;
        }
        return (C0505b) listM1356a.get(0);
    }

    /* renamed from: a */
    public static AbstractC0587aa m1353a(C0505b c0505b, int i, int i2) {
        InterfaceC0606h interfaceC0606hM1354a;
        Bitmap bitmapCreateScaledBitmap;
        if (c0505b == null || (interfaceC0606hM1354a = m1354a(c0505b, false)) == null) {
            return null;
        }
        C0505b c0505bMo1298a = interfaceC0606hM1354a.mo1298a();
        Bitmap bitmapMo1297a = interfaceC0606hM1354a.mo1297a(c0505bMo1298a.m1172d(new Random().nextInt(c0505bMo1298a.m1181z())), i2);
        if (bitmapMo1297a == null) {
            return null;
        }
        int width = bitmapMo1297a.getWidth();
        int height = bitmapMo1297a.getHeight();
        float f = width / i;
        float f2 = height / i2;
        if (f <= f2) {
            f = f2;
        }
        if (f > 1.0f) {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapMo1297a, (int) (width / f), (int) (height / f), true);
            bitmapMo1297a.recycle();
        } else {
            bitmapCreateScaledBitmap = bitmapMo1297a;
        }
        return new C0617s(bitmapCreateScaledBitmap);
    }

    /* renamed from: b */
    public static int m1361b(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        if (str.contains("Favorites")) {
            i = 4;
        }
        if (str.contains("New")) {
            i |= 1;
        }
        if (str.contains("Unread")) {
            i |= 2;
        }
        if (str.contains("Reading")) {
            return i | 8;
        }
        return i;
    }

    /* renamed from: b */
    public static Properties m1363b(Context context) {
        Properties properties = new Properties();
        properties.setProperty("Name", Build.MODEL);
        properties.setProperty("Model", Build.MODEL);
        properties.setProperty("Manufacturer", Build.MANUFACTURER);
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (C0998bi.m2081a(string)) {
            string = UUID.randomUUID().toString();
        }
        properties.setProperty("Serial", string);
        properties.setProperty("Edition", f1889k ? "Android Free" : "Android Full");
        properties.setProperty("Version", Integer.toString(C0951ag.m2005e(context)));
        DisplayMetrics displayMetricsM1999b = C0951ag.m1999b(context);
        properties.setProperty("Screen", String.format(Locale.US, "%d, %d, %.2f, %.2f", Integer.valueOf(displayMetricsM1999b.widthPixels), Integer.valueOf(displayMetricsM1999b.heightPixels), Float.valueOf(displayMetricsM1999b.xdpi), Float.valueOf(displayMetricsM1999b.ydpi)));
        String str = String.valueOf(properties.getProperty("Model")) + properties.getProperty("Manufacturer") + properties.getProperty("Serial");
        properties.setProperty("Hash", C0998bi.m2094i(String.valueOf(str) + properties.getProperty("Edition") + properties.getProperty("Version"), "SHA"));
        properties.setProperty("ID", C0998bi.m2094i(str, "SHA"));
        String str2 = "";
        if (C0951ag.m2001c()) {
            str2 = String.valueOf("") + "WEBP";
        }
        properties.setProperty("Capabilities", str2);
        return properties;
    }

    /* renamed from: c */
    public static boolean m1369c(String str) {
        return !C0998bi.m2081a(str) && C0998bi.m2091f(str, ".cbp");
    }

    /* renamed from: d */
    public static boolean m1371d(String str) {
        if (C0998bi.m2081a(str)) {
            return false;
        }
        return C0998bi.m2091f(str, ".cbp") || C0998bi.m2091f(str, ".cbz") || C0998bi.m2091f(str, ".cbr") || C0998bi.m2091f(str, ".cbr") || C0998bi.m2091f(str, ".zip") || C0998bi.m2091f(str, ".rar");
    }

    /* renamed from: a */
    public static boolean m1359a(C0505b c0505b) {
        InterfaceC0606h interfaceC0606hM1354a = m1354a(c0505b, true);
        if (interfaceC0606hM1354a == null || !interfaceC0606hM1354a.mo1311f()) {
            return false;
        }
        m1352a().m1107b(c0505b.f1655v);
        return true;
    }

    /* renamed from: b */
    public static boolean m1365b(C0505b c0505b) {
        InterfaceC0606h interfaceC0606hM1354a = m1354a(c0505b, true);
        return interfaceC0606hM1354a != null && interfaceC0606hM1354a.mo1312g();
    }

    /* renamed from: a */
    public static boolean m1360a(C0505b c0505b, String str, boolean z) {
        InterfaceC0606h interfaceC0606hM1354a = m1354a(c0505b, true);
        if (interfaceC0606hM1354a == null || !interfaceC0606hM1354a.mo1312g()) {
            return false;
        }
        String strMo1307c = interfaceC0606hM1354a.mo1307c();
        if (!interfaceC0606hM1354a.mo1302a(str, z)) {
            return false;
        }
        m1352a().m1107b(strMo1307c);
        m1352a().m1104a(c0505b);
        return true;
    }

    /* renamed from: a */
    public static InterfaceC0606h m1354a(C0505b c0505b, boolean z) {
        String str = c0505b.f1655v;
        InterfaceC0606h c0609k = null;
        int i = c0505b.f1587s;
        if (z) {
            i = 0;
        }
        switch (i) {
            case TwitterResponse.READ /* 1 */:
                c0609k = new C0613o(m1369c(str));
                break;
            case TwitterResponse.READ_WRITE /* 2 */:
                c0609k = new C0609k();
                break;
            default:
                if (AbstractC0614p.m1326a(str, new byte[]{80, 75})) {
                    c0609k = new C0613o(C0998bi.m2091f(str, ".cbp"));
                    break;
                } else if (AbstractC0614p.m1326a(str, new byte[]{82, 97, 114, 33})) {
                    c0609k = new C0609k();
                    break;
                }
                break;
        }
        if (c0609k != null) {
            c0609k.mo1300a(c0505b);
        } else {
            m1352a().m1107b(str);
            if (m1369c(str)) {
                AbstractC0614p.m1328c(str);
            }
        }
        return c0609k;
    }

    /* renamed from: a */
    public static InterfaceC0606h m1355a(String str, boolean z) {
        if (!m1371d(str)) {
            return null;
        }
        C0505b c0505b = new C0505b();
        c0505b.f1655v = str;
        InterfaceC0606h interfaceC0606hM1354a = m1354a(c0505b, true);
        if (interfaceC0606hM1354a == null) {
            return null;
        }
        interfaceC0606hM1354a.mo1305b(z);
        int i = c0505b.f1587s;
        C0505b c0505bM1102a = m1352a().m1102a(str, interfaceC0606hM1354a.mo1314i());
        if (c0505bM1102a != null && c0505bM1102a.f1587s == i) {
            interfaceC0606hM1354a.mo1300a(c0505bM1102a);
            return interfaceC0606hM1354a;
        }
        C0505b c0505bMo1303b = interfaceC0606hM1354a.mo1303b();
        if (c0505bMo1303b == null) {
            return null;
        }
        interfaceC0606hM1354a.mo1300a(c0505bMo1303b);
        if (z) {
            c0505bMo1303b.f1585q = interfaceC0606hM1354a.mo1314i();
        } else {
            C0505b c0505bM1102a2 = m1352a().m1102a(str, 0L);
            if (c0505bM1102a2 != null) {
                c0505bMo1303b.m1122a(c0505bM1102a2.f1576h);
                c0505bMo1303b.m1135c(Math.min(c0505bMo1303b.f1639X - 1, c0505bM1102a2.f1575g));
                c0505bMo1303b.m1129b(Math.min(c0505bMo1303b.f1639X - 1, c0505bM1102a2.f1574f));
            }
            interfaceC0606hM1354a.mo1301a(true);
            c0505bMo1303b.f1585q = interfaceC0606hM1354a.mo1314i();
            m1352a().m1104a(c0505bMo1303b);
        }
        return interfaceC0606hM1354a;
    }

    /* renamed from: c */
    public static void m1368c(C0505b c0505b) {
        m1358a(m1354a(c0505b, false));
    }

    /* renamed from: a */
    public static void m1358a(InterfaceC0606h interfaceC0606h) {
        if (interfaceC0606h != null && interfaceC0606h.mo1298a() != null && !interfaceC0606h.mo1298a().f1584p) {
            interfaceC0606h.mo1301a(true);
            interfaceC0606h.mo1298a().f1585q = interfaceC0606h.mo1314i();
            m1352a().m1104a(interfaceC0606h.mo1298a());
        }
    }

    /* renamed from: b */
    public static void m1364b(InterfaceC0606h interfaceC0606h) {
        if (interfaceC0606h != null && interfaceC0606h.mo1298a() != null && !interfaceC0606h.mo1298a().f1584p && interfaceC0606h.mo1298a().f1588t) {
            f1902x.m2109a(interfaceC0606h.mo1307c(), new RunnableC0629g(interfaceC0606h));
        }
    }

    /* renamed from: c */
    public static void m1367c(Context context) {
        AbstractC0733dc.m1755a(context, ComicWidgetCoverProvider.class, null, true);
        AbstractC0733dc.m1755a(context, ComicWidgetStackProvider.class, null, true);
    }
}
