package android.support.v4.view;

import android.os.Build;
import android.view.KeyEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.w */
/* loaded from: classes.dex */
public final class C0214w {

    /* renamed from: a */
    static final InterfaceC0140aa f552a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f552a = new C0217z();
        } else {
            f552a = new C0215x();
        }
    }

    /* renamed from: a */
    public static boolean m493a(KeyEvent keyEvent) {
        return f552a.mo389b(keyEvent.getMetaState());
    }

    /* renamed from: b */
    public static boolean m494b(KeyEvent keyEvent) {
        return f552a.mo390c(keyEvent.getMetaState());
    }

    /* renamed from: c */
    public static void m495c(KeyEvent keyEvent) {
        f552a.mo388a(keyEvent);
    }
}
