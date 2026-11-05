package com.cyo.comicrack.viewer;

import android.view.animation.Animation;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.in */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC0879in implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C0874ii f2666a;

    /* renamed from: b */
    private final /* synthetic */ boolean f2667b;

    AnimationAnimationListenerC0879in(C0874ii c0874ii, boolean z) {
        this.f2666a = c0874ii;
        this.f2667b = z;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f2666a.f2653g.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C0874ii.m1865a(this.f2666a, this.f2667b, false);
    }
}
