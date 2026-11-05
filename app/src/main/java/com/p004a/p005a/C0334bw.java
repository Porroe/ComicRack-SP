package com.p004a.p005a;

import android.webkit.WebView;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.bw */
/* loaded from: classes.dex */
public final class C0334bw implements InterfaceC0333bv {
    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        if (((String) map.get("name")) == null) {
            C0372i.m914b("Error: App event with no name parameter.");
        } else {
            map.get("info");
            c0308w.m797v();
        }
    }
}
