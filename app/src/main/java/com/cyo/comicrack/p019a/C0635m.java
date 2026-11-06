package com.cyo.comicrack.p019a;

import com.cyo.comicrack.storage.ComicDocuments;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p020a.C0530by;
import com.cyo.comicrack.p019a.p020a.C0536cd;
import com.cyo.comicrack.p019a.p020a.EnumC0534cb;
import com.cyo.comicrack.p019a.p021b.InterfaceC0624z;
import com.cyo.comicrack.viewer.C0802fr;
import com.cyo.comicrack.viewer.C0806fv;
import com.cyo.common.C0971b;
import com.cyo.common.C0995bf;
import com.cyo.common.C0998bi;
import com.cyo.common.C1092i;
import com.cyo.common.C1095l;
import com.cyo.common.C1102s;
import com.cyo.common.C1104u;
import com.cyo.common.InterfaceC0948ad;
import com.cyo.common.InterfaceC1093j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.m */
/* loaded from: classes.dex */
public final class C0635m extends C0575ak implements InterfaceC1093j {

    /* renamed from: a */
    public static int f1920a = 0;

    /* renamed from: b */
    public static int f1921b = 1;

    /* renamed from: c */
    public static int f1922c = 2;

    /* renamed from: d */
    public static int f1923d = 4;

    /* renamed from: e */
    public static int f1924e = 8;

    /* renamed from: f */
    public static int f1925f = 16;

    /* renamed from: g */
    public static int f1926g = 32;

    /* renamed from: h */
    public static int f1927h = 64;

    /* renamed from: t */
    private static C1092i f1928t = new C1092i();

    /* renamed from: i */
    public int f1929i;

    /* renamed from: j */
    public long f1930j;

    /* renamed from: k */
    public List<C0505b> f1931k;

    /* renamed from: l */
    public int f1932l;

    /* renamed from: m */
    public boolean f1933m;

    /* renamed from: n */
    public boolean f1934n;

    /* renamed from: o */
    public boolean f1935o;

    /* renamed from: s */
    private C0582ar f1936s;

    @Override // com.cyo.common.InterfaceC1093j
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1250a(Object obj, Object obj2) {
        m1383a((C0505b) obj, EnumC0570af.Changed, (EnumC0534cb) obj2);
    }

    private C0635m(String str, String str2) {
        super(str, str2, 0, "3D8E0FCA-079F-4E69-B2C0-56BE06153769");
        this.f1929i = 20;
        this.f1935o = true;
        mo1207a(this);
    }

    /* renamed from: a */
    public final void m1397a(InterfaceC1093j interfaceC1093j) {
        f1928t.m2362a((Object) this, interfaceC1093j);
    }

    /* renamed from: a */
    private void m1383a(C0505b c0505b, EnumC0570af enumC0570af, EnumC0534cb enumC0534cb) {
        C0569ae c0569ae = new C0569ae();
        c0569ae.f1731a = c0505b;
        c0569ae.f1732b = enumC0570af;
        c0569ae.f1733c = enumC0534cb;
        f1928t.m2363a(this, c0569ae);
    }

    /* renamed from: a */
    public final void m1396a(C0505b c0505b) {
        m1980a((InterfaceC0948ad) new C0636n(this, c0505b), true);
        C0505b c0505bM1391a = m1391a(c0505b.f1570b);
        if (c0505bM1391a != null) {
            this.f1931k.remove(c0505bM1391a);
            m1383a(c0505bM1391a, EnumC0570af.Removed, EnumC0534cb.Refresh);
            c0505bM1391a.m1131b(this);
        }
    }

