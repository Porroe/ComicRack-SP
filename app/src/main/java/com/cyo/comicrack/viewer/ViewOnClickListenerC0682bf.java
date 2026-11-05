package com.cyo.comicrack.viewer;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.bf */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0682bf implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0681be f2195a;

    ViewOnClickListenerC0682bf(C0681be c0681be) {
        this.f2195a = c0681be;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM1712O = this.f2195a.m1712O();
        this.f2195a.m1834a("ComicList", "Filter", new StringBuilder().append(iM1712O).toString());
        this.f2195a.m1722a((iM1712O + 1) % 4);
    }
}
