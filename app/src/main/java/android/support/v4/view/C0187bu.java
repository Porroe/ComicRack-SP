package android.support.v4.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.p003a.C0113a;
import android.support.v4.view.p003a.C0135v;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.bu */
/* loaded from: classes.dex */
final class C0187bu extends C0112a {

    /* renamed from: b */
    final /* synthetic */ ViewPager f516b;

    C0187bu(ViewPager viewPager) {
        this.f516b = viewPager;
    }

    @Override // android.support.v4.view.C0112a
    /* renamed from: d */
    public final void mo337d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo337d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        C0135v c0135vM383a = C0135v.m383a();
        c0135vM383a.m385a(m464b());
        if (accessibilityEvent.getEventType() == 4096 && ViewPager.m310b(this.f516b) != null) {
            c0135vM383a.m384a(ViewPager.m310b(this.f516b).mo408c());
            c0135vM383a.m386b(ViewPager.m313c(this.f516b));
            c0135vM383a.m387c(ViewPager.m313c(this.f516b));
        }
    }

    @Override // android.support.v4.view.C0112a
    /* renamed from: a */
    public final void mo335a(View view, C0113a c0113a) {
        super.mo335a(view, c0113a);
        c0113a.m340a(ViewPager.class.getName());
        c0113a.m341a(m464b());
        if (this.f516b.canScrollHorizontally(1)) {
            c0113a.m339a(4096);
        }
        if (this.f516b.canScrollHorizontally(-1)) {
            c0113a.m339a(8192);
        }
    }

    @Override // android.support.v4.view.C0112a
    /* renamed from: a */
    public final boolean mo336a(View view, int i, Bundle bundle) throws Resources.NotFoundException {
        if (super.mo336a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.f516b.canScrollHorizontally(1)) {
                    return false;
                }
                this.f516b.setCurrentItem(ViewPager.m313c(this.f516b) + 1);
                return true;
            case 8192:
                if (!this.f516b.canScrollHorizontally(-1)) {
                    return false;
                }
                this.f516b.setCurrentItem(ViewPager.m313c(this.f516b) - 1);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    private boolean m464b() {
        return ViewPager.m310b(this.f516b) != null && ViewPager.m310b(this.f516b).mo408c() > 1;
    }
}
