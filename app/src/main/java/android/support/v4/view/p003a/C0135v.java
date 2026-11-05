package android.support.v4.view.p003a;

import android.os.Build;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.a.v */
/* loaded from: classes.dex */
public final class C0135v {

    /* renamed from: a */
    private static final InterfaceC0138y f472a;

    /* renamed from: b */
    private final Object f473b;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f472a = new C0139z();
        } else if (Build.VERSION.SDK_INT >= 15) {
            f472a = new C0137x();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f472a = new C0136w();
        } else {
            f472a = new C0114aa();
        }
    }

    private C0135v(Object obj) {
        this.f473b = obj;
    }

    /* renamed from: a */
    public static C0135v m383a() {
        return new C0135v(f472a.mo343a());
    }

    /* renamed from: a */
    public final void m385a(boolean z) {
        f472a.mo345a(this.f473b, z);
    }

    /* renamed from: a */
    public final void m384a(int i) {
        f472a.mo346b(this.f473b, i);
    }

    /* renamed from: b */
    public final void m386b(int i) {
        f472a.mo344a(this.f473b, i);
    }

    /* renamed from: c */
    public final void m387c(int i) {
        f472a.mo347c(this.f473b, i);
    }

    public final int hashCode() {
        if (this.f473b == null) {
            return 0;
        }
        return this.f473b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0135v c0135v = (C0135v) obj;
            return this.f473b == null ? c0135v.f473b == null : this.f473b.equals(c0135v.f473b);
        }
        return false;
    }
}
