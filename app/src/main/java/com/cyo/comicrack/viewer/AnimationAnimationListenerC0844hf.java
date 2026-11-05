package com.cyo.comicrack.viewer;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hf */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC0844hf implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2556a;

    /* renamed from: b */
    private final /* synthetic */ View f2557b;

    /* renamed from: c */
    private final /* synthetic */ Runnable f2558c;

    AnimationAnimationListenerC0844hf(ReaderActivity readerActivity, View view, Runnable runnable) {
        this.f2556a = readerActivity;
        this.f2557b = view;
        this.f2558c = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2557b.setVisibility(8);
        if (this.f2558c != null) {
            this.f2558c.run();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
