package com.p004a.p005a;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.p004a.p005a.p007b.C0277ab;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: DontLook */
/* renamed from: com.a.a.by */
/* loaded from: classes.dex */
public final class C0336by implements InterfaceC0333bv {
    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        C0259al c0259al;
        Uri uri;
        String host;
        String str = (String) map.get("u");
        if (str == null) {
            C0372i.m920e("Could not get URL from click gmsg.");
            return;
        }
        C0277ab c0277abM788m = c0308w.m788m();
        if (c0277abM788m != null && (host = (uri = Uri.parse(str)).getHost()) != null && host.toLowerCase(Locale.US).endsWith(".admob.com")) {
            String str2 = null;
            String path = uri.getPath();
            if (path != null) {
                String[] strArrSplit = path.split("/");
                if (strArrSplit.length >= 4) {
                    str2 = strArrSplit[2] + "/" + strArrSplit[3];
                }
            }
            c0277abM788m.m660a(str2);
        }
        C0332bu c0332buM783h = c0308w.m783h();
        Context context = (Context) c0332buM783h.f967f.m898a();
        Uri uri2 = Uri.parse(str);
        Uri uriM613a = uri2;
        try {
            c0259al = (C0259al) c0332buM783h.f980s.m899a();
            if (c0259al != null && c0259al.m614a(uri2)) {
                uriM613a = c0259al.m613a(uri2, context);
            }
        } catch (C0260am e) {
            C0372i.m920e("Unable to append parameter to URL: " + str);
        }
        new Thread(new RunnableC0401q(uriM613a.toString(), context)).start();
    }
}
