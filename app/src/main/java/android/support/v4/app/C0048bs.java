package android.support.v4.app;

import android.os.Build;
import android.os.Bundle;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.bs */
/* loaded from: classes.dex */
public final class C0048bs extends AbstractC0057ca {

    // The APK has no constructor for this class.
    private C0048bs() {
        throw new AssertionError("No constructor in the original APK");
    }

    /* renamed from: a */
    public static final InterfaceC0058cb f221a;

    /* renamed from: g */
    private static final InterfaceC0050bu f222g;

    /* renamed from: b */
    private final String f223b;

    /* renamed from: c */
    private final CharSequence f224c;

    /* renamed from: d */
    private final CharSequence[] f225d;

    /* renamed from: e */
    private final boolean f226e;

    /* renamed from: f */
    private final Bundle f227f;

    @Override // android.support.v4.app.AbstractC0057ca
    /* renamed from: a */
    public final String mo157a() {
        return this.f223b;
    }

    @Override // android.support.v4.app.AbstractC0057ca
    /* renamed from: b */
    public final CharSequence mo158b() {
        return this.f224c;
    }

    @Override // android.support.v4.app.AbstractC0057ca
    /* renamed from: c */
    public final CharSequence[] mo159c() {
        return this.f225d;
    }

    @Override // android.support.v4.app.AbstractC0057ca
    /* renamed from: d */
    public final boolean mo160d() {
        return this.f226e;
    }

    @Override // android.support.v4.app.AbstractC0057ca
    /* renamed from: e */
    public final Bundle mo161e() {
        return this.f227f;
    }

    static {
        if (Build.VERSION.SDK_INT >= 20) {
            f222g = new C0051bv();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f222g = new C0053bx();
        } else {
            f222g = new C0052bw();
        }
        f221a = new C0049bt();
    }
}
