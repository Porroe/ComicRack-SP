package android.support.v4.view;

import android.support.v4.view.p003a.C0113a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.b */
/* loaded from: classes.dex */
class C0166b extends C0198g {
    C0166b() {
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: a */
    public final Object mo453a() {
        return new View.AccessibilityDelegate();
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: a */
    public Object mo454a(C0112a c0112a) {
        return new C0200i(new C0193c(this, c0112a));
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: a */
    public final boolean mo457a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: b */
    public final void mo459b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: a */
    public final void mo456a(Object obj, View view, C0113a c0113a) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo) c0113a.m338a());
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: c */
    public final void mo460c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: a */
    public final boolean mo458a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: a */
    public final void mo455a(Object obj, View view, int i) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEvent(view, i);
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: d */
    public final void mo461d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
