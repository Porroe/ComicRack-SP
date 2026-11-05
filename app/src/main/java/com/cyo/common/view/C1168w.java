package com.cyo.common.view;

import android.content.Context;
import android.support.v4.view.C0155ap;
import android.view.ScaleGestureDetector;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.w */
/* loaded from: classes.dex */
final class C1168w {

    /* renamed from: a */
    ScaleGestureDetector f3720a;

    /* renamed from: b */
    final /* synthetic */ GestureDetectorOnDoubleTapListenerC1167v f3721b;

    public C1168w(GestureDetectorOnDoubleTapListenerC1167v gestureDetectorOnDoubleTapListenerC1167v, Context context) {
        this.f3721b = gestureDetectorOnDoubleTapListenerC1167v;
        this.f3720a = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC1169x(this, (byte) 0));
        m2503a(false);
    }

    /* renamed from: a */
    public final void m2503a(boolean z) {
        C0155ap.m418a(this.f3720a, z);
    }
}
