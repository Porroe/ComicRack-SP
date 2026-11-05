package com.cyo.common.view;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.cyo.common.C0951ag;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bn */
/* loaded from: classes.dex */
final class RunnableC1147bn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Window f3631a;

    /* renamed from: b */
    private final /* synthetic */ View f3632b;

    /* renamed from: c */
    private final /* synthetic */ Context f3633c;

    /* renamed from: d */
    private final /* synthetic */ float f3634d;

    RunnableC1147bn(Window window, View view, Context context, float f) {
        this.f3631a = window;
        this.f3632b = view;
        this.f3633c = context;
        this.f3634d = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowManager.LayoutParams attributes = this.f3631a.getAttributes();
        int height = this.f3632b.getHeight();
        if (height > 0) {
            attributes.height = Math.min(height, (int) (C0951ag.m1999b(this.f3633c).heightPixels * this.f3634d));
            this.f3631a.setAttributes(attributes);
        }
    }
}
