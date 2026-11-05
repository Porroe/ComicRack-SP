package com.cyo.common.p026c.p031e.p033b;

import java.util.Arrays;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.m */
/* loaded from: classes.dex */
public class C1068m {

    /* renamed from: a */
    public static final int f3252a;

    /* renamed from: b */
    static final /* synthetic */ boolean f3253b;

    /* renamed from: f */
    private int f3257f;

    /* renamed from: g */
    private int f3258g;

    /* renamed from: h */
    private int f3259h;

    /* renamed from: i */
    private int f3260i;

    /* renamed from: k */
    private int f3262k;

    /* renamed from: l */
    private int f3263l;

    /* renamed from: m */
    private int f3264m;

    /* renamed from: n */
    private int f3265n;

    /* renamed from: o */
    private byte[] f3266o;

    /* renamed from: p */
    private int f3267p;

    /* renamed from: q */
    private int f3268q;

    /* renamed from: d */
    private int[] f3255d = new int[38];

    /* renamed from: e */
    private int[] f3256e = new int[128];

    /* renamed from: j */
    private final C1064i[] f3261j = new C1064i[38];

    /* renamed from: r */
    private C1064i f3269r = null;

    /* renamed from: s */
    private C1063h f3270s = null;

    /* renamed from: t */
    private C1063h f3271t = null;

    /* renamed from: u */
    private C1063h f3272u = null;

    /* renamed from: c */
    private int f3254c = 0;

    static {
        f3253b = !C1068m.class.desiredAssertionStatus();
        f3252a = Math.max(C1059d.f3216a, 12);
    }

    /* renamed from: c */
    private void m2288c(int i, int i2) {
        C1064i c1064i = this.f3269r;
        c1064i.mo2243c(i);
        c1064i.m2267a(this.f3261j[i2].m2266a());
        this.f3261j[i2].m2268a(c1064i);
    }

    /* renamed from: a */
    public final void m2293a() {
        this.f3262k++;
    }

    /* renamed from: c */
    private int m2287c(int i) {
        int iM2266a = this.f3261j[i].m2266a();
        C1064i c1064i = this.f3269r;
        c1064i.mo2243c(iM2266a);
        this.f3261j[i].m2267a(c1064i.m2266a());
        return iM2266a;
    }

    /* renamed from: d */
    private static int m2290d(int i, int i2) {
        return (f3252a * i2) + i;
    }

    /* renamed from: b */
    private void m2286b(int i, int i2, int i3) {
        int i4 = this.f3255d[i2] - this.f3255d[i3];
        int i5 = (this.f3255d[i3] * f3252a) + i;
        int[] iArr = this.f3255d;
        int i6 = this.f3256e[i4 - 1];
        if (iArr[i6] != i4) {
            int i7 = i6 - 1;
            m2288c(i5, i7);
            int i8 = this.f3255d[i7];
            i5 += f3252a * i8;
            i4 -= i8;
        }
        m2288c(i5, this.f3256e[i4 - 1]);
    }

    /* renamed from: b */
    public final void m2296b() {
        if (this.f3254c != 0) {
            this.f3254c = 0;
            this.f3266o = null;
            this.f3258g = 1;
            this.f3269r = null;
            this.f3270s = null;
            this.f3271t = null;
            this.f3272u = null;
        }
    }

    /* renamed from: c */
    public final int m2298c() {
        return this.f3254c;
    }

    /* renamed from: a */
    public final boolean m2294a(int i) {
        int i2 = i << 20;
        if (this.f3254c != i2) {
            m2296b();
            int i3 = ((i2 / 12) * f3252a) + f3252a;
            int i4 = i3 + 1 + 152;
            this.f3268q = i4;
            int i5 = i4 + 12;
            this.f3266o = new byte[i5];
            this.f3258g = 1;
            this.f3264m = (this.f3258g + i3) - f3252a;
            this.f3254c = i2;
            this.f3267p = this.f3258g + i3;
            if (!f3253b && i5 - this.f3268q != 12) {
                throw new AssertionError(String.valueOf(i5) + " " + this.f3268q + " 12");
            }
            int i6 = 0;
            int i7 = this.f3267p;
            while (i6 < this.f3261j.length) {
                this.f3261j[i6] = new C1064i(this.f3266o);
                this.f3261j[i6].mo2243c(i7);
                i6++;
                i7 += 4;
            }
            this.f3269r = new C1064i(this.f3266o);
            this.f3270s = new C1063h(this.f3266o);
            this.f3271t = new C1063h(this.f3266o);
            this.f3272u = new C1063h(this.f3266o);
        }
        return true;
    }

