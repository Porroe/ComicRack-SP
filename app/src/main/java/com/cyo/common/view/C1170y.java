package com.cyo.common.view;

import android.graphics.Canvas;
import android.graphics.Matrix;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.y */
/* loaded from: classes.dex */
public final class C1170y extends AbstractC1135bb {

    /* renamed from: a */
    final /* synthetic */ AnimatedContentView f3723a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1170y(AnimatedContentView gestureDetectorOnDoubleTapListenerC1167v, Matrix matrix, Matrix matrix2, float f) {
        super(matrix, matrix2, f);
        this.f3723a = gestureDetectorOnDoubleTapListenerC1167v;
    }

    @Override // com.cyo.common.view.ContentAnimation
    /* renamed from: a */
    public final void mo1846a(Canvas canvas) {
        super.mo1846a(canvas);
        this.f3723a.mo1506a(canvas, ((AbstractC1135bb) this).f3604b, true);
    }

    @Override // com.cyo.common.view.ContentAnimation
    /* renamed from: a */
    protected final void mo1792a() {
        this.f3723a.invalidate();
    }
}
