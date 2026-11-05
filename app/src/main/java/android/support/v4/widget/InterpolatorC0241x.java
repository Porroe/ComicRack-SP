package android.support.v4.widget;

import android.view.animation.Interpolator;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.x */
/* loaded from: classes.dex */
final class InterpolatorC0241x implements Interpolator {
    InterpolatorC0241x() {
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
