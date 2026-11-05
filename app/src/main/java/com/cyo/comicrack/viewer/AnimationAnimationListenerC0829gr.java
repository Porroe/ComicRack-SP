package com.cyo.comicrack.viewer;

import android.view.animation.Animation;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gr */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC0829gr implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2530a;

    AnimationAnimationListenerC0829gr(ReaderActivity readerActivity) {
        this.f2530a = readerActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ReaderActivity.m1608o(this.f2530a).setVisibility(4);
    }
}