    /* renamed from: a */
    public final C0505b m1391a(String str) {
        if (!C0998bi.m2081a(str)) {
            for (C0505b c0505b : this.f1931k) {
                if (c0505b.m1127a(str)) {
                    return c0505b;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String m1398b(C0505b comic) {
        String series = comic.f1657x;
        int volume = -1;
        if (comic.f1616A > 0 && this.f1936s != null && this.f1936s.m1257a(series)) {
            volume = comic.f1616A;
        }
        return C0505b.m1159a(series, volume);
    }

    /* renamed from: a */
    public final C0505b m1390a(Uri uri) {
        String source = uri.toString();
        String lastPathSegment = uri.getLastPathSegment();
        for (C0505b c0505b : this.f1931k) {
            if (c0505b.f1655v.equals(source) || (!ComicDocuments.isDocument(source)
                    && lastPathSegment != null && c0505b.f1655v.endsWith(lastPathSegment))) {
                return c0505b;
            }
        }
        return null;
    }

    /* renamed from: b */
    private C0575ak m1386b() {
        return (C0575ak) m1242b("3D8E0FCA-079F-4E69-B2CD-56BE06153769", false);
    }

    /* renamed from: a */
    public final C0575ak m1393a(String str, boolean z) {
        C0575ak c0575ak;
        C0575ak c0575akM1386b = m1386b();
        C0575ak c0575ak2 = (C0575ak) c0575akM1386b.m1245c(str, true);
        if (c0575ak2 != null) {
            c0575akM1386b.m1982c(c0575ak2);
            c0575akM1386b.m1238a(0, (InterfaceC0571ag) c0575ak2);
            c0575ak = c0575ak2;
        } else {
            C0580ap c0580ap = new C0580ap(str, "", C0628f.m1372e());
            c0580ap.f1758a = new C0641s(this, str);
            while (c0575akM1386b.m1987y() > this.f1929i) {
                c0575akM1386b.m1985e(c0575akM1386b.m1987y() - 1);
            }
            if (z) {
                c0575akM1386b.m1238a(0, (InterfaceC0571ag) c0580ap);
            } else {
                c0575akM1386b.m1237a((InterfaceC0571ag) c0580ap);
            }
            c0580ap.mo1252j();
            c0575ak = c0580ap;
        }
        return c0575ak;
    }

    /* renamed from: a */
    public final List m1394a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = m1386b().m1986x().iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC0571ag) it.next()).mo1211f());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Intent m1380a(Context context, Class cls, C0505b c0505b, C0575ak c0575ak, boolean z) {
        Intent intent = new Intent(context, (Class<?>) cls);
        if (ComicDocuments.isDocument(c0505b.f1655v)) {
            intent.setData(Uri.parse(c0505b.f1655v));
        }
        intent.putExtra("comic_id", c0505b.f1570b);
        if (c0575ak != null) {
            C0575ak c0575akMo1210e = c0575ak.mo1210e();
            if (c0575akMo1210e == null || z) {
                intent.putExtra("comic_folder_items", c0575ak.m1246v());
            } else {
                intent.putExtra("list_folder_id", c0575akMo1210e.f1750p);
                intent.putExtra("comic_folder_id", c0575ak.f1750p);
            }
        }
        return intent;
    }

    /* renamed from: a */
    public final C0575ak m1392a(Intent intent) {
        new C0575ak(C0628f.m1372e());
        String stringExtra = intent == null ? null : intent.getStringExtra("comic_folder_id");
        if (stringExtra != null) {
            return (C0575ak) mo1222k().m1242b(stringExtra, false);
        }
        C0575ak c0575ak = new C0575ak(C0628f.m1372e());
        String[] stringArrayExtra = intent.getStringArrayExtra("comic_folder_items");
        if (stringArrayExtra != null) {
            for (String str : stringArrayExtra) {
                C0505b c0505bM1391a = mo1222k().m1391a(str);
                if (c0505bM1391a != null) {
                    c0575ak.m1237a((InterfaceC0571ag) new C0572ah(c0505bM1391a));
                }
            }
            return c0575ak;
        }
        return c0575ak;
    }

    /* renamed from: a */
    public static C0635m m1381a(Context context, Iterable iterable, Iterable iterable2, Iterable iterable3, int i, boolean z, InterfaceC0624z interfaceC0624z) {
        C0635m c0635m = new C0635m(context.getString(C0806fv.library), context.getString(C0806fv.the_ecomic_library));
        HashMap map = new HashMap();
        c0635m.f1931k = new ArrayList<>();
        c0635m.f1933m = false;
        c0635m.f1935o = z;
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C0505b c0505b = (C0505b) it.next();
            if (i > 0 && C0628f.isLegacyCbpPath(c0505b.f1655v) && (i2 = i2 + 1) > i) {
                c0635m.f1934n = true;
            } else {
                c0635m.f1931k.add(c0505b);
                map.put(c0505b.f1570b, c0505b);
                c0505b.m1125a(c0635m);
                c0635m.f1933m = c0505b.m1151q() | c0635m.f1933m;
            }
        }
        C0575ak c0575ak = new C0575ak(context.getString(C0806fv.ecomics), context.getString(C0806fv.all_ecomics), C0802fr.icon_page_library, "3D8E0FCA-079F-4E69-B2C1-56BE06153769");
        c0635m.m1237a((InterfaceC0571ag) c0575ak);
        C0575ak c0575ak2 = new C0575ak(context.getString(C0806fv.all_ecomics), null, 0, "3D8E0FCA-079F-4E69-B2C2-56BE06153769");
        C0575ak.m1235a(c0575ak2, 1, false);
        c0575ak.m1237a((InterfaceC0571ag) c0575ak2);
        Iterator it2 = c0635m.f1931k.iterator();
        while (it2.hasNext()) {
            c0575ak2.m1237a((InterfaceC0571ag) new C0572ah((C0505b) it2.next()));
        }
        int iM1378a = m1378a(interfaceC0624z, 14, 0);
        C0580ap c0580ap = new C0580ap(context.getString(C0806fv.new_ecomics), context.getString(C0806fv.ecomics_newly_added, 14), "3D8E0FCA-079F-4E69-B2C4-56BE06153769");
        c0580ap.f1758a = new C0642t();
        c0580ap.mo1252j();
        c0575ak.m1237a((InterfaceC0571ag) c0580ap);
        int iM1378a2 = m1378a(interfaceC0624z, 14, iM1378a);
        C0580ap c0580ap2 = new C0580ap(context.getString(C0806fv.unread_ecomics), context.getString(C0806fv.ecomics_waiting_to_be_read), "3D8E0FCA-079F-4E69-B2C3-56BE06153769");
        c0580ap2.f1758a = new C0643u();
        c0580ap2.mo1252j();
        c0575ak.m1237a((InterfaceC0571ag) c0580ap2);
        C0580ap c0580ap3 = new C0580ap(context.getString(C0806fv.recent_ecomics), context.getString(C0806fv.ecomics_recently_opened), "3D8E0FCA-079F-4E69-B2CE-56BE06153769");
        c0580ap3.f1762e = 0;
        c0580ap3.f1763f = true;
        c0580ap3.f1758a = new C0644v();
        c0580ap3.mo1252j();
        c0575ak.m1237a((InterfaceC0571ag) c0580ap3);
        int iM1378a3 = m1378a(interfaceC0624z, 14, iM1378a2);
        Iterator it3 = iterable2.iterator();
        while (it3.hasNext()) {
            C0536cd c0536cd = (C0536cd) it3.next();
            C0575ak c0575ak3 = new C0575ak(c0536cd.f1660a, c0536cd.f1661b, 0, c0536cd.f1660a);
            Iterator it4 = c0536cd.f1662c.iterator();
            while (it4.hasNext()) {
                C0505b c0505b2 = (C0505b) map.get((String) it4.next());
                if (c0505b2 != null) {
                    C0572ah c0572ah = new C0572ah(c0505b2);
                    c0572ah.m1218a(c0575ak3.m1987y());
                    c0575ak3.m1237a((InterfaceC0571ag) c0572ah);
                }
            }
            if (c0575ak3.m1987y() > 0) {
                c0575ak.m1237a((InterfaceC0571ag) c0575ak3);
            }
        }
        int iM1376a = c0635m.m1376a(context, m1378a(interfaceC0624z, 14, iM1378a3), 14, interfaceC0624z);
        C0575ak c0575ak4 = new C0575ak(context.getString(C0806fv.searches), context.getString(C0806fv.search_history), C0802fr.icon_page_search, "3D8E0FCA-079F-4E69-B2CD-56BE06153769");
        c0575ak4.f1751q = true;
        c0635m.m1237a((InterfaceC0571ag) c0575ak4);
        Iterator it5 = iterable3.iterator();
        while (it5.hasNext()) {
            c0635m.m1393a((String) it5.next(), false);
        }
        m1378a(interfaceC0624z, 14, iM1376a);
        return c0635m;
    }

