package com.p004a.p005a.p007b;

import android.content.Context;
import com.p004a.p005a.C0330bs;
import com.p004a.p005a.C0331bt;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.ae */
/* loaded from: classes.dex */
public final class RunnableC0280ae implements Runnable {

    /* renamed from: a */
    private String f753a;

    /* renamed from: b */
    private Context f754b;

    public RunnableC0280ae(String str, Context context) {
        this.f753a = str;
        this.f754b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) ((C0331bt) C0330bs.m837a().f945b.m898a()).f954h.m899a()).openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setInstanceFollowRedirects(true);
            C0358a.m875a(httpURLConnection, this.f754b);
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            byte[] bytes = new C0281af(this.f753a).m698a().toString().getBytes();
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.close();
                if (httpURLConnection.getResponseCode() != 200) {
                    C0372i.m914b("Got error response from BadAd backend: " + httpURLConnection.getResponseMessage());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException | org.json.JSONException e) {
            C0372i.m915b("Error reporting bad ad.", e);
        }
    }
}
