package com.p004a.p005a.p011e;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.u */
/* loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC0384u implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f1075a;

    DialogInterfaceOnCancelListenerC0384u(JsResult jsResult) {
        this.f1075a = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f1075a.cancel();
    }
}
