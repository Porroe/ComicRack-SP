package android.support.v4.view;

import android.database.DataSetObserver;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.aj */
/* loaded from: classes.dex */
final class C0149aj extends DataSetObserver implements InterfaceC0188bv, InterfaceC0189bw {

    /* renamed from: a */
    final /* synthetic */ C0148ai f495a;

    /* renamed from: b */
    private int f496b;

    private C0149aj(C0148ai c0148ai) {
        this.f495a = c0148ai;
    }

    /* synthetic */ C0149aj(C0148ai c0148ai, byte b) {
        this(c0148ai);
    }

    @Override // android.support.v4.view.InterfaceC0189bw
    /* renamed from: a */
    public final void mo414a(int i, float f) {
        if (f > 0.5f) {
            i++;
        }
        this.f495a.mo294a(i, f, false);
    }

    @Override // android.support.v4.view.InterfaceC0189bw
    /* renamed from: a */
    public final void mo413a(int i) {
        if (this.f496b == 0) {
            this.f495a.m411a(this.f495a.f481a.getCurrentItem(), this.f495a.f481a.getAdapter());
            this.f495a.mo294a(this.f495a.f481a.getCurrentItem(), C0148ai.m410a(this.f495a) >= 0.0f ? C0148ai.m410a(this.f495a) : 0.0f, true);
        }
    }

    @Override // android.support.v4.view.InterfaceC0189bw
    /* renamed from: b */
    public final void mo416b(int i) {
        this.f496b = i;
    }

    @Override // android.support.v4.view.InterfaceC0188bv
    /* renamed from: a */
    public final void mo415a(AbstractC0145af abstractC0145af, AbstractC0145af abstractC0145af2) {
        this.f495a.m412a(abstractC0145af, abstractC0145af2);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f495a.m411a(this.f495a.f481a.getCurrentItem(), this.f495a.f481a.getAdapter());
        this.f495a.mo294a(this.f495a.f481a.getCurrentItem(), C0148ai.m410a(this.f495a) >= 0.0f ? C0148ai.m410a(this.f495a) : 0.0f, true);
    }
}
