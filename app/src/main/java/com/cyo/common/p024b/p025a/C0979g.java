package com.cyo.common.p024b.p025a;

import twitter4j.Twitter;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.g */
/* loaded from: classes.dex */
final class C0979g implements InterfaceC0988p {

    /* renamed from: a */
    final /* synthetic */ C0978f f2883a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC0975c f2884b;

    /* renamed from: c */
    private final /* synthetic */ Twitter f2885c;

    C0979g(C0978f c0978f, AbstractC0975c abstractC0975c, Twitter twitter) {
        this.f2883a = c0978f;
        this.f2884b = abstractC0975c;
        this.f2885c = twitter;
    }

    @Override // com.cyo.common.p024b.p025a.InterfaceC0988p
    /* renamed from: a */
    public final void mo2071a(String str, String str2) {
        if (str == null) {
            this.f2884b.m2066a(new C0977e(this.f2883a.f2882a, this.f2885c), false);
            return;
        }
        this.f2883a.f2882a.f2892c = str;
        this.f2883a.f2882a.f2893d = str2;
        C0982j c0982j = this.f2883a.f2882a;
        c0982j.f2895f.edit().putString("twitter_oauth_token", c0982j.f2892c).putString("twitter_oauth_token_secret", c0982j.f2893d).commit();
        C0973a.m2062a(this.f2884b, this.f2883a.f2882a);
    }
}
