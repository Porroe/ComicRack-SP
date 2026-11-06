package com.cyo.common.p026c.p031e;

import com.cyo.common.p026c.p031e.p033b.C1058c;
import com.cyo.common.p026c.p031e.p033b.C1068m;
import com.cyo.common.p026c.p031e.p033b.EnumC1056a;
import com.cyo.common.p026c.p031e.p034c.C1070a;
import com.cyo.common.p026c.p031e.p034c.C1071b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b */
/* loaded from: classes.dex */
public final class C1055b extends AbstractC1081d {

    /* renamed from: a */
    public static int[] f3162a = {4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 14, 0, 12};

    /* renamed from: aA */
    private int f3163aA;

    /* renamed from: aB */
    private int f3164aB;

    /* renamed from: ao */
    private int f3166ao;

    /* renamed from: at */
    private int f3171at;

    /* renamed from: au */
    private boolean f3172au;

    /* renamed from: aw */
    private EnumC1056a f3174aw;

    /* renamed from: ax */
    private long f3175ax;

    /* renamed from: ay */
    private boolean f3176ay;

    /* renamed from: az */
    private boolean f3177az;

    /* renamed from: an */
    private final C1058c f3165an = new C1058c();

    /* renamed from: ap */
    private C1071b f3167ap = new C1071b();

    /* renamed from: aq */
    private List f3168aq = new ArrayList();

    /* renamed from: ar */
    private List f3169ar = new ArrayList();

    /* renamed from: as */
    private List f3170as = new ArrayList();

    /* renamed from: av */
    private byte[] f3173av = new byte[404];

    public C1055b(C1046a c1046a) {
        this.f3308e = c1046a;
        this.f3312i = null;
        this.f3306c = false;
        this.f3307d = false;
        this.f3309f = false;
    }

    /* renamed from: a */
    public final void m2192a(byte[] bArr) {
        if (bArr == null) {
            this.f3312i = new byte[4194304];
        } else {
            this.f3312i = bArr;
        }
        this.f3330ak = 0;
        mo2191a(false);
    }

    /* renamed from: a */
    public final void m2187a() {
        this.f3312i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:261:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2189a(int r12, boolean r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyo.common.p026c.p031e.C1055b.m2189a(int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x022a  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2183k() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyo.common.p026c.p031e.C1055b.m2183k():void");
    }

    /* renamed from: a */
    private void m2176a(int i, int i2) throws IOException {
        if (i2 != i) {
            this.f3309f = true;
        }
        if (i2 < i) {
            m2178a(this.f3312i, i, (-i) & 4194303);
            m2178a(this.f3312i, 0, i2);
            this.f3307d = true;
            return;
        }
        m2178a(this.f3312i, i, i2 - i);
    }

    /* renamed from: a */
    private void m2178a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f3175ax < this.f3311h) {
            long j = this.f3311h - this.f3175ax;
            this.f3308e.m2174b(bArr, i, ((long) i2) > j ? (int) j : i2);
            this.f3175ax += i2;
        }
    }

    /* renamed from: d */
    private void m2182d(int i) {
        this.f3313j[3] = this.f3313j[2];
        this.f3313j[2] = this.f3313j[1];
        this.f3313j[1] = this.f3313j[0];
        this.f3313j[0] = i;
    }

    /* renamed from: b */
    private void m2180b(int i, int i2) {
        this.f3303M = i2;
        this.f3304N = i;
    }

