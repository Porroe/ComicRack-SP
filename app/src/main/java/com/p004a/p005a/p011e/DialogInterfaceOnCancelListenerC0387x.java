package com.p004a.p005a.p011e;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.x */
/* loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC0387x implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f1078a;

    DialogInterfaceOnCancelListenerC0387x(JsPromptResult jsPromptResult) {
        this.f1078a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f1078a.cancel();
    }
}
