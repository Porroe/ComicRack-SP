package com.cyo.comicrack.viewer;

import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cd */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0707cd implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0681be f2229a;

    DialogInterfaceOnClickListenerC0707cd(C0681be c0681be) {
        this.f2229a = c0681be;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
