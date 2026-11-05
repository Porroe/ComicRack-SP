package android.support.v4.app;

import android.os.Handler;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.t */
/* loaded from: classes.dex */
final class RunnableC0084t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f323a;

    /* renamed from: b */
    final /* synthetic */ int f324b = 1;

    /* renamed from: c */
    final /* synthetic */ LayoutInflaterFactoryC0082r f325c;

    RunnableC0084t(LayoutInflaterFactoryC0082r layoutInflaterFactoryC0082r, int i) {
        this.f325c = layoutInflaterFactoryC0082r;
        this.f323a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactoryC0082r layoutInflaterFactoryC0082r = this.f325c;
        Handler handler = this.f325c.f311o.f273a;
        layoutInflaterFactoryC0082r.m219a(this.f323a, this.f324b);
    }
}
