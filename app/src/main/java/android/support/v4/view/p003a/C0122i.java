package android.support.v4.view.p003a;

import android.os.Build;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.a.i */
/* loaded from: classes.dex */
public final class C0122i {

    /* renamed from: a */
    private static final InterfaceC0123j f464a;

    /* renamed from: b */
    private final Object f465b;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f464a = new C0126m();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f464a = new C0124k();
        } else {
            f464a = new C0128o();
        }
    }

    public C0122i() {
        this.f465b = f464a.mo375a(this);
    }

    public C0122i(Object obj) {
        this.f465b = obj;
    }

    /* renamed from: a */
    public final Object m374a() {
        return this.f465b;
    }

    /* renamed from: b */
    public static C0113a m370b() {
        return null;
    }

    /* renamed from: c */
    public static boolean m371c() {
        return false;
    }

    /* renamed from: d */
    public static List m372d() {
        return null;
    }

    /* renamed from: e */
    public static C0113a m373e() {
        return null;
    }
}
