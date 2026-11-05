package com.cyo.common.p026c.p031e;

import com.cyo.common.p026c.p031e.p034c.C1070a;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.c */
/* loaded from: classes.dex */
public abstract class AbstractC1069c extends C1070a {

    /* renamed from: O */
    static int[] f3273O;

    /* renamed from: P */
    static int[] f3274P;

    /* renamed from: Q */
    static int[] f3275Q;

    /* renamed from: R */
    static int[] f3276R;

    /* renamed from: aa */
    private static int[] f3286aa;

    /* renamed from: ab */
    private static int[] f3287ab;

    /* renamed from: ac */
    private static int[] f3288ac;

    /* renamed from: ad */
    private static int[] f3289ad;

    /* renamed from: ae */
    private static int[] f3290ae;

    /* renamed from: A */
    protected int f3291A;

    /* renamed from: B */
    protected int f3292B;

    /* renamed from: C */
    protected int f3293C;

    /* renamed from: D */
    protected int f3294D;

    /* renamed from: E */
    protected int f3295E;

    /* renamed from: F */
    protected int f3296F;

    /* renamed from: G */
    protected int f3297G;

    /* renamed from: H */
    protected int f3298H;

    /* renamed from: I */
    protected int f3299I;

    /* renamed from: J */
    protected int f3300J;

    /* renamed from: K */
    protected int f3301K;

    /* renamed from: L */
    protected int f3302L;

    /* renamed from: M */
    protected int f3303M;

    /* renamed from: N */
    protected int f3304N;

    /* renamed from: b */
    protected int f3305b;

    /* renamed from: c */
    protected boolean f3306c;

    /* renamed from: d */
    protected boolean f3307d;

    /* renamed from: e */
    protected C1046a f3308e;

    /* renamed from: f */
    protected boolean f3309f;

    /* renamed from: g */
    protected int f3310g;

    /* renamed from: h */
    protected long f3311h;

    /* renamed from: i */
    protected byte[] f3312i;

    /* renamed from: k */
    protected int f3314k;

    /* renamed from: l */
    protected int f3315l;

    /* renamed from: m */
    protected int f3316m;

    /* renamed from: y */
    protected int f3328y;

    /* renamed from: z */
    protected int f3329z;

    /* renamed from: a */
    private static int[] f3285a = {32768, 40960, 49152, 53248, 57344, 59904, 60928, 61440, 61952, 61952, 65535};

    /* renamed from: S */
    private static int[] f3277S = {0, 0, 0, 2, 3, 5, 7, 11, 16, 20, 24, 32, 32};

    /* renamed from: T */
    private static int[] f3278T = {40960, 49152, 53248, 57344, 59904, 60928, 61440, 61952, 62016, 65535};

    /* renamed from: U */
    private static int[] f3279U = {0, 0, 0, 0, 5, 7, 9, 13, 18, 22, 26, 34, 36};

    /* renamed from: V */
    private static int[] f3280V = {32768, 49152, 57344, 61952, 61952, 61952, 61952, 61952, 65535};

    /* renamed from: W */
    private static int[] f3281W = {0, 0, 0, 0, 0, 8, 16, 24, 33, 33, 33, 33, 33};

    /* renamed from: X */
    private static int[] f3282X = {8192, 49152, 57344, 61440, 61952, 61952, 63456, 65535};

    /* renamed from: Y */
    private static int[] f3283Y = {0, 0, 0, 0, 0, 0, 4, 44, 60, 76, 80, 80, 127};

    /* renamed from: Z */
    private static int[] f3284Z = {4096, 9216, 32768, 49152, 64000, 65535, 65535, 65535};

    /* renamed from: j */
    protected int[] f3313j = new int[4];

    /* renamed from: n */
    protected int[] f3317n = new int[256];

    /* renamed from: o */
    protected int[] f3318o = new int[256];

    /* renamed from: p */
    protected int[] f3319p = new int[256];

    /* renamed from: q */
    protected int[] f3320q = new int[256];

    /* renamed from: r */
    protected int[] f3321r = new int[256];

    /* renamed from: s */
    protected int[] f3322s = new int[256];

    /* renamed from: t */
    protected int[] f3323t = new int[256];

