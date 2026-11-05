package com.cyo.comicrack.viewer;

import android.content.Context;
import com.cyo.common.view.AbstractAlertDialogBuilderC1138be;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gv */
/* loaded from: classes.dex */
final class AlertDialogBuilderC0833gv extends AbstractAlertDialogBuilderC1138be {

    /* renamed from: a */
    final /* synthetic */ DialogInterfaceOnClickListenerC0832gu f2538a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertDialogBuilderC0833gv(DialogInterfaceOnClickListenerC0832gu dialogInterfaceOnClickListenerC0832gu, Context context, int i, int i2, String str) {
        super(context, i, i2, str);
        this.f2538a = dialogInterfaceOnClickListenerC0832gu;
    }

    /* renamed from: a */
    static /* synthetic */ DialogInterfaceOnClickListenerC0832gu m1850a(AlertDialogBuilderC0833gv alertDialogBuilderC0833gv) {
        return alertDialogBuilderC0833gv.f2538a;
    }

    @Override // com.cyo.common.view.AbstractAlertDialogBuilderC1138be
    /* renamed from: a */
    public final boolean mo1851a(String str) {
        this.f2538a.f2536a.m1878r().edit().putString("tweet_snapshot_text", str);
        ReaderActivity readerActivity = this.f2538a.f2536a;
        ReaderActivity.m1874p().m1447n().m2070a(this.f2538a.f2536a, new C0834gw(this, str), ReaderActivity.m1613t(this.f2538a.f2536a));
        return true;
    }
}
