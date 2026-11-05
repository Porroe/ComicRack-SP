package android.support.v4.app;

import android.view.animation.Animation;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.u */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC0085u implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ Fragment f326a;

    /* renamed from: b */
    final /* synthetic */ LayoutInflaterFactoryC0082r f327b;

    AnimationAnimationListenerC0085u(LayoutInflaterFactoryC0082r layoutInflaterFactoryC0082r, Fragment fragment) {
        this.f327b = layoutInflaterFactoryC0082r;
        this.f326a = fragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.f326a.f56l != null) {
            this.f326a.f56l = null;
            this.f327b.m214a(this.f326a, this.f326a.f57m, 0, 0, false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
