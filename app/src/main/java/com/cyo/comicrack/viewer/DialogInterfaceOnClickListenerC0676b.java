package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.b */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0676b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Activity f2183a;

    DialogInterfaceOnClickListenerC0676b(Activity activity) {
        this.f2183a = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2183a.startActivity(new Intent("android.intent.action.VIEW", ComicRackApplication.f1950c));
    }
}
