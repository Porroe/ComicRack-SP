package com.p004a.p005a.p007b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p004a.p005a.ActivityC0274b;
import com.p004a.p005a.C0259al;
import com.p004a.p005a.C0260am;
import com.p004a.p005a.C0332bu;
import com.p004a.p005a.EnumC0390f;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0359aa;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.ad */
/* loaded from: classes.dex */
public class C0279ad extends WebViewClient {

    /* renamed from: c */
    private static final C0293h f744c = (C0293h) C0293h.f782a.mo727a();

    /* renamed from: a */
    protected C0308w f745a;

    /* renamed from: d */
    private final Map f747d;

    /* renamed from: e */
    private final boolean f748e;

    /* renamed from: f */
    private boolean f749f;

    /* renamed from: g */
    private boolean f750g;

    /* renamed from: b */
    protected boolean f746b = false;

    /* renamed from: h */
    private boolean f751h = false;

    /* renamed from: i */
    private boolean f752i = false;

    public C0279ad(C0308w c0308w, Map map, boolean z, boolean z2) {
        this.f745a = c0308w;
        this.f747d = map;
        this.f748e = z;
        this.f750g = z2;
    }

    /* renamed from: a */
    public static C0279ad m692a(C0308w c0308w, Map map, boolean z, boolean z2) {
        return C0358a.f1021a >= 11 ? new C0359aa(c0308w, map, z, z2) : new C0279ad(c0308w, map, z, z2);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        Context context;
        C0259al c0259al;
        try {
            C0372i.m911a("shouldOverrideUrlLoading(\"" + str + "\")");
            uri = Uri.parse(str);
            C0293h c0293h = f744c;
        } catch (Throwable th) {
            C0372i.m919d("An unknown error occurred in shouldOverrideUrlLoading.", th);
            return false;
        }
        if (C0293h.m723a(uri)) {
            C0293h c0293h2 = f744c;
            C0293h.m722a(this.f745a, this.f747d, uri, webView);
            return true;
        }
        if (this.f750g) {
            if (C0358a.m880a(uri)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            HashMap map = new HashMap();
            map.put("u", str);
            ActivityC0274b.m633a(this.f745a, new C0309x("intent", map));
            return true;
        }
        if (this.f748e) {
            Uri uriM613a = uri;
            try {
                C0332bu c0332buM783h = this.f745a.m783h();
                context = (Context) c0332buM783h.f967f.m898a();
                c0259al = (C0259al) c0332buM783h.f980s.m899a();
                if (c0259al != null && c0259al.m614a(uri)) {
                    uriM613a = c0259al.m613a(uri, context);
                }
            } catch (C0260am e) {
                C0372i.m920e("Unable to append parameter to URL: " + str);
            }
            HashMap map2 = new HashMap();
            map2.put("u", uriM613a.toString());
            ActivityC0274b.m633a(this.f745a, new C0309x("intent", map2));
            return true;
        }
        C0372i.m920e("URL is not a GMSG and can't handle URL: " + str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f749f = true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f749f = false;
        if (this.f751h) {
            RunnableC0299n runnableC0299nM785j = this.f745a.m785j();
            if (runnableC0299nM785j != null) {
                runnableC0299nM785j.m742b();
            } else {
                C0372i.m911a("adLoader was null while trying to setFinishedLoadingHtml().");
            }
            this.f751h = false;
        }
        if (this.f752i) {
            C0293h c0293h = f744c;
            C0293h.m718a(webView);
            this.f752i = false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f749f = false;
        RunnableC0299n runnableC0299nM785j = this.f745a.m785j();
        if (runnableC0299nM785j != null) {
            runnableC0299nM785j.m737a(EnumC0390f.NETWORK_ERROR);
        }
    }

    /* renamed from: a */
    public final void m693a() {
        this.f746b = true;
    }

    /* renamed from: b */
    public final void m694b() {
        this.f750g = false;
    }

    /* renamed from: c */
    public final void m695c() {
        this.f751h = true;
    }

    /* renamed from: d */
    public final void m696d() {
        this.f752i = true;
    }

    /* renamed from: e */
    public final boolean m697e() {
        return this.f749f;
    }
}
