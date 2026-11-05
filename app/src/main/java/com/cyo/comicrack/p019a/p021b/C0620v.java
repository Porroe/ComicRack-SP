package com.cyo.comicrack.p019a.p021b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p020a.C0537ce;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.v */
/* loaded from: classes.dex */
public final class C0620v implements InterfaceC0606h {

    /* renamed from: b */
    private final InterfaceC0606h f1848b;

    /* renamed from: c */
    private boolean f1849c;

    /* renamed from: d */
    private boolean f1850d;

    /* renamed from: e */
    private List f1851e = new ArrayList();

    /* renamed from: a */
    static /* synthetic */ InterfaceC0606h m1332a(C0620v c0620v) {
        return c0620v.f1848b;
    }

    public C0620v(InterfaceC0606h interfaceC0606h, boolean z, boolean z2) {
        this.f1848b = interfaceC0606h;
        this.f1849c = z;
        this.f1850d = z2;
        m1334m();
    }

    /* renamed from: j */
    public final InterfaceC0606h m1340j() {
        return this.f1848b;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final C0505b mo1298a() {
        return this.f1848b.mo1298a();
    }

    /* renamed from: k */
    public final boolean m1341k() {
        return this.f1850d;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: b */
    public final AbstractC0587aa mo1304b(int i) {
        C0622x c0622xM1339g = m1339g(i);
        AbstractC0587aa c0623y = null;
        if (c0622xM1339g.m1344a()) {
            Bitmap bitmapM1343a = c0622xM1339g.m1343a(c0622xM1339g.f1854a);
            if (bitmapM1343a != null) {
                c0623y = new C0618t(bitmapM1343a);
            }
        } else {
            Bitmap bitmapM1343a2 = c0622xM1339g.m1343a(c0622xM1339g.f1854a);
            Bitmap bitmapM1343a3 = c0622xM1339g.m1343a(c0622xM1339g.f1855b);
            if (bitmapM1343a2 != null || bitmapM1343a3 != null) {
                c0623y = new C0623y(c0622xM1339g.f1854a, bitmapM1343a2, c0622xM1339g.f1855b, bitmapM1343a3, c0622xM1339g.f1858e);
            }
        }
        c0622xM1339g.m1348d();
        return c0623y;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final Bitmap mo1297a(int i, int i2) {
        throw new UnsupportedOperationException("Not valid for this provider");
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: c */
    public final Bitmap mo1306c(int i) {
        Bitmap bitmapMo1275d;
        C0622x c0622xM1339g = m1339g(i);
        if (c0622xM1339g.m1344a()) {
            bitmapMo1275d = c0622xM1339g.f1861h.f1848b.mo1306c(c0622xM1339g.f1854a);
        } else {
            bitmapMo1275d = new C0623y(c0622xM1339g.f1854a, c0622xM1339g.f1854a >= 0 ? c0622xM1339g.f1861h.f1848b.mo1306c(c0622xM1339g.f1854a) : null, c0622xM1339g.f1855b, c0622xM1339g.f1855b >= 0 ? c0622xM1339g.f1861h.f1848b.mo1306c(c0622xM1339g.f1855b) : null, c0622xM1339g.f1858e).mo1275d();
        }
        c0622xM1339g.m1348d();
        return bitmapMo1275d;
    }

    /* renamed from: e */
    public final boolean m1337e(int i) {
        return m1339g(i).m1344a();
    }

    /* renamed from: f */
    public final boolean m1338f(int i) {
        return !m1339g(i).m1344a();
    }

    /* renamed from: l */
    public final int m1342l() {
        return this.f1851e.size();
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: c */
    public final String mo1307c() {
        return this.f1848b.mo1307c();
    }

    /* renamed from: g */
    public final C0622x m1339g(int i) {
        return (C0622x) this.f1851e.get(i);
    }

    /* renamed from: a */
    public final boolean m1336a(int i, RectF rectF) {
        C0622x c0622xM1339g = m1339g(i);
        return rectF.intersect(new RectF((c0622xM1339g.m1344a() || (c0622xM1339g.f1855b >= 0 && c0622xM1339g.f1854a >= 0)) ? new Rect(0, 0, c0622xM1339g.f1859f, c0622xM1339g.f1860g) : c0622xM1339g.f1855b < 0 ? new Rect(0, 0, c0622xM1339g.f1859f / 2, c0622xM1339g.f1860g) : new Rect(c0622xM1339g.f1859f / 2, 0, c0622xM1339g.f1859f, c0622xM1339g.f1860g)));
    }

    /* renamed from: m */
    private void m1334m() {
        this.f1851e.clear();
        C0505b c0505bMo1298a = mo1298a();
        int size = c0505bMo1298a.m1165D().size();
        int i = 0;
        while (i < size) {
            C0537ce c0537ceE = c0505bMo1298a.m1174e(i);
            C0537ce c0537ceE2 = i == size + (-1) ? null : c0505bMo1298a.m1174e(i + 1);
            if (!this.f1849c || c0537ceE.m1191d()) {
                this.f1851e.add(new C0622x(this, i, c0537ceE));
            } else if (c0537ceE.m1189b()) {
                this.f1851e.add(new C0622x(this, -3, null, i, c0537ceE, this.f1850d));
            } else if (c0537ceE.m1190c() || c0537ceE2 == null) {
                this.f1851e.add(new C0622x(this, i, c0537ceE, -3, null, this.f1850d));
            } else if (c0537ceE2.m1191d()) {
                this.f1851e.add(new C0622x(this, i, c0537ceE, -2, null, this.f1850d));
            } else {
                this.f1851e.add(new C0622x(this, i, c0537ceE, i + 1, c0537ceE2, this.f1850d));
                i++;
            }
            i++;
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final void mo1300a(C0505b c0505b) {
        this.f1848b.mo1300a(c0505b);
        m1334m();
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final C0537ce mo1299a(int i) {
        C0622x c0622xM1339g = m1339g(i);
        C0621w c0621w = new C0621w(this, c0622xM1339g);
        c0621w.f1670h = c0622xM1339g.f1860g;
        c0621w.f1669g = c0622xM1339g.f1859f;
        c0621w.f1666d = i;
        return c0621w;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: d */
    public final String mo1308d(int i) {
        String strMo1308d = this.f1848b.mo1308d(i);
        if (this.f1849c) {
            strMo1308d = String.valueOf(strMo1308d) + "D";
        }
        if (this.f1850d) {
            return String.valueOf(strMo1308d) + "M";
        }
        return strMo1308d;
    }

    /* renamed from: a */
    public final int m1335a(int i, EnumC0607i enumC0607i) {
        if (enumC0607i == EnumC0607i.fromProvider) {
            if (i < m1342l()) {
                return m1339g(i).m1346b();
            }
        } else {
            int iM1342l = m1342l();
            for (int i2 = 0; i2 < iM1342l; i2++) {
                C0622x c0622xM1339g = m1339g(i2);
                if (i == c0622xM1339g.f1854a || i == c0622xM1339g.f1855b) {
                    return i2;
                }
            }
        }
        return 0;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: d */
    public final boolean mo1309d() {
        return this.f1848b.mo1309d();
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: f */
    public final boolean mo1311f() {
        return this.f1848b.mo1311f();
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: e */
    public final boolean mo1310e() {
        return this.f1848b.mo1310e();
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: g */
    public final boolean mo1312g() {
        return this.f1848b.mo1312g();
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final boolean mo1302a(String str, boolean z) {
        return this.f1848b.mo1302a(str, z);
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: b */
    public final void mo1305b(boolean z) {
        this.f1848b.mo1305b(z);
    }

    /* renamed from: a */
    public static boolean m1333a(AbstractC0587aa abstractC0587aa) {
        return (abstractC0587aa instanceof C0623y) && ((C0623y) abstractC0587aa).f1862a == -3;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: b */
    public final C0505b mo1303b() {
        return this.f1848b.mo1303b();
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final void mo1301a(boolean z) {
        this.f1848b.mo1301a(z);
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: i */
    public final long mo1314i() {
        return this.f1848b.mo1314i();
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: h */
    public final long mo1313h() {
        return this.f1848b.mo1313h();
    }
}
