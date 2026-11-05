package com.p004a.p005a;

import android.webkit.WebView;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p007b.C0309x;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.cg */
/* loaded from: classes.dex */
public final class C0353cg implements InterfaceC0333bv {

    /* renamed from: a */
    private C0338c f988a;

    public C0353cg() {
        this(new C0338c());
    }

    private C0353cg(C0338c c0338c) {
        this.f988a = c0338c;
    }

    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        String str = (String) map.get("a");
        if (str == null) {
            C0372i.m911a("Could not get the action parameter for open GMSG.");
            return;
        }
        if (str.equals("webapp")) {
            C0338c c0338c = this.f988a;
            C0338c.m841a(c0308w, new C0309x("webapp", map));
        } else if (str.equals("expand")) {
            C0338c c0338c2 = this.f988a;
            C0338c.m841a(c0308w, new C0309x("expand", map));
        } else {
            C0338c c0338c3 = this.f988a;
            C0338c.m841a(c0308w, new C0309x("intent", map));
        }
    }
}
