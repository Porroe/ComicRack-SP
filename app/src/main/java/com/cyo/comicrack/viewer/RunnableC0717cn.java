package com.cyo.comicrack.viewer;

import com.cyo.common.view.C1146bm;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cn */
/* loaded from: classes.dex */
final class RunnableC0717cn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComicRackApplication f2247a;

    /* renamed from: b */
    private final /* synthetic */ ActivityC0881ip f2248b;

    RunnableC0717cn(ComicRackApplication comicRackApplication, ActivityC0881ip activityC0881ip) {
        this.f2247a = comicRackApplication;
        this.f2248b = activityC0881ip;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2248b.m1880t();
        this.f2248b.mo1403g();
        C1146bm.m2419a(this.f2248b);
    }
}
