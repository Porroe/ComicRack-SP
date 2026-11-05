package com.cyo.common.view;

import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bg */
/* loaded from: classes.dex */
final class C1140bg extends Animation {

    /* renamed from: a */
    DecelerateInterpolator f3618a = new DecelerateInterpolator();

    /* renamed from: b */
    final /* synthetic */ Sidebar f3619b;

    /* renamed from: c */
    private final /* synthetic */ float f3620c;

    /* renamed from: d */
    private final /* synthetic */ float f3621d;

    C1140bg(Sidebar sidebar, float f, float f2) {
        this.f3619b = sidebar;
        this.f3620c = f;
        this.f3621d = f2;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        Sidebar.m2389a(this.f3619b, (int) (this.f3620c + ((this.f3621d - this.f3620c) * this.f3618a.getInterpolation(f))));
    }
}
