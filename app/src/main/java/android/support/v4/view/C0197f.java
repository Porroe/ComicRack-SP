package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p003a.C0113a;
import android.support.v4.view.p003a.C0122i;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.f */
/* loaded from: classes.dex */
final class C0197f implements InterfaceC0204m {

    /* renamed from: a */
    final /* synthetic */ C0112a f520a;

    /* renamed from: b */
    final /* synthetic */ C0196e f521b;

    C0197f(C0196e c0196e, C0112a c0112a) {
        this.f521b = c0196e;
        this.f520a = c0112a;
    }

    @Override // android.support.v4.view.InterfaceC0204m
    /* renamed from: a */
    public final boolean mo478a(View view, AccessibilityEvent accessibilityEvent) {
        C0112a c0112a = this.f520a;
        return C0112a.m332b(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0204m
    /* renamed from: b */
    public final void mo480b(View view, AccessibilityEvent accessibilityEvent) {
        this.f520a.mo337d(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0204m
    /* renamed from: a */
    public final void mo476a(View view, Object obj) {
        this.f520a.mo335a(view, new C0113a(obj));
    }

    @Override // android.support.v4.view.InterfaceC0204m
    /* renamed from: c */
    public final void mo481c(View view, AccessibilityEvent accessibilityEvent) {
        C0112a c0112a = this.f520a;
        C0112a.m333c(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0204m
    /* renamed from: a */
    public final boolean mo479a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0112a c0112a = this.f520a;
        return C0112a.m331a(viewGroup, view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0204m
    /* renamed from: a */
    public final void mo475a(View view, int i) {
        C0112a c0112a = this.f520a;
        C0112a.m329a(view, i);
    }

    @Override // android.support.v4.view.InterfaceC0204m
    /* renamed from: d */
    public final void mo482d(View view, AccessibilityEvent accessibilityEvent) {
        C0112a c0112a = this.f520a;
        C0112a.m330a(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0204m
    /* renamed from: a */
    public final Object mo474a(View view) {
        C0112a c0112a = this.f520a;
        C0122i c0122iM328a = C0112a.m328a(view);
        if (c0122iM328a != null) {
            return c0122iM328a.m374a();
        }
        return null;
    }

    @Override // android.support.v4.view.InterfaceC0204m
    /* renamed from: a */
    public final boolean mo477a(View view, int i, Bundle bundle) {
        return this.f520a.mo336a(view, i, bundle);
    }
}
