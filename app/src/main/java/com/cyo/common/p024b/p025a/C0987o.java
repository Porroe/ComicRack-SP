package com.cyo.common.p024b.p025a;

import twitter4j.auth.AccessToken;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.o */
/* loaded from: classes.dex */
final class C0987o extends AbstractC0975c {

    /* renamed from: a */
    AccessToken f2909a = null;

    /* renamed from: b */
    final /* synthetic */ C0986n f2910b;

    /* renamed from: c */
    private final /* synthetic */ String f2911c;

    /* renamed from: d */
    private final /* synthetic */ InterfaceC0988p f2912d;

    C0987o(C0986n c0986n, String str, InterfaceC0988p interfaceC0988p) {
        this.f2910b = c0986n;
        this.f2911c = str;
        this.f2912d = interfaceC0988p;
    }

    @Override // com.cyo.common.p024b.p025a.AbstractC0975c
    /* renamed from: a */
    public final void mo2065a(C0977e c0977e) throws twitter4j.TwitterException {
        if (this.f2911c.length() > 0) {
            this.f2909a = c0977e.f2880a.getOAuthAccessToken(C0986n.m2074a(this.f2910b).f2896a, this.f2911c);
        } else {
            this.f2909a = c0977e.f2880a.getOAuthAccessToken();
        }
    }

    @Override // com.cyo.common.p024b.p025a.AbstractC0975c
    /* renamed from: b */
    public final void mo2068b(C0977e c0977e, boolean z) {
        this.f2912d.mo2071a(this.f2909a.getToken(), this.f2909a.getTokenSecret());
    }

    @Override // com.cyo.common.p024b.p025a.AbstractC0975c
    /* renamed from: a */
    public final void mo2064a() {
        this.f2912d.mo2071a(null, null);
    }
}
