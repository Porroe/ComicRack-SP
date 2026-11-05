package com.cyo.common.p026c.p031e.p033b;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.k */
/* loaded from: classes.dex */
public final class C1066k extends AbstractC1060e {
    public C1066k(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public final C1066k m2271a(byte[] bArr) {
        this.f3231c = bArr;
        this.f3232d = 0;
        return this;
    }

    /* renamed from: a */
    public final int m2270a() {
        return this.f3231c[this.f3232d] & 255;
    }

    /* renamed from: a */
    public final void m2272a(int i) {
        this.f3231c[this.f3232d] = (byte) i;
    }

    /* renamed from: b */
    public final int m2276b() {
        return this.f3231c[this.f3232d + 1] & 255;
    }

    /* renamed from: b */
    public final void m2277b(int i) {
        this.f3231c[this.f3232d + 1] = (byte) i;
    }

    /* renamed from: d */
    public final void m2280d(int i) {
        byte[] bArr = this.f3231c;
        int i2 = this.f3232d + 1;
        bArr[i2] = (byte) (bArr[i2] + i);
    }

    /* renamed from: c */
    public final int m2278c() {
        return C1024b.m2145b(this.f3231c, this.f3232d + 2);
    }

    /* renamed from: a */
    public final void m2273a(C1059d c1059d) {
        m2281e(c1059d.m2246e());
    }

    /* renamed from: e */
    public final void m2281e(int i) {
        C1024b.m2143a(this.f3231c, this.f3232d + 2, i);
    }

    /* renamed from: a */
    public final void m2275a(C1067l c1067l) {
        m2272a(c1067l.f3249a);
        m2277b(c1067l.f3250b);
        m2281e(c1067l.f3251c);
    }

    /* renamed from: a */
    public final void m2274a(C1066k c1066k) {
        System.arraycopy(c1066k.f3231c, c1066k.f3232d, this.f3231c, this.f3232d, 6);
    }

    /* renamed from: d */
    public final C1066k m2279d() {
        mo2243c(this.f3232d - 6);
        return this;
    }

    /* renamed from: f */
    public final C1066k m2282f() {
        mo2243c(this.f3232d + 6);
        return this;
    }

    /* renamed from: a */
    public static void m2269a(C1066k c1066k, C1066k c1066k2) {
        byte[] bArr = c1066k.f3231c;
        byte[] bArr2 = c1066k2.f3231c;
        int i = 0;
        int i2 = c1066k.f3232d;
        int i3 = c1066k2.f3232d;
        while (i < 6) {
            byte b = bArr[i2];
            bArr[i2] = bArr2[i3];
            bArr2[i3] = b;
            i++;
            i2++;
            i3++;
        }
    }

    public final String toString() {
        return "State[\n  pos=" + this.f3232d + "\n  size=6\n  symbol=" + m2270a() + "\n  freq=" + m2276b() + "\n  successor=" + m2278c() + "\n]";
    }
}
