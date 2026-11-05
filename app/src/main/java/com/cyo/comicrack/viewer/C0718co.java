package com.cyo.comicrack.viewer;

import java.util.TimerTask;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.co */
/* loaded from: classes.dex */
final class C0718co extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ ComicRackApplication f2249a;

    /* renamed from: b */
    private final /* synthetic */ ActivityC0881ip f2250b;

    C0718co(ComicRackApplication comicRackApplication, ActivityC0881ip activityC0881ip) {
        this.f2249a = comicRackApplication;
        this.f2250b = activityC0881ip;
    }

    /* renamed from: a */
    static /* synthetic */ ComicRackApplication m1743a(C0718co c0718co) {
        return c0718co.f2249a;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (!ComicRackApplication.m1409a(this.f2249a) && !this.f2249a.m1444h()) {
            ComicRackApplication.m1410b(this.f2249a).post(new RunnableC0719cp(this, this.f2250b));
        }
    }
}
