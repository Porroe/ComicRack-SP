package com.p004a.p005a.p007b;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p004a.p005a.ActivityC0274b;
import com.p004a.p005a.C0267at;
import com.p004a.p005a.C0273az;
import com.p004a.p005a.C0312ba;
import com.p004a.p005a.C0314bc;
import com.p004a.p005a.C0315bd;
import com.p004a.p005a.C0319bh;
import com.p004a.p005a.C0322bk;
import com.p004a.p005a.C0329br;
import com.p004a.p005a.C0330bs;
import com.p004a.p005a.C0331bt;
import com.p004a.p005a.C0332bu;
import com.p004a.p005a.C0357e;
import com.p004a.p005a.C0392h;
import com.p004a.p005a.C0393i;
import com.p004a.p005a.C0395k;
import com.p004a.p005a.EnumC0390f;
import com.p004a.p005a.InterfaceC0243a;
import com.p004a.p005a.InterfaceC0354d;
import com.p004a.p005a.InterfaceC0394j;
import com.p004a.p005a.RunnableC0401q;
import com.p004a.p005a.RunnableC0402r;
import com.p004a.p005a.p006a.C0247d;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0368e;
import com.p004a.p005a.p011e.C0370g;
import com.p004a.p005a.p011e.C0372i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.w */
/* loaded from: classes.dex */
public final class C0308w {

    /* renamed from: a */
    private static final Object f840a = new Object();

    /* renamed from: b */
    private final C0332bu f843b;

    /* renamed from: f */
    private C0290e f847f;

    /* renamed from: g */
    private C0279ad f848g;

    /* renamed from: i */
    private long f850i;

    /* renamed from: j */
    private boolean f851j;

    /* renamed from: o */
    private SharedPreferences f856o;

    /* renamed from: q */
    private RunnableC0402r f858q;

    /* renamed from: s */
    private LinkedList f860s;

    /* renamed from: t */
    private LinkedList f861t;

    /* renamed from: u */
    private LinkedList f862u;

    /* renamed from: w */
    private Boolean f864w;

    /* renamed from: x */
    private C0314bc f865x;

    /* renamed from: y */
    private C0315bd f866y;

    /* renamed from: z */
    private C0319bh f867z;

    /* renamed from: h */
    private boolean f849h = false;

    /* renamed from: v */
    private int f863v = -1;

    /* renamed from: A */
    private String f841A = null;

    /* renamed from: B */
    private String f842B = null;

    /* renamed from: r */
    private boolean f859r = false;

    /* renamed from: e */
    private C0277ab f846e = new C0277ab();

    /* renamed from: c */
    private RunnableC0299n f844c = null;

    /* renamed from: d */
    private C0357e f845d = null;

    /* renamed from: k */
    private boolean f852k = false;

    /* renamed from: p */
    private long f857p = 60000;

    /* renamed from: l */
    private boolean f853l = false;

    /* renamed from: n */
    private boolean f855n = false;

    /* renamed from: m */
    private boolean f854m = true;

    public C0308w(InterfaceC0243a interfaceC0243a, Activity activity, C0392h c0392h, String str, ViewGroup viewGroup) throws C0298m {
        C0278ac c0278acM686a = c0392h == null ? C0278ac.f740a : C0278ac.m686a(c0392h, activity.getApplicationContext());
        if (interfaceC0243a instanceof C0247d) {
            c0278acM686a.m691d();
        }
        if (activity == null) {
            this.f843b = new C0332bu(C0330bs.m837a(), interfaceC0243a, interfaceC0243a instanceof C0393i ? (C0393i) interfaceC0243a : null, interfaceC0243a instanceof C0395k ? (C0395k) interfaceC0243a : null, str, null, null, viewGroup, c0278acM686a, this);
            return;
        }
        synchronized (f840a) {
            this.f856o = activity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
            this.f850i = 60000L;
        }
        this.f843b = new C0332bu(C0330bs.m837a(), interfaceC0243a, interfaceC0243a instanceof C0393i ? (C0393i) interfaceC0243a : null, interfaceC0243a instanceof C0395k ? (C0395k) interfaceC0243a : null, str, activity, activity.getApplicationContext(), viewGroup, c0278acM686a, this);
        this.f858q = new RunnableC0402r(this);
        this.f860s = new LinkedList();
        this.f861t = new LinkedList();
        this.f862u = new LinkedList();
        m759a();
        C0358a.m894h((Context) this.f843b.f967f.m898a());
        this.f865x = new C0314bc();
        this.f866y = new C0315bd(this);
        this.f864w = null;
        this.f867z = null;
    }

