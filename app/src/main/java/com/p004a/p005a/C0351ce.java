package com.p004a.p005a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.p004a.p005a.p007b.C0275a;
import com.p004a.p005a.p007b.C0278ac;
import com.p004a.p005a.p007b.C0290e;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0363ae;
import com.p004a.p005a.p011e.C0372i;
import com.p004a.p005a.p011e.C0381r;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.ce */
/* loaded from: classes.dex */
public final class C0351ce implements InterfaceC0333bv {
    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        C0332bu c0332buM783h = c0308w.m783h();
        C0331bt c0331bt = (C0331bt) ((C0330bs) c0332buM783h.f965d.m898a()).f945b.m898a();
        m856c(map, "as_domains", c0331bt.f947a);
        m856c(map, "bad_ad_report_path", c0331bt.f954h);
        m854a(map, "min_hwa_banner", c0331bt.f948b);
        m854a(map, "min_hwa_activation_overlay", c0331bt.f949c);
        m854a(map, "min_hwa_overlay", c0331bt.f950d);
        m856c(map, "mraid_banner_path", c0331bt.f951e);
        m856c(map, "mraid_expanded_banner_path", c0331bt.f952f);
        m856c(map, "mraid_interstitial_path", c0331bt.f953g);
        m855b(map, "ac_max_size", c0331bt.f955i);
        m855b(map, "ac_padding", c0331bt.f956j);
        m855b(map, "ac_total_quota", c0331bt.f957k);
        m855b(map, "db_total_quota", c0331bt.f958l);
        m855b(map, "db_quota_per_origin", c0331bt.f959m);
        m855b(map, "db_quota_step_size", c0331bt.f960n);
        C0290e c0290eM786k = c0308w.m786k();
        if (C0358a.f1021a >= 11) {
            C0381r.m925a(c0290eM786k.getSettings(), c0332buM783h);
            C0381r.m925a(webView.getSettings(), c0332buM783h);
        }
        if (!((C0278ac) c0332buM783h.f968g.m898a()).m687a()) {
            boolean zM716j = c0290eM786k.m716j();
            boolean z = C0358a.f1021a < ((Integer) c0331bt.f948b.m899a()).intValue();
            if (!z && zM716j) {
                C0372i.m911a("Re-enabling hardware acceleration for a banner after reading constants.");
                c0290eM786k.m713g();
            } else if (z && !zM716j) {
                C0372i.m911a("Disabling hardware acceleration for a banner after reading constants.");
                c0290eM786k.m712f();
            }
        }
        C0275a c0275a = (C0275a) c0332buM783h.f966e.m898a();
        if (!((C0278ac) c0332buM783h.f968g.m898a()).m689b() && c0275a != null) {
            boolean zJ = c0275a.m716j();
            boolean z2 = C0358a.f1021a < ((Integer) c0331bt.f949c.m899a()).intValue();
            if (!z2 && zJ) {
                C0372i.m911a("Re-enabling hardware acceleration for an activation overlay after reading constants.");
                c0275a.m713g();
            } else if (z2 && !zJ) {
                C0372i.m911a("Disabling hardware acceleration for an activation overlay after reading constants.");
                c0275a.m712f();
            }
        }
        String str = (String) c0331bt.f947a.m899a();
        C0259al c0259al = (C0259al) c0332buM783h.f980s.m899a();
        if (c0259al != null && !TextUtils.isEmpty(str)) {
            c0259al.f669a = str.split(",");
        }
        c0331bt.f961o.m900a(true);
    }

    /* renamed from: a */
    private static void m854a(HashMap map, String str, C0363ae c0363ae) {
        try {
            String str2 = (String) map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                c0363ae.m900a(Integer.valueOf(str2));
            }
        } catch (NumberFormatException e) {
            C0372i.m911a("Could not parse \"" + str + "\" constant.");
        }
    }

    /* renamed from: b */
    private static void m855b(HashMap map, String str, C0363ae c0363ae) {
        try {
            String str2 = (String) map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                c0363ae.m900a(Long.valueOf(str2));
            }
        } catch (NumberFormatException e) {
            C0372i.m911a("Could not parse \"" + str + "\" constant.");
        }
    }

    /* renamed from: c */
    private static void m856c(HashMap map, String str, C0363ae c0363ae) {
        String str2 = (String) map.get(str);
        if (!TextUtils.isEmpty(str2)) {
            c0363ae.m900a(str2);
        }
    }
}
