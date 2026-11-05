package com.cyo.common.p024b.p025a;

import android.content.Context;
import android.content.SharedPreferences;
import com.cyo.comicrack.viewer.C0806fv;
import com.cyo.common.C0951ag;
import java.io.InputStream;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.f */
/* loaded from: classes.dex */
public final class C0978f {

    /* renamed from: a */
    public C0982j f2882a;

    public C0978f(String str, String str2, String str3, SharedPreferences sharedPreferences) {
        this.f2882a = new C0982j(sharedPreferences, str, str2, str3);
    }

    /* renamed from: a */
    public final void m2070a(Context context, InterfaceC0981i interfaceC0981i, InputStream inputStream) {
        C0980h c0980h = new C0980h(this, interfaceC0981i, inputStream, context);
        if (C0951ag.m1996a(context)) {
            Twitter twitterM2073a = C0983k.m2073a(this.f2882a);
            if (twitterM2073a == null) {
                String string = context.getString(C0806fv.authenticate_on_twitter);
                C0982j c0982j = this.f2882a;
                C0979g c0979g = new C0979g(this, c0980h, twitterM2073a);
                Twitter twitterFactory = new TwitterFactory().getInstance();
                twitterFactory.setOAuthConsumer(c0982j.f2890a, c0982j.f2891b);
                C0973a.m2063a(new C0984l(c0979g, context, string, c0982j, twitterFactory), c0982j, twitterFactory);
                return;
            }
            C0973a.m2063a(c0980h, this.f2882a, twitterM2073a);
        }
    }
}
