package android.support.v4.view;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.bi */
/* loaded from: classes.dex */
public final class C0175bi {

    /* renamed from: a */
    static final InterfaceC0180bn f503a;

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f503a = new C0179bm();
        } else if (Build.VERSION.SDK_INT >= 11) {
            f503a = new C0178bl();
        } else if (Build.VERSION.SDK_INT >= 8) {
            f503a = new C0177bk();
        } else {
            f503a = new C0176bj();
        }
    }

    /* renamed from: a */
    public static int m462a(ViewConfiguration viewConfiguration) {
        return f503a.mo463a(viewConfiguration);
    }
}
