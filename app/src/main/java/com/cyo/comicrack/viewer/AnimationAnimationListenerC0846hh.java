package com.cyo.comicrack.viewer;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hh */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC0846hh implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2560a;

    /* renamed from: b */
    private final /* synthetic */ AlphaAnimation f2561b;

    AnimationAnimationListenerC0846hh(ReaderActivity readerActivity, AlphaAnimation alphaAnimation) {
        this.f2560a = readerActivity;
        this.f2561b = alphaAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        ReaderActivity.m1516C(this.f2560a).setVisibility(0);
        ReaderActivity.m1516C(this.f2560a).setTag(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ReaderActivity.m1516C(this.f2560a).setTag("done");
        ReaderActivity.m1516C(this.f2560a).startAnimation(this.f2561b);
    }
}
