package com.p004a.p005a;

import android.app.Activity;
import android.os.Handler;
import android.os.SystemClock;
import com.p004a.p005a.p007b.C0278ac;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0370g;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.bd */
/* loaded from: classes.dex */
public final class C0315bd {

    /* renamed from: a */
    public final C0308w f887a;

    /* renamed from: b */
    public Thread f888b;

    /* renamed from: c */
    public final Object f889c;

    /* renamed from: d */
    public boolean f890d;

    /* renamed from: e */
    public final Object f891e;

    /* renamed from: f */
    private C0322bk f892f;

    /* renamed from: g */
    private final Object f893g;

    public C0315bd(C0308w c0308w) {
        this.f892f = null;
        this.f893g = new Object();
        this.f888b = null;
        this.f889c = new Object();
        this.f890d = false;
        this.f891e = new Object();
        C0370g.m902a(c0308w);
        this.f887a = c0308w;
    }

    /* renamed from: c */
    private boolean m817c() {
        boolean z;
        synchronized (this.f889c) {
            z = this.f888b != null;
        }
        return z;
    }

    /* renamed from: a */
    public final void m818a(C0312ba c0312ba, C0357e c0357e) {
        synchronized (this.f889c) {
            if (m817c()) {
                C0372i.m916c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
                return;
            }
            if (c0312ba.m810d()) {
                this.f887a.m760a(c0312ba.m811e());
                if (!this.f887a.m793r()) {
                    this.f887a.m782g();
                }
            } else if (this.f887a.m793r()) {
                this.f887a.m781f();
            }
            C0308w c0308w = this.f887a;
            if (c0312ba.m816j() != null) {
                if (!c0308w.m783h().m839b()) {
                    C0392h c0392hM690c = ((C0278ac) c0308w.m783h().f968g.m898a()).m690c();
                    if (c0312ba.m816j().m687a()) {
                        C0372i.m920e("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (" + c0392hM690c + ") in the ad-type field in the mediation UI.");
                    } else {
                        C0392h c0392hM690c2 = c0312ba.m816j().m690c();
                        if (c0392hM690c2 != c0392hM690c) {
                            C0372i.m920e("Mediation server returned ad size: '" + c0392hM690c2 + "', while the AdView was created with ad size: '" + c0392hM690c + "'. Using the ad-size passed to the AdView on creation.");
                        }
                    }
                } else if (!c0312ba.m816j().m687a()) {
                    C0372i.m920e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
                }
            }
            this.f888b = new Thread(new RunnableC0316be(this, c0312ba, c0357e));
            this.f888b.start();
        }
    }

    protected C0315bd() {
        this.f892f = null;
        this.f893g = new Object();
        this.f888b = null;
        this.f889c = new Object();
        this.f890d = false;
        this.f891e = new Object();
        this.f887a = null;
    }

    /* renamed from: a */
    final boolean m819a() {
        boolean z;
        synchronized (this.f891e) {
            z = this.f890d;
        }
        return z;
    }

    /* renamed from: a */
    final boolean m821a(String str, Activity activity, C0357e c0357e, C0319bh c0319bh, HashMap map, long j) {
        C0322bk c0322bk = new C0322bk(this, (C0278ac) this.f887a.m783h().f968g.m898a(), c0319bh, str, c0357e, map);
        synchronized (c0322bk) {
            c0322bk.m825a(activity);
            while (!c0322bk.m828b() && j > 0) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c0322bk.wait(j);
                    j -= SystemClock.elapsedRealtime() - jElapsedRealtime;
                } catch (InterruptedException e) {
                    C0372i.m911a("Interrupted while waiting for ad network to load ad using adapter class: " + str);
                }
            }
            this.f887a.m788m().m659a(c0322bk.m830d());
            if (c0322bk.m828b() && c0322bk.m829c()) {
                ((Handler) C0330bs.m837a().f946c.m898a()).post(new RunnableC0318bg(this, c0322bk, this.f887a.m783h().m839b() ? null : c0322bk.m831e(), c0319bh));
                return true;
            }
            if (!c0322bk.m828b()) {
                C0372i.m911a("Timeout occurred in adapter class: " + c0322bk.m833g());
            }
            c0322bk.m824a();
            return false;
        }
    }

    /* renamed from: a */
    final boolean m820a(C0322bk c0322bk) {
        boolean z;
        synchronized (this.f891e) {
            if (m819a()) {
                c0322bk.m824a();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final C0322bk m822b() {
        C0322bk c0322bk;
        synchronized (this.f893g) {
            c0322bk = this.f892f;
        }
        return c0322bk;
    }

    /* renamed from: b */
    public final void m823b(C0322bk c0322bk) {
        synchronized (this.f893g) {
            if (this.f892f != c0322bk) {
                if (this.f892f != null) {
                    this.f892f.m824a();
                }
                this.f892f = c0322bk;
            }
        }
    }
}
