package android.support.v4.view;

import android.support.v4.view.p003a.C0113a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.c */
/* loaded from: classes.dex */
final class C0193c implements InterfaceC0201j {

    /* renamed from: a */
    final /* synthetic */ C0112a f518a;

    /* renamed from: b */
    final /* synthetic */ C0166b f519b;

    C0193c(C0166b c0166b, C0112a c0112a) {
        this.f519b = c0166b;
        this.f518a = c0112a;
    }

    @Override // android.support.v4.view.InterfaceC0201j
    /* renamed from: a */
    public final boolean mo467a(View view, AccessibilityEvent accessibilityEvent) {
        C0112a c0112a = this.f518a;
        return C0112a.m332b(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0201j
    /* renamed from: b */
    public final void mo469b(View view, AccessibilityEvent accessibilityEvent) {
        this.f518a.mo337d(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0201j
    /* renamed from: a */
    public final void mo466a(View view, Object obj) {
        this.f518a.mo335a(view, new C0113a(obj));
    }

    @Override // android.support.v4.view.InterfaceC0201j
    /* renamed from: c */
    public final void mo470c(View view, AccessibilityEvent accessibilityEvent) {
        C0112a c0112a = this.f518a;
        C0112a.m333c(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0201j
    /* renamed from: a */
    public final boolean mo468a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0112a c0112a = this.f518a;
        return C0112a.m331a(viewGroup, view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0201j
    /* renamed from: a */
    public final void mo465a(View view, int i) {
        C0112a c0112a = this.f518a;
        C0112a.m329a(view, i);
    }

    @Override // android.support.v4.view.InterfaceC0201j
    /* renamed from: d */
    public final void mo471d(View view, AccessibilityEvent accessibilityEvent) {
        C0112a c0112a = this.f518a;
        C0112a.m330a(view, accessibilityEvent);
    }
}
