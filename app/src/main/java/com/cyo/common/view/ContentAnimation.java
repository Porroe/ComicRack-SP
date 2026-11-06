package com.cyo.common.view;

import android.graphics.Canvas;
import android.view.animation.AnimationUtils;
import com.cyo.common.C0950af;
import com.cyo.common.p022a.AbstractC0934e;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.n */
/* loaded from: classes.dex */
public abstract class ContentAnimation {

    /* renamed from: a */
    private long frameTimeMillis;

    /* renamed from: b */
    private boolean f3656b;

    /* renamed from: c */
    private boolean f3657c;

    /* renamed from: d */
    private boolean f3658d;

    /* renamed from: i */
    public long frameTimeOverrideMillis;

    /* renamed from: j */
    public long startTimeMillis;

    /* renamed from: k */
    long durationMillis;

    /* renamed from: l */
    float manualProgress;

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
        if (this.f3658d || this.startTimeMillis == 0 || this.f3657c) {
            return false;
        }
        this.frameTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (!this.f3656b && m2428c()) {
            this.f3656b = true;
            if (this.f3663m != null) {
                InterfaceC1160o interfaceC1160o = this.f3663m;
            }
        }
        float progress = calculateProgress(true);
        if (this.f3664n) {
            progress = 1.0f - progress;
        }
        mo1793a(progress);
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
    private float calculateProgress(boolean clampProgress) {
        float progress;
        if (this.f3658d) {
            progress = this.manualProgress;
        } else {
            if (this.startTimeMillis == 0 || this.durationMillis == 0) {
                return -1.0f;
            }
            long elapsedMillis = (this.frameTimeOverrideMillis != 0 ? this.frameTimeOverrideMillis : this.frameTimeMillis) - this.startTimeMillis;
            progress = (float) elapsedMillis / this.durationMillis;
        }
        if (clampProgress) {
            return C0950af.m1989a(progress, 0.0f, 1.0f);
        }
        return progress;
    }

    /* renamed from: c */
    public final boolean m2428c() {
        return calculateProgress(false) >= 0.0f;
    }

    /* renamed from: d */
    public final boolean m2429d() {
        return m2428c() && calculateProgress(false) > 1.0f;
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
            this.startTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (m2428c() || m2429d()) {
                return;
            }
            if (this.startTimeMillis == 0) {
                this.startTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            }
            m2427b();
        }
    }

    /* renamed from: g */
    public final void m2432g() {
        this.f3657c = false;
        this.f3656b = false;
        this.startTimeMillis = 0L;
        this.frameTimeOverrideMillis = 0L;
        if (this.manualProgress > 0.0f && this.manualProgress < 1.0f) {
            float f = this.manualProgress;
            if (this.f3664n) {
                f = 1.0f - f;
            }
            this.startTimeMillis = AnimationUtils.currentAnimationTimeMillis() - ((long) (f * this.durationMillis));
        }
    }

    /* renamed from: b */
    public final void setManualProgress(float progress) {
        this.manualProgress = progress;
        if (this.f3658d) {
            mo1793a(calculateProgress(true));
            mo1792a();
        }
    }

    /* renamed from: a */
    public final void m2425a(boolean z) {
        this.f3658d = z;
        if (z) {
            mo1793a(calculateProgress(true));
        }
    }
}
