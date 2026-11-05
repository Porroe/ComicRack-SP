package com.p004a.p005a;

import android.app.Activity;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.p004a.p005a.p007b.C0288c;
import com.p004a.p005a.p007b.C0290e;
import com.p004a.p005a.p007b.C0293h;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.p */
/* loaded from: classes.dex */
public final class C0400p implements InterfaceC0333bv {

    /* renamed from: a */
    private static final C0293h f1112a = (C0293h) C0293h.f782a.mo727a();

    /* renamed from: a */
    private static int m938a(HashMap map, String str, int i, DisplayMetrics displayMetrics) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                return (int) TypedValue.applyDimension(1, Integer.parseInt(str2), displayMetrics);
            } catch (NumberFormatException e) {
                C0372i.m911a("Could not parse \"" + str + "\" in a video gmsg: " + str2);
                return i;
            }
        }
        return i;
    }

    @Override // com.p004a.p005a.InterfaceC0333bv
    /* renamed from: a */
    public final void mo840a(C0308w c0308w, HashMap map, WebView webView) {
        String str = (String) map.get("action");
        if (str == null) {
            C0372i.m911a("No \"action\" parameter in a video gmsg.");
            return;
        }
        if (webView instanceof C0290e) {
            C0290e c0290e = (C0290e) webView;
            ActivityC0274b activityC0274bM714h = c0290e.m714h();
            if (activityC0274bM714h == null) {
                C0372i.m911a("Could not get adActivity for a video gmsg.");
                return;
            }
            boolean zEquals = str.equals("new");
            boolean zEquals2 = str.equals("position");
            if (zEquals || zEquals2) {
                DisplayMetrics displayMetricsM867a = C0358a.m867a((Activity) activityC0274bM714h);
                int iM938a = m938a(map, "x", 0, displayMetricsM867a);
                int iM938a2 = m938a(map, "y", 0, displayMetricsM867a);
                int iM938a3 = m938a(map, "w", -1, displayMetricsM867a);
                int iM938a4 = m938a(map, "h", -1, displayMetricsM867a);
                if (zEquals && activityC0274bM714h.m643a() == null) {
                    activityC0274bM714h.m646b(iM938a, iM938a2, iM938a3, iM938a4);
                    return;
                } else {
                    activityC0274bM714h.m644a(iM938a, iM938a2, iM938a3, iM938a4);
                    return;
                }
            }
            C0288c c0288cM643a = activityC0274bM714h.m643a();
            if (c0288cM643a == null) {
                C0293h c0293h = f1112a;
                C0293h.m720a(c0290e, "onVideoEvent", "{'event': 'error', 'what': 'no_video_view'}");
                return;
            }
            if (str.equals("click")) {
                DisplayMetrics displayMetricsM867a2 = C0358a.m867a((Activity) activityC0274bM714h);
                int iM938a5 = m938a(map, "x", 0, displayMetricsM867a2);
                int iM938a6 = m938a(map, "y", 0, displayMetricsM867a2);
                long jUptimeMillis = SystemClock.uptimeMillis();
                c0288cM643a.m704a(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iM938a5, iM938a6, 0));
                return;
            }
            if (str.equals("controls")) {
                String str2 = (String) map.get("enabled");
                if (str2 == null) {
                    C0372i.m911a("No \"enabled\" parameter in a controls video gmsg.");
                    return;
                } else if (str2.equals("true")) {
                    c0288cM643a.setMediaControllerEnabled(true);
                    return;
                } else {
                    c0288cM643a.setMediaControllerEnabled(false);
                    return;
                }
            }
            if (str.equals("currentTime")) {
                String str3 = (String) map.get("time");
                if (str3 == null) {
                    C0372i.m911a("No \"time\" parameter in a currentTime video gmsg.");
                    return;
                }
                try {
                    c0288cM643a.m703a((int) (Float.parseFloat(str3) * 1000.0f));
                    return;
                } catch (NumberFormatException e) {
                    C0372i.m911a("Could not parse \"time\" parameter: " + str3);
                    return;
                }
            }
            if (str.equals("hide")) {
                c0288cM643a.setVisibility(4);
                return;
            }
            if (str.equals("load")) {
                c0288cM643a.m702a();
                return;
            }
            if (str.equals("pause")) {
                c0288cM643a.m705b();
                return;
            }
            if (str.equals("play")) {
                c0288cM643a.m706c();
                return;
            }
            if (str.equals("show")) {
                c0288cM643a.setVisibility(0);
                return;
            } else if (str.equals("src")) {
                c0288cM643a.setSrc((String) map.get("src"));
                return;
            } else {
                C0372i.m911a("Unknown video action: " + str);
                return;
            }
        }
        C0372i.m911a("Could not get adWebView for a video gmsg.");
    }
}
