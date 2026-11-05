package com.cyo.common.p026c.p031e.p034c;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.c.a */
/* loaded from: classes.dex */
public class C1070a {

    /* renamed from: ak */
    protected int f3330ak;

    /* renamed from: al */
    protected int f3331al;

    /* renamed from: am */
    protected byte[] f3332am = new byte[32768];

    /* renamed from: f */
    public final void m2319f() {
        this.f3330ak = 0;
        this.f3331al = 0;
    }

    /* renamed from: b */
    public final void m2317b(int i) {
        int i2 = this.f3331al + i;
        this.f3330ak += i2 >> 3;
        this.f3331al = i2 & 7;
    }

    /* renamed from: g */
    public final int m2320g() {
        return (((((this.f3332am[this.f3330ak] & 255) << 16) + ((this.f3332am[this.f3330ak + 1] & 255) << 8)) + (this.f3332am[this.f3330ak + 2] & 255)) >>> (8 - this.f3331al)) & 65535;
    }

    /* renamed from: c */
    public final void m2318c(int i) {
        m2317b(i);
    }

    /* renamed from: h */
    public final int m2321h() {
        return m2320g();
    }

    /* renamed from: i */
    public final boolean m2322i() {
        return this.f3330ak + 3 >= 32768;
    }

    /* renamed from: j */
    public final byte[] m2323j() {
        return this.f3332am;
    }
}
