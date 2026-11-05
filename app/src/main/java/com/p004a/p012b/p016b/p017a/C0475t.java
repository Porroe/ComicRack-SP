package com.p004a.p012b.p016b.p017a;

import android.content.Context;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

/* compiled from: DontLook */
/* renamed from: com.a.b.b.a.t */
/* loaded from: classes.dex */
public final class C0475t implements InterfaceC0472q {

    /* renamed from: a */
    private long f1524a;

    /* renamed from: b */
    private long f1525b;

    /* renamed from: c */
    private long f1526c;

    /* renamed from: d */
    private long f1527d;

    /* renamed from: e */
    private long f1528e = 0;

    /* renamed from: f */
    private int f1529f;

    /* renamed from: g */
    private C0473r f1530g;

    public C0475t(Context context, InterfaceC0471p interfaceC0471p) {
        this.f1530g = new C0473r(context.getSharedPreferences("com.android.vending.licensing.ServerManagedPolicy", 0), interfaceC0471p);
        this.f1529f = Integer.parseInt(this.f1530g.m1087b("lastResponse", Integer.toString(291)));
        this.f1524a = Long.parseLong(this.f1530g.m1087b("validityTimestamp", "0"));
        this.f1525b = Long.parseLong(this.f1530g.m1087b("retryUntil", "0"));
        this.f1526c = Long.parseLong(this.f1530g.m1087b("maxRetries", "0"));
        this.f1527d = Long.parseLong(this.f1530g.m1087b("retryCount", "0"));
    }

    @Override // com.p004a.p012b.p016b.p017a.InterfaceC0472q
    /* renamed from: a */
    public final void mo1084a(int i, C0474s c0474s) {
        if (i != 291) {
            m1088a(0L);
        } else {
            m1088a(this.f1527d + 1);
        }
        if (i == 256) {
            Map mapM1092d = m1092d(c0474s.f1523g);
            this.f1529f = i;
            m1089a((String) mapM1092d.get("VT"));
            m1090b((String) mapM1092d.get("GT"));
            m1091c((String) mapM1092d.get("GR"));
        } else if (i == 561) {
            m1089a("0");
            m1090b("0");
            m1091c("0");
        }
        this.f1528e = System.currentTimeMillis();
        this.f1529f = i;
        this.f1530g.m1086a("lastResponse", Integer.toString(i));
        C0473r c0473r = this.f1530g;
        if (c0473r.f1514a != null) {
            c0473r.f1514a.commit();
            c0473r.f1514a = null;
        }
    }

    /* renamed from: a */
    private void m1088a(long j) {
        this.f1527d = j;
        this.f1530g.m1086a("retryCount", Long.toString(j));
    }

    /* renamed from: a */
    private void m1089a(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e) {
            Log.w("ServerManagedPolicy", "License validity timestamp (VT) missing, caching for a minute");
            lValueOf = Long.valueOf(System.currentTimeMillis() + 60000);
            str = Long.toString(lValueOf.longValue());
        }
        this.f1524a = lValueOf.longValue();
        this.f1530g.m1086a("validityTimestamp", str);
    }

    /* renamed from: b */
    private void m1090b(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e) {
            Log.w("ServerManagedPolicy", "License retry timestamp (GT) missing, grace period disabled");
            str = "0";
            lValueOf = 0L;
        }
        this.f1525b = lValueOf.longValue();
        this.f1530g.m1086a("retryUntil", str);
    }

    /* renamed from: c */
    private void m1091c(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e) {
            Log.w("ServerManagedPolicy", "Licence retry count (GR) missing, grace period disabled");
            str = "0";
            lValueOf = 0L;
        }
        this.f1526c = lValueOf.longValue();
        this.f1530g.m1086a("maxRetries", str);
    }

    @Override // com.p004a.p012b.p016b.p017a.InterfaceC0472q
    /* renamed from: a */
    public final boolean mo1085a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f1529f == 256) {
            if (jCurrentTimeMillis <= this.f1524a) {
                return false;
            }
        } else if (this.f1529f == 291 && jCurrentTimeMillis < this.f1528e + 60000) {
            return (jCurrentTimeMillis <= this.f1525b || this.f1527d > this.f1526c) ? false : false;
        }
        return false;
    }

    /* renamed from: d */
    private static Map m1092d(String str) {
        HashMap map = new HashMap();
        try {
            for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI("?" + str), "UTF-8")) {
                map.put(nameValuePair.getName(), nameValuePair.getValue());
            }
        } catch (URISyntaxException e) {
            Log.w("ServerManagedPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return map;
    }
}
