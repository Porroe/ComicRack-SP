package com.p004a.p012b.p013a.p014a.p015a;

import android.app.Activity;

/* compiled from: DontLook */
/* renamed from: com.a.b.a.a.a.f */
/* loaded from: classes.dex */
final class RunnableC0417f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0413b f1347a;

    /* renamed from: b */
    private final /* synthetic */ boolean f1348b;

    /* renamed from: c */
    private final /* synthetic */ Activity f1349c;

    RunnableC0417f(C0413b c0413b, boolean z, Activity activity) {
        this.f1347a = c0413b;
        this.f1348b = z;
        this.f1349c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1348b || !this.f1347a.f1330j) {
            this.f1347a.f1330j = true;
            this.f1347a.m950b().mo955a(this.f1347a.f1322b, this.f1347a.f1323c, this.f1347a.f1321a);
            if (!this.f1347a.f1328h) {
                this.f1347a.m950b().mo956a("", "", "", 0);
            }
        }
        if (this.f1347a.f1328h) {
            this.f1347a.m950b().mo954a(this.f1347a.m951b(this.f1349c));
        }
    }
}
