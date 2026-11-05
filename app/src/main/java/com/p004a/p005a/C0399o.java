package com.p004a.p005a;

import android.app.Activity;
import android.webkit.WebView;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.o */
/* loaded from: classes.dex */
public final class C0399o implements InterfaceC0333bv {
    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) throws NumberFormatException {
        if (((Activity) c0308w.m783h().f964c.m901a()) == null) {
            C0372i.m920e("Activity was null while responding to touch gmsg.");
            return;
        }
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            int i3 = Integer.parseInt(str3);
            C0257aj c0257aj = (C0257aj) c0308w.m783h().f979r.m899a();
            if (c0257aj != null) {
                c0257aj.m597a(i, i2, i3);
            }
        } catch (NumberFormatException e) {
            C0372i.m920e("Could not parse touch parameters from gmsg.");
        }
    }
}
