package com.p004a.p005a.p011e;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.z */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0389z implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f1080a;

    /* renamed from: b */
    final /* synthetic */ EditText f1081b;

    DialogInterfaceOnClickListenerC0389z(JsPromptResult jsPromptResult, EditText editText) {
        this.f1080a = jsPromptResult;
        this.f1081b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1080a.confirm(this.f1081b.getText().toString());
    }
}
