package com.p004a.p005a;

import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0372i;
import java.lang.ref.WeakReference;

/* compiled from: DontLook */
/* renamed from: com.a.a.r */
/* loaded from: classes.dex */
public final class RunnableC0402r implements Runnable {

    /* renamed from: a */
    private WeakReference f1115a;

    public RunnableC0402r(C0308w c0308w) {
        this.f1115a = new WeakReference(c0308w);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0308w c0308w = (C0308w) this.f1115a.get();
        if (c0308w == null) {
            C0372i.m911a("The ad must be gone, so cancelling the refresh timer.");
        } else {
            c0308w.m799x();
        }
    }
}
