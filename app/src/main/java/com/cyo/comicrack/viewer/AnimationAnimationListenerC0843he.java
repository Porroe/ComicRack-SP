package com.cyo.comicrack.viewer;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.he */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC0843he implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2553a;

    /* renamed from: b */
    private final /* synthetic */ View f2554b;

    /* renamed from: c */
    private final /* synthetic */ Runnable f2555c;

    AnimationAnimationListenerC0843he(ReaderActivity readerActivity, View view, Runnable runnable) {
        this.f2553a = readerActivity;
        this.f2554b = view;
        this.f2555c = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.f2554b == ReaderActivity.m1621y(this.f2553a)) {
            ReaderActivity.m1514B(this.f2553a).setSelected(true);
        }
        if (this.f2555c != null) {
            this.f2555c.run();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (this.f2554b == ReaderActivity.m1621y(this.f2553a)) {
            ReaderActivity.m1580b(this.f2553a).requestFocus();
        }
    }
}
