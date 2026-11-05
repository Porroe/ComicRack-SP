package com.cyo.common.p024b.p025a;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cyo.common.p024b.C0972a;
import twitter4j.Twitter;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.n */
/* loaded from: classes.dex */
final class C0986n extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C0984l f2904a;

    /* renamed from: b */
    private final /* synthetic */ C0982j f2905b;

    /* renamed from: c */
    private final /* synthetic */ Twitter f2906c;

    /* renamed from: d */
    private final /* synthetic */ AlertDialog f2907d;

    /* renamed from: e */
    private final /* synthetic */ InterfaceC0988p f2908e;

    C0986n(C0984l c0984l, C0982j c0982j, Twitter twitter, AlertDialog alertDialog, InterfaceC0988p interfaceC0988p) {
        this.f2904a = c0984l;
        this.f2905b = c0982j;
        this.f2906c = twitter;
        this.f2907d = alertDialog;
        this.f2908e = interfaceC0988p;
    }

    /* renamed from: a */
    static /* synthetic */ C0984l m2074a(C0986n c0986n) {
        return c0986n.f2904a;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.startsWith("http://comicrack.cyolito.com") && str.indexOf("oauth_token=") != -1) {
            C0973a.m2063a(new C0987o(this, (String) new C0972a(str.substring(str.indexOf("?", 0) + 1, str.length())).f2866a.get("oauth_verifier"), this.f2908e), this.f2905b, this.f2906c);
            this.f2907d.dismiss();
        }
    }
}
