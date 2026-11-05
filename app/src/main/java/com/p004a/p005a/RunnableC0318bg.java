package com.p004a.p005a;

import android.view.View;
import com.p004a.p005a.p011e.C0372i;

/* compiled from: DontLook */
/* renamed from: com.a.a.bg */
/* loaded from: classes.dex */
final class RunnableC0318bg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0322bk f899a;

    /* renamed from: b */
    final /* synthetic */ View f900b;

    /* renamed from: c */
    final /* synthetic */ C0319bh f901c;

    /* renamed from: d */
    final /* synthetic */ C0315bd f902d;

    RunnableC0318bg(C0315bd c0315bd, C0322bk c0322bk, View view, C0319bh c0319bh) {
        this.f902d = c0315bd;
        this.f899a = c0322bk;
        this.f900b = view;
        this.f901c = c0319bh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f902d.m820a(this.f899a)) {
            C0372i.m911a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
        } else {
            this.f902d.f887a.m764a(this.f900b, this.f899a, this.f901c);
        }
    }
}
