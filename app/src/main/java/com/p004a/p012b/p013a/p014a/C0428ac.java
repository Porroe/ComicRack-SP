package com.p004a.p012b.p013a.p014a;

import android.net.Uri;
import android.util.Log;

/* renamed from: com.a.b.a.a.ac */
/* loaded from: classes.dex */
final class C0428ac {
    /* renamed from: a */
    static String m962a(String str, long j) {
        String queryParameter = Uri.parse(str).getQueryParameter("utmht");
        if (queryParameter == null) {
            return str;
        }
        try {
            return str + "&utmqt=" + (j - Long.valueOf(Long.parseLong(queryParameter)).longValue());
        } catch (NumberFormatException e) {
            Log.e("GoogleAnalyticsTracker", "Error parsing utmht parameter: " + e.toString());
            return str;
        }
    }
}
