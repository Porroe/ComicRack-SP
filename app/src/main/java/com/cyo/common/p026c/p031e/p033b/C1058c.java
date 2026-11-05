package com.cyo.common.p026c.p031e.p033b;

import com.cyo.common.p026c.p031e.C1055b;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.c */
/* loaded from: classes.dex */
public final class C1058c {

    /* renamed from: w */
    private static int[] f3182w = {15581, 7999, 22975, 18675, 25761, 23228, 26162, 24657};

    /* renamed from: b */
    private C1065j f3192b;

    /* renamed from: f */
    private C1066k f3196f;

    /* renamed from: g */
    private int f3197g;

    /* renamed from: h */
    private int f3198h;

    /* renamed from: i */
    private int f3199i;

    /* renamed from: j */
    private int f3200j;

    /* renamed from: k */
    private int f3201k;

    /* renamed from: l */
    private int f3202l;

    /* renamed from: q */
    private int f3207q;

    /* renamed from: r */
    private int f3208r;

    /* renamed from: s */
    private int f3209s;

    /* renamed from: a */
    private C1065j[][] f3191a = (C1065j[][]) Array.newInstance((Class<?>) C1065j.class, 25, 16);

    /* renamed from: m */
    private int[] f3203m = new int[256];

    /* renamed from: n */
    private int[] f3204n = new int[256];

    /* renamed from: o */
    private int[] f3205o = new int[256];

    /* renamed from: p */
    private int[] f3206p = new int[256];

