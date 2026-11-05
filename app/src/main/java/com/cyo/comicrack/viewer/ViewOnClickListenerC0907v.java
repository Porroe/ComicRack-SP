package com.cyo.comicrack.viewer;

import android.view.View;
import com.cyo.comicrack.p019a.C0628f;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.v */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0907v implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0906u f2747a;

    ViewOnClickListenerC0907v(C0906u c0906u) {
        this.f2747a = c0906u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0906u c0906u = this.f2747a;
        C0906u.m1906a(C0906u.m1896P());
        if (C0628f.f1889k) {
            ComicRackApplication.m1405a(this.f2747a.m55i(), C0806fv.full_edition_edit_details);
        } else {
            this.f2747a.m1908O();
        }
    }
}
