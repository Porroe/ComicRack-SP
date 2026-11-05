package com.cyo.common;

import android.view.animation.Animation;
import android.widget.RelativeLayout;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bl */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC1001bl implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C0999bj f2950a;

    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f2951b;

    /* renamed from: c */
    private final /* synthetic */ RelativeLayout f2952c;

    AnimationAnimationListenerC1001bl(C0999bj c0999bj, RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.f2950a = c0999bj;
        this.f2951b = relativeLayout;
        this.f2952c = relativeLayout2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f2951b.requestFocus();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2951b.post(new RunnableC1002bm(this, this.f2951b, this.f2952c));
    }
}
