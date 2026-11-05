package com.p004a.p005a;

import android.webkit.WebView;
import com.p004a.p005a.p007b.C0290e;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.ca */
/* loaded from: classes.dex */
public final class C0347ca implements InterfaceC0333bv {
    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        if (webView instanceof C0290e) {
            ((C0290e) webView).setCustomClose("1".equals(map.get("custom_close")));
        } else {
            C0372i.m914b("Trying to set a custom close icon on a WebView that isn't an AdWebView");
        }
    }
}
