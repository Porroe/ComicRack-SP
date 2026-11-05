package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.ax */
/* loaded from: classes.dex */
public final class C0163ax {

    /* renamed from: a */
    static final InterfaceC0174bh f500a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f500a = new C0164ay();
        } else if (i >= 19) {
            f500a = new C0173bg();
        } else if (i >= 17) {
            f500a = new C0172bf();
        } else if (i >= 16) {
            f500a = new C0171be();
        } else if (i >= 14) {
            f500a = new C0170bd();
        } else if (i >= 11) {
            f500a = new C0169bc();
        } else if (i >= 9) {
            f500a = new C0168bb();
        } else if (i >= 7) {
            f500a = new C0167ba();
        } else {
            f500a = new C0165az();
        }
    }

    /* renamed from: a */
    public static boolean m430a(View view, int i) {
        return f500a.mo445a(view, i);
    }

    /* renamed from: a */
    public static int m424a(View view) {
        return f500a.mo438a(view);
    }

    /* renamed from: a */
    public static void m428a(View view, C0112a c0112a) {
        f500a.mo443a(view, c0112a);
    }

    /* renamed from: b */
    public static void m431b(View view) {
        f500a.mo446b(view);
    }

    /* renamed from: a */
    public static void m425a(View view, int i, int i2, int i3, int i4) {
        f500a.mo440a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m429a(View view, Runnable runnable) {
        f500a.mo444a(view, runnable);
    }

    /* renamed from: c */
    public static int m433c(View view) {
        return f500a.mo448c(view);
    }

    /* renamed from: b */
    public static void m432b(View view, int i) {
        f500a.mo447b(view, i);
    }

    /* renamed from: a */
    public static void m426a(View view, int i, Paint paint) {
        f500a.mo441a(view, i, paint);
    }

    /* renamed from: d */
    public static int m434d(View view) {
        return f500a.mo449d(view);
    }

    /* renamed from: a */
    public static void m427a(View view, Paint paint) {
        f500a.mo442a(view, paint);
    }

    /* renamed from: e */
    public static int m435e(View view) {
        return f500a.mo450e(view);
    }

    /* renamed from: f */
    public static boolean m436f(View view) {
        return f500a.mo451f(view);
    }

    /* renamed from: g */
    public static boolean m437g(View view) {
        return f500a.mo452g(view);
    }
}