    /* renamed from: u */
    protected int[] f3324u = new int[256];

    /* renamed from: v */
    protected int[] f3325v = new int[256];

    /* renamed from: w */
    protected int[] f3326w = new int[256];

    /* renamed from: x */
    protected int[] f3327x = new int[256];

    /* renamed from: a */
    protected abstract void mo2191a(boolean z);

    static {
        int[] iArr = new int[13];
        iArr[6] = 2;
        iArr[7] = 7;
        iArr[8] = 53;
        iArr[9] = 117;
        iArr[10] = 233;
        f3286aa = iArr;
        f3287ab = new int[]{2048, 9216, 60928, 65152, 65535, 65535, 65535};
        int[] iArr2 = new int[13];
        iArr2[7] = 2;
        iArr2[8] = 16;
        iArr2[9] = 218;
        iArr2[10] = 251;
        f3288ac = iArr2;
        f3289ad = new int[]{65280, 65535, 65535, 65535, 65535, 65535};
        int[] iArr3 = new int[13];
        iArr3[9] = 255;
        f3290ae = iArr3;
        f3273O = new int[]{1, 3, 4, 4, 5, 6, 7, 8, 8, 4, 4, 5, 6, 6, 4, 0};
        f3274P = new int[]{0, 160, 208, 224, 240, 248, 252, 254, 255, 192, 128, 144, 152, 156, 176};
        f3275Q = new int[]{2, 3, 3, 3, 4, 4, 5, 6, 6, 4, 4, 5, 6, 6, 4, 0};
        f3276R = new int[]{0, 64, 96, 160, 208, 224, 240, 248, 252, 192, 128, 144, 152, 156, 176};
    }

