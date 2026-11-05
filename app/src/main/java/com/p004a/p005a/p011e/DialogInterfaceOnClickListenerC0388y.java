package com.p004a.p005a.p011e;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.y */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0388y implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f1079a;

    DialogInterfaceOnClickListenerC0388y(JsPromptResult jsPromptResult) {
        this.f1079a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1079a.cancel();
    }
}
