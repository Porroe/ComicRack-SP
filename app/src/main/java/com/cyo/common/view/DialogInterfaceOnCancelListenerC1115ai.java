package com.cyo.common.view;

import android.app.Activity;
import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.ai */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC1115ai implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ Activity f3567a;

    public DialogInterfaceOnCancelListenerC1115ai(Activity activity) {
        this.f3567a = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C1112af.m2403a(this.f3567a, false);
    }
}
