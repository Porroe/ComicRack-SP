package com.cyo.common.p024b.p025a;

import com.cyo.common.C0998bi;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.k */
/* loaded from: classes.dex */
public final class C0983k {
    /* renamed from: a */
    public static Twitter m2073a(C0982j c0982j) {
        if (!((C0998bi.m2081a(c0982j.f2890a) || C0998bi.m2081a(c0982j.f2891b) || C0998bi.m2081a(c0982j.f2892c) || C0998bi.m2081a(c0982j.f2893d)) ? false : true)) {
            return null;
        }
        return new TwitterFactory(new ConfigurationBuilder().setOAuthConsumerKey(c0982j.f2890a).setOAuthConsumerSecret(c0982j.f2891b).setOAuthAccessToken(c0982j.f2892c).setOAuthAccessTokenSecret(c0982j.f2893d).build()).getInstance();
    }
}
