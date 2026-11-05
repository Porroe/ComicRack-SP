package android.support.v4.view.p003a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.a.q */
/* loaded from: classes.dex */
final class C0130q extends AccessibilityNodeProvider {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0131r f470a;

    C0130q(InterfaceC0131r interfaceC0131r) {
        this.f470a = interfaceC0131r;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        this.f470a.mo378c();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return this.f470a.mo377b();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f470a.mo376a();
    }
}
