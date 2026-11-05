package android.support.v4.view;

import android.os.Build;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.s */
/* loaded from: classes.dex */
public final class C0210s {

    /* renamed from: a */
    static final InterfaceC0211t f551a;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f551a = new C0213v();
        } else {
            f551a = new C0212u();
        }
    }

    /* renamed from: a */
    public static int m491a(int i, int i2) {
        return f551a.mo492a(i, i2);
    }
}
