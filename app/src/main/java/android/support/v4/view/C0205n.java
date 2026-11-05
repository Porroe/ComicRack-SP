package android.support.v4.view;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.n */
/* loaded from: classes.dex */
public final class C0205n {

    /* renamed from: a */
    private final InterfaceC0206o f524a;

    public C0205n(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (byte) 0);
    }

    private C0205n(Context context, GestureDetector.OnGestureListener onGestureListener, byte b) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f524a = new C0209r(context, onGestureListener);
        } else {
            this.f524a = new C0207p(context, onGestureListener);
        }
    }

    /* renamed from: a */
    public final boolean m483a(MotionEvent motionEvent) {
        return this.f524a.mo484a(motionEvent);
    }
}
