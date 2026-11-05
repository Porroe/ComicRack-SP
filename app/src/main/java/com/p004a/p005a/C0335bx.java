package com.p004a.p005a;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import com.p004a.p005a.p007b.C0293h;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.bx */
/* loaded from: classes.dex */
public final class C0335bx implements InterfaceC0333bv {

    /* renamed from: a */
    private static final C0293h f982a = (C0293h) C0293h.f782a.mo727a();

    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        String str = (String) map.get("urls");
        if (str == null) {
            C0372i.m920e("Could not get the urls param from canOpenURLs gmsg.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = webView.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            map2.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length >= 2 ? strArrSplit2[1] : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0])), 65536) != null));
        }
        C0293h c0293h = f982a;
        C0293h.m721a(webView, map2);
    }
}
