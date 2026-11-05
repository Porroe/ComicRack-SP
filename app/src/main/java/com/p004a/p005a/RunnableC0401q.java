package com.p004a.p005a;

import android.content.Context;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DontLook */
/* renamed from: com.a.a.q */
/* loaded from: classes.dex */
public final class RunnableC0401q implements Runnable {

    /* renamed from: a */
    private final Context f1113a;

    /* renamed from: b */
    private final String f1114b;

    public RunnableC0401q(String str, Context context) {
        this.f1114b = str;
        this.f1113a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0372i.m911a("Pinging URL: " + this.f1114b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f1114b).openConnection();
            try {
                C0358a.m875a(httpURLConnection, this.f1113a);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    C0372i.m920e("Did not receive 2XX (got " + responseCode + ") from pinging URL: " + this.f1114b);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
            C0372i.m919d("Unable to ping the URL: " + this.f1114b, th);
        }
    }
}
