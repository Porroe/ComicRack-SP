package com.p004a.p005a;

import com.p004a.p005a.p008c.InterfaceC0343d;
import com.p004a.p005a.p011e.C0372i;

/* compiled from: DontLook */
/* renamed from: com.a.a.bm */
/* loaded from: classes.dex */
final class RunnableC0324bm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0343d f930a;

    /* renamed from: b */
    final /* synthetic */ C0322bk f931b;

    RunnableC0324bm(C0322bk c0322bk, InterfaceC0343d interfaceC0343d) {
        this.f931b = c0322bk;
        this.f930a = interfaceC0343d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f930a.m850e();
        } catch (Throwable th) {
            C0372i.m915b("Error while telling adapter (" + this.f931b.m833g() + ") ad to show interstitial: ", th);
        }
    }
}
