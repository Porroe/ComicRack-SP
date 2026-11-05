package com.p004a.p005a.p007b;

import android.net.Uri;
import android.webkit.WebView;
import com.p004a.p005a.InterfaceC0333bv;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;
import com.p004a.p005a.p011e.InterfaceC0380q;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.h */
/* loaded from: classes.dex */
public final class C0293h {

    /* renamed from: e */
    private static final C0293h f786e = new C0293h();

    /* renamed from: a */
    public static final InterfaceC0380q f782a = new C0295j();

    /* renamed from: b */
    public static final Map f783b = Collections.unmodifiableMap(new C0296k());

    /* renamed from: c */
    public static final Map f784c = Collections.unmodifiableMap(new C0297l());

    /* renamed from: d */
    public static final Map f785d = Collections.unmodifiableMap(new C0294i());

    /* renamed from: a */
    static /* synthetic */ C0293h m717a() {
        return f786e;
    }

    /* renamed from: a */
    public static void m722a(C0308w c0308w, Map map, Uri uri, WebView webView) {
        String path;
        HashMap mapM884b = C0358a.m884b(uri);
        if (mapM884b == null) {
            C0372i.m920e("An error occurred while parsing the message parameters.");
            return;
        }
        if (m726c(uri)) {
            String host = uri.getHost();
            if (host == null) {
                C0372i.m920e("An error occurred while parsing the AMSG parameters.");
                path = null;
            } else if (host.equals("launch")) {
                mapM884b.put("a", "intent");
                mapM884b.put("u", mapM884b.get("url"));
                mapM884b.remove("url");
                path = "/open";
            } else if (host.equals("closecanvas")) {
                path = "/close";
            } else if (host.equals("log")) {
                path = "/log";
            } else {
                C0372i.m920e("An error occurred while parsing the AMSG: " + uri.toString());
                path = null;
            }
        } else if (m725b(uri)) {
            path = uri.getPath();
        } else {
            C0372i.m920e("Message was neither a GMSG nor an AMSG.");
            path = null;
        }
        if (path == null) {
            C0372i.m920e("An error occurred while parsing the message.");
            return;
        }
        InterfaceC0333bv interfaceC0333bv = (InterfaceC0333bv) map.get(path);
        if (interfaceC0333bv == null) {
            C0372i.m920e("No AdResponse found, <message: " + path + ">");
        } else {
            interfaceC0333bv.mo840a(c0308w, mapM884b, webView);
        }
    }

    /* renamed from: a */
    public static boolean m723a(Uri uri) {
        if (uri == null || !uri.isHierarchical()) {
            return false;
        }
        return m725b(uri) || m726c(uri);
    }

    /* renamed from: b */
    private static boolean m725b(Uri uri) {
        String authority;
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("gmsg") && (authority = uri.getAuthority()) != null && authority.equals("mobileads.google.com");
    }

    /* renamed from: c */
    private static boolean m726c(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("admob");
    }

    /* renamed from: a */
    public static void m720a(WebView webView, String str, String str2) {
        if (str2 != null) {
            m719a(webView, "AFMA_ReceiveMessage('" + str + "', " + str2 + ");");
        } else {
            m719a(webView, "AFMA_ReceiveMessage('" + str + "');");
        }
    }

    /* renamed from: a */
    private static void m719a(WebView webView, String str) {
        C0372i.m911a("Sending JS to a WebView: " + str);
        webView.loadUrl("javascript:" + str);
    }

    /* renamed from: a */
    public static void m721a(WebView webView, Map map) {
        m720a(webView, "openableURLs", new JSONObject(map).toString());
    }

    /* renamed from: a */
    public static void m718a(WebView webView) {
        m720a(webView, "onshow", "{'version': 'afma-sdk-a-v6.4.1'}");
    }

    /* renamed from: b */
    public static void m724b(WebView webView) {
        m720a(webView, "onhide", null);
    }
}
