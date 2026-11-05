package com.cyo.common.p026c.p031e.p033b;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.d */
/* loaded from: classes.dex */
public final class C1059d extends AbstractC1060e {

    /* renamed from: g */
    private int f3219g;

    /* renamed from: h */
    private final C1057b f3220h;

    /* renamed from: i */
    private final C1066k f3221i;

    /* renamed from: j */
    private int f3222j;

    /* renamed from: k */
    private final C1066k f3223k;

    /* renamed from: l */
    private final C1066k f3224l;

    /* renamed from: m */
    private final C1066k f3225m;

    /* renamed from: n */
    private final C1066k f3226n;

    /* renamed from: o */
    private final C1066k f3227o;

    /* renamed from: p */
    private C1059d f3228p;

    /* renamed from: q */
    private final int[] f3229q;

    /* renamed from: f */
    private static final int f3218f = Math.max(6, 6);

    /* renamed from: a */
    public static final int f3216a = (f3218f + 2) + 4;

    /* renamed from: b */
    public static final int[] f3217b = {25, 14, 9, 7, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 2};

    public C1059d(byte[] bArr) {
        super(bArr);
        this.f3223k = new C1066k(null);
        this.f3224l = new C1066k(null);
        this.f3225m = new C1066k(null);
        this.f3226n = new C1066k(null);
        this.f3227o = new C1066k(null);
        this.f3228p = null;
        this.f3229q = new int[256];
        this.f3221i = new C1066k(bArr);
        this.f3220h = new C1057b(bArr);
    }

    /* renamed from: a */
    public final C1059d m2236a(byte[] bArr) {
        this.f3231c = bArr;
        this.f3232d = 0;
        this.f3221i.m2271a(bArr);
        this.f3220h.m2196a(bArr);
        return this;
    }

    /* renamed from: a */
    public final C1057b m2235a() {
        return this.f3220h;
    }

    /* renamed from: b */
    public final int m2239b() {
        if (this.f3231c != null) {
            this.f3219g = C1024b.m2142a(this.f3231c, this.f3232d) & 65535;
        }
        return this.f3219g;
    }

    /* renamed from: a */
    public final void m2237a(int i) {
        this.f3219g = 65535 & i;
        if (this.f3231c != null) {
            C1024b.m2144a(this.f3231c, this.f3232d, (short) i);
        }
    }

    /* renamed from: c */
    public final C1066k m2242c() {
        return this.f3221i;
    }

    /* renamed from: d */
    public final int m2245d() {
        if (this.f3231c != null) {
            this.f3222j = C1024b.m2145b(this.f3231c, this.f3232d + 8);
        }
        return this.f3222j;
    }

    /* renamed from: b */
    public final void m2240b(int i) {
        this.f3222j = i;
        if (this.f3231c != null) {
            C1024b.m2143a(this.f3231c, this.f3232d + 8, i);
        }
    }

    @Override // com.cyo.common.p026c.p031e.p033b.AbstractC1060e
    /* renamed from: c */
    public final void mo2243c(int i) {
        super.mo2243c(i);
        this.f3221i.mo2243c(i + 2);
        this.f3220h.mo2243c(i + 2);
    }

    /* renamed from: b */
    private C1059d m2232b(byte[] bArr) {
        if (this.f3228p == null) {
            this.f3228p = new C1059d(null);
        }
        return this.f3228p.m2236a(bArr);
    }

    /* renamed from: a */
    public final int m2234a(C1058c c1058c, C1066k c1066k, C1067l c1067l) {
        C1059d c1059dM2232b = m2232b(c1058c.m2205a().m2305j());
        c1059dM2232b.mo2243c(c1058c.m2205a().m2299d());
        if (c1059dM2232b != null) {
            c1059dM2232b.m2237a(1);
            c1059dM2232b.f3221i.m2275a(c1067l);
            c1059dM2232b.m2240b(m2246e());
            c1066k.m2273a(c1059dM2232b);
        }
        return c1059dM2232b.m2246e();
    }

