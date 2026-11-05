package com.cyo.common.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.cyo.common.C0951ag;
import com.cyo.common.EnumC0993bd;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bm */
/* loaded from: classes.dex */
public final class C1146bm {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m2419a(Activity activity) {
        if (activity instanceof InterfaceC1111ae) {
            ((InterfaceC1111ae) activity).mo1635o();
        }
    }

    /* renamed from: a */
    public static int m2418a(Context context, int i) {
        return Math.round(context.getResources().getDisplayMetrics().density * i);
    }

    /* renamed from: a */
    public static void m2420a(Dialog dialog, float f, EnumC0993bd enumC0993bd) {
        Window window;
        View decorView;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Context context = window.getContext();
        if (!C0951ag.m1997a(context, enumC0993bd) || !C0951ag.m2002c(context) || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new RunnableC1147bn(window, decorView, context, f));
    }
}
