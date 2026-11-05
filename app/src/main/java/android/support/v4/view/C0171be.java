package android.support.v4.view;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.be */
/* loaded from: classes.dex */
class C0171be extends C0170bd {
    C0171be() {
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: b */
    public final void mo446b(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public final void mo440a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public final void mo444a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: c */
    public final int mo448c(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: b */
    public void mo447b(View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: g */
    public final boolean mo452g(View view) {
        return view.getFitsSystemWindows();
    }
}
