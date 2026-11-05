package android.support.v4.view;

import android.view.MotionEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.ad */
/* loaded from: classes.dex */
final class C0143ad implements InterfaceC0144ae {
    C0143ad() {
    }

    @Override // android.support.v4.view.InterfaceC0144ae
    /* renamed from: a */
    public final int mo399a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Override // android.support.v4.view.InterfaceC0144ae
    /* renamed from: b */
    public final int mo400b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Override // android.support.v4.view.InterfaceC0144ae
    /* renamed from: c */
    public final float mo401c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Override // android.support.v4.view.InterfaceC0144ae
    /* renamed from: d */
    public final float mo402d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    @Override // android.support.v4.view.InterfaceC0144ae
    /* renamed from: a */
    public final int mo398a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }
}
