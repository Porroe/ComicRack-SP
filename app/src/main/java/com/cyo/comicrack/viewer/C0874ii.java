package com.cyo.comicrack.viewer;

import android.content.res.Resources;
import android.support.v4.app.ActivityC0076l;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import java.util.Timer;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ii */
/* loaded from: classes.dex */
public final class C0874ii extends AbstractC0755dy {

    /* renamed from: f */
    ViewPager f2652f;

    /* renamed from: g */
    PagerTabStrip f2653g;

    /* renamed from: h */
    Class f2654h;

    /* renamed from: i */
    InterfaceC0754dx f2655i;

    /* renamed from: j */
    private C0880io f2656j;

    final MaterialCollectionTabs materialTabs;

    /* renamed from: k */
    private Timer f2657k;

    /* renamed from: l */
    private float f2658l;

    public C0874ii(ActivityC0076l activityC0076l, Class cls, int i, int i2, InterfaceC0754dx interfaceC0754dx) {
        super(activityC0076l);
        this.f2657k = new Timer();
        this.f2654h = cls;
        this.f2652f = (ViewPager) this.f2386a.findViewById(i);
        this.f2653g = (PagerTabStrip) this.f2386a.findViewById(i2);
        if (LibraryInterface.isMaterial(activityC0076l)) {
            if (this.f2653g != null) {
                this.f2653g.setVisibility(android.view.View.GONE);
            }
            this.f2653g = null;
        }
        materialTabs = LibraryInterface.isMaterial(activityC0076l)
                ? new MaterialCollectionTabs(f2652f) : null;
        this.f2655i = interfaceC0754dx;
        if (this.f2653g != null) {
            this.f2653g.setTabIndicatorColorResource(C0800fp.list_caption_text);
            this.f2653g.setVisibility(8);
        }
        this.f2652f.setOnPageChangeListener(new C0875ij(this));
        m1866j();
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0755dy
    /* renamed from: i */
    protected final void mo1813i() throws Resources.NotFoundException {
        this.f2656j = new C0880io(this, this.f2390e);
        this.f2652f.setAdapter(this.f2656j);
        if (materialTabs != null) { materialTabs.setAdapter(f2656j); }
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0755dy
    /* renamed from: a */
    protected final void mo1812a(int i, boolean z) throws Resources.NotFoundException {
        if (i != -1 && this.f2652f != null && this.f2652f.getCurrentItem() != i) {
            this.f2652f.m325a(i, z);
        }
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: a */
    public final void mo1799a() {
        this.f2656j.m409d();
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: b */
    public final AbstractC0782ey mo1803b() {
        if (this.f2656j == null) {
            return null;
        }
        return (AbstractC0782ey) this.f2656j.mo248a(this.f2652f.getCurrentItem());
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: c */
    public final ViewPager mo1805c() {
        return this.f2652f;
    }

    /* renamed from: j */
    final void m1866j() {
        if (this.f2653g != null) {
            this.f2657k.cancel();
            this.f2657k = new Timer();
            this.f2657k.schedule(new C0876ik(this), 3000L);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m1865a(C0874ii c0874ii, boolean z, boolean z2) {
        if (c0874ii.f2653g != null) {
            boolean z3 = c0874ii.f2653g.getVisibility() == 0;
            if (z3 && c0874ii.f2658l == 0.0f) {
                c0874ii.f2658l = c0874ii.f2653g.getHeight();
            }
            if (!c0874ii.f2387b) {
                z2 = false;
                z = false;
            }
            c0874ii.f2653g.clearAnimation();
            if (z != z3) {
                if (z2 && c0874ii.f2658l != 0.0f) {
                    C0878im c0878im = new C0878im(c0874ii, z ? 0.0f : c0874ii.f2658l, z ? c0874ii.f2658l : 0.0f);
                    c0878im.setDuration(300L);
                    c0878im.setAnimationListener(new AnimationAnimationListenerC0879in(c0874ii, z));
                    c0874ii.f2653g.startAnimation(c0878im);
                    return;
                }
                if (z != z3) {
                    c0874ii.f2653g.setVisibility(z ? 0 : 8);
                    if (c0874ii.f2658l != 0.0f) {
                        c0874ii.f2653g.getLayoutParams().height = (int) c0874ii.f2658l;
                    }
                    c0874ii.f2653g.requestLayout();
                }
            }
        }
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: g */
    public final void mo1809g() {
        if (this.f2652f == null || this.f2652f.getAdapter() == null || this.f2652f.getAdapter().mo408c() == 0) {
        }
    }
}
