package com.p004a.p005a.p011e;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.p004a.p005a.C0330bs;
import com.p004a.p005a.C0331bt;
import com.p004a.p005a.p007b.C0279ad;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p007b.RunnableC0299n;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.aa */
/* loaded from: classes.dex */
public final class C0359aa extends C0279ad {
    public C0359aa(C0308w c0308w, Map map, boolean z, boolean z2) {
        super(c0308w, map, z, z2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            if ("mraid.js".equalsIgnoreCase(new File(str).getName())) {
                RunnableC0299n runnableC0299nM785j = this.f745a.m785j();
                if (runnableC0299nM785j != null) {
                    runnableC0299nM785j.m745c();
                } else {
                    this.f745a.m770a(true);
                }
                C0331bt c0331bt = (C0331bt) ((C0330bs) this.f745a.m783h().f965d.m898a()).f945b.m898a();
                if (!this.f745a.m783h().m839b()) {
                    if (this.f746b) {
                        String str2 = (String) c0331bt.f952f.m899a();
                        C0372i.m911a("shouldInterceptRequest(" + str2 + ")");
                        return m896a(str2, webView.getContext());
                    }
                    String str3 = (String) c0331bt.f951e.m899a();
                    C0372i.m911a("shouldInterceptRequest(" + str3 + ")");
                    return m896a(str3, webView.getContext());
                }
                String str4 = (String) c0331bt.f953g.m899a();
                C0372i.m911a("shouldInterceptRequest(" + str4 + ")");
                return m896a(str4, webView.getContext());
            }
        } catch (IOException e) {
            C0372i.m919d("IOException fetching MRAID JS.", e);
        } catch (Throwable th) {
            C0372i.m919d("An unknown error occurred fetching MRAID JS.", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    /* renamed from: a */
    private static WebResourceResponse m896a(String str, Context context) throws java.io.IOException, java.net.MalformedURLException, java.io.UnsupportedEncodingException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            C0358a.m875a(httpURLConnection, context.getApplicationContext());
            httpURLConnection.connect();
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(C0358a.m869a(new InputStreamReader(httpURLConnection.getInputStream())).getBytes("UTF-8")));
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
