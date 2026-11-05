package com.cyo.common.p026c.p031e.p033b;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.b.i */
/* loaded from: classes.dex */
public final class C1064i extends AbstractC1060e {

    /* renamed from: a */
    private int f3245a;

    public C1064i(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public final int m2266a() {
        if (this.f3231c != null) {
            this.f3245a = C1024b.m2145b(this.f3231c, this.f3232d);
        }
        return this.f3245a;
    }

    /* renamed from: a */
    public final void m2268a(C1064i c1064i) {
        m2267a(c1064i.m2246e());
    }

    /* renamed from: a */
    public final void m2267a(int i) {
        this.f3245a = i;
        if (this.f3231c != null) {
            C1024b.m2143a(this.f3231c, this.f3232d, i);
        }
    }

    public final String toString() {
        return "State[\n  pos=" + this.f3232d + "\n  size=4\n  next=" + m2266a() + "\n]";
    }
}
