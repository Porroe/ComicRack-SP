package android.support.v4.view;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.r */
/* loaded from: classes.dex */
final class C0209r implements InterfaceC0206o {

    /* renamed from: a */
    private final GestureDetector f550a;

    public C0209r(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f550a = new GestureDetector(context, onGestureListener, null);
    }

    @Override // android.support.v4.view.InterfaceC0206o
    /* renamed from: a */
    public final boolean mo484a(MotionEvent motionEvent) {
        return this.f550a.onTouchEvent(motionEvent);
    }
}
