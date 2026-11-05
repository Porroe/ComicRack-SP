package com.p004a.p005a;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.p004a.p005a.p007b.C0278ac;
import com.p004a.p005a.p008c.InterfaceC0341b;
import com.p004a.p005a.p008c.InterfaceC0343d;
import com.p004a.p005a.p011e.C0370g;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.bk */
/* loaded from: classes.dex */
public final class C0322bk {

    /* renamed from: a */
    final C0278ac f916a;

    /* renamed from: b */
    InterfaceC0341b f917b;

    /* renamed from: c */
    private final C0319bh f918c;

    /* renamed from: d */
    private boolean f919d;

    /* renamed from: e */
    private boolean f920e;

    /* renamed from: f */
    private EnumC0321bj f921f;

    /* renamed from: g */
    private final C0315bd f922g;

    /* renamed from: h */
    private boolean f923h;

    /* renamed from: i */
    private boolean f924i;

    /* renamed from: j */
    private View f925j;

    /* renamed from: k */
    private final String f926k;

    /* renamed from: l */
    private final C0357e f927l;

    /* renamed from: m */
    private final HashMap f928m;

    public C0322bk(C0315bd c0315bd, C0278ac c0278ac, C0319bh c0319bh, String str, C0357e c0357e, HashMap map) {
        C0370g.m907b(TextUtils.isEmpty(str));
        this.f922g = c0315bd;
        this.f916a = c0278ac;
        this.f918c = c0319bh;
        this.f926k = str;
        this.f927l = c0357e;
        this.f928m = map;
        this.f919d = false;
        this.f920e = false;
        this.f921f = null;
        this.f917b = null;
        this.f923h = false;
        this.f924i = false;
        this.f925j = null;
    }

    /* renamed from: a */
    public final synchronized void m825a(Activity activity) {
        C0370g.m908b(this.f923h, "startLoadAdTask has already been called.");
        this.f923h = true;
        ((Handler) C0330bs.m837a().f946c.m898a()).post(new RunnableC0325bn(this, activity, this.f926k, this.f927l, this.f928m));
    }

    /* renamed from: a */
    public final synchronized void m824a() {
        C0370g.m906a(this.f923h, "destroy() called but startLoadAdTask has not been called.");
        ((Handler) C0330bs.m837a().f946c.m898a()).post(new RunnableC0323bl(this));
    }

    /* renamed from: b */
    public final synchronized boolean m828b() {
        return this.f919d;
    }

    /* renamed from: c */
    public final synchronized boolean m829c() {
        C0370g.m906a(this.f919d, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
        return this.f920e;
    }

    /* renamed from: d */
    public final synchronized EnumC0321bj m830d() {
        return this.f921f == null ? EnumC0321bj.TIMEOUT : this.f921f;
    }

    /* renamed from: e */
    public final synchronized View m831e() {
        C0370g.m906a(this.f919d, "getAdView() called when isLoadAdTaskDone() is false.");
        return this.f925j;
    }

    /* renamed from: f */
    public final synchronized void m832f() {
        C0370g.m905a(this.f916a.m687a());
        try {
            ((Handler) C0330bs.m837a().f946c.m898a()).post(new RunnableC0324bm(this, (InterfaceC0343d) this.f917b));
        } catch (ClassCastException e) {
            C0372i.m915b("In Ambassador.show(): ambassador.adapter does not implement the MediationInterstitialAdapter interface.", e);
        }
    }

    /* renamed from: g */
    public final synchronized String m833g() {
        return this.f917b != null ? this.f917b.getClass().getName() : "\"adapter was not created.\"";
    }

    /* renamed from: a */
    final synchronized void m826a(EnumC0321bj enumC0321bj) {
        this.f920e = false;
        this.f919d = true;
        this.f921f = enumC0321bj;
        notify();
    }

    /* renamed from: a */
    final synchronized void m827a(InterfaceC0341b interfaceC0341b) {
        this.f917b = interfaceC0341b;
    }

    /* renamed from: h */
    final synchronized void m834h() {
        this.f924i = true;
    }

    /* renamed from: i */
    final synchronized boolean m835i() {
        return this.f924i;
    }
}
