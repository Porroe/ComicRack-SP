package com.cyo.comicrack.viewer;

import java.util.TimerTask;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ik */
/* loaded from: classes.dex */
final class C0876ik extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ C0874ii f2660a;

    C0876ik(C0874ii c0874ii) {
        this.f2660a = c0874ii;
    }

    /* renamed from: a */
    static /* synthetic */ C0874ii m1867a(C0876ik c0876ik) {
        return c0876ik.f2660a;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f2660a.f2653g.post(new RunnableC0877il(this));
    }
}
