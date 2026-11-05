package com.p004a.p012b.p013a.p014a.p015a;

import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: DontLook */
/* renamed from: com.a.b.a.a.a.b */
/* loaded from: classes.dex */
public final class C0413b {

    /* renamed from: m */
    private static C0413b f1320m;

    /* renamed from: a */
    Context f1321a;

    /* renamed from: b */
    String f1322b;

    /* renamed from: d */
    boolean f1324d;

    /* renamed from: e */
    boolean f1325e;

    /* renamed from: g */
    boolean f1327g;

    /* renamed from: q */
    private InterfaceC0422k f1336q;

    /* renamed from: r */
    private C0419h f1337r;

    /* renamed from: n */
    private boolean f1333n = false;

    /* renamed from: c */
    int f1323c = 60;

    /* renamed from: f */
    int f1326f = 100;

    /* renamed from: h */
    boolean f1328h = false;

    /* renamed from: o */
    private int f1334o = 0;

    /* renamed from: i */
    boolean f1329i = true;

    /* renamed from: j */
    boolean f1330j = false;

    /* renamed from: p */
    private Map f1335p = new HashMap();

    /* renamed from: k */
    InterfaceC0420i f1331k = null;

    /* renamed from: l */
    final LinkedBlockingQueue f1332l = new LinkedBlockingQueue();

    /* renamed from: s */
    private Object f1338s = new Object();

    private C0413b() {
    }

    /* renamed from: a */
    public static C0413b m944a() {
        if (f1320m == null) {
            f1320m = new C0413b();
        }
        return f1320m;
    }

    /* renamed from: b */
    final InterfaceC0420i m950b() {
        if (this.f1331k == null && this.f1333n) {
            this.f1331k = new C0421j();
            m948a(new RunnableC0414c(this));
        }
        return this.f1331k;
    }

    /* renamed from: a */
    public final void m947a(Context context) {
        if (context == null) {
            Log.e("EZTracker", "Context cannot be null");
            return;
        }
        this.f1333n = PreferenceManager.getDefaultSharedPreferences(context).getBoolean("tracking_enabled", false);
        if (this.f1321a == null) {
            this.f1321a = context.getApplicationContext();
            this.f1336q = new C0412a(this.f1321a);
            this.f1322b = this.f1336q.mo942a("ga_api_key");
            if (this.f1322b != null) {
                this.f1324d = this.f1336q.mo943b("ga_debug");
                this.f1325e = this.f1336q.mo943b("ga_dryRun");
                this.f1326f = this.f1336q.mo941a("ga_sampleRate", 100);
                this.f1323c = this.f1336q.mo941a("ga_dispatchPeriod", 20);
                this.f1328h = this.f1336q.mo943b("ga_auto_activity_tracking");
                this.f1327g = this.f1336q.mo943b("ga_anonymizeIp");
                if (this.f1337r == null) {
                    this.f1337r = new C0419h(this);
                    this.f1337r.start();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m945a(Activity activity) {
        this.f1334o++;
        m946a(activity, this.f1329i);
        this.f1329i = false;
    }

    /* renamed from: a */
    public final void m946a(Activity activity, boolean z) {
        m948a(new RunnableC0417f(this, z, activity));
    }

    /* renamed from: c */
    public final void m952c() {
        this.f1334o--;
        this.f1329i = this.f1334o == 0;
        m948a(new RunnableC0418g(this, this.f1329i));
    }

    /* renamed from: b */
    public final String m951b(Activity activity) {
        String canonicalName = activity.getClass().getCanonicalName();
        if (this.f1335p.containsKey(canonicalName)) {
            return (String) this.f1335p.get(canonicalName);
        }
        String strMo942a = this.f1336q.mo942a(canonicalName);
        if (strMo942a == null) {
            strMo942a = canonicalName;
        }
        this.f1335p.put(canonicalName, strMo942a);
        return strMo942a;
    }

    /* renamed from: a */
    public final void m949a(String str, String str2, String str3, int i) {
        m948a(new RunnableC0415d(this, str, str2, str3, i));
    }

    /* renamed from: a */
    final void m948a(Runnable runnable) {
        if (this.f1333n) {
            synchronized (this.f1338s) {
                this.f1332l.add(runnable);
            }
        }
    }
}
