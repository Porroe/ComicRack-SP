package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.c */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0703c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Activity f2221a;

    DialogInterfaceOnClickListenerC0703c(Activity activity) {
        this.f2221a = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ComicRackApplication.m1412b(this.f2221a);
    }
}
