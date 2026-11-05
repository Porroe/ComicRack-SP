package com.cyo.common.p026c.p031e.p033b;

import com.cyo.common.p026c.p031e.C1055b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.f */
/* loaded from: classes.dex */
public final class C1061f {

    /* renamed from: a */
    long f3233a;

    /* renamed from: b */
    long f3234b;

    /* renamed from: c */
    long f3235c;

    /* renamed from: d */
    final C1062g f3236d = new C1062g();

    /* renamed from: e */
    C1055b f3237e;

    /* renamed from: a */
    public final int m2247a() {
        this.f3235c = (this.f3235c / this.f3236d.f3239b) & 4294967295L;
        return (int) ((this.f3234b - this.f3233a) / this.f3235c);
    }

    /* renamed from: b */
    public final void m2248b() {
        this.f3233a = (this.f3233a + (this.f3235c * this.f3236d.m2250a())) & 4294967295L;
        this.f3235c = (this.f3235c * (this.f3236d.f3238a - this.f3236d.m2250a())) & 4294967295L;
    }

    /* renamed from: c */
    public final void m2249c() throws java.io.IOException, com.cyo.common.p026c.p028b.C1020a {
        boolean z = false;
        while (true) {
            if ((this.f3233a ^ (this.f3233a + this.f3235c)) >= 16777216) {
                z = this.f3235c < 32768;
                if (!z) {
                    return;
                }
            }
            if (z) {
                this.f3235c = (-this.f3233a) & 32767 & 4294967295L;
                z = false;
            }
            this.f3234b = ((this.f3234b << 8) | this.f3237e.m2193b()) & 4294967295L;
            this.f3235c = (this.f3235c << 8) & 4294967295L;
            this.f3233a = (this.f3233a << 8) & 4294967295L;
        }
    }

    public final String toString() {
        return "RangeCoder[\n  low=" + this.f3233a + "\n  code=" + this.f3234b + "\n  range=" + this.f3235c + "\n  subrange=" + this.f3236d + "]";
    }
}
