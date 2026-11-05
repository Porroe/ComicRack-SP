package com.cyo.comicrack.viewer;

import android.content.DialogInterface;
import com.cyo.common.InterfaceC0991bb;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gj */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0821gj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2513a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC0991bb f2514b;

    DialogInterfaceOnClickListenerC0821gj(ReaderActivity readerActivity, InterfaceC0991bb interfaceC0991bb) {
        this.f2513a = readerActivity;
        this.f2514b = interfaceC0991bb;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ReaderActivity.m1574a(this.f2513a, this.f2514b.mo2039a() - 1, true);
    }
}
