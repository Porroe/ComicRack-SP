package com.cyo.common.p026c.p031e.p033b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.g */
/* loaded from: classes.dex */
public final class C1062g {

    /* renamed from: a */
    long f3238a;

    /* renamed from: b */
    long f3239b;

    /* renamed from: c */
    private long f3240c;

    /* renamed from: a */
    public final void m2251a(long j) {
        this.f3238a = 4294967295L & j;
    }

    /* renamed from: a */
    public final long m2250a() {
        return this.f3240c & 4294967295L;
    }

    /* renamed from: b */
    public final void m2252b(long j) {
        this.f3240c = 4294967295L & j;
    }

    /* renamed from: c */
    public final void m2253c(long j) {
        this.f3239b = 4294967295L & j;
    }

    public final String toString() {
        return "SubRange[\n  lowCount=" + this.f3240c + "\n  highCount=" + this.f3238a + "\n  scale=" + this.f3239b + "]";
    }
}
