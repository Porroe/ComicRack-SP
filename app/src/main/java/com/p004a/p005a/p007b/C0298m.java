package com.p004a.p005a.p007b;

import com.p004a.p005a.p011e.C0372i;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.m */
/* loaded from: classes.dex */
public final class C0298m extends RuntimeException {

    // The APK has no constructor for this class.
    private C0298m() {
        throw new AssertionError("No constructor in the original APK");
    }

    /* renamed from: a */
    public final boolean f787a;

    /* renamed from: a */
    public final void m728a(String str) {
        C0372i.m914b(m729b(str));
        C0372i.m912a((String) null, this);
    }

    /* renamed from: b */
    public final String m729b(String str) {
        if (this.f787a) {
            return str + ": " + getMessage();
        }
        return str;
    }
}
