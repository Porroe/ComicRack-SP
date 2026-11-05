package com.cyo.common.p026c.p031e;

import com.cyo.common.p026c.p031e.p032a.C1047a;
import com.cyo.common.p026c.p031e.p032a.C1048b;
import com.cyo.common.p026c.p031e.p032a.C1049c;
import com.cyo.common.p026c.p031e.p032a.C1050d;
import com.cyo.common.p026c.p031e.p032a.C1051e;
import com.cyo.common.p026c.p031e.p032a.C1052f;
import com.cyo.common.p026c.p031e.p032a.C1053g;
import com.cyo.common.p026c.p031e.p032a.C1054h;
import java.util.Arrays;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.d */
/* loaded from: classes.dex */
public abstract class AbstractC1081d extends AbstractC1069c {

    /* renamed from: ae */
    public static final int[] f3439ae = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224};

    /* renamed from: af */
    public static final byte[] f3440af = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};

    /* renamed from: ag */
    public static final int[] f3441ag = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, 384, 512, 768, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576, 32768, 49152, 65536, 98304, 131072, 196608, 262144, 327680, 393216, 458752, 524288, 589824, 655360, 720896, 786432, 851968, 917504, 983040};

    /* renamed from: ah */
    public static final int[] f3442ah = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16};

    /* renamed from: ai */
    public static final int[] f3443ai = {0, 4, 8, 16, 32, 64, 128, 192};

    /* renamed from: aj */
    public static final int[] f3444aj = {2, 2, 3, 4, 5, 6, 6, 6};

    /* renamed from: U */
    protected int f3447U;

    /* renamed from: V */
    protected int f3448V;

    /* renamed from: W */
    protected int f3449W;

    /* renamed from: X */
    protected int f3450X;

    /* renamed from: S */
    protected C1053g[] f3445S = new C1053g[4];

    /* renamed from: T */
    protected byte[] f3446T = new byte[1028];

    /* renamed from: Y */
    protected C1047a[] f3451Y = new C1047a[4];

    /* renamed from: Z */
    protected C1051e f3452Z = new C1051e();

    /* renamed from: aa */
    protected C1050d f3453aa = new C1050d();

    /* renamed from: ab */
    protected C1052f f3454ab = new C1052f();

    /* renamed from: ac */
    protected C1054h f3455ac = new C1054h();

    /* renamed from: ad */
    protected C1048b f3456ad = new C1048b();

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void m2348c(boolean r15) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyo.common.p026c.p031e.AbstractC1081d.m2348c(boolean):void");
    }

    /* renamed from: a */
    private void m2344a(int i, int i2) {
        int[] iArr = this.f3313j;
        int i3 = this.f3316m;
        this.f3316m = i3 + 1;
        iArr[i3 & 3] = i2;
        this.f3303M = i2;
        this.f3304N = i;
        this.f3311h -= i;
        int i4 = this.f3314k - i2;
        if (i4 < 4194004 && this.f3314k < 4194004) {
            byte[] bArr = this.f3312i;
            int i5 = this.f3314k;
            this.f3314k = i5 + 1;
            int i6 = i4 + 1;
            bArr[i5] = this.f3312i[i4];
            byte[] bArr2 = this.f3312i;
            int i7 = this.f3314k;
            this.f3314k = i7 + 1;
            int i8 = i6 + 1;
            bArr2[i7] = this.f3312i[i6];
            while (i > 2) {
                i--;
                byte[] bArr3 = this.f3312i;
                int i9 = this.f3314k;
                this.f3314k = i9 + 1;
                bArr3[i9] = this.f3312i[i8];
                i8++;
            }
            return;
        }
        while (true) {
            int i10 = i - 1;
            if (i != 0) {
                this.f3312i[this.f3314k] = this.f3312i[i4 & 4194303];
                this.f3314k = (this.f3314k + 1) & 4194303;
                i4++;
                i = i10;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    protected static void m2345a(byte[] bArr, int i, C1049c c1049c, int i2) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        Arrays.fill(iArr, 0);
        Arrays.fill(c1049c.m2175a(), 0);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] & 15;
            iArr[i4] = iArr[i4] + 1;
        }
        iArr[0] = 0;
        iArr2[0] = 0;
        c1049c.f3160c[0] = 0;
        c1049c.f3159b[0] = 0;
        long j = 0;
        int i5 = 1;
        while (i5 < 16) {
            long j2 = 2 * (j + iArr[i5]);
            long j3 = j2 << (15 - i5);
            if (j3 > 65535) {
                j3 = 65535;
            }
            c1049c.f3159b[i5] = (int) j3;
            int[] iArr3 = c1049c.f3160c;
            int i6 = c1049c.f3160c[i5 - 1] + iArr[i5 - 1];
            iArr3[i5] = i6;
            iArr2[i5] = i6;
            i5++;
            j = j2;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            if (bArr[i + i7] != 0) {
                int[] iArrM2175a = c1049c.m2175a();
                int i8 = bArr[i + i7] & 15;
                int i9 = iArr2[i8];
                iArr2[i8] = i9 + 1;
                iArrM2175a[i9] = i7;
            }
        }
        c1049c.f3158a = i2;
    }

    /* renamed from: a */
    protected final int m2347a(C1049c c1049c) {
        int i = 1;
        long jG = m2320g() & 65534;
        int[] iArr = c1049c.f3159b;
        if (jG < iArr[8]) {
            if (jG < iArr[4]) {
                if (jG >= iArr[2]) {
                    i = jG < ((long) iArr[3]) ? 3 : 4;
                } else if (jG >= iArr[1]) {
                    i = 2;
                }
            } else if (jG < iArr[6]) {
                i = jG < ((long) iArr[5]) ? 5 : 6;
            } else if (jG < iArr[7]) {
                i = 7;
            } else {
                i = 8;
            }
        } else if (jG < iArr[12]) {
            if (jG < iArr[10]) {
                if (jG < iArr[9]) {
                    i = 9;
                } else {
                    i = 10;
                }
            } else if (jG < iArr[11]) {
                i = 11;
            } else {
                i = 12;
            }
        } else if (jG >= iArr[14]) {
            i = 15;
        } else if (jG < iArr[13]) {
            i = 13;
        } else {
            i = 14;
        }
        m2317b(i);
        int i2 = ((((int) jG) - iArr[i - 1]) >>> (16 - i)) + c1049c.f3160c[i];
        if (i2 >= c1049c.f3158a) {
            i2 = 0;
        }
        return c1049c.m2175a()[i2];
    }

    /* renamed from: a */
    private boolean m2346a() throws java.io.IOException, com.cyo.common.p026c.p028b.C1020a {
        int i;
        int iG;
        byte[] bArr = new byte[19];
        byte[] bArr2 = new byte[1028];
        if (this.f3330ak > this.f3310g - 25 && !m2315d()) {
            return false;
        }
        int iG2 = m2320g();
        this.f3447U = 32768 & iG2;
        if ((iG2 & 16384) == 0) {
            Arrays.fill(this.f3446T, (byte) 0);
        }
        m2317b(2);
        if (this.f3447U != 0) {
            this.f3448V = ((iG2 >>> 12) & 3) + 1;
            if (this.f3449W >= this.f3448V) {
                this.f3449W = 0;
            }
            m2317b(2);
            i = this.f3448V * 257;
        } else {
            i = 374;
        }
        for (int i2 = 0; i2 < 19; i2++) {
            bArr[i2] = (byte) (m2320g() >>> 12);
            m2317b(4);
        }
        m2345a(bArr, 0, this.f3456ad, 19);
        int i3 = 0;
        while (i3 < i) {
            if (this.f3330ak > this.f3310g - 5 && !m2315d()) {
                return false;
            }
            int iM2347a = m2347a(this.f3456ad);
            if (iM2347a < 16) {
                bArr2[i3] = (byte) ((iM2347a + this.f3446T[i3]) & 15);
                i3++;
            } else if (iM2347a == 16) {
                int iG3 = (m2320g() >>> 14) + 3;
                m2317b(2);
                while (true) {
                    int i4 = iG3 - 1;
                    if (iG3 <= 0 || i3 >= i) {
                        break;
                    }
                    bArr2[i3] = bArr2[i3 - 1];
                    i3++;
                    iG3 = i4;
                }
            } else {
                if (iM2347a == 17) {
                    iG = (m2320g() >>> 13) + 3;
                    m2317b(3);
                } else {
                    iG = (m2320g() >>> 9) + 11;
                    m2317b(7);
                }
                while (true) {
                    int i5 = iG - 1;
                    if (iG <= 0 || i3 >= i) {
                        break;
                    }
                    bArr2[i3] = 0;
                    i3++;
                    iG = i5;
                }
            }
        }
        if (this.f3330ak > this.f3310g) {
            return true;
        }
        if (this.f3447U != 0) {
            for (int i6 = 0; i6 < this.f3448V; i6++) {
                m2345a(bArr2, i6 * 257, this.f3445S[i6], 257);
            }
        } else {
            m2345a(bArr2, 0, this.f3452Z, 298);
            m2345a(bArr2, 298, this.f3453aa, 48);
            m2345a(bArr2, 346, this.f3455ac, 28);
        }
        for (int i7 = 0; i7 < this.f3446T.length; i7++) {
            this.f3446T[i7] = bArr2[i7];
        }
        return true;
    }

    /* renamed from: d */
    protected final void m2349d(boolean z) {
        if (!z) {
            this.f3449W = 0;
            this.f3450X = 0;
            this.f3448V = 1;
            Arrays.fill(this.f3451Y, new C1047a());
            Arrays.fill(this.f3446T, (byte) 0);
        }
    }
}