    /* renamed from: d */
    private int m2289d(int i) {
        if (this.f3257f == 0) {
            this.f3257f = 255;
            C1063h c1063h = this.f3270s;
            c1063h.mo2243c(this.f3268q);
            C1063h c1063h2 = this.f3271t;
            C1063h c1063h3 = this.f3272u;
            if (this.f3259h != this.f3260i) {
                this.f3266o[this.f3259h] = 0;
            }
            c1063h.m2263c(c1063h);
            c1063h.m2261b(c1063h);
            for (int i2 = 0; i2 < 38; i2++) {
                while (this.f3261j[i2].m2266a() != 0) {
                    c1063h2.mo2243c(m2287c(i2));
                    c1063h2.m2259a(c1063h);
                    c1063h2.m2265f();
                    c1063h2.m2258a(this.f3255d[i2]);
                }
            }
            c1063h2.mo2243c(c1063h.m2260b());
            while (c1063h2.m2246e() != c1063h.m2246e()) {
                c1063h3.mo2243c(m2290d(c1063h2.m2246e(), c1063h2.m2262c()));
                while (c1063h3.m2264d() == 65535 && c1063h2.m2262c() + c1063h3.m2262c() < 65536) {
                    c1063h3.m2257a();
                    c1063h2.m2258a(c1063h2.m2262c() + c1063h3.m2262c());
                    c1063h3.mo2243c(m2290d(c1063h2.m2246e(), c1063h2.m2262c()));
                }
                c1063h2.mo2243c(c1063h2.m2260b());
            }
            c1063h2.mo2243c(c1063h.m2260b());
            while (c1063h2.m2246e() != c1063h.m2246e()) {
                c1063h2.m2257a();
                int iM2262c = c1063h2.m2262c();
                while (iM2262c > 128) {
                    m2288c(c1063h2.m2246e(), 37);
                    c1063h2.mo2243c(m2290d(c1063h2.m2246e(), 128));
                    iM2262c -= 128;
                }
                int[] iArr = this.f3255d;
                int i3 = this.f3256e[iM2262c - 1];
                if (iArr[i3] != iM2262c) {
                    i3--;
                    int i4 = iM2262c - this.f3255d[i3];
                    m2288c(m2290d(c1063h2.m2246e(), iM2262c - i4), i4 - 1);
                }
                m2288c(c1063h2.m2246e(), i3);
                c1063h2.mo2243c(c1063h.m2260b());
            }
            if (this.f3261j[i].m2266a() != 0) {
                return m2287c(i);
            }
        }
        int i5 = i;
        while (true) {
            int i6 = i5 + 1;
            if (i6 == 38) {
                this.f3257f--;
                int i7 = this.f3255d[i] * f3252a;
                int i8 = this.f3255d[i] * 12;
                if (this.f3265n - this.f3262k <= i8) {
                    return 0;
                }
                this.f3265n -= i8;
                this.f3263l -= i7;
                return this.f3263l;
            }
            if (this.f3261j[i6].m2266a() != 0) {
                int iM2287c = m2287c(i6);
                m2286b(iM2287c, i6, i);
                return iM2287c;
            }
            i5 = i6;
        }
    }

    /* renamed from: b */
    public final int m2295b(int i) {
        int i2 = this.f3256e[i - 1];
        if (this.f3261j[i2].m2266a() != 0) {
            return m2287c(i2);
        }
        int i3 = this.f3259h;
        this.f3259h += this.f3255d[i2] * f3252a;
        if (this.f3259h > this.f3260i) {
            this.f3259h -= this.f3255d[i2] * f3252a;
            return m2289d(i2);
        }
        return i3;
    }

