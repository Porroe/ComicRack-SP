package com.cyo.common.p026c.p031e.p033b;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.b */
/* loaded from: classes.dex */
public final class C1057b extends AbstractC1060e {
    public C1057b(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public final C1057b m2196a(byte[] bArr) {
        this.f3231c = bArr;
        this.f3232d = 0;
        return this;
    }

    /* renamed from: a */
    public final int m2195a() {
        return C1024b.m2142a(this.f3231c, this.f3232d) & 65535;
    }

    /* renamed from: a */
    public final void m2197a(int i) {
        C1024b.m2144a(this.f3231c, this.f3232d, (short) i);
    }

    /* renamed from: b */
    public final void m2201b(int i) {
        byte[] bArr = this.f3231c;
        int i2 = this.f3232d;
        int i3 = ((bArr[i2] & 255) + (i & 255)) >>> 8;
        bArr[i2] = (byte) (bArr[i2] + (i & 255));
        if (i3 > 0 || (65280 & i) != 0) {
            int i4 = i2 + 1;
            bArr[i4] = (byte) (i3 + ((i >>> 8) & 255) + bArr[i4]);
        }
    }

    /* renamed from: b */
    public final int m2200b() {
        return C1024b.m2145b(this.f3231c, this.f3232d + 2);
    }

    /* renamed from: a */
    public final void m2198a(C1066k c1066k) {
        m2199a_(c1066k.m2246e());
    }

    /* renamed from: a_ */
    public final void m2199a_(int i) {
        C1024b.m2143a(this.f3231c, this.f3232d + 2, i);
    }

    public final String toString() {
        return "FreqData[\n  pos=" + this.f3232d + "\n  size=6\n  summFreq=" + m2195a() + "\n  stats=" + m2200b() + "\n]";
    }
}
