package com.p004a.p005a.p007b;

import android.webkit.WebView;
import com.p004a.p005a.C0332bu;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.t */
/* loaded from: classes.dex */
final class RunnableC0305t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC0299n f822a;

    /* renamed from: b */
    private final String f823b;

    /* renamed from: c */
    private final String f824c;

    /* renamed from: d */
    private final WebView f825d;

    public RunnableC0305t(RunnableC0299n runnableC0299n, WebView webView, String str, String str2) {
        this.f822a = runnableC0299n;
        this.f825d = webView;
        this.f823b = str;
        this.f824c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f822a.f789b.f942c.m900a(Boolean.valueOf(this.f822a.f793f));
        ((C0308w) ((C0332bu) this.f822a.f789b.f940a.m898a()).f963b.m898a()).m786k().m710a(this.f822a.f793f);
        if (((C0332bu) this.f822a.f789b.f940a.m898a()).f966e.m898a() != null) {
            ((C0275a) ((C0332bu) this.f822a.f789b.f940a.m898a()).f966e.m898a()).setOverlayEnabled(!this.f822a.f793f);
        }
        if (this.f824c != null) {
            this.f825d.loadDataWithBaseURL(this.f823b, this.f824c, "text/html", "utf-8", null);
        } else {
            this.f825d.loadUrl(this.f823b);
        }
    }
}
