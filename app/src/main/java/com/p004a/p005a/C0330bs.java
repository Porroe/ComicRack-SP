package com.p004a.p005a;

import android.os.Handler;
import android.os.Looper;
import com.p004a.p005a.p011e.AbstractC0360ab;
import com.p004a.p005a.p011e.C0362ad;
import com.p004a.p005a.p011e.C0363ae;

/* compiled from: DontLook */
/* renamed from: com.a.a.bs */
/* loaded from: classes.dex */
public final class C0330bs extends AbstractC0360ab {

    /* renamed from: d */
    private static final C0330bs f943d = new C0330bs();

    /* renamed from: a */
    public final C0363ae f944a = new C0363ae(this, "marketPackages", null);

    /* renamed from: b */
    public final C0362ad f945b = new C0362ad(this, "constants", new C0331bt());

    /* renamed from: c */
    public final C0362ad f946c = new C0362ad(this, "uiHandler", new Handler(Looper.getMainLooper()));

    /* renamed from: a */
    public static C0330bs m837a() {
        return f943d;
    }

    private C0330bs() {
    }
}
