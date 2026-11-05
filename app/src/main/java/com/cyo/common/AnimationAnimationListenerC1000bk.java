package com.cyo.common;

import android.view.animation.Animation;
import android.widget.ListView;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bk */
/* loaded from: classes.dex */
final class AnimationAnimationListenerC1000bk implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C0999bj f2948a;

    /* renamed from: b */
    private final /* synthetic */ ListView f2949b;

    AnimationAnimationListenerC1000bk(C0999bj c0999bj, ListView listView) {
        this.f2948a = c0999bj;
        this.f2949b = listView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2949b.setSelected(true);
        this.f2949b.requestFocus();
    }
}
