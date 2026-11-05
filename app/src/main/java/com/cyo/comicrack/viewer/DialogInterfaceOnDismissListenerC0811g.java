package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.content.DialogInterface;
import com.cyo.common.view.C1146bm;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.g */
/* loaded from: classes.dex */
final class DialogInterfaceOnDismissListenerC0811g implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    private final /* synthetic */ Activity f2498a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f2499b;

    DialogInterfaceOnDismissListenerC0811g(Activity activity, Runnable runnable) {
        this.f2498a = activity;
        this.f2499b = runnable;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C1146bm.m2419a(this.f2498a);
        if (this.f2499b != null) {
            this.f2499b.run();
        }
    }
}
