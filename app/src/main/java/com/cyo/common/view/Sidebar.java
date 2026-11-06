package com.cyo.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.cyo.common.C0950af;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class Sidebar extends LinearLayout {

    /* renamed from: a */
    private final int f3533a;

    /* renamed from: b */
    private final int f3534b;

    /* renamed from: c */
    private final int f3535c;

    /* renamed from: d */
    private final int f3536d;

    /* renamed from: e */
    private final int f3537e;

    /* renamed from: f */
    private final int f3538f;

    /* renamed from: g */
    private boolean f3539g;

    /* renamed from: h */
    private boolean f3540h;

    /* renamed from: i */
    private boolean f3541i;

    /* renamed from: j */
    private float f3542j;

    /* renamed from: k */
    private float f3543k;

    /* renamed from: l */
    private int f3544l;

    /* renamed from: m */
    private boolean f3545m;

    /* renamed from: n */
    private boolean f3546n;

    /* renamed from: o */
    private boolean f3547o;

    /* renamed from: p */
    private boolean f3548p;

    /* renamed from: q */
    private int f3549q;

    /* renamed from: r */
    private InterfaceC1142bi f3550r;

    /* renamed from: a */
    static /* synthetic */ InterfaceC1142bi m2386a(Sidebar sidebar) {
        return sidebar.f3550r;
    }

    public Sidebar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3533a = 20;
        this.f3534b = 5;
        this.f3535c = 20;
        this.f3536d = 100000;
        this.f3537e = 300;
        this.f3538f = 100;
        this.f3547o = true;
        this.f3549q = 10;
    }

    public int getOverlayWidth() {
        return this.f3549q;
    }

    public void setOverlayWidth(int i) {
        this.f3549q = i;
    }

    /* renamed from: a */
    public final boolean m2392a() {
        return this.f3545m ? getLeftMargin() == 0 : this.f3547o;
    }

    /* renamed from: a */
    public final void m2391a(boolean z, boolean z2) {
        if (!this.f3545m) {
            this.f3546n = true;
            this.f3547o = z;
            return;
        }
        if (z != m2392a()) {
            if (z2) {
                if (this.f3550r != null) {
                    InterfaceC1142bi interfaceC1142bi = this.f3550r;
                }
                m2387a(z ? 1 : -1, 300);
            } else {
                setLeftMargin(z ? 0 : -getSidebarWidth());
                if (this.f3550r != null) {
                    this.f3550r.mo1818a();
                }
            }
        }
    }

    public void setOnSidebarListener(InterfaceC1142bi interfaceC1142bi) {
        this.f3550r = interfaceC1142bi;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.f3545m) {
            this.f3545m = true;
            if (this.f3546n) {
                m2391a(this.f3547o, false);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 1:
                this.f3539g = false;
                if (this.f3540h) {
                    m2387a(this.f3544l, 100);
                    break;
                }
                break;
            case 2:
                if (this.f3539g) {
                    if (this.f3540h) {
                        m2390b(motionEvent);
                    }
                    m2388a(motionEvent);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f3539g = true;
                this.f3540h = false;
                this.f3541i = false;
                this.f3548p = false;
                this.f3542j = motionEvent.getRawX();
                this.f3543k = motionEvent.getRawY();
                break;
            case 1:
                this.f3539g = false;
                break;
            case 2:
                if (this.f3539g) {
                    if (this.f3540h) {
                        m2390b(motionEvent);
                        return true;
                    }
                    m2388a(motionEvent);
                    break;
                }
                break;
        }
        return false;
    }

    /* renamed from: a */
    private void m2388a(MotionEvent motionEvent) {
        if (!this.f3541i && !this.f3540h) {
            boolean zM2392a = m2392a();
            if (Math.abs(motionEvent.getRawY() - this.f3543k) >= (zM2392a ? 20 : 100000)) {
                this.f3541i = true;
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.f3542j) >= (zM2392a ? 20 : 5)) {
                this.f3540h = true;
                if (this.f3550r != null) {
                    InterfaceC1142bi interfaceC1142bi = this.f3550r;
                }
            }
        }
    }

    public int getSidebarWidth() {
        return getWidth() - getOverlayWidth();
    }

    /* renamed from: b */
    private void m2390b(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        int i = (int) (rawX - this.f3542j);
        if (!this.f3548p) {
            setLeftMargin(getLeftMargin() + i);
        }
        this.f3544l = C0950af.m1990a(i + this.f3544l, -10, 10);
        this.f3548p = false;
        this.f3542j = rawX;
    }

    /* renamed from: a */
    static /* synthetic */ void m2389a(Sidebar sidebar, int i) {
        sidebar.setLeftMargin(i);
    }

    private void setLeftMargin(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = C0950af.m1990a(i, -getSidebarWidth(), 0);
        setLayoutParams(layoutParams);
    }

    private int getLeftMargin() {
        return ((RelativeLayout.LayoutParams) getLayoutParams()).leftMargin;
    }

    /* renamed from: a */
    private void m2387a(int i, int i2) {
        C1140bg c1140bg = new C1140bg(this, getLeftMargin(), i > 0 ? 0 : -getSidebarWidth());
        c1140bg.setAnimationListener(new AnimationAnimationListenerC1141bh(this));
        c1140bg.setDuration(i2);
        startAnimation(c1140bg);
    }
}
