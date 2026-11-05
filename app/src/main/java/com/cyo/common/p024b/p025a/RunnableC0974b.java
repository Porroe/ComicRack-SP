package com.cyo.common.p024b.p025a;

import twitter4j.TwitterException;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.b */
/* loaded from: classes.dex */
final class RunnableC0974b implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0977e f2875a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC0975c f2876b;

    RunnableC0974b(C0977e c0977e, AbstractC0975c abstractC0975c) {
        this.f2875a = c0977e;
        this.f2876b = abstractC0975c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        try {
            if (this.f2875a.f2880a == null) {
                this.f2875a.f2880a = C0983k.m2073a(this.f2875a.f2881b);
            }
            this.f2876b.mo2065a(this.f2875a);
        } catch (TwitterException e) {
            if (!"Status is a duplicate.".equals(e.getErrorMessage()) && e.getStatusCode() != 304) {
                if (e.getStatusCode() == 401) {
                    this.f2875a.f2881b.m2072a();
                }
                AbstractC0975c abstractC0975c = this.f2876b;
                z = false;
            }
        }
        this.f2876b.m2066a(this.f2875a, z);
    }
}