    /* renamed from: a */
    public final synchronized void m759a() {
        C0392h c0392hM690c = ((C0278ac) this.f843b.f968g.m898a()).m690c();
        this.f847f = C0358a.f1021a >= 14 ? new C0368e(this.f843b, c0392hM690c) : new C0290e(this.f843b, c0392hM690c);
        this.f847f.setVisibility(8);
        this.f848g = C0279ad.m692a(this, C0293h.f785d, true, this.f843b.m839b());
        this.f847f.setWebViewClient(this.f848g);
        if (C0358a.f1021a < ((Integer) ((C0331bt) ((C0330bs) this.f843b.f965d.m898a()).f945b.m898a()).f948b.m899a()).intValue() && !((C0278ac) this.f843b.f968g.m898a()).m687a()) {
            C0372i.m911a("Disabling hardware acceleration for a banner.");
            this.f847f.m712f();
        }
    }

    /* renamed from: b */
    public final synchronized void m772b() {
        if (this.f866y != null) {
            C0315bd c0315bd = this.f866y;
            synchronized (c0315bd.f891e) {
                c0315bd.f890d = true;
                c0315bd.m823b(null);
                synchronized (c0315bd.f889c) {
                    if (c0315bd.f888b != null) {
                        c0315bd.f888b.interrupt();
                    }
                }
            }
        }
        this.f843b.f976o.m900a(null);
        this.f843b.f977p.m900a(null);
        m754C();
        m781f();
        if (this.f847f != null) {
            this.f847f.destroy();
        }
        this.f849h = true;
    }

    /* renamed from: a */
    public final void m768a(String str) {
        this.f842B = str;
        Uri uriBuild = new Uri.Builder().encodedQuery(str).build();
        StringBuilder sb = new StringBuilder();
        HashMap mapM884b = C0358a.m884b(uriBuild);
        for (Object entry : mapM884b.keySet()) {
            String str2 = (String) entry;
            sb.append(str2).append(" = ").append((String) mapM884b.get(str2)).append("\n");
        }
        this.f841A = sb.toString().trim();
        if (TextUtils.isEmpty(this.f841A)) {
            this.f841A = null;
        }
    }

    /* renamed from: c */
    public final String m777c() {
        return this.f841A;
    }

    /* renamed from: d */
    public final String m779d() {
        return this.f842B;
    }

    /* renamed from: e */
    public final synchronized void m780e() {
        this.f854m = false;
        C0372i.m911a("Refreshing is no longer allowed on this AdView.");
    }

    /* renamed from: f */
    public final synchronized void m781f() {
        if (this.f853l) {
            C0372i.m911a("Disabling refreshing.");
            ((Handler) C0330bs.m837a().f946c.m898a()).removeCallbacks(this.f858q);
            this.f853l = false;
        } else {
            C0372i.m911a("Refreshing is already disabled.");
        }
    }

    /* renamed from: g */
    public final synchronized void m782g() {
        this.f855n = false;
        if (this.f843b.m838a()) {
            if (this.f854m) {
                if (!this.f853l) {
                    C0372i.m911a("Enabling refreshing every " + this.f857p + " milliseconds.");
                    ((Handler) C0330bs.m837a().f946c.m898a()).postDelayed(this.f858q, this.f857p);
                    this.f853l = true;
                } else {
                    C0372i.m911a("Refreshing is already enabled.");
                }
            } else {
                C0372i.m911a("Refreshing disabled on this AdView");
            }
        } else {
            C0372i.m911a("Tried to enable refreshing on something other than an AdView.");
        }
    }

    /* renamed from: h */
    public final C0332bu m783h() {
        return this.f843b;
    }

