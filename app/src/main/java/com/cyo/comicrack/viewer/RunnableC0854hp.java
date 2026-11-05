package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.p021b.InterfaceC0606h;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hp */
/* loaded from: classes.dex */
final class RunnableC0854hp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0853ho f2572a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC0606h f2573b;

    RunnableC0854hp(C0853ho c0853ho, InterfaceC0606h interfaceC0606h) {
        this.f2572a = c0853ho;
        this.f2573b = interfaceC0606h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2572a.f2570c) {
            this.f2572a.f2568a = this.f2573b.mo1304b(this.f2572a.f2569b);
            if (ReaderActivity.m1589d(this.f2572a.f2571d) != EnumC0855hq.None) {
                this.f2572a.f2568a = ReaderActivity.m1545a(this.f2572a.f2571d, this.f2572a.f2568a);
            }
            this.f2572a.f2570c.notifyAll();
        }
    }
}
