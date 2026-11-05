package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.i */
/* loaded from: classes.dex */
public final class C0226i {

    /* renamed from: b */
    private static final InterfaceC0229l f613b;

    /* renamed from: a */
    private Object f614a;

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f613b = new C0228k();
        } else {
            f613b = new C0227j();
        }
    }

    public C0226i(Context context) {
        this.f614a = f613b.mo544a(context);
    }

    /* renamed from: a */
    public final void m538a(int i, int i2) {
        f613b.mo545a(this.f614a, i, i2);
    }

    /* renamed from: a */
    public final boolean m539a() {
        return f613b.mo546a(this.f614a);
    }

    /* renamed from: b */
    public final void m542b() {
        f613b.mo549b(this.f614a);
    }

    /* renamed from: a */
    public final boolean m540a(float f) {
        return f613b.mo547a(this.f614a, f);
    }

    /* renamed from: c */
    public final boolean m543c() {
        return f613b.mo550c(this.f614a);
    }

    /* renamed from: a */
    public final boolean m541a(Canvas canvas) {
        return f613b.mo548a(this.f614a, canvas);
    }
}