    /* renamed from: a */
    private int m1376a(Context context, int i, int i2, InterfaceC0624z interfaceC0624z) {
        int iM1379a;
        int iM1379a2;
        int iM1379a3;
        int iM1379a4;
        int iM1379a5;
        int iM1379a6;
        int iM1379a7;
        this.f1933m = false;
        Iterator it = this.f1931k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((C0505b) it.next()).m1151q()) {
                this.f1933m = true;
                break;
            }
        }
        this.f1936s = this.f1935o ? new C0582ar(this.f1931k) : null;
        List list = this.f1931k;
        C0995bf c0995bf = new C0995bf(",");
        int iM1377a = m1377a((C0575ak) this, "3D8E0FCA-079F-4E69-B2C5-56BE06153769");
        if (m1388f(f1921b) || iM1377a == -1) {
            if (iM1377a != -1) {
                m1985e(iM1377a);
            }
            C0575ak c0575ak = new C0575ak(context.getString(C0806fv.series), context.getString(C0806fv.all_ecomics_grouped_by_series), C0802fr.icon_page_series, "3D8E0FCA-079F-4E69-B2C5-56BE06153769");
            c0575ak.mo1207a(this);
            m1384a(c0575ak, list, new C0645w(this));
            iM1379a = m1379a(this, 1, c0575ak);
        } else {
            iM1379a = 2;
        }
        int iM1378a = m1378a(interfaceC0624z, i2, i);
        int iM1377a2 = m1377a((C0575ak) this, "3D8E0FCA-079F-4E69-B2C6-56BE06153769");
        if (m1388f(f1922c) || iM1377a2 == -1) {
            if (iM1377a2 != -1) {
                m1985e(iM1377a2);
            }
            C0575ak c0575ak2 = new C0575ak(context.getString(C0806fv.stories), context.getString(C0806fv.all_ecomics_grouped_by_stories), C0802fr.icon_page_series, "3D8E0FCA-079F-4E69-B2C6-56BE06153769");
            c0575ak2.mo1207a(this);
            m1384a(c0575ak2, list, new C0646x(c0995bf));
            iM1379a2 = m1379a(this, iM1379a, c0575ak2);
        } else {
            iM1379a2 = iM1379a + 1;
        }
        int iM1378a2 = m1378a(interfaceC0624z, i2, iM1378a);
        if (m1377a((C0575ak) this, "3D8E0FCA-079F-4E69-B2CB-56BE06153769") == -1) {
            C0575ak c0575ak3 = new C0575ak(context.getString(C0806fv.folders), context.getString(C0806fv.all_ecomics_grouped_by_folders), C0802fr.icon_page_series, "3D8E0FCA-079F-4E69-B2CB-56BE06153769");
            c0575ak3.mo1207a(this);
            List list2 = this.f1931k;
            String[] strArr = new String[list2.size()];
            for (int i3 = 0; i3 < strArr.length; i3++) {
                strArr[i3] = ((C0505b) list2.get(i3)).m1147m();
            }
            m1384a(c0575ak3, list, new C0647y(C1095l.m2370a(strArr)));
            iM1379a3 = m1379a(this, iM1379a2, c0575ak3);
        } else {
            iM1379a3 = iM1379a2 + 1;
        }
        int iM1378a3 = m1378a(interfaceC0624z, i2, iM1378a2);
        int iM1377a3 = m1377a((C0575ak) this, "3D8E0FCA-079F-4E69-B2CC-56BE06153769");
        if (m1388f(f1927h) || iM1377a3 == -1) {
            if (iM1377a3 != -1) {
                m1985e(iM1377a3);
            }
            C0575ak c0575ak4 = new C0575ak(context.getString(C0806fv.publishers), context.getString(C0806fv.all_ecomics_grouped_by_publishers), C0802fr.icon_page_series, "3D8E0FCA-079F-4E69-B2CC-56BE06153769");
            c0575ak4.mo1207a(this);
            m1384a(c0575ak4, list, new C0648z());
            iM1379a4 = m1379a(this, iM1379a3, c0575ak4);
        } else {
            iM1379a4 = iM1379a3 + 1;
        }
        int iM1378a4 = m1378a(interfaceC0624z, i2, iM1378a3);
        int iM1377a4 = m1377a((C0575ak) this, "3D8E0FCA-079F-4E69-B2C7-56BE06153769");
        if (m1388f(f1923d) || iM1377a4 == -1) {
            if (iM1377a4 != -1) {
                m1985e(iM1377a4);
            }
            C0575ak c0575ak5 = new C0575ak(context.getString(C0806fv.years), context.getString(C0806fv.all_ecomics_grouped_by_years), C0802fr.icon_page_date, "3D8E0FCA-079F-4E69-B2C7-56BE06153769");
            c0575ak5.mo1207a(this);
            m1384a(c0575ak5, list, new C0637o());
            iM1379a5 = m1379a(this, iM1379a4, c0575ak5);
        } else {
            iM1379a5 = iM1379a4 + 1;
        }
        int iM1378a5 = m1378a(interfaceC0624z, i2, iM1378a4);
        int iM1377a5 = m1377a((C0575ak) this, "3D8E0FCA-079F-4E69-B2C8-56BE06153769");
        if (m1388f(f1924e) || iM1377a5 == -1) {
            if (iM1377a5 != -1) {
                m1985e(iM1377a5);
            }
            C0575ak c0575ak6 = new C0575ak(context.getString(C0806fv.writers), context.getString(C0806fv.all_ecomics_grouped_by_writers), C0802fr.icon_page_writer, "3D8E0FCA-079F-4E69-B2C8-56BE06153769");
            c0575ak6.mo1207a(this);
            m1384a(c0575ak6, list, new C0638p(c0995bf));
            iM1379a6 = m1379a(this, iM1379a5, c0575ak6);
        } else {
            iM1379a6 = iM1379a5 + 1;
        }
        int iM1378a6 = m1378a(interfaceC0624z, i2, iM1378a5);
        int iM1377a6 = m1377a((C0575ak) this, "3D8E0FCA-079F-4E69-B2C9-56BE06153769");
        if (m1388f(f1925f) || iM1377a6 == -1) {
            if (iM1377a6 != -1) {
                m1985e(iM1377a6);
            }
            C0575ak c0575ak7 = new C0575ak(context.getString(C0806fv.artists), context.getString(C0806fv.all_ecomics_grouped_by_artists), C0802fr.icon_page_human, "3D8E0FCA-079F-4E69-B2C9-56BE06153769");
            c0575ak7.mo1207a(this);
            m1384a(c0575ak7, list, new C0639q(c0995bf));
            iM1379a7 = m1379a(this, iM1379a6, c0575ak7);
        } else {
            iM1379a7 = iM1379a6 + 1;
        }
        int iM1378a7 = m1378a(interfaceC0624z, i2, iM1378a6);
        int iM1377a7 = m1377a((C0575ak) this, "3D8E0FCA-079F-4E69-B2CA-56BE06153769");
        if (m1388f(f1926g) || iM1377a7 == -1) {
            if (iM1377a7 != -1) {
                m1985e(iM1377a7);
            }
            C0575ak c0575ak8 = new C0575ak(context.getString(C0806fv.genres), context.getString(C0806fv.all_ecomics_grouped_by_genres), C0802fr.icon_page_genre, "3D8E0FCA-079F-4E69-B2CA-56BE06153769");
            c0575ak8.mo1207a(this);
            m1384a(c0575ak8, list, new C0640r());
            m1379a(this, iM1379a7, c0575ak8);
        }
        int iM1378a8 = m1378a(interfaceC0624z, i2, iM1378a7);
        this.f1932l = f1920a;
        this.f1930j = C0971b.m2057b().getTime();
        return iM1378a8;
    }

    /* renamed from: a */
    public final int m1389a(Context context) {
        return m1376a(context, 0, 0, null);
    }

    /* renamed from: a */
    public final void m1395a(int i) {
        this.f1932l |= i;
    }

    /* renamed from: f */
    private boolean m1388f(int i) {
        return (this.f1932l & i) != 0;
    }

    /* renamed from: a */
    private static int m1379a(C0635m c0635m, int i, C0575ak c0575ak) {
        if (c0575ak.m1987y() > 1) {
            int i2 = i + 1;
            c0635m.m1238a(i, (InterfaceC0571ag) c0575ak);
            return i2;
        }
        return i;
    }

    /* renamed from: a */
    private static int m1378a(InterfaceC0624z interfaceC0624z, int i, int i2) {
        int i3 = i2 + 1;
        if (interfaceC0624z != null) {
            interfaceC0624z.mo1349a(i, i3);
        }
        return i3;
    }

    /* renamed from: a */
    public static int m1377a(C0575ak c0575ak, String str) {
        int iY;
        if (c0575ak != null && (iY = c0575ak.m1987y()) != 0) {
            for (int i = 0; i < iY; i++) {
                if (str.equals(((InterfaceC0571ag) c0575ak.m1983d(i)).mo1208c())) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: b */
    public static String m1387b(int i) {
        if (i == 0) {
            return C0628f.f1894p;
        }
        return String.format(i == 1 ? C0628f.f1893o : C0628f.f1892n, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static String[] m1385a(C0575ak c0575ak) {
        String[] strArr = new String[c0575ak.m1987y()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < strArr.length) {
                strArr[i2] = ((C0572ah) c0575ak.m1983d(i2)).m1221j().m1147m();
                i = i2 + 1;
            } else {
                return strArr;
            }
        }
    }

    /* renamed from: a */
    public static List m1382a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) it.next();
                if (interfaceC0571ag instanceof C0572ah) {
                    arrayList.add((C0572ah) interfaceC0571ag);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m1384a(C0575ak c0575ak, Iterable iterable, AbstractC0567ac abstractC0567ac) {
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C0505b c0505b = (C0505b) it.next();
            Iterable iterableMo1203b = abstractC0567ac.mo1203b(c0505b);
            Iterable entries = iterableMo1203b == null
                    ? new C1104u(new C0565aa(abstractC0567ac.mo1205d(c0505b),
                            abstractC0567ac.mo1202a(c0505b), abstractC0567ac.mo1204c(c0505b)))
                    : new C1102s(iterableMo1203b, new C0568ad(abstractC0567ac));
            for (Object entry : entries) {
                C0565aa c0565aa = (C0565aa) entry;
                if (C0998bi.m2081a(c0565aa.f1725b)) {
                    c0565aa.f1725b = C0628f.f1891m;
                }
                C0566ab c0566ab = (C0566ab) map.get(c0565aa.f1725b);
                if (c0566ab == null) {
                    if (C0998bi.m2081a(c0565aa.f1726c)) {
                        c0565aa.f1726c = C0628f.f1891m;
                    }
                    C0566ab c0566ab2 = new C0566ab(C0998bi.m2081a(c0565aa.f1724a) ? String.valueOf(c0575ak.f1750p) + "/" + c0565aa.f1725b : c0565aa.f1724a, c0565aa.f1726c);
                    map.put(c0565aa.f1725b, c0566ab2);
                    c0566ab = c0566ab2;
                }
                c0566ab.f1729c.add(c0505b);
            }
        }
        ArrayList<String> arrayList = new ArrayList(map.keySet());
        C0530by c0530by = new C0530by();
        Collections.sort(arrayList);
        for (String str : arrayList) {
            C0566ab c0566ab3 = (C0566ab) map.get(str);
            ArrayList arrayList2 = new ArrayList(c0566ab3.f1729c);
            if (arrayList2.size() != 0) {
                Collections.sort(arrayList2, c0530by);
                C0575ak c0575ak2 = new C0575ak(str, c0566ab3.f1728b, null, 0, c0566ab3.f1727a);
                c0575ak.m1237a((InterfaceC0571ag) c0575ak2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    c0575ak2.m1237a((InterfaceC0571ag) new C0572ah((C0505b) it2.next()));
                }
            }
        }
    }
}
