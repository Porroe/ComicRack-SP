package com.cyo.common.p024b.p025a;

import android.content.SharedPreferences;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.j */
/* loaded from: classes.dex */
public final class C0982j {

    /* renamed from: a */
    public String f2890a;

    /* renamed from: b */
    public String f2891b;

    /* renamed from: c */
    public String f2892c;

    /* renamed from: d */
    public String f2893d;

    /* renamed from: e */
    public String f2894e;

    /* renamed from: f */
    public SharedPreferences f2895f;

    public C0982j(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        this.f2890a = str;
        this.f2891b = str2;
        this.f2894e = str3;
        this.f2895f = sharedPreferences;
        this.f2892c = this.f2895f.getString("twitter_oauth_token", null);
        this.f2893d = this.f2895f.getString("twitter_oauth_token_secret", null);
    }

    /* renamed from: a */
    public final void m2072a() {
        this.f2893d = null;
        this.f2892c = null;
        this.f2895f.edit().remove("twitter_oauth_token").remove("twitter_oauth_token_secret").commit();
    }
}
