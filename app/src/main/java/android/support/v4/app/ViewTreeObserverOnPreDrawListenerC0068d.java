package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.d */
/* loaded from: classes.dex */
final class ViewTreeObserverOnPreDrawListenerC0068d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f244a;

    /* renamed from: b */
    final /* synthetic */ C0070f f245b;

    /* renamed from: c */
    final /* synthetic */ int f246c;

    /* renamed from: d */
    final /* synthetic */ Object f247d;

    /* renamed from: e */
    final /* synthetic */ RunnableC0002a f248e;

    ViewTreeObserverOnPreDrawListenerC0068d(RunnableC0002a runnableC0002a, View view, C0070f c0070f, int i, Object obj) {
        this.f248e = runnableC0002a;
        this.f244a = view;
        this.f245b = c0070f;
        this.f246c = i;
        this.f247d = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f244a.getViewTreeObserver().removeOnPreDrawListener(this);
        RunnableC0002a.m78a(this.f248e, this.f245b, this.f246c, this.f247d);
        return true;
    }
}
