package com.cyo.common.p022a.p023a;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.a.m */
/* loaded from: classes.dex */
final class C0926m {

    /* renamed from: a */
    final /* synthetic */ C0925l f2804a;

    private C0926m(C0925l c0925l) {
        this.f2804a = c0925l;
    }

    /* synthetic */ C0926m(C0925l c0925l, byte b) {
        this(c0925l);
    }

    /* renamed from: a */
    public final synchronized void m1954a(C0925l c0925l) {
        c0925l.f2784b = true;
        if (C0925l.m1941a(this.f2804a) == c0925l) {
            C0925l.m1942a(this.f2804a, (C0925l) null);
        }
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized boolean m1955b(C0925l c0925l) {
        boolean z;
        if (C0925l.m1941a(this.f2804a) == c0925l || C0925l.m1941a(this.f2804a) == null) {
            C0925l.m1942a(this.f2804a, c0925l);
            notifyAll();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final synchronized void m1956c(C0925l c0925l) {
        if (C0925l.m1941a(this.f2804a) == c0925l) {
            C0925l.m1942a(this.f2804a, (C0925l) null);
        }
        notifyAll();
    }
}
