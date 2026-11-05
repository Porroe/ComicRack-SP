package com.p004a.p012b.p013a.p014a;

/* renamed from: com.a.b.a.a.e */
/* loaded from: classes.dex */
final class C0432e {

    /* renamed from: a */
    C0431d[] f1371a = new C0431d[5];

    /* renamed from: b */
    static void m966b(int i) {
        if (i <= 0 || i > 5) {
            throw new IllegalArgumentException("Index must be between 1 and 5 inclusive.");
        }
    }

    /* renamed from: a */
    public final C0431d m967a(int i) {
        m966b(i);
        return this.f1371a[i - 1];
    }

    /* renamed from: a */
    public final void m968a(C0431d c0431d) {
        m966b(c0431d.f1370d);
        this.f1371a[c0431d.f1370d - 1] = c0431d;
    }

    /* renamed from: a */
    public final C0431d[] m969a() {
        return (C0431d[]) this.f1371a.clone();
    }

    /* renamed from: b */
    public final boolean m970b() {
        for (int i = 0; i < this.f1371a.length; i++) {
            if (this.f1371a[i] != null) {
                return true;
            }
        }
        return false;
    }
}
