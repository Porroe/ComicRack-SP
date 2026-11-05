package com.cyo.common.view;

import android.app.AlertDialog;
import android.view.View;
import com.cyo.comicrack.viewer.C0806fv;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.ar */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1124ar implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1120an f3589a;

    ViewOnClickListenerC1124ar(C1120an c1120an) {
        this.f3589a = c1120an;
    }

    /* renamed from: a */
    static /* synthetic */ C1120an m2409a(ViewOnClickListenerC1124ar viewOnClickListenerC1124ar) {
        return viewOnClickListenerC1124ar.f3589a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new AlertDialog.Builder(this.f3589a.f3572a.getContext()).setTitle(C0806fv.delete_folder).setMessage(C0806fv.are_you_sure_you_want_to_delete_this_folder).setPositiveButton(C0806fv.yes, new DialogInterfaceOnClickListenerC1125as(this)).setNegativeButton(C0806fv.f2496no, new DialogInterfaceOnClickListenerC1126at(this)).show();
    }
}
