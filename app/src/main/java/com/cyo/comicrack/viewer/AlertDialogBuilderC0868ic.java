package com.cyo.comicrack.viewer;

import android.content.Context;
import com.cyo.common.view.AbstractAlertDialogBuilderC1119am;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ic */
/* loaded from: classes.dex */
final class AlertDialogBuilderC0868ic extends AbstractAlertDialogBuilderC1119am {

    /* renamed from: a */
    final /* synthetic */ ViewOnClickListenerC0867ib f2643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertDialogBuilderC0868ic(ViewOnClickListenerC0867ib viewOnClickListenerC0867ib, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3);
        this.f2643a = viewOnClickListenerC0867ib;
    }

    @Override // com.cyo.common.view.AbstractAlertDialogBuilderC1119am
    /* renamed from: a */
    public final boolean mo1820a(String str) {
        ComicRackApplication.f1954i.m1439c(str);
        return true;
    }
}
