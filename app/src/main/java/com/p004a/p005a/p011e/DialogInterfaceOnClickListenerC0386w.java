package com.p004a.p005a.p011e;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.w */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0386w implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f1077a;

    DialogInterfaceOnClickListenerC0386w(JsResult jsResult) {
        this.f1077a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1077a.confirm();
    }
}
