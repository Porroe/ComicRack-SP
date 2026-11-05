package com.p004a.p005a;

import com.p004a.p005a.p011e.C0370g;
import com.p004a.p005a.p011e.C0372i;

/* compiled from: DontLook */
/* renamed from: com.a.a.bl */
/* loaded from: classes.dex */
final class RunnableC0323bl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0322bk f929a;

    RunnableC0323bl(C0322bk c0322bk) {
        this.f929a = c0322bk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f929a.m835i()) {
            C0370g.m902a(this.f929a.f917b);
            try {
                this.f929a.f917b.m845a();
                C0372i.m911a("Called destroy() for adapter with class: " + this.f929a.f917b.getClass().getName());
            } catch (Throwable th) {
                C0372i.m915b("Error while destroying adapter (" + this.f929a.m833g() + "):", th);
            }
        }
    }
}
