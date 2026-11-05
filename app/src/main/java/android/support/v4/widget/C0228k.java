package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.k */
/* loaded from: classes.dex */
final class C0228k implements InterfaceC0229l {
    C0228k() {
    }

    @Override // android.support.v4.widget.InterfaceC0229l
    /* renamed from: a */
    public final Object mo544a(Context context) {
        return new EdgeEffect(context);
    }

    @Override // android.support.v4.widget.InterfaceC0229l
    /* renamed from: a */
    public final void mo545a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    @Override // android.support.v4.widget.InterfaceC0229l
    /* renamed from: a */
    public final boolean mo546a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    @Override // android.support.v4.widget.InterfaceC0229l
    /* renamed from: b */
    public final void mo549b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    @Override // android.support.v4.widget.InterfaceC0229l
    /* renamed from: a */
    public final boolean mo547a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    @Override // android.support.v4.widget.InterfaceC0229l
    /* renamed from: c */
    public final boolean mo550c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }

    @Override // android.support.v4.widget.InterfaceC0229l
    /* renamed from: a */
    public final boolean mo548a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }
}