    /* renamed from: t */
    private int[][] f3210t = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 128, 64);

    /* renamed from: u */
    private C1061f f3211u = new C1061f();

    /* renamed from: v */
    private C1068m f3212v = new C1068m();

    /* renamed from: x */
    private final C1066k f3213x = new C1066k(null);

    /* renamed from: y */
    private final C1066k f3214y = new C1066k(null);

    /* renamed from: z */
    private final C1066k f3215z = new C1066k(null);

    /* renamed from: A */
    private final C1066k f3183A = new C1066k(null);

    /* renamed from: B */
    private final C1067l f3184B = new C1067l();

    /* renamed from: C */
    private final C1067l f3185C = new C1067l();

    /* renamed from: D */
    private final C1059d f3186D = new C1059d(null);

    /* renamed from: E */
    private final C1059d f3187E = new C1059d(null);

    /* renamed from: F */
    private final C1059d f3188F = new C1059d(null);

    /* renamed from: G */
    private final C1059d f3189G = new C1059d(null);

    /* renamed from: H */
    private final int[] f3190H = new int[64];

    /* renamed from: c */
    private C1059d f3193c = null;

    /* renamed from: e */
    private C1059d f3195e = null;

    /* renamed from: d */
    private C1059d f3194d = null;

    /* renamed from: a */
    public final C1068m m2205a() {
        return this.f3212v;
    }

    /* renamed from: u */
    private void m2203u() {
        Arrays.fill(this.f3203m, 0);
        this.f3212v.m2304i();
        this.f3202l = (-(this.f3200j < 12 ? this.f3200j : 12)) - 1;
        int iM2299d = this.f3212v.m2299d();
        this.f3193c.mo2243c(iM2299d);
        this.f3195e.mo2243c(iM2299d);
        this.f3193c.m2240b(0);
        this.f3199i = this.f3200j;
        this.f3193c.m2237a(256);
        this.f3193c.m2235a().m2197a(this.f3193c.m2239b() + 1);
        int iM2295b = this.f3212v.m2295b(128);
        this.f3196f.mo2243c(iM2295b);
        this.f3193c.m2235a().m2199a_(iM2295b);
        C1066k c1066k = new C1066k(this.f3212v.m2305j());
        int iM2200b = this.f3193c.m2235a().m2200b();
        this.f3201k = this.f3202l;
        this.f3208r = 0;
        for (int i = 0; i < 256; i++) {
            c1066k.mo2243c((i * 6) + iM2200b);
            c1066k.m2272a(i);
            c1066k.m2277b(1);
            c1066k.m2281e(0);
        }
        for (int i2 = 0; i2 < 128; i2++) {
            for (int i3 = 0; i3 < 8; i3++) {
                for (int i4 = 0; i4 < 64; i4 += 8) {
                    this.f3210t[i2][i3 + i4] = 16384 - (f3182w[i3] / (i2 + 2));
                }
            }
        }
        for (int i5 = 0; i5 < 25; i5++) {
            for (int i6 = 0; i6 < 16; i6++) {
                C1065j c1065j = this.f3191a[i5][i6];
                c1065j.f3247b = 3;
                c1065j.f3246a = (((i5 * 5) + 10) << c1065j.f3247b) & 65535;
                c1065j.f3248c = 4;
            }
        }
    }

    /* renamed from: a */
    public final boolean m2207a(C1055b c1055b) throws java.io.IOException, com.cyo.common.p026c.p028b.C1020a {
        int iM2193b;
        int i = 3;
        int iM2193b2 = c1055b.m2193b() & 255;
        boolean z = (iM2193b2 & 32) != 0;
        if (z) {
            iM2193b = c1055b.m2193b();
        } else {
            if (this.f3212v.m2298c() == 0) {
                return false;
            }
            iM2193b = 0;
        }
        if ((iM2193b2 & 64) != 0) {
            c1055b.m2188a(c1055b.m2193b());
        }
        C1061f c1061f = this.f3211u;
        c1061f.f3237e = c1055b;
        c1061f.f3234b = 0L;
        c1061f.f3233a = 0L;
        c1061f.f3235c = 4294967295L;
        for (int i2 = 0; i2 < 4; i2++) {
            c1061f.f3234b = ((c1061f.f3234b << 8) | c1061f.f3237e.m2193b()) & 4294967295L;
        }
        if (z) {
            int i3 = (iM2193b2 & 31) + 1;
            int i4 = i3 > 16 ? ((i3 - 16) * 3) + 16 : i3;
            if (i4 == 1) {
                this.f3212v.m2296b();
                return false;
            }
            this.f3212v.m2294a(iM2193b + 1);
            this.f3193c = new C1059d(this.f3212v.m2305j());
            this.f3194d = new C1059d(this.f3212v.m2305j());
            this.f3195e = new C1059d(this.f3212v.m2305j());
            this.f3196f = new C1066k(this.f3212v.m2305j());
            this.f3192b = new C1065j();
            for (int i5 = 0; i5 < 25; i5++) {
                for (int i6 = 0; i6 < 16; i6++) {
                    this.f3191a[i5][i6] = new C1065j();
                }
            }
            this.f3207q = 1;
            this.f3200j = i4;
            m2203u();
            this.f3205o[0] = 0;
            this.f3205o[1] = 2;
            for (int i7 = 0; i7 < 9; i7++) {
                this.f3205o[i7 + 2] = 4;
            }
            for (int i8 = 0; i8 < 245; i8++) {
                this.f3205o[i8 + 11] = 6;
            }
            int i9 = 0;
            while (i9 < 3) {
                this.f3204n[i9] = i9;
                i9++;
            }
            int i10 = 1;
            int i11 = 1;
            for (int i12 = i9; i12 < 256; i12++) {
                this.f3204n[i12] = i;
                i10--;
                if (i10 == 0) {
                    i11++;
                    i++;
                    i10 = i11;
                }
            }
            for (int i13 = 0; i13 < 64; i13++) {
                this.f3206p[i13] = 0;
            }
            for (int i14 = 0; i14 < 192; i14++) {
                this.f3206p[i14 + 64] = 8;
            }
            this.f3192b.f3247b = 7;
        }
        return this.f3193c.m2246e() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m2208b() {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyo.common.p026c.p031e.p033b.C1058c.m2208b():int");
    }

    /* renamed from: c */
    public final C1065j[][] m2211c() {
        return this.f3191a;
    }

    /* renamed from: d */
    public final C1065j m2212d() {
        return this.f3192b;
    }

    /* renamed from: e */
    public final int m2214e() {
        return this.f3202l;
    }

    /* renamed from: f */
    public final int m2216f() {
        return this.f3207q;
    }

    /* renamed from: g */
    public final void m2218g() {
        this.f3207q = (this.f3207q + 1) & 255;
    }

    /* renamed from: h */
    public final int[] m2219h() {
        return this.f3203m;
    }

    /* renamed from: i */
    public final int m2220i() {
        return this.f3197g;
    }

    /* renamed from: a */
    public final void m2206a(int i) {
        this.f3197g = i;
    }

    /* renamed from: b */
    public final void m2209b(int i) {
        this.f3208r = i & 255;
    }

    /* renamed from: c */
    public final void m2210c(int i) {
        this.f3198h = i;
    }

    /* renamed from: d */
    public final void m2213d(int i) {
        this.f3201k = i;
    }

    /* renamed from: j */
    public final int m2221j() {
        return this.f3201k;
    }

    /* renamed from: e */
    public final void m2215e(int i) {
        this.f3201k += i;
    }

    /* renamed from: k */
    public final int m2222k() {
        return this.f3208r;
    }

    /* renamed from: l */
    public final int m2223l() {
        return this.f3209s;
    }

    /* renamed from: f */
    public final void m2217f(int i) {
        this.f3209s = i & 255;
    }

    /* renamed from: m */
    public final int[][] m2224m() {
        return this.f3210t;
    }

    /* renamed from: n */
    public final C1061f m2225n() {
        return this.f3211u;
    }

    /* renamed from: o */
    public final int[] m2226o() {
        return this.f3206p;
    }

    /* renamed from: p */
    public final int[] m2227p() {
        return this.f3205o;
    }

    /* renamed from: q */
    public final int[] m2228q() {
        return this.f3204n;
    }

    /* renamed from: r */
    public final C1066k m2229r() {
        return this.f3196f;
    }

    /* renamed from: s */
    public final byte[] m2230s() {
        return this.f3212v.m2305j();
    }

    /* renamed from: t */
    public final int m2231t() {
        return this.f3199i;
    }

    /* renamed from: a */
    private int m2202a(boolean z, C1066k c1066k) {
        boolean z2;
        int i;
        int i2;
        boolean z3;
        int i3 = 1;
        C1067l c1067l = this.f3185C;
        C1066k c1066kM2271a = this.f3213x.m2271a(this.f3212v.m2305j());
        C1059d c1059dM2236a = this.f3186D.m2236a(this.f3212v.m2305j());
        c1059dM2236a.mo2243c(this.f3193c.m2246e());
        C1059d c1059dM2236a2 = this.f3187E.m2236a(this.f3212v.m2305j());
        c1059dM2236a2.mo2243c(this.f3196f.m2278c());
        C1066k c1066kM2271a2 = this.f3214y.m2271a(this.f3212v.m2305j());
        if (z) {
            z2 = false;
            i = 0;
        } else {
            this.f3190H[0] = this.f3196f.m2246e();
            if (c1059dM2236a.m2245d() == 0) {
                z2 = true;
                i = 1;
            } else {
                z2 = false;
                i = 1;
            }
        }
        if (!z2) {
            if (c1066k.m2246e() != 0) {
                c1066kM2271a2.mo2243c(c1066k.m2246e());
                c1059dM2236a.mo2243c(c1059dM2236a.m2245d());
                z3 = true;
            } else {
                z3 = false;
            }
            while (true) {
                if (!z3) {
                    c1059dM2236a.mo2243c(c1059dM2236a.m2245d());
                    if (c1059dM2236a.m2239b() != 1) {
                        c1066kM2271a2.mo2243c(c1059dM2236a.m2235a().m2200b());
                        if (c1066kM2271a2.m2270a() != this.f3196f.m2270a()) {
                            do {
                                c1066kM2271a2.m2282f();
                            } while (c1066kM2271a2.m2270a() != this.f3196f.m2270a());
                        }
                    } else {
                        c1066kM2271a2.mo2243c(c1059dM2236a.m2242c().m2246e());
                    }
                }
                if (c1066kM2271a2.m2278c() != c1059dM2236a2.m2246e()) {
                    c1059dM2236a.mo2243c(c1066kM2271a2.m2278c());
                    break;
                }
                int i4 = i + 1;
                this.f3190H[i] = c1066kM2271a2.m2246e();
                if (c1059dM2236a.m2245d() == 0) {
                    i = i4;
                    break;
                }
                i = i4;
                z3 = false;
            }
        }
        if (i == 0) {
            return c1059dM2236a.m2246e();
        }
        c1067l.m2283a(this.f3212v.m2305j()[c1059dM2236a2.m2246e()]);
        c1067l.f3251c = c1059dM2236a2.m2246e() + 1;
        if (c1059dM2236a.m2239b() != 1) {
            if (c1059dM2236a.m2246e() <= this.f3212v.m2302g()) {
                return 0;
            }
            c1066kM2271a2.mo2243c(c1059dM2236a.m2235a().m2200b());
            if (c1066kM2271a2.m2270a() != c1067l.f3249a) {
                do {
                    c1066kM2271a2.m2282f();
                } while (c1066kM2271a2.m2270a() != c1067l.f3249a);
            }
            int iM2276b = c1066kM2271a2.m2276b() - 1;
            int iM2195a = (c1059dM2236a.m2235a().m2195a() - c1059dM2236a.m2239b()) - iM2276b;
            if (iM2276b * 2 > iM2195a) {
                i3 = (((iM2276b * 2) + (iM2195a * 3)) - 1) / (iM2195a * 2);
            } else if (iM2276b * 5 <= iM2195a) {
                i3 = 0;
            }
            c1067l.m2285b(i3 + 1);
            i2 = i;
        } else {
            c1067l.m2285b(c1059dM2236a.m2242c().m2276b());
            i2 = i;
        }
        do {
            i2--;
            c1066kM2271a.mo2243c(this.f3190H[i2]);
            c1059dM2236a.mo2243c(c1059dM2236a.m2234a(this, c1066kM2271a, c1067l));
            if (c1059dM2236a.m2246e() == 0) {
                return 0;
            }
        } while (i2 != 0);
        return c1059dM2236a.m2246e();
    }

    /* renamed from: v */
    private void m2204v() {
        m2203u();
        this.f3207q = 0;
    }

    public final String toString() {
        return "ModelPPM[\n  numMasked=" + this.f3197g + "\n  initEsc=" + this.f3198h + "\n  orderFall=" + this.f3199i + "\n  maxOrder=" + this.f3200j + "\n  runLength=" + this.f3201k + "\n  initRL=" + this.f3202l + "\n  escCount=" + this.f3207q + "\n  prevSuccess=" + this.f3208r + "\n  foundState=" + this.f3196f + "\n  coder=" + this.f3211u + "\n  subAlloc=" + this.f3212v + "\n]";
    }
}
