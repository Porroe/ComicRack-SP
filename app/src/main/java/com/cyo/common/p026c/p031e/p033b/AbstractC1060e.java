package com.cyo.common.p026c.p031e.p033b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.e */
/* loaded from: classes.dex */
public abstract class AbstractC1060e {

    /* renamed from: e */
    static final /* synthetic */ boolean f3230e;

    /* renamed from: c */
    protected byte[] f3231c;

    /* renamed from: d */
    protected int f3232d;

    static {
        f3230e = !AbstractC1060e.class.desiredAssertionStatus();
    }

    public AbstractC1060e(byte[] bArr) {
        this.f3231c = bArr;
    }

    /* renamed from: e */
    public final int m2246e() {
        if (f3230e || this.f3231c != null) {
            return this.f3232d;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public void mo2243c(int i) {
        if (!f3230e && this.f3231c == null) {
            throw new AssertionError();
        }
        if (!f3230e && (i < 0 || i >= this.f3231c.length)) {
            throw new AssertionError(i);
        }
        this.f3232d = i;
    }
}
