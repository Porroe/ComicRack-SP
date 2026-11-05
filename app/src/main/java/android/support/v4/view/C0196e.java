package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p003a.C0122i;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.e */
/* loaded from: classes.dex */
final class C0196e extends C0166b {
    C0196e() {
    }

    @Override // android.support.v4.view.C0166b, android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: a */
    public final Object mo454a(C0112a c0112a) {
        return new C0203l(new C0197f(this, c0112a));
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: a */
    public final C0122i mo472a(Object obj, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = ((View.AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0122i(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // android.support.v4.view.C0198g, android.support.v4.view.InterfaceC0195d
    /* renamed from: a */
    public final boolean mo473a(Object obj, View view, int i, Bundle bundle) {
        return ((View.AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
