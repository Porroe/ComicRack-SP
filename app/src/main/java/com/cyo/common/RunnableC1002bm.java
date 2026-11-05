package com.cyo.common;

import android.widget.RelativeLayout;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bm */
/* loaded from: classes.dex */
final class RunnableC1002bm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AnimationAnimationListenerC1001bl f2953a;

    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f2954b;

    /* renamed from: c */
    private final /* synthetic */ RelativeLayout f2955c;

    RunnableC1002bm(AnimationAnimationListenerC1001bl animationAnimationListenerC1001bl, RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.f2953a = animationAnimationListenerC1001bl;
        this.f2954b = relativeLayout;
        this.f2955c = relativeLayout2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2954b.removeView(this.f2955c);
    }
}
