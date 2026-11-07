package com.cyo.comicrack.viewer;

import android.support.v4.view.InterfaceC0189bw;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ij */
/* loaded from: classes.dex */
final class C0875ij implements InterfaceC0189bw {

    /* renamed from: a */
    final /* synthetic */ C0874ii f2659a;

    C0875ij(C0874ii c0874ii) {
        this.f2659a = c0874ii;
    }

    @Override // android.support.v4.view.InterfaceC0189bw
    /* renamed from: a */
    public final void mo413a(int position) {
        if (this.f2659a.materialTabs != null) {
            this.f2659a.materialTabs.onPageSelected(position);
        }
        if (this.f2659a.f2655i != null) {
            this.f2659a.f2655i.mo1811a(position);
        }
    }

    @Override // android.support.v4.view.InterfaceC0189bw
    /* renamed from: a */
    public final void mo414a(int position, float offset) {
        if (this.f2659a.materialTabs != null) {
            this.f2659a.materialTabs.onPageScrolled(position, offset);
        }
    }

    @Override // android.support.v4.view.InterfaceC0189bw
    /* renamed from: b */
    public final void mo416b(int state) {
        if (this.f2659a.materialTabs != null) {
            this.f2659a.materialTabs.onScrollStateChanged(state);
        }
        if (!this.f2659a.f2652f.m327c()) {
            if (this.f2659a.mo1803b() instanceof InterfaceC0892j) {
                ((InterfaceC0892j) this.f2659a.mo1803b()).mo1721a();
            }
            if (state == 1 && this.f2659a.f2653g != null) {
                C0874ii.m1865a(this.f2659a, true, false);
                this.f2659a.m1866j();
            }
        }
    }
}
