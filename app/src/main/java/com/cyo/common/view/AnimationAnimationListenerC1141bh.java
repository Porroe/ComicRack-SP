package com.cyo.common.view;

import android.view.animation.Animation;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bh */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC1141bh implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ Sidebar f3622a;

    AnimationAnimationListenerC1141bh(Sidebar sidebar) {
        this.f3622a = sidebar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (Sidebar.m2386a(this.f3622a) != null) {
            Sidebar.m2386a(this.f3622a).mo1819b();
        }
        if (Sidebar.m2386a(this.f3622a) != null) {
            Sidebar.m2386a(this.f3622a).mo1818a();
        }
    }
}
