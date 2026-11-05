package com.cyo.comicrack.viewer;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.bx */
/* loaded from: classes.dex */
final class ViewOnLongClickListenerC0700bx implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ C0681be f2218a;

    ViewOnLongClickListenerC0700bx(C0681be c0681be) {
        this.f2218a = c0681be;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f2218a.m1723a((this.f2218a.m1714Q() == 256 ? 0 : 256) + this.f2218a.m1713P(), true);
        return true;
    }
}
