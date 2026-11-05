package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ck */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0714ck implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Activity f2243a;

    DialogInterfaceOnClickListenerC0714ck(Activity activity) {
        this.f2243a = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ComicRackApplication.m1412b(this.f2243a);
    }
}
