package android.support.v4.widget;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.u */
/* loaded from: classes.dex */
final class C0238u extends C0237t {

    /* renamed from: a */
    private Method f624a;

    /* renamed from: b */
    private Field f625b;

    C0238u() {
        try {
            this.f624a = View.class.getDeclaredMethod("getDisplayList", null);
        } catch (NoSuchMethodException e) {
            Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
        }
        try {
            this.f625b = View.class.getDeclaredField("mRecreateDisplayList");
            this.f625b.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
        }
    }

    @Override // android.support.v4.widget.C0237t, android.support.v4.widget.InterfaceC0236s
    /* renamed from: a */
    public final void mo559a(SlidingPaneLayout slidingPaneLayout, View view) {
        if (this.f624a != null && this.f625b != null) {
            try {
                this.f625b.setBoolean(view, true);
                this.f624a.invoke(view, null);
            } catch (Exception e) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
            }
            super.mo559a(slidingPaneLayout, view);
            return;
        }
        view.invalidate();
    }
}
