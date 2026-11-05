package com.cyo.common.view;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.al */
/* loaded from: classes.dex */
final class C1118al extends Animation {

    /* renamed from: a */
    final /* synthetic */ FastThumbView f3569a;

    private C1118al(FastThumbView fastThumbView) {
        this.f3569a = fastThumbView;
    }

    /* synthetic */ C1118al(FastThumbView fastThumbView, byte b) {
        this(fastThumbView);
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        this.f3569a.setImageAlpha((int) (255.0f * f));
    }
}