    /* renamed from: c */
    private void m2181c(int i, int i2) {
        int i3 = this.f3314k - i2;
        if (i3 < 0 || i3 >= 4194044 || this.f3314k >= 4194044) {
            while (true) {
                int i4 = i - 1;
                if (i != 0) {
                    this.f3312i[this.f3314k] = this.f3312i[i3 & 4194303];
                    this.f3314k = (this.f3314k + 1) & 4194303;
                    i3++;
                    i = i4;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                byte[] bArr = this.f3312i;
                int i5 = this.f3314k;
                this.f3314k = i5 + 1;
                int i6 = i3 + 1;
                bArr[i5] = this.f3312i[i3];
                i--;
                if (i <= 0) {
                    return;
                } else {
                    i3 = i6;
                }
            }
        }
    }

    @Override // com.cyo.common.p026c.p031e.AbstractC1069c
    /* renamed from: a */
    protected final void mo2191a(boolean z) {
        if (!z) {
            this.f3172au = false;
            Arrays.fill(this.f3313j, 0);
            this.f3316m = 0;
            this.f3303M = 0;
            this.f3304N = 0;
            Arrays.fill(this.f3173av, (byte) 0);
            this.f3314k = 0;
            this.f3315l = 0;
            this.f3166ao = 2;
            m2184l();
        }
        m2319f();
        this.f3177az = false;
        this.f3175ax = 0L;
        this.f3310g = 0;
        this.f3305b = 0;
        m2349d(z);
    }

    /* renamed from: l */
    private void m2184l() {
        this.f3170as.clear();
        this.f3171at = 0;
        this.f3168aq.clear();
        this.f3169ar.clear();
    }

    /* renamed from: m */
    private boolean m2185m() throws java.io.IOException, com.cyo.common.p026c.p028b.C1020a {
        int iH;
        int iH2;
        int i;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[404];
        if (this.f3330ak > this.f3310g - 25 && !m2315d()) {
            return false;
        }
        m2318c((8 - this.f3331al) & 7);
        long jH = m2321h() & (-1);
        if ((32768 & jH) != 0) {
            this.f3174aw = EnumC1056a.BLOCK_PPM;
            C1058c c1058c = this.f3165an;
            int i2 = this.f3166ao;
            return c1058c.m2207a(this);
        }
        this.f3174aw = EnumC1056a.BLOCK_LZ;
        this.f3163aA = 0;
        this.f3164aB = 0;
        if ((jH & 16384) == 0) {
            Arrays.fill(this.f3173av, (byte) 0);
        }
        m2318c(2);
        int i3 = 0;
        while (i3 < 20) {
            int iH3 = (m2321h() >>> 12) & 255;
            m2318c(4);
            if (iH3 == 15) {
                int iH4 = (m2321h() >>> 12) & 255;
                m2318c(4);
                if (iH4 == 0) {
                    bArr[i3] = 15;
                } else {
                    int i4 = iH4 + 2;
                    while (true) {
                        i = i3;
                        int i5 = i4;
                        i4 = i5 - 1;
                        if (i5 <= 0 || i >= bArr.length) {
                            break;
                        }
                        i3 = i + 1;
                        bArr[i] = 0;
                    }
                    i3 = i - 1;
                }
            } else {
                bArr[i3] = (byte) iH3;
            }
            i3++;
        }
        m2345a(bArr, 0, this.f3456ad, 20);
        int i6 = 0;
        while (i6 < 404) {
            if (this.f3330ak > this.f3310g - 5 && !m2315d()) {
                return false;
            }
            int iA = m2347a(this.f3456ad);
            if (iA < 16) {
                bArr2[i6] = (byte) ((iA + this.f3173av[i6]) & 15);
                i6++;
            } else if (iA < 18) {
                if (iA == 16) {
                    iH = (m2321h() >>> 13) + 3;
                    m2318c(3);
                } else {
                    iH = (m2321h() >>> 9) + 11;
                    m2318c(7);
                }
                while (true) {
                    int i7 = iH - 1;
                    if (iH <= 0 || i6 >= 404) {
                        break;
                    }
                    bArr2[i6] = bArr2[i6 - 1];
                    i6++;
                    iH = i7;
                }
            } else {
                if (iA == 18) {
                    iH2 = (m2321h() >>> 13) + 3;
                    m2318c(3);
                } else {
                    iH2 = (m2321h() >>> 9) + 11;
                    m2318c(7);
                }
                while (true) {
                    int i8 = iH2 - 1;
                    if (iH2 <= 0 || i6 >= 404) {
                        break;
                    }
                    bArr2[i6] = 0;
                    i6++;
                    iH2 = i8;
                }
            }
        }
        this.f3172au = true;
        if (this.f3330ak > this.f3310g) {
            return false;
        }
        m2345a(bArr2, 0, this.f3452Z, 299);
        m2345a(bArr2, 299, this.f3453aa, 60);
        m2345a(bArr2, 359, this.f3454ab, 17);
        m2345a(bArr2, 376, this.f3455ac, 28);
        for (int i9 = 0; i9 < this.f3173av.length; i9++) {
            this.f3173av[i9] = bArr2[i9];
        }
        return true;
    }

    /* renamed from: n */
    private boolean m2186n() throws java.io.IOException, com.cyo.common.p026c.p028b.C1020a {
        int iG = m2320g() >> 8;
        m2317b(8);
        int iG2 = (iG & 7) + 1;
        if (iG2 == 7) {
            iG2 = (m2320g() >> 8) + 7;
            m2317b(8);
        } else if (iG2 == 8) {
            iG2 = m2320g();
            m2317b(16);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iG2; i++) {
            if (this.f3330ak >= this.f3310g - 1 && !m2315d() && i < iG2 - 1) {
                return false;
            }
            arrayList.add(Byte.valueOf((byte) (m2320g() >> 8)));
            m2317b(8);
        }
        return m2179a(iG, arrayList);
    }

    /* renamed from: a */
    private boolean m2179a(int i, List list) {
        int i2;
        C1082e c1082e;
        int iIntValue;
        C1082e c1082e2;
        int iM2324a;
        C1070a c1070a = new C1070a();
        c1070a.m2319f();
        for (int i3 = 0; i3 < Math.min(32768, list.size()); i3++) {
            c1070a.m2323j()[i3] = ((Byte) list.get(i3)).byteValue();
        }
        C1071b c1071b = this.f3167ap;
        if (c1071b.f3335a == null) {
            c1071b.f3335a = new byte[262148];
        }
        if ((i & 128) != 0) {
            int iM2324a2 = C1071b.m2324a(c1070a);
            if (iM2324a2 == 0) {
                m2184l();
                i2 = iM2324a2;
            } else {
                i2 = iM2324a2 - 1;
            }
        } else {
            i2 = this.f3171at;
        }
        if (i2 > this.f3168aq.size() || i2 > this.f3170as.size()) {
            return false;
        }
        this.f3171at = i2;
        boolean z = i2 == this.f3168aq.size();
        C1082e c1082e3 = new C1082e();
        if (z) {
            if (i2 > 1024) {
                return false;
            }
            C1082e c1082e4 = new C1082e();
            this.f3168aq.add(c1082e4);
            c1082e3.f3461e = this.f3168aq.size() - 1;
            this.f3170as.add(0);
            c1082e4.f3459c = 0;
            c1082e = c1082e4;
        } else {
            C1082e c1082e5 = (C1082e) this.f3168aq.get(i2);
            c1082e3.f3461e = i2;
            c1082e5.f3459c++;
            c1082e = c1082e5;
        }
        this.f3169ar.add(c1082e3);
        c1082e3.f3459c = c1082e.f3459c;
        int iM2324a3 = C1071b.m2324a(c1070a);
        int i4 = (i & 64) != 0 ? iM2324a3 + 258 : iM2324a3;
        c1082e3.f3457a = (this.f3314k + i4) & 4194303;
        if ((i & 32) != 0) {
            iIntValue = C1071b.m2324a(c1070a);
            c1082e2 = c1082e3;
        } else if (i2 < this.f3170as.size()) {
            iIntValue = ((Integer) this.f3170as.get(i2)).intValue();
            c1082e2 = c1082e3;
        } else {
            iIntValue = 0;
            c1082e2 = c1082e3;
        }
        c1082e2.f3458b = iIntValue;
        c1082e3.f3460d = this.f3315l != this.f3314k && ((this.f3315l - this.f3314k) & 4194303) <= i4;
        this.f3170as.set(i2, Integer.valueOf(c1082e3.f3458b));
        Arrays.fill(c1082e3.f3462f.f3423f, 0);
        c1082e3.f3462f.f3423f[3] = 245760;
        c1082e3.f3462f.f3423f[4] = c1082e3.f3458b;
        c1082e3.f3462f.f3423f[5] = c1082e3.f3459c;
        if ((i & 16) != 0) {
            int iM2321h = c1070a.m2321h() >>> 9;
            c1070a.m2318c(7);
            for (int i5 = 0; i5 < 7; i5++) {
                if (((1 << i5) & iM2321h) != 0) {
                    c1082e3.f3462f.f3423f[i5] = C1071b.m2324a(c1070a);
                }
            }
        }
        if (z) {
            int iM2324a4 = C1071b.m2324a(c1070a);
            if (iM2324a4 >= 65536 || iM2324a4 == 0) {
                return false;
            }
            byte[] bArr = new byte[iM2324a4];
            for (int i6 = 0; i6 < iM2324a4; i6++) {
                if (c1070a.m2322i()) {
                    return false;
                }
                bArr[i6] = (byte) (c1070a.m2321h() >> 8);
                c1070a.m2318c(8);
            }
            this.f3167ap.m2335a(bArr, iM2324a4, c1082e.f3462f);
        }
        c1082e3.f3462f.f3419b = c1082e.f3462f.f3418a;
        c1082e3.f3462f.f3420c = c1082e.f3462f.f3420c;
        int size = c1082e.f3462f.f3422e.size();
        if (size > 0 && size < 8192) {
            c1082e3.f3462f.f3422e = c1082e.f3462f.f3422e;
        }
        if (c1082e3.f3462f.f3421d.size() < 64) {
            c1082e3.f3462f.f3421d.clear();
            c1082e3.f3462f.f3421d.setSize(64);
        }
        Vector vector = c1082e3.f3462f.f3421d;
        for (int i7 = 0; i7 < 7; i7++) {
            C1071b c1071b2 = this.f3167ap;
            C1071b.m2326a(vector, i7 * 4, c1082e3.f3462f.f3423f[i7]);
        }
        C1071b c1071b3 = this.f3167ap;
        C1071b.m2326a(vector, 28, c1082e3.f3458b);
        C1071b c1071b4 = this.f3167ap;
        C1071b.m2326a(vector, 32, 0);
        C1071b c1071b5 = this.f3167ap;
        C1071b.m2326a(vector, 36, 0);
        C1071b c1071b6 = this.f3167ap;
        C1071b.m2326a(vector, 40, 0);
        C1071b c1071b7 = this.f3167ap;
        C1071b.m2326a(vector, 44, c1082e3.f3459c);
        for (int i8 = 0; i8 < 16; i8++) {
            vector.set(i8 + 48, (byte) 0);
        }
        if ((i & 8) != 0) {
            if (c1070a.m2322i() || (iM2324a = C1071b.m2324a(c1070a)) > 8128) {
                return false;
            }
            int size2 = c1082e3.f3462f.f3421d.size();
            if (size2 < iM2324a + 64) {
                c1082e3.f3462f.f3421d.setSize((iM2324a + 64) - size2);
            }
            Vector vector2 = c1082e3.f3462f.f3421d;
            for (int i9 = 0; i9 < iM2324a; i9++) {
                if (c1070a.m2322i()) {
                    return false;
                }
                vector2.set(i9 + 64, Byte.valueOf((byte) (c1070a.m2321h() >>> 8)));
                c1070a.m2318c(8);
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0e73  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2177a(com.cyo.common.p026c.p031e.p034c.C1078i r30) {
        /*
            Method dump skipped, instructions count: 4160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyo.common.p026c.p031e.C1055b.m2177a(com.cyo.common.c.e.c.i):void");
    }

    /* renamed from: a */
    public final void m2190a(long j) {
        this.f3311h = j;
        this.f3176ay = false;
    }

    /* renamed from: b */
    public final int m2193b() throws java.io.IOException, com.cyo.common.p026c.p028b.C1020a {
        if (this.f3330ak > 32738) {
            m2315d();
        }
        byte[] bArr = this.f3332am;
        int i = this.f3330ak;
        this.f3330ak = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: a */
    public final void m2188a(int i) {
        this.f3166ao = i;
    }

    /* renamed from: c */
    public final void m2194c() {
        C1068m c1068mM2205a;
        if (this.f3165an != null && (c1068mM2205a = this.f3165an.m2205a()) != null) {
            c1068mM2205a.m2296b();
        }
    }
}