    /* renamed from: i */
    public final synchronized C0314bc m784i() {
        return this.f865x;
    }

    /* renamed from: j */
    public final synchronized RunnableC0299n m785j() {
        return this.f844c;
    }

    /* renamed from: k */
    public final synchronized C0290e m786k() {
        return this.f847f;
    }

    /* renamed from: l */
    public final synchronized C0279ad m787l() {
        return this.f848g;
    }

    /* renamed from: m */
    public final C0277ab m788m() {
        return this.f846e;
    }

    /* renamed from: a */
    public final synchronized void m761a(int i) {
        this.f863v = i;
    }

    /* renamed from: n */
    public final synchronized int m789n() {
        return this.f863v;
    }

    /* renamed from: o */
    public final long m790o() {
        return this.f850i;
    }

    /* renamed from: A */
    private synchronized boolean m752A() {
        return this.f844c != null;
    }

    /* renamed from: p */
    public final synchronized boolean m791p() {
        return this.f851j;
    }

    /* renamed from: q */
    public final synchronized boolean m792q() {
        return this.f852k;
    }

    /* renamed from: r */
    public final synchronized boolean m793r() {
        return this.f853l;
    }

    /* renamed from: a */
    public final synchronized void m766a(C0357e c0357e) {
        C0372i.m918d("v6.4.1 RC00");
        if (this.f849h) {
            C0372i.m920e("loadAd called after ad was destroyed.");
        } else if (m752A()) {
            C0372i.m920e("loadAd called while the ad is already loading, so aborting.");
        } else if (ActivityC0274b.m635b()) {
            C0372i.m920e("loadAd called while an interstitial or landing page is displayed, so aborting");
        } else if (C0358a.m888c((Context) this.f843b.f967f.m898a()) && C0358a.m886b((Context) this.f843b.f967f.m898a())) {
            if (C0267at.m621a((Context) this.f843b.f967f.m898a(), this.f856o.getLong("GoogleAdMobDoritosLife", 60000L))) {
                C0267at.m620a((Activity) this.f843b.f964c.m901a());
            }
            this.f852k = false;
            this.f860s.clear();
            this.f861t.clear();
            this.f845d = c0357e;
            C0314bc c0314bc = this.f865x;
            if (c0314bc.f885a != null && SystemClock.elapsedRealtime() < c0314bc.f886b) {
                this.f866y.m818a(this.f865x.f885a, c0357e);
            } else {
                C0329br c0329br = new C0329br(this.f843b);
                this.f843b.f974m.m900a(c0329br);
                this.f844c = (RunnableC0299n) c0329br.f941b.m899a();
                this.f844c.m736a(c0357e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m767a(EnumC0390f enumC0390f) {
        this.f844c = null;
        if (enumC0390f == EnumC0390f.NETWORK_ERROR) {
            m760a(60.0f);
            if (!m793r()) {
                m782g();
                this.f855n = true;
            }
        }
        if (this.f843b.m839b()) {
            if (enumC0390f == EnumC0390f.NO_FILL) {
                this.f846e.m655B();
            } else if (enumC0390f == EnumC0390f.NETWORK_ERROR) {
                this.f846e.m684z();
            }
        }
        C0372i.m916c("onFailedToReceiveAd(" + enumC0390f + ")");
        InterfaceC0354d interfaceC0354d = (InterfaceC0354d) this.f843b.f976o.m899a();
        if (interfaceC0354d != null) {
            this.f843b.f962a.m898a();
            interfaceC0354d.mo859c();
        }
    }

    /* renamed from: a */
    public final synchronized void m765a(C0312ba c0312ba) {
        this.f844c = null;
        this.f866y.m818a(c0312ba, this.f845d);
    }

    /* renamed from: a */
    public final synchronized void m764a(View view, C0322bk c0322bk, C0319bh c0319bh) {
        C0372i.m911a("AdManager.onReceiveGWhirlAd() called.");
        this.f852k = true;
        this.f867z = c0319bh;
        if (this.f843b.m838a()) {
            m756a(view);
            m757a(c0319bh, false);
        }
        this.f866y.m823b(c0322bk);
        InterfaceC0354d interfaceC0354d = (InterfaceC0354d) this.f843b.f976o.m899a();
        if (interfaceC0354d != null) {
            this.f843b.f962a.m898a();
            interfaceC0354d.mo857a();
        }
    }

    /* renamed from: b */
    public final synchronized void m774b(C0312ba c0312ba) {
        C0372i.m911a("AdManager.onGWhirlNoFill() called.");
        List listM815i = c0312ba.m815i();
        String strM809c = c0312ba.m809c();
        if (listM815i == null) {
            listM815i = new ArrayList();
            listM815i.add("http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@");
        }
        m758a(listM815i, null, null, strM809c, null, this.f846e.m663d(), this.f846e.m664e());
        InterfaceC0354d interfaceC0354d = (InterfaceC0354d) this.f843b.f976o.m899a();
        if (interfaceC0354d != null) {
            this.f843b.f962a.m898a();
            EnumC0390f enumC0390f = EnumC0390f.NO_FILL;
            interfaceC0354d.mo859c();
        }
    }

    /* renamed from: s */
    public final synchronized void m794s() {
        this.f846e.m656C();
        C0372i.m916c("onDismissScreen()");
        InterfaceC0354d interfaceC0354d = (InterfaceC0354d) this.f843b.f976o.m899a();
        if (interfaceC0354d != null) {
            this.f843b.f962a.m898a();
            interfaceC0354d.mo858b();
        }
    }

    /* renamed from: t */
    public final synchronized void m795t() {
        C0372i.m916c("onPresentScreen()");
        if (((InterfaceC0354d) this.f843b.f976o.m899a()) != null) {
            this.f843b.f962a.m898a();
        }
    }

    /* renamed from: u */
    public final synchronized void m796u() {
        C0372i.m916c("onLeaveApplication()");
        if (((InterfaceC0354d) this.f843b.f976o.m899a()) != null) {
            this.f843b.f962a.m898a();
        }
    }

    /* renamed from: v */
    public final synchronized void m797v() {
        if (((InterfaceC0394j) this.f843b.f977p.m899a()) != null) {
            this.f843b.f962a.m898a();
        }
    }

    /* renamed from: w */
    public final void m798w() {
        this.f846e.m665f();
        m755D();
    }

    /* renamed from: a */
    private void m757a(C0319bh c0319bh, Boolean bool) {
        List arrayList = c0319bh.f906d;
        if (arrayList == null) {
            arrayList = new ArrayList();
            arrayList.add("http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@");
        }
        m758a(arrayList, c0319bh.f903a, c0319bh.f904b, c0319bh.f905c, bool, this.f846e.m663d(), this.f846e.m664e());
    }

    /* renamed from: a */
    private void m758a(List list, String str, String str2, String str3, Boolean bool, String str4, String str5) {
        String strM868a = C0358a.m868a((Context) this.f843b.f967f.m898a());
        C0273az c0273azM627a = C0273az.m627a();
        String string = c0273azM627a.m629b().toString();
        String string2 = c0273azM627a.m630c().toString();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strReplaceAll = ((String) it.next()).replaceAll("@gw_adlocid@", (String) this.f843b.f969h.m898a()).replaceAll("@gw_qdata@", str3).replaceAll("@gw_sdkver@", "afma-sdk-a-v6.4.1").replaceAll("@gw_sessid@", string).replaceAll("@gw_seqnum@", string2).replaceAll("@gw_devid@", strM868a);
            if (str2 != null) {
                strReplaceAll = strReplaceAll.replaceAll("@gw_adnetid@", str2);
            }
            if (str != null) {
                strReplaceAll = strReplaceAll.replaceAll("@gw_allocid@", str);
            }
            if (str4 != null) {
                strReplaceAll = strReplaceAll.replaceAll("@gw_adt@", str4);
            }
            if (str5 != null) {
                strReplaceAll = strReplaceAll.replaceAll("@gw_aec@", str5);
            }
            if (bool != null) {
                strReplaceAll = strReplaceAll.replaceAll("@gw_adnetrefresh@", bool.booleanValue() ? "1" : "0");
            }
            new Thread(new RunnableC0401q(strReplaceAll, (Context) this.f843b.f967f.m898a())).start();
        }
        this.f846e.m661b();
    }

    /* renamed from: B */
    private synchronized void m753B() {
        Activity activity = (Activity) this.f843b.f964c.m901a();
        if (activity == null) {
            C0372i.m920e("activity was null while trying to ping tracking URLs.");
        } else {
            Iterator it = this.f860s.iterator();
            while (it.hasNext()) {
                new Thread(new RunnableC0401q((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    /* renamed from: x */
    public final synchronized void m799x() {
        if (!this.f849h) {
            if (this.f845d != null) {
                if (this.f843b.m838a()) {
                    if (((C0393i) this.f843b.f971j.m898a()).isShown() && C0358a.m890d()) {
                        C0372i.m916c("Refreshing ad.");
                        m766a(this.f845d);
                    } else {
                        C0372i.m911a("Not refreshing because the ad is not visible.");
                    }
                    if (this.f855n) {
                        m781f();
                    } else {
                        ((Handler) C0330bs.m837a().f946c.m898a()).postDelayed(this.f858q, this.f857p);
                    }
                } else {
                    C0372i.m911a("Tried to refresh an ad that wasn't an AdView.");
                }
            } else {
                C0372i.m911a("Tried to refresh before calling loadAd().");
            }
        }
    }

    /* renamed from: a */
    public final void m763a(long j) {
        synchronized (f840a) {
            SharedPreferences.Editor editorEdit = this.f856o.edit();
            editorEdit.putLong("Timeout" + this.f843b.f969h, j);
            editorEdit.commit();
            if (this.f859r) {
                this.f850i = j;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m770a(boolean z) {
        this.f851j = z;
    }

    /* renamed from: a */
    private void m756a(View view) {
        ((ViewGroup) this.f843b.f970i.m898a()).setVisibility(0);
        ((ViewGroup) this.f843b.f970i.m898a()).removeAllViews();
        ((ViewGroup) this.f843b.f970i.m898a()).addView(view);
        if (((C0278ac) this.f843b.f968g.m898a()).m689b()) {
            C0308w c0308w = (C0308w) this.f843b.f963b.m898a();
            this.f843b.f973l.m899a();
            c0308w.m771a(false, -1, -1, -1, -1);
            if (((C0275a) this.f843b.f966e.m898a()).m647a()) {
                ((ViewGroup) this.f843b.f970i.m898a()).addView((View) this.f843b.f966e.m898a(), C0358a.m865a((Context) this.f843b.f967f.m898a(), ((C0278ac) this.f843b.f968g.m898a()).m690c().m929a()), C0358a.m865a((Context) this.f843b.f967f.m898a(), ((C0278ac) this.f843b.f968g.m898a()).m690c().m930b()));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m760a(float f) {
        long j = this.f857p;
        this.f857p = (long) (1000.0f * f);
        if (m793r() && this.f857p != j) {
            m781f();
            m782g();
        }
    }

    /* renamed from: b */
    public final synchronized void m773b(long j) {
        if (j > 0) {
            this.f856o.edit().putLong("GoogleAdMobDoritosLife", j).commit();
        }
    }

    /* renamed from: y */
    public final synchronized void m800y() {
        boolean z = false;
        synchronized (this) {
            C0370g.m905a(this.f843b.m839b());
            if (this.f852k) {
                this.f852k = false;
                if (this.f864w == null) {
                    C0372i.m914b("isMediationFlag is null in show() with isReady() true. we should have an ad and know whether this is a mediation request or not. ");
                } else if (this.f864w.booleanValue()) {
                    C0315bd c0315bd = this.f866y;
                    C0370g.m905a(c0315bd.f887a.f843b.m839b());
                    C0322bk c0322bkM822b = c0315bd.m822b();
                    if (c0322bkM822b != null) {
                        c0322bkM822b.m832f();
                        z = true;
                    } else {
                        C0372i.m914b("There is no ad ready to show.");
                    }
                    if (z) {
                        m757a(this.f867z, false);
                    }
                } else {
                    ActivityC0274b.m633a(this, new C0309x("interstitial"));
                    m753B();
                }
            } else {
                C0372i.m916c("Cannot show interstitial because it is not loaded and ready.");
            }
        }
    }

    /* renamed from: C */
    private synchronized void m754C() {
        if (this.f844c != null) {
            this.f844c.m733a();
            this.f844c = null;
        }
        if (this.f847f != null) {
            this.f847f.stopLoading();
        }
    }

    /* renamed from: D */
    private synchronized void m755D() {
        Activity activity = (Activity) this.f843b.f964c.m901a();
        if (activity == null) {
            C0372i.m920e("activity was null while trying to ping click tracking URLs.");
        } else {
            Iterator it = this.f862u.iterator();
            while (it.hasNext()) {
                new Thread(new RunnableC0401q((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    /* renamed from: z */
    protected final synchronized void m801z() {
        this.f844c = null;
        this.f852k = true;
        this.f847f.setVisibility(0);
        if (this.f843b.m838a()) {
            m756a(this.f847f);
        }
        this.f846e.m666g();
        if (this.f843b.m838a()) {
            m753B();
        }
        C0372i.m916c("onReceiveAd()");
        InterfaceC0354d interfaceC0354d = (InterfaceC0354d) this.f843b.f976o.m899a();
        if (interfaceC0354d != null) {
            this.f843b.f962a.m898a();
            interfaceC0354d.mo857a();
        }
        this.f843b.f973l.m900a(this.f843b.f974m.m899a());
        this.f843b.f974m.m900a(null);
    }

    /* renamed from: b */
    protected final synchronized void m775b(String str) {
        C0372i.m911a("Adding a tracking URL: " + str);
        this.f860s.add(str);
    }

    /* renamed from: c */
    protected final synchronized void m778c(String str) {
        C0372i.m911a("Adding a manual tracking URL: " + str);
        this.f861t.add(str);
    }

    /* renamed from: a */
    protected final synchronized void m769a(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C0372i.m911a("Adding a click tracking URL: " + ((String) it.next()));
        }
        this.f862u = linkedList;
    }

    /* renamed from: b */
    public final void m776b(boolean z) {
        this.f864w = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void m771a(boolean z, int i, int i2, int i3, int i4) {
        ((C0275a) this.f843b.f966e.m898a()).setOverlayActivated(!z);
        m762a(i, i2, i3, i4);
        if (this.f843b.f978q.m899a() != null) {
            if (z) {
                this.f843b.f978q.m899a();
                this.f843b.f962a.m898a();
            } else {
                this.f843b.f978q.m899a();
                this.f843b.f962a.m898a();
            }
        }
    }

    /* renamed from: a */
    public final void m762a(int i, int i2, int i3, int i4) {
        int iM648b;
        int i5;
        C0275a c0275a = (C0275a) this.f843b.f966e.m898a();
        int iM865a = C0358a.m865a((Context) this.f843b.f967f.m898a(), i3 < 0 ? ((C0278ac) this.f843b.f968g.m898a()).m690c().m929a() : i3);
        Context context = (Context) this.f843b.f967f.m898a();
        if (i4 < 0) {
            i4 = ((C0278ac) this.f843b.f968g.m898a()).m690c().m930b();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM865a, C0358a.m865a(context, i4));
        if (i3 < 0) {
            iM648b = 0;
            i5 = 0;
        } else {
            iM648b = i2;
            i5 = i;
        }
        int iM649c = i5 < 0 ? ((C0275a) this.f843b.f966e.m898a()).m649c() : i5;
        if (iM648b < 0) {
            iM648b = ((C0275a) this.f843b.f966e.m898a()).m648b();
        }
        ((C0275a) this.f843b.f966e.m898a()).setXPosition(iM649c);
        ((C0275a) this.f843b.f966e.m898a()).setYPosition(iM648b);
        layoutParams.setMargins(C0358a.m865a((Context) this.f843b.f967f.m898a(), iM649c), C0358a.m865a((Context) this.f843b.f967f.m898a(), iM648b), 0, 0);
        c0275a.setLayoutParams(layoutParams);
    }
}
