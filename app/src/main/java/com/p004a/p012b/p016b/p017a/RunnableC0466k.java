package com.p004a.p012b.p016b.p017a;

import android.util.Log;

/* compiled from: DontLook */
/* renamed from: com.a.b.b.a.k */
/* loaded from: classes.dex */
final class RunnableC0466k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BinderC0465j f1503a;

    RunnableC0466k(BinderC0465j binderC0465j) {
        this.f1503a = binderC0465j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Log.i("LicenseChecker", "Check timed out.");
        ServiceConnectionC0464i.m1065a(BinderC0465j.m1077c(this.f1503a), BinderC0465j.m1075a(this.f1503a));
        ServiceConnectionC0464i.m1069b(BinderC0465j.m1077c(this.f1503a), BinderC0465j.m1075a(this.f1503a));
    }
}
