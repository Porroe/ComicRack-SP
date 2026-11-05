package com.cyo.common.view;

import android.view.animation.Animation;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.ak */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC1117ak implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ FastThumbView f3568a;

    AnimationAnimationListenerC1117ak(FastThumbView fastThumbView) {
        this.f3568a = fastThumbView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f3568a.setImageAlpha(255);
        FastThumbView.m2374a(this.f3568a);
    }
}
