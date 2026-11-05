package com.p004a.p005a.p011e;

import com.p004a.p005a.C0332bu;
import com.p004a.p005a.C0392h;
import com.p004a.p005a.p007b.C0275a;
import com.p004a.p005a.p007b.C0290e;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.e */
/* loaded from: classes.dex */
public final class C0368e extends C0290e {
    public C0368e(C0332bu c0332bu, C0392h c0392h) {
        super(c0332bu, c0392h);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f775b.f966e.m898a() != null) {
            return !((C0275a) this.f775b.f966e.m898a()).f719a;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.f775b.f966e.m898a() != null) {
            return !((C0275a) this.f775b.f966e.m898a()).f719a;
        }
        return super.canScrollVertically(i);
    }
}
