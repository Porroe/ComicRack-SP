package android.support.v4.view.p003a;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.a.c */
/* loaded from: classes.dex */
class C0116c extends C0121h {
    C0116c() {
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: a */
    public final void mo349a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: a */
    public final int mo348a(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: a */
    public final void mo350a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: b */
    public final void mo354b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: b */
    public final CharSequence mo353b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: c */
    public final CharSequence mo355c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: d */
    public final CharSequence mo356d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: e */
    public final CharSequence mo357e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: f */
    public final boolean mo358f(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: g */
    public final boolean mo359g(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: h */
    public final boolean mo360h(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: i */
    public final boolean mo361i(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: j */
    public final boolean mo362j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: k */
    public final boolean mo363k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: l */
    public final boolean mo364l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: m */
    public final boolean mo365m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: n */
    public final boolean mo366n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: o */
    public final boolean mo367o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: a */
    public final void mo351a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: p */
    public final void mo368p(Object obj) {
        ((AccessibilityNodeInfo) obj).setParent(null);
    }

    @Override // android.support.v4.view.p003a.C0121h, android.support.v4.view.p003a.InterfaceC0117d
    /* renamed from: a */
    public final void mo352a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }
}
