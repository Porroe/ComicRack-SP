package android.support.v4.view;

import android.os.Build;
import android.view.VelocityTracker;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.at */
/* loaded from: classes.dex */
public final class C0159at {

    /* renamed from: a */
    static final InterfaceC0162aw f499a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f499a = new C0161av();
        } else {
            f499a = new C0160au();
        }
    }

    /* renamed from: a */
    public static float m420a(VelocityTracker velocityTracker, int i) {
        return f499a.mo422a(velocityTracker, i);
    }

    /* renamed from: b */
    public static float m421b(VelocityTracker velocityTracker, int i) {
        return f499a.mo423b(velocityTracker, i);
    }
}
