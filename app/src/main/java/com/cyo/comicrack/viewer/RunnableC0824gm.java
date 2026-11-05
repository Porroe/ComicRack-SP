package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.p021b.InterfaceC0606h;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gm */
/* loaded from: classes.dex */
final class RunnableC0824gm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2518a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC0606h f2519b;

    /* renamed from: c */
    private final /* synthetic */ int f2520c;

    RunnableC0824gm(ReaderActivity readerActivity, InterfaceC0606h interfaceC0606h, int i) {
        this.f2518a = readerActivity;
        this.f2519b = interfaceC0606h;
        this.f2520c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (ReaderActivity.m1596f(this.f2518a) == this.f2519b && ReaderActivity.m1607n(this.f2518a) == 0) {
            ReaderActivity.m1574a(this.f2518a, this.f2520c, true);
        }
    }
}