    /* renamed from: b */
    protected final void m2314b(boolean z) throws IOException, com.cyo.common.p026c.p028b.C1020a {
        int i;
        if (this.f3306c) {
            this.f3314k = this.f3315l;
        } else {
            mo2191a(z);
            if (!z) {
                this.f3295E = 0;
                this.f3296F = 0;
                this.f3294D = 0;
                this.f3293C = 0;
                this.f3292B = 0;
                this.f3291A = 0;
                this.f3329z = 13568;
                this.f3302L = 8193;
                this.f3301K = 128;
                this.f3300J = 128;
            }
            this.f3299I = 0;
            this.f3328y = 0;
            this.f3297G = 0;
            this.f3298H = 0;
            this.f3310g = 0;
            m2315d();
            if (!z) {
                for (int i2 = 0; i2 < 256; i2++) {
                    int[] iArr = this.f3321r;
                    int[] iArr2 = this.f3322s;
                    this.f3323t[i2] = i2;
                    iArr2[i2] = i2;
                    iArr[i2] = i2;
                    this.f3324u[i2] = ((i2 ^ (-1)) + 1) & 255;
                    int[] iArr3 = this.f3317n;
                    int i3 = i2 << 8;
                    this.f3319p[i2] = i3;
                    iArr3[i2] = i3;
                    this.f3318o[i2] = i2;
                    this.f3320q[i2] = (((i2 ^ (-1)) + 1) & 255) << 8;
                }
                Arrays.fill(this.f3325v, 0);
                Arrays.fill(this.f3326w, 0);
                Arrays.fill(this.f3327x, 0);
                m2310a(this.f3319p, this.f3326w);
                this.f3314k = 0;
            } else {
                this.f3314k = this.f3315l;
            }
            this.f3311h--;
        }
        if (this.f3311h >= 0) {
            m2312c();
            this.f3299I = 8;
        }
        while (this.f3311h >= 0) {
            this.f3314k &= 4194303;
            if (this.f3330ak > this.f3310g - 30 && !m2315d()) {
                break;
            }
            if (((this.f3315l - this.f3314k) & 4194303) < 270 && this.f3315l != this.f3314k) {
                m2316e();
                if (this.f3306c) {
                    return;
                }
            }
            if (this.f3297G != 0) {
                m2311b();
            } else {
                int i4 = this.f3299I - 1;
                this.f3299I = i4;
                if (i4 < 0) {
                    m2312c();
                    this.f3299I = 7;
                }
                if ((this.f3328y & 128) != 0) {
                    this.f3328y <<= 1;
                    if (this.f3301K > this.f3300J) {
                        m2308a();
                    } else {
                        m2311b();
                    }
                } else {
                    this.f3328y <<= 1;
                    int i5 = this.f3299I - 1;
                    this.f3299I = i5;
                    if (i5 < 0) {
                        m2312c();
                        this.f3299I = 7;
                    }
                    if ((this.f3328y & 128) != 0) {
                        this.f3328y <<= 1;
                        if (this.f3301K > this.f3300J) {
                            m2311b();
                        } else {
                            m2308a();
                        }
                    } else {
                        this.f3328y <<= 1;
                        this.f3296F = 0;
                        int iH = m2321h();
                        if (this.f3298H == 2) {
                            m2318c(1);
                            if (iH >= 32768) {
                                m2309a(this.f3303M, this.f3304N);
                            } else {
                                iH <<= 1;
                                this.f3298H = 0;
                            }
                        }
                        int i6 = iH >>> 8;
                        if (this.f3292B < 37) {
                            int i7 = 0;
                            while (((f3274P[i7] ^ i6) & ((255 >>> m2306a(i7)) ^ (-1))) != 0) {
                                i7++;
                            }
                            m2318c(m2306a(i7));
                            i = i7;
                        } else {
                            int i8 = 0;
                            while (((f3276R[i8] ^ i6) & ((255 >> m2313d(i8)) ^ (-1))) != 0) {
                                i8++;
                            }
                            m2318c(m2313d(i8));
                            i = i8;
                        }
                        if (i < 9) {
                            this.f3298H = 0;
                            this.f3292B += i;
                            this.f3292B -= this.f3292B >> 4;
                            int iM2307a = m2307a(m2321h(), 5, f3284Z, f3286aa) & 255;
                            int i9 = this.f3318o[iM2307a];
                            int i10 = iM2307a - 1;
                            if (i10 != -1) {
                                this.f3322s[i9] = this.f3322s[i9] - 1;
                                int i11 = this.f3318o[i10];
                                int[] iArr4 = this.f3322s;
                                iArr4[i11] = iArr4[i11] + 1;
                                this.f3318o[i10 + 1] = i11;
                                this.f3318o[i10] = i9;
                            }
                            int i12 = i + 2;
                            int[] iArr5 = this.f3313j;
                            int i13 = this.f3316m;
                            this.f3316m = i13 + 1;
                            int i14 = i9 + 1;
                            iArr5[i13] = i14;
                            this.f3316m &= 3;
                            this.f3304N = i12;
                            this.f3303M = i14;
                            m2309a(i14, i12);
                        } else if (i == 9) {
                            this.f3298H++;
                            m2309a(this.f3303M, this.f3304N);
                        } else if (i == 14) {
                            this.f3298H = 0;
                            int iM2307a2 = m2307a(m2321h(), 3, f3278T, f3279U) + 5;
                            int iH2 = (m2321h() >> 1) | 32768;
                            m2318c(15);
                            this.f3304N = iM2307a2;
                            this.f3303M = iH2;
                            m2309a(iH2, iM2307a2);
                        } else {
                            this.f3298H = 0;
                            int i15 = this.f3313j[(this.f3316m - (i - 9)) & 3];
                            int iM2307a3 = m2307a(m2321h(), 2, f3285a, f3277S) + 2;
                            if (iM2307a3 == 257 && i == 10) {
                                this.f3295E ^= 1;
                            } else {
                                if (i15 > 256) {
                                    iM2307a3++;
                                }
                                if (i15 >= this.f3302L) {
                                    iM2307a3++;
                                }
                                int[] iArr6 = this.f3313j;
                                int i16 = this.f3316m;
                                this.f3316m = i16 + 1;
                                iArr6[i16] = i15;
                                this.f3316m &= 3;
                                this.f3304N = iM2307a3;
                                this.f3303M = i15;
                                m2309a(i15, iM2307a3);
                            }
                        }
                    }
                }
            }
        }
        m2316e();
    }

