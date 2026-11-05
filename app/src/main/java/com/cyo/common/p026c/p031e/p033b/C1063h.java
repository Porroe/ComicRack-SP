package com.cyo.common.p026c.p031e.p033b;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.h */
/* loaded from: classes.dex */
public final class C1063h extends AbstractC1060e {

    /* renamed from: a */
    private int f3241a;

    /* renamed from: b */
    private int f3242b;

    /* renamed from: f */
    private int f3243f;

    /* renamed from: g */
    private int f3244g;

    public C1063h(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public final void m2259a(C1063h c1063h) {
        C1063h c1063h2 = new C1063h(this.f3231c);
        m2255d(c1063h.m2246e());
        c1063h2.mo2243c(m2256g());
        m2254b(c1063h2.m2260b());
        c1063h2.m2261b(this);
        c1063h2.mo2243c(m2260b());
        c1063h2.m2263c(this);
    }

    /* renamed from: a */
    public final void m2257a() {
        C1063h c1063h = new C1063h(this.f3231c);
        c1063h.mo2243c(m2256g());
        c1063h.m2254b(m2260b());
        c1063h.mo2243c(m2260b());
        c1063h.m2255d(m2256g());
    }

    /* renamed from: b */
    public final int m2260b() {
        if (this.f3231c != null) {
            this.f3243f = C1024b.m2145b(this.f3231c, this.f3232d + 4);
        }
        return this.f3243f;
    }

    /* renamed from: b */
    public final void m2261b(C1063h c1063h) {
        m2254b(c1063h.m2246e());
    }

    /* renamed from: b */
    private void m2254b(int i) {
        this.f3243f = i;
        if (this.f3231c != null) {
            C1024b.m2143a(this.f3231c, this.f3232d + 4, i);
        }
    }

    /* renamed from: c */
    public final int m2262c() {
        if (this.f3231c != null) {
            this.f3242b = C1024b.m2142a(this.f3231c, this.f3232d + 2) & 65535;
        }
        return this.f3242b;
    }

    /* renamed from: a */
    public final void m2258a(int i) {
        this.f3242b = 65535 & i;
        if (this.f3231c != null) {
            C1024b.m2144a(this.f3231c, this.f3232d + 2, (short) i);
        }
    }

    /* renamed from: g */
    private int m2256g() {
        if (this.f3231c != null) {
            this.f3244g = C1024b.m2145b(this.f3231c, this.f3232d + 8);
        }
        return this.f3244g;
    }

    /* renamed from: c */
    public final void m2263c(C1063h c1063h) {
        m2255d(c1063h.m2246e());
    }

    /* renamed from: d */
    private void m2255d(int i) {
        this.f3244g = i;
        if (this.f3231c != null) {
            C1024b.m2143a(this.f3231c, this.f3232d + 8, i);
        }
    }

    /* renamed from: d */
    public final int m2264d() {
        if (this.f3231c != null) {
            this.f3241a = C1024b.m2142a(this.f3231c, this.f3232d) & 65535;
        }
        return this.f3241a;
    }

    /* renamed from: f */
    public final void m2265f() {
        this.f3241a = 65535;
        if (this.f3231c != null) {
            C1024b.m2144a(this.f3231c, this.f3232d, (short) -1);
        }
    }
}
