package android.support.v4.p000a;

import android.support.v4.p002c.C0098d;

/* compiled from: DontLook */
/* renamed from: android.support.v4.a.a */
/* loaded from: classes.dex */
public final class C0000a {

    /* renamed from: a */
    public int f0a;

    /* renamed from: b */
    public InterfaceC0001b f1b;

    /* renamed from: c */
    public boolean f2c;

    /* renamed from: d */
    public boolean f3d;

    /* renamed from: e */
    public boolean f4e;

    /* renamed from: f */
    public boolean f5f;

    /* renamed from: g */
    public boolean f6g;

    /* renamed from: a */
    public final void m0a(InterfaceC0001b interfaceC0001b) {
        if (this.f1b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.f1b != interfaceC0001b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f1b = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0098d.m272a(this, sb);
        sb.append(" id=");
        sb.append(this.f0a);
        sb.append("}");
        return sb.toString();
    }
}