    /* renamed from: d */
    protected final boolean m2315d() throws IOException, com.cyo.common.p026c.p028b.C1020a {
        int i = this.f3310g - this.f3330ak;
        if (i < 0) {
            return false;
        }
        if (this.f3330ak > 16384) {
            if (i > 0) {
                System.arraycopy(this.f3332am, this.f3330ak, this.f3332am, 0, i);
            }
            this.f3330ak = 0;
            this.f3310g = i;
        } else {
            i = this.f3310g;
        }
        int iM2172a = this.f3308e.m2172a(this.f3332am, i, (32768 - i) & (-16));
        if (iM2172a > 0) {
            this.f3310g += iM2172a;
        }
        this.f3305b = this.f3310g - 30;
        return iM2172a != -1;
    }

    /* renamed from: a */
    private int m2306a(int i) {
        return i == 1 ? this.f3295E + 3 : f3273O[i];
    }

    /* renamed from: d */
    private int m2313d(int i) {
        return i == 3 ? this.f3295E + 3 : f3275Q[i];
    }

    /* renamed from: a */
    private void m2308a() {
        int iM2307a;
        int i;
        int i2;
        int i3 = 0;
        this.f3296F = 0;
        this.f3301K += 16;
        if (this.f3301K > 255) {
            this.f3301K = 144;
            this.f3300J >>>= 1;
        }
        int i4 = this.f3293C;
        int iH = m2321h();
        if (this.f3293C >= 122) {
            iH = m2307a(iH, 3, f3278T, f3279U);
        } else if (this.f3293C >= 64) {
            iH = m2307a(iH, 2, f3285a, f3277S);
        } else if (iH < 256) {
            m2318c(16);
        } else {
            while (((iH << i3) & 32768) == 0) {
                i3++;
            }
            m2318c(i3 + 1);
            iH = i3;
        }
        this.f3293C += iH;
        this.f3293C -= this.f3293C >>> 5;
        int iH2 = m2321h();
        if (this.f3291A > 10495) {
            iM2307a = m2307a(iH2, 5, f3284Z, f3286aa);
        } else if (this.f3291A > 1791) {
            iM2307a = m2307a(iH2, 5, f3282X, f3283Y);
        } else {
            iM2307a = m2307a(iH2, 4, f3280V, f3281W);
        }
        this.f3291A += iM2307a;
        this.f3291A -= this.f3291A >> 8;
        while (true) {
            int i5 = this.f3319p[iM2307a & 255];
            int[] iArr = this.f3326w;
            i = i5 + 1;
            int i6 = i5 & 255;
            i2 = iArr[i6];
            iArr[i6] = i2 + 1;
            if ((i & 255) != 0) {
                break;
            } else {
                m2310a(this.f3319p, this.f3326w);
            }
        }
        this.f3319p[iM2307a] = this.f3319p[i2];
        this.f3319p[i2] = i;
        int iH3 = ((65280 & i) | (m2321h() >>> 8)) >>> 1;
        m2318c(7);
        int i7 = this.f3294D;
        if (iH != 1 && iH != 4) {
            if (iH == 0 && iH3 <= this.f3302L) {
                this.f3294D++;
                this.f3294D -= this.f3294D >> 8;
            } else if (this.f3294D > 0) {
                this.f3294D--;
            }
        }
        int i8 = iH + 3;
        if (iH3 >= this.f3302L) {
            i8++;
        }
        if (iH3 <= 256) {
            i8 += 8;
        }
        if (i7 > 176 || (this.f3329z >= 10752 && i4 < 64)) {
            this.f3302L = 32512;
        } else {
            this.f3302L = 8193;
        }
        int[] iArr2 = this.f3313j;
        int i9 = this.f3316m;
        this.f3316m = i9 + 1;
        iArr2[i9] = iH3;
        this.f3316m &= 3;
        this.f3304N = i8;
        this.f3303M = iH3;
        m2309a(iH3, i8);
    }

