package android.support.v4.app;

import android.os.Build;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.cd */
/* loaded from: classes.dex */
public final class C0060cd {

    /* renamed from: a */
    private static InterfaceC0062cf f236a;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f236a = new C0065ci();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f236a = new C0064ch();
        } else {
            f236a = new C0063cg();
        }
    }
}
