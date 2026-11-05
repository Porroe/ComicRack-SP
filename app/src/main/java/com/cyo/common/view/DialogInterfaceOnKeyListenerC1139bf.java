package com.cyo.common.view;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bf */
/* loaded from: classes.dex */
final class DialogInterfaceOnKeyListenerC1139bf implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ AbstractAlertDialogBuilderC1138be f3617a;

    DialogInterfaceOnKeyListenerC1139bf(AbstractAlertDialogBuilderC1138be abstractAlertDialogBuilderC1138be) {
        this.f3617a = abstractAlertDialogBuilderC1138be;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 66) {
            return false;
        }
        this.f3617a.onClick(dialogInterface, -1);
        return true;
    }
}
