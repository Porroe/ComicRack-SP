package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.bc */
/* loaded from: classes.dex */
class C0169bc extends C0168bb {
    C0169bc() {
    }

    @Override // android.support.v4.view.C0165az
    /* renamed from: a */
    final long mo439a() {
        return ValueAnimator.getFrameDelay();
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public final void mo441a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: d */
    public final int mo449d(View view) {
        return view.getLayerType();
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public void mo442a(View view, Paint paint) {
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }
}
