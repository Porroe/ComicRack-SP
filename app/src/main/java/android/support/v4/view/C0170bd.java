package android.support.v4.view;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.bd */
/* loaded from: classes.dex */
class C0170bd extends C0169bc {

    /* renamed from: b */
    static boolean f502b = false;

    C0170bd() {
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public final boolean mo445a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Override // android.support.v4.view.C0165az, android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public final void mo443a(View view, C0112a c0112a) {
        view.setAccessibilityDelegate((View.AccessibilityDelegate) c0112a.m334a());
    }
}
