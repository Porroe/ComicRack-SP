package com.cyo.common.view;

import android.graphics.Canvas;
import android.view.animation.AnimationUtils;
import com.cyo.common.C0950af;
import com.cyo.common.p022a.AbstractC0934e;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.n */
/* loaded from: classes.dex */
public abstract class AbstractC1159n {

    /* renamed from: a */
    private long f3655a;

    /* renamed from: b */
    private boolean f3656b;

    /* renamed from: c */
    private boolean f3657c;

    /* renamed from: d */
    private boolean f3658d;

    /* renamed from: i */
    public long f3659i;

    /* renamed from: j */
    public long f3660j;

    /* renamed from: k */
    long f3661k;

    /* renamed from: l */
    float f3662l;

    /* renamed from: m */
    InterfaceC1160o f3663m;

    /* renamed from: n */
    public boolean f3664n;

    /* renamed from: a */
    protected abstract void mo1792a();

    /* renamed from: a */
    protected abstract void mo1793a(float f);

    /* renamed from: b */
    public final boolean m2427b() {
        if (this.f3658d || this.f3660j == 0 || this.f3657c) {
            return false;
        }
        this.f3655a = AnimationUtils.currentAnimationTimeMillis();
        if (!this.f3656b && m2428c()) {
            this.f3656b = true;
            if (this.f3663m != null) {
                InterfaceC1160o interfaceC1160o = this.f3663m;
            }
        }
        float fM2424b = m2424b(true);
        if (this.f3664n) {
            fM2424b = 1.0f - fM2424b;
        }
        mo1793a(fM2424b);
        mo1792a();
        if (m2429d()) {
            this.f3657c = true;
            if (this.f3663m != null) {
                this.f3663m.mo2433a(this);
            }
        }
        return true;
    }

    /* renamed from: b */
    private float m2424b(boolean z) {
        float f;
        if (this.f3658d) {
            f = this.f3662l;
        } else {
            if (this.f3660j == 0 || this.f3661k == 0) {
                return -1.0f;
            }
            f = ((this.f3659i != 0 ? this.f3659i : this.f3655a) - this.f3660j) / this.f3661k;
        }
        if (z) {
            return C0950af.m1989a(f, 0.0f, 1.0f);
        }
        return f;
    }

    /* renamed from: c */
    public final boolean m2428c() {
        return m2424b(false) >= 0.0f;
    }

    /* renamed from: d */
    public final boolean m2429d() {
        return m2428c() && m2424b(false) > 1.0f;
    }

    /* renamed from: e */
    public final boolean m2430e() {
        return m2428c() && !m2429d();
    }

    /* renamed from: a */
    public void mo1846a(Canvas canvas) {
        m2427b();
    }

    /* renamed from: a */
    public void mo1794a(AbstractC0934e abstractC0934e) {
        m2427b();
    }

    /* renamed from: f */
    public final void m2431f() {
        if (!m2428c() && !m2429d()) {
            this.f3660j = AnimationUtils.currentAnimationTimeMillis();
            if (m2428c() || m2429d()) {
                return;
            }
            if (this.f3660j == 0) {
                this.f3660j = AnimationUtils.currentAnimationTimeMillis();
            }
            m2427b();
        }
    }

    /* renamed from: g */
    public final void m2432g() {
        this.f3657c = false;
        this.f3656b = false;
        this.f3660j = 0L;
        this.f3659i = 0L;
        if (this.f3662l > 0.0f && this.f3662l < 1.0f) {
            float f = this.f3662l;
            if (this.f3664n) {
                f = 1.0f - f;
            }
            this.f3660j = AnimationUtils.currentAnimationTimeMillis() - ((long) (f * this.f3661k));
        }
    }

    /* renamed from: b */
    public final void m2426b(float f) {
        this.f3662l = f;
        if (this.f3658d) {
            mo1793a(m2424b(true));
            mo1792a();
        }
    }

    /* renamed from: a */
    public final void m2425a(boolean z) {
        this.f3658d = z;
        if (z) {
            mo1793a(m2424b(true));
        }
    }
}