    /* renamed from: d */
    public final int m2299d() {
        if (this.f3260i != this.f3259h) {
            int i = this.f3260i - f3252a;
            this.f3260i = i;
            return i;
        }
        if (this.f3261j[0].m2266a() != 0) {
            return m2287c(0);
        }
        return m2289d(0);
    }

    /* renamed from: a */
    public final int m2291a(int i, int i2) {
        int i3 = this.f3256e[i2 - 1];
        if (i3 != this.f3256e[(i2 - 1) + 1]) {
            int iM2295b = m2295b(i2 + 1);
            if (iM2295b != 0) {
                System.arraycopy(this.f3266o, i, this.f3266o, iM2295b, f3252a * i2);
                m2288c(i, i3);
            }
            return iM2295b;
        }
        return i;
    }

    /* renamed from: a */
    public final int m2292a(int i, int i2, int i3) {
        int i4 = this.f3256e[i2 - 1];
        int i5 = this.f3256e[i3 - 1];
        if (i4 != i5) {
            if (this.f3261j[i5].m2266a() != 0) {
                int iM2287c = m2287c(i5);
                System.arraycopy(this.f3266o, i, this.f3266o, iM2287c, f3252a * i3);
                m2288c(i, i4);
                return iM2287c;
            }
            m2286b(i, i4, i5);
            return i;
        }
        return i;
    }

    /* renamed from: b */
    public final void m2297b(int i, int i2) {
        m2288c(i, this.f3256e[i2 - 1]);
    }

    /* renamed from: e */
    public final int m2300e() {
        return this.f3265n;
    }

    /* renamed from: f */
    public final int m2301f() {
        return this.f3264m;
    }

    /* renamed from: g */
    public final int m2302g() {
        return this.f3262k;
    }

    /* renamed from: h */
    public final void m2303h() {
        this.f3262k--;
    }

    /* renamed from: i */
    public final void m2304i() {
        Arrays.fill(this.f3266o, this.f3267p, this.f3267p + (this.f3261j.length * 4), (byte) 0);
        this.f3262k = this.f3258g;
        int i = ((this.f3254c / 8) / 12) * 7 * 12;
        int i2 = (i / 12) * f3252a;
        int i3 = this.f3254c - i;
        int i4 = ((i3 / 12) * f3252a) + (i3 % 12);
        this.f3260i = this.f3258g + this.f3254c;
        int i5 = i4 + this.f3258g;
        this.f3263l = i5;
        this.f3259h = i5;
        this.f3265n = i3 + this.f3258g;
        this.f3260i = this.f3259h + i2;
        int i6 = 1;
        int i7 = 0;
        while (i7 < 4) {
            this.f3255d[i7] = i6 & 255;
            i7++;
            i6++;
        }
        int i8 = i6 + 1;
        while (i7 < 8) {
            this.f3255d[i7] = i8 & 255;
            i7++;
            i8 += 2;
        }
        int i9 = i8 + 1;
        while (i7 < 12) {
            this.f3255d[i7] = i9 & 255;
            i7++;
            i9 += 3;
        }
        int i10 = i9 + 1;
        while (i7 < 38) {
            this.f3255d[i7] = i10 & 255;
            i7++;
            i10 += 4;
        }
        this.f3257f = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 128; i12++) {
            i11 += this.f3255d[i11] < i12 + 1 ? 1 : 0;
            this.f3256e[i12] = i11 & 255;
        }
    }

    /* renamed from: j */
    public final byte[] m2305j() {
        return this.f3266o;
    }

    public String toString() {
        return "SubAllocator[\n  subAllocatorSize=" + this.f3254c + "\n  glueCount=" + this.f3257f + "\n  heapStart=" + this.f3258g + "\n  loUnit=" + this.f3259h + "\n  hiUnit=" + this.f3260i + "\n  pText=" + this.f3262k + "\n  unitsStart=" + this.f3263l + "\n]";
    }
}
