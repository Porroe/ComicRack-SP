package android.support.v4.view.p003a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.a.t */
/* loaded from: classes.dex */
final class C0133t extends AccessibilityNodeProvider {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0134u f471a;

    C0133t(InterfaceC0134u interfaceC0134u) {
        this.f471a = interfaceC0134u;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        this.f471a.mo381c();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return this.f471a.mo380b();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f471a.mo379a();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        this.f471a.mo382d();
        return null;
    }
}
