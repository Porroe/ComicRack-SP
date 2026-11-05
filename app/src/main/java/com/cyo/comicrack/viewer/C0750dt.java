package com.cyo.comicrack.viewer;

import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
import com.cyo.comicrack.p019a.p021b.AbstractC0587aa;
import com.cyo.common.p022a.AbstractC0934e;
import com.cyo.common.view.AbstractC1159n;
import com.cyo.common.view.C1165t;
import com.cyo.common.view.EnumC1164s;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.dt */
/* loaded from: classes.dex */
final class C0750dt extends AbstractC1159n {

    /* renamed from: a */
    final DecelerateInterpolator f2373a = new DecelerateInterpolator();

    /* renamed from: b */
    public AbstractC0587aa f2374b;

    /* renamed from: c */
    public int f2375c;

    /* renamed from: d */
    public final C0749ds f2376d;

    /* renamed from: e */
    public final C0749ds f2377e;

    /* renamed from: f */
    public final C0749ds f2378f;

    /* renamed from: g */
    public float f2379g;

    /* renamed from: h */
    final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC0744dn f2380h;

    /* renamed from: o */
    private boolean f2381o;

    /* renamed from: p */
    private boolean f2382p;

    /* renamed from: q */
    private float f2383q;

    public C0750dt(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn, C0749ds c0749ds, C0749ds c0749ds2, AbstractC0587aa abstractC0587aa, float f) {
        this.f2380h = sharedPreferencesOnSharedPreferenceChangeListenerC0744dn;
        this.f2378f = new C0749ds(sharedPreferencesOnSharedPreferenceChangeListenerC0744dn);
        this.f2379g = f;
        this.f2376d = c0749ds;
        this.f2377e = c0749ds2;
        this.f2374b = abstractC0587aa;
    }

    @Override // com.cyo.common.view.AbstractC1159n
    /* renamed from: a */
    protected final void mo1793a(float f) {
        this.f2383q = this.f2373a.getInterpolation(f);
        this.f2375c = this.f2379g == 0.0f ? 255 : (int) (255.0f * Math.min(1.0f, this.f2383q / this.f2379g));
        this.f2378f.f2369a = this.f2376d.f2369a + ((this.f2377e.f2369a - this.f2376d.f2369a) * this.f2383q);
        this.f2378f.f2370b = this.f2376d.f2370b + ((this.f2377e.f2370b - this.f2376d.f2370b) * this.f2383q);
        this.f2378f.f2371c = this.f2376d.f2371c + ((this.f2377e.f2371c - this.f2376d.f2371c) * this.f2383q);
    }

    @Override // com.cyo.common.view.AbstractC1159n
    /* renamed from: a */
    protected final void mo1792a() {
    }

    @Override // com.cyo.common.view.AbstractC1159n
    /* renamed from: a */
    public final void mo1794a(AbstractC0934e abstractC0934e) {
        super.mo1794a(abstractC0934e);
        if (this.f2374b != null && !this.f2374b.f1771d) {
            if (!this.f2381o && this.f2383q >= this.f2379g) {
                if (this.f2374b != SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1763a(this.f2380h)) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1769b(this.f2380h);
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1771c(this.f2380h).m2445b(this);
                SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1765a(this.f2380h, this.f2374b);
                this.f2381o = true;
            }
            if (!this.f2382p && SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1772d(this.f2380h).m1760a().m1762a() && this.f2383q >= 1.0f - this.f2379g) {
                this.f2382p = true;
                if (SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1771c(this.f2380h).m2447c() == this) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1770b(this.f2380h, this.f2374b);
                }
            }
            if (this.f2375c > 250) {
                SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1771c(this.f2380h).m2445b(this);
            }
            C1165t c1165t = new C1165t(EnumC1164s.FitInside);
            SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1766a(this.f2380h, c1165t, abstractC0934e);
            c1165t.m2465a(this.f2374b.mo1273b(), this.f2374b.mo1274c());
            c1165t.f3693i = this.f2378f.f2370b;
            c1165t.f3694j = this.f2378f.f2371c;
            c1165t.f3690f = this.f2378f.f2369a;
            Paint paint = new Paint();
            paint.setAlpha(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1771c(this.f2380h).m2448d() == this ? 255 : this.f2375c);
            if (!SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1772d(this.f2380h).m1760a().m1762a() || abstractC0934e.mo1939h()) {
                paint.setFilterBitmap(true);
            } else {
                paint.setFilterBitmap(false);
                paint.setDither(false);
            }
            abstractC0934e.mo1934c();
            abstractC0934e.mo1929a(c1165t.m2481o());
            this.f2374b.mo1271a(abstractC0934e, paint);
            abstractC0934e.mo1935d();
        }
    }
}
