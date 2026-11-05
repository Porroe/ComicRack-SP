package com.p004a.p012b.p016b.p017a;

import android.util.Log;

/* compiled from: DontLook */
/* renamed from: com.a.b.b.a.j */
/* loaded from: classes.dex */
final class BinderC0465j extends AbstractBinderC0459d {

    /* renamed from: a */
    final /* synthetic */ ServiceConnectionC0464i f1500a;

    /* renamed from: b */
    private final C0469n f1501b;

    /* renamed from: c */
    private Runnable f1502c = new RunnableC0466k(this);

    /* renamed from: c */
    static /* synthetic */ ServiceConnectionC0464i m1077c(BinderC0465j binderC0465j) {
        return binderC0465j.f1500a;
    }

    /* renamed from: a */
    static /* synthetic */ C0469n m1075a(BinderC0465j binderC0465j) {
        return binderC0465j.f1501b;
    }

    public BinderC0465j(ServiceConnectionC0464i serviceConnectionC0464i, C0469n c0469n) {
        this.f1500a = serviceConnectionC0464i;
        this.f1501b = c0469n;
        Log.i("LicenseChecker", "Start monitoring timeout.");
        ServiceConnectionC0464i.m1062a(this.f1500a).postDelayed(this.f1502c, 10000L);
    }

    @Override // com.p004a.p012b.p016b.p017a.InterfaceC0458c
    /* renamed from: a */
    public final void mo1059a(int i, String str, String str2) {
        ServiceConnectionC0464i.m1062a(this.f1500a).post(new RunnableC0467l(this, i, str, str2));
    }

    /* renamed from: b */
    static /* synthetic */ void m1076b(BinderC0465j binderC0465j) {
        Log.i("LicenseChecker", "Clearing timeout.");
        ServiceConnectionC0464i.m1062a(binderC0465j.f1500a).removeCallbacks(binderC0465j.f1502c);
    }
}