    /* renamed from: b */
    private void m2311b() {
        int iM2307a;
        int iH = m2321h();
        if (this.f3329z > 30207) {
            iM2307a = m2307a(iH, 8, f3289ad, f3290ae);
        } else if (this.f3329z > 24063) {
            iM2307a = m2307a(iH, 6, f3287ab, f3288ac);
        } else if (this.f3329z > 13823) {
            iM2307a = m2307a(iH, 5, f3284Z, f3286aa);
        } else if (this.f3329z > 3583) {
            iM2307a = m2307a(iH, 5, f3282X, f3283Y);
        } else {
            iM2307a = m2307a(iH, 4, f3280V, f3281W);
        }
        int i = iM2307a & 255;
        if (this.f3297G != 0) {
            if (i == 0 && iH > 4095) {
                i = 256;
            }
            i--;
            if (i == -1) {
                int iH2 = m2321h();
                m2318c(1);
                if ((32768 & iH2) != 0) {
                    this.f3297G = 0;
                    this.f3296F = 0;
                    return;
                }
                int i2 = (iH2 & 16384) != 0 ? 4 : 3;
                m2318c(1);
                int iM2307a2 = (m2307a(m2321h(), 5, f3284Z, f3286aa) << 5) | (m2321h() >>> 11);
                m2318c(5);
                m2309a(iM2307a2, i2);
                return;
            }
        } else {
            int i3 = this.f3296F;
            this.f3296F = i3 + 1;
            if (i3 >= 16 && this.f3299I == 0) {
                this.f3297G = 1;
            }
        }
        this.f3329z += i;
        this.f3329z -= this.f3329z >>> 8;
        this.f3300J += 16;
        if (this.f3300J > 255) {
            this.f3300J = 144;
            this.f3301K >>>= 1;
        }
        byte[] bArr = this.f3312i;
        int i4 = this.f3314k;
        this.f3314k = i4 + 1;
        bArr[i4] = (byte) (this.f3317n[i] >>> 8);
        this.f3311h--;
        while (true) {
            int i5 = this.f3317n[i];
            int[] iArr = this.f3325v;
            int i6 = i5 + 1;
            int i7 = i5 & 255;
            int i8 = iArr[i7];
            iArr[i7] = i8 + 1;
            if ((i6 & 255) > 161) {
                m2310a(this.f3317n, this.f3325v);
            } else {
                this.f3317n[i] = this.f3317n[i8];
                this.f3317n[i8] = i6;
                return;
            }
        }
    }

    /* renamed from: c */
    private void m2312c() {
        int iM2307a = m2307a(m2321h(), 5, f3284Z, f3286aa);
        while (true) {
            int i = this.f3320q[iM2307a];
            this.f3328y = i >>> 8;
            int[] iArr = this.f3327x;
            int i2 = i + 1;
            int i3 = i & 255;
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            if ((i2 & 255) == 0) {
                m2310a(this.f3320q, this.f3327x);
            } else {
                this.f3320q[iM2307a] = this.f3320q[i4];
                this.f3320q[i4] = i2;
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m2310a(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            int i3 = 0;
            while (i3 < 32) {
                iArr[i] = (iArr[i] & (-256)) | i2;
                i3++;
                i++;
            }
        }
        Arrays.fill(iArr2, 0);
        for (int i4 = 6; i4 >= 0; i4--) {
            iArr2[i4] = (7 - i4) * 32;
        }
    }

    /* renamed from: a */
    private void m2309a(int i, int i2) {
        this.f3311h -= i2;
        while (true) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                this.f3312i[this.f3314k] = this.f3312i[(this.f3314k - i) & 4194303];
                this.f3314k = (this.f3314k + 1) & 4194303;
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private int m2307a(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = i & 65520;
        int i4 = 0;
        while (iArr[i4] <= i3) {
            i2++;
            i4++;
        }
        m2318c(i2);
        return ((i3 - (i4 != 0 ? iArr[i4 - 1] : 0)) >>> (16 - i2)) + iArr2[i2];
    }

    /* renamed from: e */
    protected final void m2316e() throws IOException {
        if (this.f3314k != this.f3315l) {
            this.f3309f = true;
        }
        if (this.f3314k < this.f3315l) {
            this.f3308e.m2174b(this.f3312i, this.f3315l, (-this.f3315l) & 4194303);
            this.f3308e.m2174b(this.f3312i, 0, this.f3314k);
            this.f3307d = true;
        } else {
            this.f3308e.m2174b(this.f3312i, this.f3315l, this.f3314k - this.f3315l);
        }
        this.f3315l = this.f3314k;
    }
}
