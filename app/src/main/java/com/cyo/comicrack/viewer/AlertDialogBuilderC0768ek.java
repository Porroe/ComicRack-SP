package com.cyo.comicrack.viewer;

import android.content.Context;
import com.cyo.common.view.AbstractAlertDialogBuilderC1119am;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ek */
/* loaded from: classes.dex */
final class AlertDialogBuilderC0768ek extends AbstractAlertDialogBuilderC1119am {

    /* renamed from: a */
    final /* synthetic */ DialogInterfaceOnClickListenerC0767ej f2408a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertDialogBuilderC0768ek(DialogInterfaceOnClickListenerC0767ej dialogInterfaceOnClickListenerC0767ej, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3);
        this.f2408a = dialogInterfaceOnClickListenerC0767ej;
    }

    @Override // com.cyo.common.view.AbstractAlertDialogBuilderC1119am
    /* renamed from: a */
    public final boolean mo1820a(String str) {
        LibraryActivity libraryActivity = this.f2408a.f2407a;
        LibraryActivity.m1874p().m1439c(str);
        this.f2408a.f2407a.m1879s();
        return true;
    }
}
