package com.cyo.comicrack.viewer;

import android.view.animation.Animation;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hg */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC0845hg implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2559a;

    AnimationAnimationListenerC0845hg(ReaderActivity readerActivity) {
        this.f2559a = readerActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ReaderActivity.m1516C(this.f2559a).setVisibility(8);
        ReaderActivity.m1516C(this.f2559a).setTag(null);
    }
}
