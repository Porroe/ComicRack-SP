package com.cyo.comicrack.viewer;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.bq */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0693bq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0681be f2208a;

    ViewOnClickListenerC0693bq(C0681be c0681be) {
        this.f2208a = c0681be;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM1713P;
        if (this.f2208a.m1715R().f2268b < 7) {
            iM1713P = (this.f2208a.m1713P() + 1) % 3;
        } else {
            iM1713P = (this.f2208a.m1713P() + 1) % 2;
        }
        int iM1714Q = iM1713P + this.f2208a.m1714Q();
        this.f2208a.m1723a(iM1714Q, true);
        this.f2208a.m1834a("ComicList", "Style", new StringBuilder().append(iM1714Q).toString());
    }
}
