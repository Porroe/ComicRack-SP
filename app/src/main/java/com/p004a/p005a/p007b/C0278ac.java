package com.p004a.p005a.p007b;

import android.content.Context;
import com.p004a.p005a.C0392h;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.ac */
/* loaded from: classes.dex */
public final class C0278ac {

    /* renamed from: a */
    public static final C0278ac f740a = new C0278ac(null, true);

    /* renamed from: b */
    private C0392h f741b;

    /* renamed from: c */
    private boolean f742c;

    /* renamed from: d */
    private final boolean f743d;

    private C0278ac(C0392h c0392h, boolean z) {
        this.f741b = c0392h;
        this.f743d = z;
    }

    /* renamed from: a */
    public static C0278ac m686a(C0392h c0392h, Context context) {
        return new C0278ac(C0392h.m927a(c0392h, context), false);
    }

    /* renamed from: a */
    public static C0278ac m685a(C0392h c0392h) {
        return m686a(c0392h, null);
    }

    /* renamed from: a */
    public final boolean m687a() {
        return this.f743d;
    }

    /* renamed from: b */
    public final boolean m689b() {
        return this.f742c;
    }

    /* renamed from: c */
    public final C0392h m690c() {
        return this.f741b;
    }

    /* renamed from: b */
    public final void m688b(C0392h c0392h) {
        if (!this.f743d) {
            this.f741b = c0392h;
        }
    }

    /* renamed from: d */
    public final void m691d() {
        this.f742c = true;
    }
}
