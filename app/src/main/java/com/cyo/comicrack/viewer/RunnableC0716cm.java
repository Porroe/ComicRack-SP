package com.cyo.comicrack.viewer;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cm */
/* loaded from: classes.dex */
final class RunnableC0716cm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComicRackApplication f2244a;

    /* renamed from: b */
    private final /* synthetic */ ActivityC0881ip f2245b;

    /* renamed from: c */
    private final /* synthetic */ Runnable f2246c;

    RunnableC0716cm(ComicRackApplication comicRackApplication, ActivityC0881ip activityC0881ip, Runnable runnable) {
        this.f2244a = comicRackApplication;
        this.f2245b = activityC0881ip;
        this.f2246c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0649a.m1697b(this.f2245b, this.f2246c);
    }
}
