package android.support.v4.view;

import android.view.animation.Interpolator;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.bp */
/* loaded from: classes.dex */
final class InterpolatorC0182bp implements Interpolator {
    InterpolatorC0182bp() {
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
