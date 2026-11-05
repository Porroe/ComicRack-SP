package com.cyo.common;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ListView;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bp */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1005bp implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0999bj f2962a;

    /* renamed from: b */
    private final /* synthetic */ ListView f2963b;

    /* renamed from: c */
    private final /* synthetic */ AlphaAnimation f2964c;

    ViewOnClickListenerC1005bp(C0999bj c0999bj, ListView listView, AlphaAnimation alphaAnimation) {
        this.f2962a = c0999bj;
        this.f2963b = listView;
        this.f2964c = alphaAnimation;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f2963b.startAnimation(this.f2964c);
    }
}