    /* renamed from: d */
    private void m2233d(C1058c c1058c) {
        int i;
        int iM2239b = m2239b();
        int iM2239b2 = m2239b() - 1;
        C1066k c1066k = new C1066k(c1058c.m2230s());
        C1066k c1066k2 = new C1066k(c1058c.m2230s());
        C1066k c1066k3 = new C1066k(c1058c.m2230s());
        c1066k2.mo2243c(c1058c.m2229r().m2246e());
        while (c1066k2.m2246e() != this.f3220h.m2200b()) {
            c1066k3.mo2243c(c1066k2.m2246e() - 6);
            C1066k.m2269a(c1066k2, c1066k3);
            c1066k2.m2279d();
        }
        c1066k3.mo2243c(this.f3220h.m2200b());
        c1066k3.m2280d(4);
        this.f3220h.m2201b(4);
        int iM2195a = this.f3220h.m2195a() - c1066k2.m2276b();
        int i2 = c1058c.m2231t() != 0 ? 1 : 0;
        c1066k2.m2277b((c1066k2.m2276b() + i2) >>> 1);
        this.f3220h.m2197a(c1066k2.m2276b());
        do {
            c1066k2.m2282f();
            iM2195a -= c1066k2.m2276b();
            c1066k2.m2277b((c1066k2.m2276b() + i2) >>> 1);
            this.f3220h.m2201b(c1066k2.m2276b());
            c1066k3.mo2243c(c1066k2.m2246e() - 6);
            if (c1066k2.m2276b() > c1066k3.m2276b()) {
                c1066k.mo2243c(c1066k2.m2246e());
                C1067l c1067l = new C1067l();
                c1067l.m2284a(c1066k);
                C1066k c1066k4 = new C1066k(c1058c.m2230s());
                C1066k c1066k5 = new C1066k(c1058c.m2230s());
                do {
                    c1066k4.mo2243c(c1066k.m2246e() - 6);
                    c1066k.m2274a(c1066k4);
                    c1066k.m2279d();
                    c1066k5.mo2243c(c1066k.m2246e() - 6);
                    if (c1066k.m2246e() == this.f3220h.m2200b()) {
                        break;
                    }
                } while (c1067l.f3250b > c1066k5.m2276b());
                c1066k.m2275a(c1067l);
            }
            iM2239b2--;
        } while (iM2239b2 != 0);
        if (c1066k2.m2276b() == 0) {
            do {
                iM2239b2++;
                c1066k2.m2279d();
            } while (c1066k2.m2276b() == 0);
            i = iM2195a + iM2239b2;
            m2237a(m2239b() - iM2239b2);
            if (m2239b() == 1) {
                C1067l c1067l2 = new C1067l();
                c1066k3.mo2243c(this.f3220h.m2200b());
                c1067l2.m2284a(c1066k3);
                do {
                    c1067l2.f3250b = (c1067l2.f3250b - (c1067l2.f3250b >>> 1)) & 255;
                    i >>>= 1;
                } while (i > 1);
                c1058c.m2205a().m2297b(this.f3220h.m2200b(), (iM2239b + 1) >>> 1);
                this.f3221i.m2275a(c1067l2);
                c1058c.m2229r().mo2243c(this.f3221i.m2246e());
                return;
            }
        } else {
            i = iM2195a;
        }
        this.f3220h.m2201b(i - (i >>> 1));
        int i3 = (iM2239b + 1) >>> 1;
        int iM2239b3 = (m2239b() + 1) >>> 1;
        if (i3 != iM2239b3) {
            this.f3220h.m2199a_(c1058c.m2205a().m2292a(this.f3220h.m2200b(), i3, iM2239b3));
        }
        c1058c.m2229r().mo2243c(this.f3220h.m2200b());
    }

    /* renamed from: a */
    public final void m2238a(C1058c c1058c) {
        C1066k c1066kM2271a = this.f3223k.m2271a(c1058c.m2230s());
        c1066kM2271a.mo2243c(this.f3221i.m2246e());
        c1058c.m2217f(c1058c.m2226o()[c1058c.m2229r().m2270a()]);
        int iM2276b = c1066kM2271a.m2276b() - 1;
        m2232b(c1058c.m2205a().m2305j()).mo2243c(m2245d());
        int iM2222k = c1058c.m2227p()[m2239b() - 1] + c1058c.m2222k() + 0 + c1058c.m2223l() + (c1058c.m2226o()[c1066kM2271a.m2270a()] * 2) + ((c1058c.m2221j() >>> 26) & 32);
        int i = c1058c.m2224m()[iM2276b][iM2222k];
        C1061f c1061fM2225n = c1058c.m2225n();
        c1061fM2225n.f3235c >>>= 14;
        if ((((c1061fM2225n.f3234b - c1061fM2225n.f3233a) / c1061fM2225n.f3235c) & 4294967295L) < i) {
            c1058c.m2229r().mo2243c(c1066kM2271a.m2246e());
            c1066kM2271a.m2280d(c1066kM2271a.m2276b() < 128 ? 1 : 0);
            c1058c.m2225n().f3236d.m2252b(0L);
            c1058c.m2225n().f3236d.m2251a(i);
            c1058c.m2224m()[iM2276b][iM2222k] = ((i + 128) - ((i + 32) >>> 7)) & 65535;
            c1058c.m2209b(1);
            c1058c.m2215e(1);
            return;
        }
        c1058c.m2225n().f3236d.m2252b(i);
        int i2 = (i - ((i + 32) >>> 7)) & 65535;
        c1058c.m2224m()[iM2276b][iM2222k] = i2;
        c1058c.m2225n().f3236d.m2251a(16384L);
        c1058c.m2210c(f3217b[i2 >>> 10]);
        c1058c.m2206a(1);
        c1058c.m2219h()[c1066kM2271a.m2270a()] = c1058c.m2216f();
        c1058c.m2209b(0);
        c1058c.m2229r().mo2243c(0);
    }

