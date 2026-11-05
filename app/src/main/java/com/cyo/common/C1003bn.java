package com.cyo.common;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bn */
/* loaded from: classes.dex */
final class C1003bn implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C0999bj f2956a;

    /* renamed from: b */
    private final /* synthetic */ ListView f2957b;

    /* renamed from: c */
    private final /* synthetic */ AlphaAnimation f2958c;

    C1003bn(C0999bj c0999bj, ListView listView, AlphaAnimation alphaAnimation) {
        this.f2956a = c0999bj;
        this.f2957b = listView;
        this.f2958c = alphaAnimation;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1006bq c1006bq = (C1006bq) adapterView.getItemAtPosition(i);
        if (!c1006bq.f2965a) {
            this.f2957b.startAnimation(this.f2958c);
            if (this.f2956a.f2946d != null) {
                this.f2956a.f2946d.mo1736a(c1006bq);
            }
        }
    }
}
