package android.support.v4.view.p003a;

import android.view.accessibility.AccessibilityRecord;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.a.w */
/* loaded from: classes.dex */
class C0136w extends C0114aa {
    C0136w() {
    }

    @Override // android.support.v4.view.p003a.C0114aa, android.support.v4.view.p003a.InterfaceC0138y
    /* renamed from: a */
    public final Object mo343a() {
        return AccessibilityRecord.obtain();
    }

    @Override // android.support.v4.view.p003a.C0114aa, android.support.v4.view.p003a.InterfaceC0138y
    /* renamed from: a */
    public final void mo344a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    @Override // android.support.v4.view.p003a.C0114aa, android.support.v4.view.p003a.InterfaceC0138y
    /* renamed from: b */
    public final void mo346b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    @Override // android.support.v4.view.p003a.C0114aa, android.support.v4.view.p003a.InterfaceC0138y
    /* renamed from: a */
    public final void mo345a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    @Override // android.support.v4.view.p003a.C0114aa, android.support.v4.view.p003a.InterfaceC0138y
    /* renamed from: c */
    public final void mo347c(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
