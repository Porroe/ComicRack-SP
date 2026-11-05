package com.cyo.comicrack.viewer;

import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.go */
/* loaded from: classes.dex */
final class DialogInterfaceOnDismissListenerC0826go implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ AsyncTaskC0825gn f2525a;

    DialogInterfaceOnDismissListenerC0826go(AsyncTaskC0825gn asyncTaskC0825gn) {
        this.f2525a = asyncTaskC0825gn;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (ReaderActivity.m1596f(AsyncTaskC0825gn.m1848a(this.f2525a)) == null) {
            AsyncTaskC0825gn.m1848a(this.f2525a).finish();
        }
    }
}
