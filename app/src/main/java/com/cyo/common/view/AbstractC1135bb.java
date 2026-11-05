package com.cyo.common.view;

import android.graphics.Matrix;
import android.view.animation.OvershootInterpolator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bb */
/* loaded from: classes.dex */
public abstract class AbstractC1135bb extends AbstractC1159n {

    /* renamed from: a */
    private OvershootInterpolator f3603a;

    /* renamed from: b */
    Matrix f3604b;

    /* renamed from: c */
    private float[] f3605c = new float[9];

    /* renamed from: d */
    private float[] f3606d = new float[9];

    /* renamed from: e */
    private float[] f3607e = new float[9];

    public AbstractC1135bb(Matrix matrix, Matrix matrix2, float f) {
        this.f3603a = new OvershootInterpolator(f);
        matrix.getValues(this.f3605c);
        matrix2.getValues(this.f3606d);
    }

    @Override // com.cyo.common.view.AbstractC1159n
    /* renamed from: a */
    public final void mo1793a(float f) {
        float interpolation = this.f3603a.getInterpolation(f);
        for (int i = 0; i < this.f3605c.length; i++) {
            this.f3607e[i] = this.f3605c[i] + ((this.f3606d[i] - this.f3605c[i]) * interpolation);
        }
        Matrix matrix = new Matrix();
        matrix.setValues(this.f3607e);
        this.f3604b = matrix;
    }
}
