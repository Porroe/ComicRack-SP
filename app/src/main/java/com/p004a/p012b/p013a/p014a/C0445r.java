package com.p004a.p012b.p013a.p014a;

import android.os.Build;
import java.util.Locale;
import org.apache.http.HttpHost;

/* renamed from: com.a.b.a.a.r */
/* loaded from: classes.dex */
final class C0445r implements InterfaceC0433f {

    /* renamed from: a */
    final HttpHost f1431a;

    /* renamed from: b */
    boolean f1432b;

    /* renamed from: c */
    private final String f1433c;

    /* renamed from: d */
    private HandlerThreadC0446s f1434d;

    public C0445r() {
        this("GoogleAnalytics", "1.4.2");
    }

    public C0445r(String str, String str2) {
        this(str, str2, "www.google-analytics.com");
    }

    private C0445r(String str, String str2, String str3) {
        this.f1432b = false;
        this.f1431a = new HttpHost(str3, 80);
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[7];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = Build.VERSION.RELEASE;
        objArr[3] = locale.getLanguage() != null ? locale.getLanguage().toLowerCase() : "en";
        objArr[4] = locale.getCountry() != null ? locale.getCountry().toLowerCase() : "";
        objArr[5] = Build.MODEL;
        objArr[6] = Build.ID;
        this.f1433c = String.format("%s/%s (Linux; U; Android %s; %s-%s; %s Build/%s)", objArr);
    }

    @Override // com.p004a.p012b.p013a.p014a.InterfaceC0433f
    /* renamed from: a */
    public final void mo971a(InterfaceC0434g interfaceC0434g) {
        if (this.f1434d != null && this.f1434d.getLooper() != null) {
            this.f1434d.getLooper().quit();
            this.f1434d = null;
        }
        this.f1434d = new HandlerThreadC0446s(interfaceC0434g, this.f1433c, this, (byte) 0);
        this.f1434d.start();
    }

    @Override // com.p004a.p012b.p013a.p014a.InterfaceC0433f
    /* renamed from: a */
    public final void mo972a(boolean z) {
        this.f1432b = z;
    }

    @Override // com.p004a.p012b.p013a.p014a.InterfaceC0433f
    /* renamed from: a */
    public final void mo973a(C0440m[] c0440mArr) {
        if (this.f1434d == null) {
            return;
        }
        this.f1434d.m1019a(c0440mArr);
    }
}
