package com.cyo.comicrack.viewer;

import android.content.DialogInterface;
import com.cyo.common.view.C1146bm;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.r */
/* loaded from: classes.dex */
final class DialogInterfaceOnDismissListenerC0903r implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C0896k f2726a;

    /* renamed from: b */
    private final /* synthetic */ ActivityC0881ip f2727b;

    DialogInterfaceOnDismissListenerC0903r(C0896k c0896k, ActivityC0881ip activityC0881ip) {
        this.f2726a = c0896k;
        this.f2727b = activityC0881ip;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C1146bm.m2419a(this.f2727b);
    }
}
