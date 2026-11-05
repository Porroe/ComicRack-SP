package com.cyo.comicrack.viewer;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ig */
/* loaded from: classes.dex */
final class RunnableC0872ig implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SplashActivity f2648a;

    /* renamed from: b */
    private final /* synthetic */ int f2649b;

    /* renamed from: c */
    private final /* synthetic */ boolean f2650c;

    RunnableC0872ig(SplashActivity splashActivity, int i, boolean z) {
        this.f2648a = splashActivity;
        this.f2649b = i;
        this.f2650c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2649b != 0) {
            SplashActivity.m1644f(this.f2648a).setText(this.f2649b);
        }
        SplashActivity.m1644f(this.f2648a).setVisibility(this.f2649b != 0 ? 0 : 4);
        SplashActivity.m1640b(this.f2648a).setVisibility(!this.f2650c ? 0 : 8);
        SplashActivity.m1645g(this.f2648a).setVisibility(this.f2650c ? 0 : 8);
    }
}
