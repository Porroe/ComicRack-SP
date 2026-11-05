package com.cyo.comicrack.viewer;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hd */
/* loaded from: classes.dex */
final class C0842hd extends Animation {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2550a;

    /* renamed from: b */
    private final /* synthetic */ int f2551b;

    /* renamed from: c */
    private final /* synthetic */ int f2552c;

    C0842hd(ReaderActivity readerActivity, int i, int i2) {
        this.f2550a = readerActivity;
        this.f2551b = i;
        this.f2552c = i2;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        ReaderActivity.m1580b(this.f2550a).setOverlayColorAlpha(this.f2551b + ((int) ((this.f2552c - this.f2551b) * f)));
    }
}
