package com.cyo.common.view;

import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.at */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1126at implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnClickListenerC1124ar f3591a;

    DialogInterfaceOnClickListenerC1126at(ViewOnClickListenerC1124ar viewOnClickListenerC1124ar) {
        this.f3591a = viewOnClickListenerC1124ar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
