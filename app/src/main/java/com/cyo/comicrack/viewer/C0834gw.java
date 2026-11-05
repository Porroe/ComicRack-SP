package com.cyo.comicrack.viewer;

import com.cyo.common.p024b.p025a.InterfaceC0981i;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gw */
/* loaded from: classes.dex */
final class C0834gw implements InterfaceC0981i {

    /* renamed from: a */
    final /* synthetic */ AlertDialogBuilderC0833gv f2539a;

    /* renamed from: b */
    private final /* synthetic */ String f2540b;

    C0834gw(AlertDialogBuilderC0833gv alertDialogBuilderC0833gv, String str) {
        this.f2539a = alertDialogBuilderC0833gv;
        this.f2540b = str;
    }

    @Override // com.cyo.common.p024b.p025a.InterfaceC0981i
    /* renamed from: a */
    public final String mo1744a() {
        return ReaderActivity.m1596f(DialogInterfaceOnClickListenerC0832gu.m1849a(AlertDialogBuilderC0833gv.m1850a(this.f2539a))).mo1298a().m1120a(this.f2540b, 0.0f);
    }
}
