package com.cyo.comicrack.viewer;

import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.im */
/* loaded from: classes.dex */
final class C0878im extends Animation {

    /* renamed from: a */
    DecelerateInterpolator f2662a = new DecelerateInterpolator();

    /* renamed from: b */
    final /* synthetic */ C0874ii f2663b;

    /* renamed from: c */
    private final /* synthetic */ float f2664c;

    /* renamed from: d */
    private final /* synthetic */ float f2665d;

    C0878im(C0874ii c0874ii, float f, float f2) {
        this.f2663b = c0874ii;
        this.f2664c = f;
        this.f2665d = f2;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        this.f2663b.f2653g.getLayoutParams().height = (int) (this.f2664c + ((this.f2665d - this.f2664c) * this.f2662a.getInterpolation(f)));
        this.f2663b.f2653g.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
