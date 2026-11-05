package com.p004a.p005a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p007b.EnumC0306u;
import com.p004a.p005a.p007b.RunnableC0299n;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: DontLook */
/* renamed from: com.a.a.cd */
/* loaded from: classes.dex */
public final class C0350cd implements InterfaceC0333bv {
    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        EnumC0306u enumC0306u;
        String strReplaceAll = (String) map.get("url");
        String str = (String) map.get("type");
        String str2 = (String) map.get("afma_notify_dt");
        String str3 = (String) map.get("activation_overlay_url");
        String str4 = (String) map.get("check_packages");
        boolean zEquals = "1".equals(map.get("drt_include"));
        String str5 = (String) map.get("request_scenario");
        boolean zEquals2 = "1".equals(map.get("use_webview_loadurl"));
        if (EnumC0306u.OFFLINE_EMPTY.f831e.equals(str5)) {
            enumC0306u = EnumC0306u.OFFLINE_EMPTY;
        } else if (EnumC0306u.OFFLINE_USING_BUFFERED_ADS.f831e.equals(str5)) {
            enumC0306u = EnumC0306u.OFFLINE_USING_BUFFERED_ADS;
        } else if (EnumC0306u.ONLINE_USING_BUFFERED_ADS.f831e.equals(str5)) {
            enumC0306u = EnumC0306u.ONLINE_USING_BUFFERED_ADS;
        } else {
            enumC0306u = EnumC0306u.ONLINE_SERVER_REQUEST;
        }
        C0372i.m916c("Received ad url: <url: \"" + strReplaceAll + "\" type: \"" + str + "\" afmaNotifyDt: \"" + str2 + "\" activationOverlayUrl: \"" + str3 + "\" useWebViewLoadUrl: \"" + zEquals2 + "\">");
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(strReplaceAll)) {
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] strArrSplit = str4.split(",");
            BigInteger bit = bigInteger;
            for (int i = 0; i < strArrSplit.length; i++) {
                if (C0358a.m878a((Context) c0308w.m783h().f964c.m901a(), strArrSplit[i])) {
                    bit = bit.setBit(i);
                }
            }
            String str6 = String.format(Locale.US, "%X", bit);
            strReplaceAll = strReplaceAll.replaceAll("%40installed_markets%40", str6);
            C0330bs.m837a().f944a.m900a(str6);
            C0372i.m916c("Ad url modified to " + strReplaceAll);
        }
        RunnableC0299n runnableC0299nM785j = c0308w.m785j();
        if (runnableC0299nM785j != null) {
            runnableC0299nM785j.m747c(zEquals);
            runnableC0299nM785j.m735a(enumC0306u);
            runnableC0299nM785j.m749d(zEquals2);
            runnableC0299nM785j.m750e(str3);
            runnableC0299nM785j.m748d(strReplaceAll);
        }
    }
}
