package com.p004a.p005a;

import android.webkit.WebView;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p007b.RunnableC0299n;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.cc */
/* loaded from: classes.dex */
public final class C0349cc implements InterfaceC0333bv {
    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        C0372i.m920e("Invalid " + ((String) map.get("type")) + " request error: " + ((String) map.get("errors")));
        RunnableC0299n runnableC0299nM785j = c0308w.m785j();
        if (runnableC0299nM785j != null) {
            runnableC0299nM785j.m737a(EnumC0390f.INVALID_REQUEST);
        }
    }
}
