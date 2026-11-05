package android.support.v4.view;

import android.view.MotionEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.ac */
/* loaded from: classes.dex */
final class C0142ac implements InterfaceC0144ae {
    C0142ac() {
    }

    @Override // android.support.v4.view.InterfaceC0144ae
    /* renamed from: a */
    public final int mo399a(MotionEvent motionEvent, int i) {
        return i == 0 ? 0 : -1;
    }

    @Override // android.support.v4.view.InterfaceC0144ae
    /* renamed from: b */
    public final int mo400b(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return 0;
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    @Override // android.support.v4.view.InterfaceC0144ae
    /* renamed from: c */
    public final float mo401c(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getX();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    @Override // android.support.v4.view.InterfaceC0144ae
    /* renamed from: d */
    public final float mo402d(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getY();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    @Override // android.support.v4.view.InterfaceC0144ae
    /* renamed from: a */
    public final int mo398a(MotionEvent motionEvent) {
        return 1;
    }
}
