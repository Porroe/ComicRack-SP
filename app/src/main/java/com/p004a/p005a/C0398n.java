package com.p004a.p005a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.p004a.p005a.p007b.C0275a;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.n */
/* loaded from: classes.dex */
public final class C0398n implements InterfaceC0333bv {
    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        if (webView instanceof C0275a) {
            try {
                int i = !TextUtils.isEmpty((CharSequence) map.get("w")) ? Integer.parseInt((String) map.get("w")) : -1;
                int i2 = !TextUtils.isEmpty((CharSequence) map.get("h")) ? Integer.parseInt((String) map.get("h")) : -1;
                int i3 = !TextUtils.isEmpty((CharSequence) map.get("x")) ? Integer.parseInt((String) map.get("x")) : -1;
                int i4 = TextUtils.isEmpty((CharSequence) map.get("y")) ? -1 : Integer.parseInt((String) map.get("y"));
                if (map.get("a") != null && ((String) map.get("a")).equals("1")) {
                    c0308w.m771a(true, i3, i4, i, i2);
                    return;
                } else if (map.get("a") != null && ((String) map.get("a")).equals("0")) {
                    c0308w.m771a(false, i3, i4, i, i2);
                    return;
                } else {
                    c0308w.m762a(i3, i4, i, i2);
                    return;
                }
            } catch (NumberFormatException e) {
                C0372i.m919d("Invalid number format in activation overlay response.", e);
                return;
            }
        }
        C0372i.m914b("Trying to activate an overlay when this is not an overlay.");
    }
}
