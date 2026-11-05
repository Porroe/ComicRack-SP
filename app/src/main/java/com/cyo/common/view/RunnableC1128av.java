package com.cyo.common.view;

import android.widget.LinearLayout;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.av */
/* loaded from: classes.dex */
final class RunnableC1128av implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1120an f3593a;

    /* renamed from: b */
    private final /* synthetic */ String f3594b;

    RunnableC1128av(C1120an c1120an, String str) {
        this.f3593a = c1120an;
        this.f3594b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f3593a.f3573b.getWidth();
        int height = this.f3593a.f3573b.getHeight();
        if (width != 0 && height != 0) {
            this.f3593a.f3573b.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        }
        this.f3593a.m2407a(this.f3594b);
    }
}
