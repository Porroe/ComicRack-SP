package com.p004a.p005a.p007b;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.p004a.p005a.C0329br;
import com.p004a.p005a.C0332bu;
import com.p004a.p005a.C0392h;
import com.p004a.p005a.EnumC0390f;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.y */
/* loaded from: classes.dex */
public final class RunnableC0310y implements Runnable {

    /* renamed from: a */
    volatile boolean f870a;

    /* renamed from: b */
    boolean f871b;

    /* renamed from: c */
    private final C0329br f872c;

    /* renamed from: d */
    private final InterfaceC0276aa f873d;

    /* renamed from: e */
    private String f874e;

    /* renamed from: f */
    private Thread f875f;

    RunnableC0310y(C0329br c0329br) {
        this(c0329br, new C0311z());
    }

    private RunnableC0310y(C0329br c0329br, InterfaceC0276aa interfaceC0276aa) {
        this.f875f = null;
        this.f872c = c0329br;
        this.f873d = interfaceC0276aa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m802a(HttpURLConnection httpURLConnection) throws NumberFormatException {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Debug-Dialog");
        if (!TextUtils.isEmpty(headerField)) {
            ((RunnableC0299n) this.f872c.f941b.m899a()).m751f(headerField);
        }
        String headerField2 = httpURLConnection.getHeaderField("X-Afma-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField2)) {
            for (String str : headerField2.trim().split("\\s+")) {
                ((C0308w) ((C0332bu) this.f872c.f940a.m898a()).f963b.m898a()).m775b(str);
            }
        }
        String headerField3 = httpURLConnection.getHeaderField("X-Afma-Manual-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField3)) {
            for (String str2 : headerField3.trim().split("\\s+")) {
                ((C0308w) ((C0332bu) this.f872c.f940a.m898a()).f963b.m898a()).m778c(str2);
            }
        }
        String headerField4 = httpURLConnection.getHeaderField("X-Afma-Click-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField4)) {
            for (String str3 : headerField4.trim().split("\\s+")) {
                ((RunnableC0299n) this.f872c.f941b.m899a()).m739a(str3);
            }
        }
        String headerField5 = httpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
        if (!TextUtils.isEmpty(headerField5)) {
            try {
                float f = Float.parseFloat(headerField5);
                C0308w c0308w = (C0308w) ((C0332bu) this.f872c.f940a.m898a()).f963b.m898a();
                if (f > 0.0f) {
                    c0308w.m760a(f);
                    if (!c0308w.m793r()) {
                        c0308w.m782g();
                    }
                } else if (c0308w.m793r()) {
                    c0308w.m781f();
                }
            } catch (NumberFormatException e) {
                C0372i.m919d("Could not get refresh value: " + headerField5, e);
            }
        }
        String headerField6 = httpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
        if (!TextUtils.isEmpty(headerField6)) {
            try {
                ((C0308w) ((C0332bu) this.f872c.f940a.m898a()).f963b.m898a()).m763a((long) (Float.parseFloat(headerField6) * 1000.0f));
            } catch (NumberFormatException e2) {
                C0372i.m919d("Could not get timeout value: " + headerField6, e2);
            }
        }
        String headerField7 = httpURLConnection.getHeaderField("X-Afma-Orientation");
        if (!TextUtils.isEmpty(headerField7)) {
            if (headerField7.equals("portrait")) {
                ((RunnableC0299n) this.f872c.f941b.m899a()).m734a(C0358a.m881b());
            } else if (headerField7.equals("landscape")) {
                ((RunnableC0299n) this.f872c.f941b.m899a()).m734a(C0358a.m864a());
            }
        }
        if (!TextUtils.isEmpty(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"))) {
            try {
                ((C0308w) ((C0332bu) this.f872c.f940a.m898a()).f963b.m898a()).m773b(Long.parseLong(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life")));
            } catch (NumberFormatException e3) {
                C0372i.m920e("Got bad value of Doritos cookie cache life from header: " + httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
            }
        }
        String headerField8 = httpURLConnection.getHeaderField("Cache-Control");
        if (!TextUtils.isEmpty(headerField8)) {
            ((RunnableC0299n) this.f872c.f941b.m899a()).m746c(headerField8);
        }
        String headerField9 = httpURLConnection.getHeaderField("X-Afma-Mediation");
        if (!TextUtils.isEmpty(headerField9)) {
            ((RunnableC0299n) this.f872c.f941b.m899a()).m744b(Boolean.valueOf(headerField9).booleanValue());
        }
        String headerField10 = httpURLConnection.getHeaderField("Content-Type");
        if (!TextUtils.isEmpty(headerField10)) {
            ((RunnableC0299n) this.f872c.f941b.m899a()).m743b(headerField10);
        }
        String headerField11 = httpURLConnection.getHeaderField("X-Afma-Ad-Size");
        if (!TextUtils.isEmpty(headerField11)) {
            try {
                String[] strArrSplit = headerField11.split("x", 2);
                if (strArrSplit.length != 2) {
                    C0372i.m920e("Could not parse size header: " + headerField11);
                } else {
                    int i = Integer.parseInt(strArrSplit[0]);
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    RunnableC0299n runnableC0299n = (RunnableC0299n) this.f872c.f941b.m899a();
                    runnableC0299n.m738a(new C0392h(i, i2));
                }
            } catch (NumberFormatException e4) {
                C0372i.m920e("Could not parse size header: " + headerField11);
            }
        }
        String headerField12 = httpURLConnection.getHeaderField("X-Afma-Disable-Activation-And-Scroll");
        if (!TextUtils.isEmpty(headerField12)) {
            ((RunnableC0299n) this.f872c.f941b.m899a()).m741a(headerField12.equals("1"));
        }
    }

    /* renamed from: a */
    final synchronized void m803a(String str) {
        if (this.f875f == null) {
            this.f874e = str;
            this.f870a = false;
            this.f875f = new Thread(this);
            this.f875f.start();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.f870a) {
            try {
                HttpURLConnection httpURLConnectionMo651a = this.f873d.mo651a(new URL(this.f874e));
                try {
                    String string = PreferenceManager.getDefaultSharedPreferences((Context) ((C0332bu) this.f872c.f940a.m898a()).f967f.m898a()).getString("drt", "");
                    if (this.f871b && !TextUtils.isEmpty(string)) {
                        if (C0358a.f1021a == 8) {
                            httpURLConnectionMo651a.addRequestProperty("X-Afma-drt-Cookie", string);
                        } else {
                            httpURLConnectionMo651a.addRequestProperty("Cookie", string);
                        }
                    }
                    C0358a.m875a(httpURLConnectionMo651a, (Context) ((C0332bu) this.f872c.f940a.m898a()).f967f.m898a());
                    httpURLConnectionMo651a.setInstanceFollowRedirects(false);
                    httpURLConnectionMo651a.connect();
                    int responseCode = httpURLConnectionMo651a.getResponseCode();
                    if (300 <= responseCode && responseCode < 400) {
                        String headerField = httpURLConnectionMo651a.getHeaderField("Location");
                        if (headerField == null) {
                            C0372i.m916c("Could not get redirect location from a " + responseCode + " redirect.");
                            ((RunnableC0299n) this.f872c.f941b.m899a()).m737a(EnumC0390f.INTERNAL_ERROR);
                            this.f870a = true;
                        } else {
                            m802a(httpURLConnectionMo651a);
                            this.f874e = headerField;
                        }
                    } else if (responseCode == 200) {
                        m802a(httpURLConnectionMo651a);
                        String strTrim = C0358a.m869a(new InputStreamReader(httpURLConnectionMo651a.getInputStream())).trim();
                        C0372i.m911a("Response content is: " + strTrim);
                        if (TextUtils.isEmpty(strTrim)) {
                            C0372i.m911a("Response message is null or zero length: " + strTrim);
                            ((RunnableC0299n) this.f872c.f941b.m899a()).m737a(EnumC0390f.NO_FILL);
                            this.f870a = true;
                        } else {
                            ((RunnableC0299n) this.f872c.f941b.m899a()).m740a(strTrim, this.f874e);
                            this.f870a = true;
                        }
                    } else if (responseCode == 400) {
                        C0372i.m916c("Bad request");
                        ((RunnableC0299n) this.f872c.f941b.m899a()).m737a(EnumC0390f.INVALID_REQUEST);
                        this.f870a = true;
                    } else {
                        C0372i.m916c("Invalid response code: " + responseCode);
                        ((RunnableC0299n) this.f872c.f941b.m899a()).m737a(EnumC0390f.INTERNAL_ERROR);
                        this.f870a = true;
                    }
                    httpURLConnectionMo651a.disconnect();
                } catch (Throwable th) {
                    httpURLConnectionMo651a.disconnect();
                    throw th;
                }
            } catch (MalformedURLException e) {
                C0372i.m915b("Received malformed ad url from javascript.", e);
                ((RunnableC0299n) this.f872c.f941b.m899a()).m737a(EnumC0390f.INTERNAL_ERROR);
                return;
            } catch (IOException e2) {
                C0372i.m915b("IOException connecting to ad url.", e2);
                ((RunnableC0299n) this.f872c.f941b.m899a()).m737a(EnumC0390f.NETWORK_ERROR);
                return;
            } catch (Throwable th2) {
                C0372i.m915b("An unknown error occurred in AdResponseLoader.", th2);
                ((RunnableC0299n) this.f872c.f941b.m899a()).m737a(EnumC0390f.INTERNAL_ERROR);
                return;
            }
        }
    }
}
