package com.cyo.common.p026c.p030d;

import com.cyo.common.p026c.p029c.C1024b;
import java.util.Calendar;
import java.util.Date;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.g */
/* loaded from: classes.dex */
public final class C1033g extends C1029c {

    /* renamed from: h */
    public final int f3046h;

    /* renamed from: i */
    public byte f3047i;

    /* renamed from: j */
    public byte f3048j;

    /* renamed from: k */
    public String f3049k;

    /* renamed from: l */
    public long f3050l;

    /* renamed from: m */
    public long f3051m;

    /* renamed from: n */
    private long f3052n;

    /* renamed from: o */
    private final EnumC1035i f3053o;

    /* renamed from: p */
    private final int f3054p;

    /* renamed from: q */
    private short f3055q;

    /* renamed from: r */
    private int f3056r;

    /* renamed from: s */
    private int f3057s;

    /* renamed from: t */
    private final byte[] f3058t;

    /* renamed from: u */
    private String f3059u;

    /* renamed from: v */
    private byte[] f3060v;

    /* renamed from: w */
    private final byte[] f3061w;

    /* renamed from: x */
    private Date f3062x;

    /* renamed from: y */
    private int f3063y;

    /* renamed from: z */
    private int f3064z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1033g(C1029c c1029c, byte[] bArr) {
        super(c1029c);
        this.f3061w = new byte[8];
        this.f3064z = -1;
        this.f3052n = ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
        this.f3053o = EnumC1035i.m2159a(bArr[4]);
        this.f3046h = C1024b.m2145b(bArr, 5);
        this.f3054p = C1024b.m2145b(bArr, 9);
        this.f3047i = (byte) (this.f3047i | (bArr[13] & 255));
        this.f3048j = (byte) (this.f3048j | (bArr[14] & 255));
        this.f3055q = C1024b.m2142a(bArr, 15);
        this.f3063y = C1024b.m2145b(bArr, 17);
        int i = 21;
        if ((this.f3032d & 256) != 0) {
            this.f3056r = C1024b.m2145b(bArr, 21);
            this.f3057s = C1024b.m2145b(bArr, 25);
            i = 29;
        } else {
            this.f3056r = 0;
            this.f3057s = 0;
            if (this.f3052n == -1) {
                this.f3052n = -1L;
                this.f3057s = Integer.MAX_VALUE;
            }
        }
        this.f3050l |= this.f3056r;
        this.f3050l <<= 32;
        this.f3050l |= this.f3035g;
        this.f3051m |= this.f3057s;
        this.f3051m <<= 32;
        this.f3051m += this.f3052n;
        this.f3055q = this.f3055q > 4096 ? (short) 4096 : this.f3055q;
        this.f3058t = new byte[this.f3055q];
        int i2 = i;
        for (int i3 = 0; i3 < this.f3055q; i3++) {
            this.f3058t[i3] = bArr[i2];
            i2++;
        }
        if (EnumC1045s.FileHeader.m2171b(this.f3031c)) {
            if ((this.f3032d & 512) != 0) {
                this.f3049k = "";
                this.f3059u = "";
                int i4 = 0;
                while (i4 < this.f3058t.length && this.f3058t[i4] != 0) {
                    i4++;
                }
                byte[] bArr2 = new byte[i4];
                System.arraycopy(this.f3058t, 0, bArr2, 0, bArr2.length);
                this.f3049k = new String(bArr2);
                if (i4 != this.f3055q) {
                    this.f3059u = C1034h.m2158a(this.f3058t, i4 + 1);
                }
            } else {
                this.f3049k = new String(this.f3058t);
                this.f3059u = "";
            }
        }
        if (EnumC1045s.NewSubHeader.m2171b(this.f3031c)) {
            int i5 = (this.f3033e - 32) - this.f3055q;
            int i6 = m2153k() ? i5 - 8 : i5;
            if (i6 > 0) {
                this.f3060v = new byte[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    this.f3060v[i7] = bArr[i2];
                    i2++;
                }
            }
            if (C1039m.f3084f.m2165a(this.f3058t)) {
                this.f3064z = this.f3060v[8] + (this.f3060v[9] << 8) + (this.f3060v[10] << 16) + (this.f3060v[11] << 24);
            }
        }
        if (m2153k()) {
            for (int i8 = 0; i8 < 8; i8++) {
                this.f3061w[i8] = bArr[i2];
                i2++;
            }
        }
        int i9 = this.f3054p;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, (i9 >>> 25) + 1980);
        calendar.set(2, ((i9 >>> 21) & 15) - 1);
        calendar.set(5, (i9 >>> 16) & 31);
        calendar.set(11, (i9 >>> 11) & 31);
        calendar.set(12, (i9 >>> 5) & 63);
        calendar.set(13, (i9 & 31) * 2);
        this.f3062x = calendar.getTime();
    }

    public final String toString() {
        return super.toString();
    }

    /* renamed from: g */
    public final boolean m2154g() {
        return (this.f3032d & 2) != 0;
    }

    /* renamed from: h */
    public final boolean m2155h() {
        return (this.f3032d & 16) != 0;
    }

    /* renamed from: i */
    public final boolean m2156i() {
        return (this.f3032d & 4) != 0;
    }

    /* renamed from: k */
    private boolean m2153k() {
        return (this.f3032d & 1024) != 0;
    }

    /* renamed from: j */
    public final boolean m2157j() {
        return (this.f3032d & 224) == 224;
    }
}
