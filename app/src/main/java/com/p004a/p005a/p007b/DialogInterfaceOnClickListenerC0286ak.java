package com.p004a.p005a.p007b;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.ak */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0286ak implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f762a;

    /* renamed from: b */
    final /* synthetic */ C0283ah f763b;

    DialogInterfaceOnClickListenerC0286ak(C0283ah c0283ah, String str) {
        this.f763b = c0283ah;
        this.f762a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0283ah.m701b(this.f763b).startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f762a), "Share via"));
    }
}
