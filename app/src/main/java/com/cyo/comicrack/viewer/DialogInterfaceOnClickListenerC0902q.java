package com.cyo.comicrack.viewer;

import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.q */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0902q implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0896k f2723a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC0905t f2724b;

    /* renamed from: c */
    private final /* synthetic */ ActivityC0881ip f2725c;

    DialogInterfaceOnClickListenerC0902q(C0896k c0896k, InterfaceC0905t interfaceC0905t, ActivityC0881ip activityC0881ip) {
        this.f2723a = c0896k;
        this.f2724b = interfaceC0905t;
        this.f2725c = activityC0881ip;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (C0896k.m1891d(this.f2723a) >= 0 && C0896k.m1891d(this.f2723a) < C0896k.m1886b(this.f2723a).m1139e() && this.f2724b != null) {
            ActivityC0881ip activityC0881ip = this.f2725c;
            ActivityC0881ip.m960a(C0896k.m1882a(), C0896k.m1892d(), null, 0);
            this.f2724b.mo1847a(C0896k.m1891d(this.f2723a));
        }
    }
}
