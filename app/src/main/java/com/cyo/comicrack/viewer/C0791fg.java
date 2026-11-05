package com.cyo.comicrack.viewer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.cyo.comicrack.p019a.p021b.AbstractC0587aa;
import com.cyo.common.C0950af;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.fg */
/* loaded from: classes.dex */
final class C0791fg {

    /* renamed from: a */
    AbstractC0587aa f2463a;

    /* renamed from: b */
    float f2464b;

    /* renamed from: c */
    int f2465c;

    public C0791fg(AbstractC0587aa abstractC0587aa, float f, int i) {
        this.f2463a = abstractC0587aa;
        this.f2464b = f;
        this.f2465c = i;
    }

    /* renamed from: a */
    final void m1842a(Canvas canvas, boolean z, Paint paint) {
        canvas.save();
        int iMo1273b = this.f2463a.mo1273b() / 2;
        if (z) {
            canvas.translate(iMo1273b * C0950af.m1989a(this.f2464b, 0.0f, 1.0f), 0.0f);
        } else {
            canvas.translate(iMo1273b * C0950af.m1989a(-this.f2464b, 0.0f, 1.0f), 0.0f);
        }
        canvas.clipRect(0, 0, iMo1273b, this.f2463a.mo1274c());
        if (z) {
            canvas.translate(-iMo1273b, 0.0f);
        }
        this.f2463a.m1270a(canvas, paint);
        canvas.restore();
    }
}
