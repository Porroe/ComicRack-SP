package android.support.v4.app;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.an */
/* loaded from: classes.dex */
final class C0016an extends FrameLayout {
    /* renamed from: a */
    static ViewGroup m128a(View view) {
        C0016an c0016an = new C0016an(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            c0016an.setLayoutParams(layoutParams);
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c0016an.addView(view);
        return c0016an;
    }

    private C0016an(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }
}
