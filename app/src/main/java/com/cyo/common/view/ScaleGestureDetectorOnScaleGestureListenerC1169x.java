package com.cyo.common.view;

import android.graphics.PointF;
import android.view.ScaleGestureDetector;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.x */
/* loaded from: classes.dex */
final class ScaleGestureDetectorOnScaleGestureListenerC1169x implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a */
    final /* synthetic */ C1168w f3722a;

    private ScaleGestureDetectorOnScaleGestureListenerC1169x(C1168w c1168w) {
        this.f3722a = c1168w;
    }

    /* synthetic */ ScaleGestureDetectorOnScaleGestureListenerC1169x(C1168w c1168w, byte b) {
        this(c1168w);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        PointF pointFM2467b = GestureDetectorOnDoubleTapListenerC1167v.m2483a(this.f3722a.f3721b).m2467b(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        this.f3722a.f3721b.m2489a(pointFM2467b.x, pointFM2467b.y, (GestureDetectorOnDoubleTapListenerC1167v.m2483a(this.f3722a.f3721b).f3690f * scaleGestureDetector.getCurrentSpan()) / scaleGestureDetector.getPreviousSpan(), false);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
