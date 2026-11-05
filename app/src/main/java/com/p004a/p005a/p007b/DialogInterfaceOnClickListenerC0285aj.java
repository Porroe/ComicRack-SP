package com.p004a.p005a.p007b;

import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.aj */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0285aj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0283ah f761a;

    DialogInterfaceOnClickListenerC0285aj(C0283ah c0283ah) {
        this.f761a = c0283ah;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        new Thread(new RunnableC0280ae(C0283ah.m700a(this.f761a).m779d(), C0283ah.m701b(this.f761a).getApplicationContext())).start();
    }
}
