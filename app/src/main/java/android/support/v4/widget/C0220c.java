package android.support.v4.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.c */
/* loaded from: classes.dex */
final class C0220c implements InterfaceC0219b {
    C0220c() {
    }

    @Override // android.support.v4.widget.InterfaceC0219b
    /* renamed from: a */
    public final void mo525a(View view, Object obj, int i) {
        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) obj;
        if (i == 3) {
            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
        } else if (i == 5) {
            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
        }
        view.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
    }

    @Override // android.support.v4.widget.InterfaceC0219b
    /* renamed from: a */
    public final void mo526a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i) {
        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) obj;
        if (i == 3) {
            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
        } else if (i == 5) {
            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
        marginLayoutParams.bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
    }

    @Override // android.support.v4.widget.InterfaceC0219b
    /* renamed from: a */
    public final int mo524a(Object obj) {
        if (obj != null) {
            return ((WindowInsets) obj).getSystemWindowInsetTop();
        }
        return 0;
    }
}
