package com.p004a.p005a.p011e;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.v */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0385v implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f1076a;

    DialogInterfaceOnClickListenerC0385v(JsResult jsResult) {
        this.f1076a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1076a.cancel();
    }
}
