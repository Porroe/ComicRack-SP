package com.p004a.p005a.p007b;

import com.p004a.p005a.C0312ba;
import com.p004a.p005a.C0332bu;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.p */
/* loaded from: classes.dex */
final class RunnableC0301p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0312ba f813a;

    /* renamed from: b */
    final /* synthetic */ RunnableC0299n f814b;

    RunnableC0301p(RunnableC0299n runnableC0299n, C0312ba c0312ba) {
        this.f814b = runnableC0299n;
        this.f813a = c0312ba;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f814b.f788a != null) {
            this.f814b.f788a.stopLoading();
            this.f814b.f788a.destroy();
        }
        ((C0308w) ((C0332bu) this.f814b.f789b.f940a.m898a()).f963b.m898a()).m768a(this.f814b.f791d);
        if (this.f814b.f792e != null) {
            ((C0278ac) ((C0332bu) this.f814b.f789b.f940a.m898a()).f968g.m898a()).m688b(this.f814b.f792e);
        }
        ((C0308w) ((C0332bu) this.f814b.f789b.f940a.m898a()).f963b.m898a()).m765a(this.f813a);
    }
}
