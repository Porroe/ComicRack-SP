package com.p004a.p012b.p013a.p014a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.a.b.a.a.i */
/* loaded from: classes.dex */
public final class C0436i {

    /* renamed from: a */
    private static C0436i f1392a = new C0436i();

    /* renamed from: g */
    private String f1398g;

    /* renamed from: h */
    private Context f1399h;

    /* renamed from: i */
    private ConnectivityManager f1400i;

    /* renamed from: l */
    private int f1403l;

    /* renamed from: m */
    private InterfaceC0442o f1404m;

    /* renamed from: n */
    private InterfaceC0433f f1405n;

    /* renamed from: o */
    private boolean f1406o;

    /* renamed from: p */
    private boolean f1407p;

    /* renamed from: q */
    private C0411a f1408q;

    /* renamed from: r */
    private C0432e f1409r;

    /* renamed from: u */
    private Handler f1412u;

    /* renamed from: b */
    private boolean f1393b = false;

    /* renamed from: c */
    private boolean f1394c = false;

    /* renamed from: d */
    private boolean f1395d = false;

    /* renamed from: e */
    private boolean f1396e = false;

    /* renamed from: f */
    private int f1397f = 100;

    /* renamed from: j */
    private String f1401j = "GoogleAnalytics";

    /* renamed from: k */
    private String f1402k = "1.4.2";

    /* renamed from: s */
    private Map f1410s = new HashMap();

    /* renamed from: t */
    private Map f1411t = new HashMap();

    /* renamed from: v */
    private Runnable f1413v = new RunnableC0437j(this);

    private C0436i() {
    }

    /* renamed from: a */
    static /* synthetic */ Handler m976a(C0436i c0436i) {
        return c0436i.f1412u;
    }

    /* renamed from: a */
    public static C0436i m977a() {
        return f1392a;
    }

    /* renamed from: a */
    private void m978a(String str, String str2, String str3, String str4, int i) {
        C0435h c0435h = new C0435h(str, str2, str3, str4, i, this.f1399h.getResources().getDisplayMetrics().widthPixels, this.f1399h.getResources().getDisplayMetrics().heightPixels);
        c0435h.f1389r = this.f1409r;
        c0435h.f1375d = !this.f1408q.f1318a ? 0 : C0429b.m963a().m964b();
        c0435h.f1382k = this.f1396e;
        this.f1409r = new C0432e();
        this.f1404m.mo1000a(c0435h);
        if (this.f1406o) {
            this.f1406o = false;
            m980e();
        }
    }

    /* renamed from: b */
    static /* synthetic */ InterfaceC0442o m979b(C0436i c0436i) {
        return c0436i.f1404m;
    }

    /* renamed from: e */
    private void m980e() {
        if (this.f1403l >= 0 && this.f1412u.postDelayed(this.f1413v, this.f1403l * 1000) && this.f1393b) {
            Log.v("GoogleAnalyticsTracker", "Scheduled next dispatch");
        }
    }

    /* renamed from: f */
    private void m981f() {
        if (this.f1412u != null) {
            this.f1412u.removeCallbacks(this.f1413v);
        }
    }

    /* renamed from: a */
    public final void m982a(int i) {
        if (i < 0 || i > 100) {
            Log.w("GoogleAnalyticsTracker", "Invalid sample rate: " + i + " (should be between 0 and 100");
            return;
        }
        this.f1397f = i;
        if (this.f1404m != null) {
            this.f1404m.mo998a(this.f1397f);
        }
    }

    /* renamed from: a */
    public final void m983a(String str) {
        m978a(this.f1398g, "__##GOOGLEPAGEVIEW##__", str, null, -1);
    }

    /* renamed from: a */
    public final void m984a(String str, int i, Context context) {
        InterfaceC0442o c0449v;
        InterfaceC0433f c0445r;
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        if (this.f1404m == null) {
            c0449v = new C0449v(context);
            c0449v.mo1001a(this.f1395d);
            c0449v.mo998a(this.f1397f);
        } else {
            c0449v = this.f1404m;
        }
        if (this.f1405n == null) {
            c0445r = new C0445r(this.f1401j, this.f1402k);
            c0445r.mo972a(this.f1394c);
        } else {
            c0445r = this.f1405n;
        }
        C0438k c0438k = new C0438k(this);
        this.f1398g = str;
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        this.f1399h = context.getApplicationContext();
        this.f1404m = c0449v;
        this.f1408q = new C0411a();
        this.f1404m.mo1004c();
        this.f1405n = c0445r;
        this.f1405n.mo971a(c0438k);
        this.f1407p = false;
        if (this.f1400i == null) {
            this.f1400i = (ConnectivityManager) this.f1399h.getSystemService("connectivity");
        }
        if (this.f1412u == null) {
            this.f1412u = new Handler(context.getMainLooper());
        } else {
            m981f();
        }
        int i2 = this.f1403l;
        this.f1403l = i;
        if (i2 <= 0) {
            m980e();
        } else if (i2 > 0) {
            m981f();
            m980e();
        }
    }

    /* renamed from: a */
    public final void m985a(String str, String str2, String str3, int i) {
        if (str == null) {
            throw new IllegalArgumentException("category cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("action cannot be null");
        }
        m978a(this.f1398g, str, str2, str3, i);
    }

    /* renamed from: a */
    public final void m986a(boolean z) {
        this.f1395d = z;
        if (this.f1404m != null) {
            this.f1404m.mo1001a(this.f1395d);
        }
    }

    /* renamed from: b */
    public final void m987b(boolean z) {
        this.f1393b = z;
    }

    /* renamed from: b */
    public final boolean m988b() {
        if (this.f1393b) {
            Log.v("GoogleAnalyticsTracker", "Called dispatch");
        }
        if (this.f1407p) {
            if (this.f1393b) {
                Log.v("GoogleAnalyticsTracker", "...but dispatcher was busy");
            }
            m980e();
            return false;
        }
        NetworkInfo activeNetworkInfo = this.f1400i.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            if (this.f1393b) {
                Log.v("GoogleAnalyticsTracker", "...but there was no network available");
            }
            m980e();
            return false;
        }
        if (this.f1404m.mo1003b() == 0) {
            this.f1406o = true;
            if (!this.f1393b) {
                return false;
            }
            Log.v("GoogleAnalyticsTracker", "...but there was nothing to dispatch");
            return false;
        }
        C0440m[] c0440mArrMo1002a = this.f1404m.mo1002a();
        this.f1405n.mo973a(c0440mArrMo1002a);
        this.f1407p = true;
        m980e();
        if (this.f1393b) {
            Log.v("GoogleAnalyticsTracker", "Sending " + c0440mArrMo1002a.length + " hits to dispatcher");
        }
        return true;
    }

    /* renamed from: c */
    final void m989c() {
        this.f1407p = false;
    }

    /* renamed from: c */
    public final void m990c(boolean z) {
        this.f1394c = z;
        if (this.f1405n != null) {
            this.f1405n.mo972a(z);
        }
    }

    /* renamed from: d */
    public final boolean m991d() {
        return this.f1393b;
    }
}
