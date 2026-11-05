package com.cyo.common.p026c.p031e.p033b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.l */
/* loaded from: classes.dex */
public final class C1067l {

    /* renamed from: a */
    int f3249a;

    /* renamed from: b */
    int f3250b;

    /* renamed from: c */
    int f3251c;

    /* renamed from: a */
    public final void m2283a(int i) {
        this.f3249a = i & 255;
    }

    /* renamed from: b */
    public final void m2285b(int i) {
        this.f3250b = i & 255;
    }

    /* renamed from: a */
    public final void m2284a(C1066k c1066k) {
        m2285b(c1066k.m2276b());
        this.f3251c = c1066k.m2278c();
        m2283a(c1066k.m2270a());
    }

    public final String toString() {
        return "State[\n  symbol=" + this.f3249a + "\n  freq=" + this.f3250b + "\n  successor=" + this.f3251c + "\n]";
    }
}
