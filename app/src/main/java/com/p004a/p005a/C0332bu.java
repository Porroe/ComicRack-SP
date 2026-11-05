package com.p004a.p005a;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.p004a.p005a.p007b.C0275a;
import com.p004a.p005a.p007b.C0278ac;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.AbstractC0360ab;
import com.p004a.p005a.p011e.C0362ad;
import com.p004a.p005a.p011e.C0363ae;
import com.p004a.p005a.p011e.C0364af;

/* compiled from: DontLook */
/* renamed from: com.a.a.bu */
/* loaded from: classes.dex */
public final class C0332bu extends AbstractC0360ab {

    /* renamed from: a */
    public final C0362ad f962a;

    /* renamed from: b */
    public final C0362ad f963b;

    /* renamed from: c */
    public final C0364af f964c;

    /* renamed from: d */
    public final C0362ad f965d;

    /* renamed from: e */
    public final C0362ad f966e;

    /* renamed from: f */
    public final C0362ad f967f;

    /* renamed from: g */
    public final C0362ad f968g;

    /* renamed from: h */
    public final C0362ad f969h;

    /* renamed from: i */
    public final C0362ad f970i;

    /* renamed from: j */
    public final C0362ad f971j;

    /* renamed from: k */
    public final C0362ad f972k;

    /* renamed from: l */
    public final C0363ae f973l = new C0363ae(this, "currentAd", null);

    /* renamed from: m */
    public final C0363ae f974m = new C0363ae(this, "nextAd", null);

    /* renamed from: o */
    public final C0363ae f976o = new C0363ae(this, "adListener");

    /* renamed from: p */
    public final C0363ae f977p = new C0363ae(this, "appEventListener");

    /* renamed from: q */
    public final C0363ae f978q = new C0363ae(this, "swipeableEventListener");

    /* renamed from: r */
    public final C0363ae f979r = new C0363ae(this, "spamSignals", null);

    /* renamed from: s */
    public final C0363ae f980s = new C0363ae(this, "spamSignalsUtil", null);

    /* renamed from: t */
    public final C0363ae f981t = new C0363ae(this, "usesManualImpressions", false);

    /* renamed from: n */
    public final C0363ae f975n = new C0363ae(this, "adSizes", null);

    /* renamed from: a */
    public final boolean m838a() {
        return !m839b();
    }

    /* renamed from: b */
    public final boolean m839b() {
        return ((C0278ac) this.f968g.m898a()).m687a();
    }

    public C0332bu(C0330bs c0330bs, InterfaceC0243a interfaceC0243a, C0393i c0393i, C0395k c0395k, String str, Activity activity, Context context, ViewGroup viewGroup, C0278ac c0278ac, C0308w c0308w) {
        C0275a c0275a = null;
        this.f965d = new C0362ad(this, "appState", c0330bs);
        this.f962a = new C0362ad(this, "ad", interfaceC0243a);
        this.f971j = new C0362ad(this, "adView", c0393i);
        this.f968g = new C0362ad(this, "adType", c0278ac);
        this.f969h = new C0362ad(this, "adUnitId", str);
        this.f964c = new C0364af(this, "activity", activity);
        this.f972k = new C0362ad(this, "interstitialAd", c0395k);
        this.f970i = new C0362ad(this, "bannerContainer", viewGroup);
        this.f967f = new C0362ad(this, "applicationContext", context);
        this.f963b = new C0362ad(this, "adManager", c0308w);
        if (c0278ac != null && c0278ac.m689b()) {
            c0275a = new C0275a(this);
        }
        this.f966e = new C0362ad(this, "activationOverlay", c0275a);
    }
}
