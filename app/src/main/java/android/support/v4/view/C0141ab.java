package android.support.v4.view;

import android.os.Build;
import android.view.MotionEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.ab */
/* loaded from: classes.dex */
public final class C0141ab {

    /* renamed from: a */
    static final InterfaceC0144ae f474a;

    static {
        if (Build.VERSION.SDK_INT >= 5) {
            f474a = new C0143ad();
        } else {
            f474a = new C0142ac();
        }
    }

    /* renamed from: a */
    public static int m391a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    /* renamed from: b */
    public static int m393b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    /* renamed from: a */
    public static int m392a(MotionEvent motionEvent, int i) {
        return f474a.mo399a(motionEvent, i);
    }

    /* renamed from: b */
    public static int m394b(MotionEvent motionEvent, int i) {
        return f474a.mo400b(motionEvent, i);
    }

    /* renamed from: c */
    public static float m395c(MotionEvent motionEvent, int i) {
        return f474a.mo401c(motionEvent, i);
    }

    /* renamed from: d */
    public static float m397d(MotionEvent motionEvent, int i) {
        return f474a.mo402d(motionEvent, i);
    }

    /* renamed from: c */
    public static int m396c(MotionEvent motionEvent) {
        return f474a.mo398a(motionEvent);
    }
}
