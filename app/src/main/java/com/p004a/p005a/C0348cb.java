package com.p004a.p005a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.cb */
/* loaded from: classes.dex */
public final class C0348cb implements InterfaceC0333bv {
    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        String str = (String) map.get("u");
        if (TextUtils.isEmpty(str)) {
            C0372i.m920e("Could not get URL from track gmsg.");
        } else {
            new Thread(new RunnableC0401q(str, (Context) c0308w.m783h().f967f.m898a())).start();
        }
    }
}
