package com.cyo.common.view;

import android.support.v4.view.AbstractC0145af;
import android.support.v4.view.ViewPager;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bk */
/* loaded from: classes.dex */
public final class C1144bk extends AbstractC0145af {

    /* renamed from: a */
    private View[] f3626a;

    /* renamed from: b */
    private String[] f3627b;

    public C1144bk(View[] viewArr, String[] strArr) {
        this.f3626a = viewArr;
        this.f3627b = strArr;
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: c */
    public final int mo408c() {
        return this.f3626a.length;
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: a */
    public final boolean mo253a(View view, Object obj) {
        return view == obj;
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: a */
    public final Object mo403a(View view, int i) {
        View view2 = this.f3626a[i];
        ((ViewPager) view).addView(view2);
        return view2;
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: b */
    public final void mo407b(View view, Object obj) {
        ((ViewPager) view).removeView((View) obj);
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: b */
    public final CharSequence mo405b(int i) {
        return this.f3627b[i];
    }
}
