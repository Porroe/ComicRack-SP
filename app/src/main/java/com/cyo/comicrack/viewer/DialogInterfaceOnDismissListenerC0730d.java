package com.cyo.comicrack.viewer;

import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.d */
/* loaded from: classes.dex */
final class DialogInterfaceOnDismissListenerC0730d implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    private final /* synthetic */ Runnable f2278a;

    DialogInterfaceOnDismissListenerC0730d(Runnable runnable) {
        this.f2278a = runnable;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f2278a != null) {
            this.f2278a.run();
        }
    }
}