    /* renamed from: b */
    public final boolean m2241b(C1058c c1058c) {
        C1065j c1065jM2212d;
        int iM2276b;
        int iM2239b = m2239b() - c1058c.m2220i();
        int iM2239b2 = m2239b();
        if (iM2239b2 != 256) {
            C1059d c1059dM2232b = m2232b(c1058c.m2230s());
            c1059dM2232b.mo2243c(m2245d());
            C1065j c1065j = c1058c.m2211c()[c1058c.m2228q()[iM2239b - 1]][((c1058c.m2220i() > iM2239b ? 1 : 0) * 4) + (iM2239b < c1059dM2232b.m2239b() - iM2239b2 ? 1 : 0) + 0 + ((this.f3220h.m2195a() < iM2239b2 * 11 ? 1 : 0) * 2) + c1058c.m2223l()];
            C1062g c1062g = c1058c.m2225n().f3236d;
            int i = c1065j.f3246a >>> c1065j.f3247b;
            c1065j.f3246a -= i;
            c1062g.m2253c((i == 0 ? 1 : 0) + i);
            c1065jM2212d = c1065j;
        } else {
            c1065jM2212d = c1058c.m2212d();
            c1058c.m2225n().f3236d.m2253c(1L);
        }
        C1061f c1061fM2225n = c1058c.m2225n();
        C1066k c1066kM2271a = this.f3223k.m2271a(c1058c.m2230s());
        C1066k c1066kM2271a2 = this.f3224l.m2271a(c1058c.m2230s());
        c1066kM2271a.mo2243c(this.f3220h.m2200b() - 6);
        int i2 = 0;
        int i3 = 0;
        int i4 = iM2239b;
        while (true) {
            c1066kM2271a.m2282f();
            if (c1058c.m2219h()[c1066kM2271a.m2270a()] != c1058c.m2216f()) {
                iM2276b = c1066kM2271a.m2276b() + i3;
                int i5 = i2 + 1;
                this.f3229q[i2] = c1066kM2271a.m2246e();
                int i6 = i4 - 1;
                if (i6 == 0) {
                    break;
                }
                i4 = i6;
                i2 = i5;
                i3 = iM2276b;
            }
        }
        C1062g c1062g2 = c1061fM2225n.f3236d;
        c1062g2.m2253c(c1062g2.f3239b + iM2276b);
        long jM2247a = c1061fM2225n.m2247a();
        if (jM2247a >= c1061fM2225n.f3236d.f3239b) {
            return false;
        }
        int i7 = 0;
        c1066kM2271a.mo2243c(this.f3229q[0]);
        if (jM2247a < iM2276b) {
            int iM2276b2 = 0;
            while (true) {
                iM2276b2 += c1066kM2271a.m2276b();
                if (iM2276b2 > jM2247a) {
                    break;
                }
                i7++;
                c1066kM2271a.mo2243c(this.f3229q[i7]);
            }
            c1061fM2225n.f3236d.m2251a(iM2276b2);
            c1061fM2225n.f3236d.m2252b(iM2276b2 - c1066kM2271a.m2276b());
            if (c1065jM2212d.f3247b < 7) {
                int i8 = c1065jM2212d.f3248c - 1;
                c1065jM2212d.f3248c = i8;
                if (i8 == 0) {
                    c1065jM2212d.f3246a += c1065jM2212d.f3246a;
                    int i9 = c1065jM2212d.f3247b;
                    c1065jM2212d.f3247b = i9 + 1;
                    c1065jM2212d.f3248c = 3 << i9;
                }
            }
            c1065jM2212d.f3246a &= 65535;
            c1065jM2212d.f3248c &= 255;
            c1065jM2212d.f3247b &= 255;
            int iE = c1066kM2271a.m2246e();
            C1066k c1066kM2271a3 = this.f3227o.m2271a(c1058c.m2230s());
            c1066kM2271a3.mo2243c(iE);
            c1058c.m2229r().mo2243c(iE);
            c1058c.m2229r().m2280d(4);
            this.f3220h.m2201b(4);
            if (c1066kM2271a3.m2276b() > 124) {
                m2233d(c1058c);
            }
            c1058c.m2218g();
            c1058c.m2213d(c1058c.m2214e());
        } else {
            c1061fM2225n.f3236d.m2252b(iM2276b);
            c1061fM2225n.f3236d.m2251a(c1061fM2225n.f3236d.f3239b);
            int iM2239b3 = m2239b() - c1058c.m2220i();
            int i10 = -1;
            do {
                i10++;
                c1066kM2271a2.mo2243c(this.f3229q[i10]);
                c1058c.m2219h()[c1066kM2271a2.m2270a()] = c1058c.m2216f();
                iM2239b3--;
            } while (iM2239b3 != 0);
            c1065jM2212d.f3246a = (((int) c1061fM2225n.f3236d.f3239b) + c1065jM2212d.f3246a) & 65535;
            c1058c.m2206a(m2239b());
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m2244c(C1058c c1058c) {
        C1061f c1061fM2225n = c1058c.m2225n();
        c1061fM2225n.f3236d.m2253c(this.f3220h.m2195a());
        C1066k c1066k = new C1066k(c1058c.m2230s());
        c1066k.mo2243c(this.f3220h.m2200b());
        long jM2247a = c1061fM2225n.m2247a();
        if (jM2247a >= c1061fM2225n.f3236d.f3239b) {
            return false;
        }
        int iM2276b = c1066k.m2276b();
        if (jM2247a < iM2276b) {
            c1061fM2225n.f3236d.m2251a(iM2276b);
            c1058c.m2209b(((long) (iM2276b * 2)) > c1061fM2225n.f3236d.f3239b ? 1 : 0);
            c1058c.m2215e(c1058c.m2222k());
            int i = iM2276b + 4;
            c1058c.m2229r().mo2243c(c1066k.m2246e());
            c1058c.m2229r().m2277b(i);
            this.f3220h.m2201b(4);
            if (i > 124) {
                m2233d(c1058c);
            }
            c1061fM2225n.f3236d.m2252b(0L);
            return true;
        }
        if (c1058c.m2229r().m2246e() == 0) {
            return false;
        }
        c1058c.m2209b(0);
        int iM2239b = m2239b();
        int i2 = iM2239b - 1;
        do {
            iM2276b += c1066k.m2282f().m2276b();
            if (iM2276b <= jM2247a) {
                i2--;
            } else {
                c1061fM2225n.f3236d.m2252b(iM2276b - c1066k.m2276b());
                c1061fM2225n.f3236d.m2251a(iM2276b);
                int iE = c1066k.m2246e();
                c1058c.m2229r().mo2243c(iE);
                c1058c.m2229r().m2280d(4);
                this.f3220h.m2201b(4);
                C1066k c1066kM2271a = this.f3225m.m2271a(c1058c.m2230s());
                C1066k c1066kM2271a2 = this.f3226n.m2271a(c1058c.m2230s());
                c1066kM2271a.mo2243c(iE);
                c1066kM2271a2.mo2243c(iE - 6);
                if (c1066kM2271a.m2276b() <= c1066kM2271a2.m2276b()) {
                    return true;
                }
                C1066k.m2269a(c1066kM2271a, c1066kM2271a2);
                c1058c.m2229r().mo2243c(c1066kM2271a2.m2246e());
                if (c1066kM2271a2.m2276b() <= 124) {
                    return true;
                }
                m2233d(c1058c);
                return true;
            }
        } while (i2 != 0);
        c1058c.m2217f(c1058c.m2226o()[c1058c.m2229r().m2270a()]);
        c1061fM2225n.f3236d.m2252b(iM2276b);
        c1058c.m2219h()[c1066k.m2270a()] = c1058c.m2216f();
        c1058c.m2206a(iM2239b);
        c1058c.m2229r().mo2243c(0);
        int i3 = iM2239b - 1;
        do {
            c1058c.m2219h()[c1066k.m2279d().m2270a()] = c1058c.m2216f();
            i3--;
        } while (i3 != 0);
        c1061fM2225n.f3236d.m2251a(c1061fM2225n.f3236d.f3239b);
        return true;
    }

    public final String toString() {
        return "PPMContext[\n  pos=" + this.f3232d + "\n  size=" + f3216a + "\n  numStats=" + m2239b() + "\n  Suffix=" + m2245d() + "\n  freqData=" + this.f3220h + "\n  oneState=" + this.f3221i + "\n]";
    }
}
