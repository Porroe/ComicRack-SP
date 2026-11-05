package com.p004a.p012b.p013a.p014a;

import android.util.Log;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.DefaultHttpClientConnection;

/* renamed from: com.a.b.a.a.x */
/* loaded from: classes.dex */
final class C0451x {

    /* renamed from: a */
    DefaultHttpClientConnection f1470a;

    /* renamed from: b */
    InterfaceC0452y f1471b;

    /* renamed from: c */
    int f1472c;

    /* renamed from: d */
    boolean f1473d;

    /* renamed from: e */
    HttpHost f1474e;

    /* renamed from: f */
    SocketFactory f1475f;

    public C0451x(HttpHost httpHost) {
        this(httpHost, new PlainSocketFactory());
    }

    private C0451x(HttpHost httpHost, SocketFactory socketFactory) {
        this.f1470a = new DefaultHttpClientConnection();
        this.f1473d = true;
        this.f1474e = httpHost;
        this.f1475f = socketFactory;
    }

    /* renamed from: a */
    public final void m1052a() throws org.apache.http.HttpException, java.io.IOException {
        this.f1470a.flush();
        HttpConnectionMetrics metrics = this.f1470a.getMetrics();
        while (metrics.getResponseCount() < metrics.getRequestCount()) {
            HttpResponse httpResponseReceiveResponseHeader = this.f1470a.receiveResponseHeader();
            if (!httpResponseReceiveResponseHeader.getStatusLine().getProtocolVersion().greaterEquals(HttpVersion.HTTP_1_1)) {
                this.f1471b.mo1021a();
                this.f1473d = false;
            }
            Header[] headers = httpResponseReceiveResponseHeader.getHeaders("Connection");
            if (headers != null) {
                for (Header header : headers) {
                    if ("close".equalsIgnoreCase(header.getValue())) {
                        this.f1471b.mo1021a();
                        this.f1473d = false;
                    }
                }
            }
            this.f1472c = httpResponseReceiveResponseHeader.getStatusLine().getStatusCode();
            if (this.f1472c != 200) {
                this.f1471b.mo1022a(this.f1472c);
                m1053b();
                return;
            }
            this.f1470a.receiveResponseEntity(httpResponseReceiveResponseHeader);
            httpResponseReceiveResponseHeader.getEntity().consumeContent();
            this.f1471b.mo1023b();
            if (C0436i.m977a().m991d()) {
                Log.v("GoogleAnalyticsTracker", "HTTP Response Code: " + httpResponseReceiveResponseHeader.getStatusLine().getStatusCode());
            }
            if (!this.f1473d) {
                m1053b();
                return;
            }
        }
    }

    /* renamed from: b */
    final void m1053b() {
        if (this.f1470a == null || !this.f1470a.isOpen()) {
            return;
        }
        try {
            this.f1470a.close();
        } catch (IOException e) {
        }
    }
}
