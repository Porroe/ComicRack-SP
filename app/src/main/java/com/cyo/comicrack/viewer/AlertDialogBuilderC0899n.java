package com.cyo.comicrack.viewer;

import android.content.Context;
import com.cyo.comicrack.p019a.p020a.C0537ce;
import com.cyo.common.C0998bi;
import com.cyo.common.view.AbstractAlertDialogBuilderC1138be;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.n */
/* loaded from: classes.dex */
final class AlertDialogBuilderC0899n extends AbstractAlertDialogBuilderC1138be {

    /* renamed from: a */
    final /* synthetic */ ViewOnClickListenerC0898m f2718a;

    /* renamed from: b */
    private final /* synthetic */ ActivityC0881ip f2719b;

    /* renamed from: c */
    private final /* synthetic */ C0537ce f2720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertDialogBuilderC0899n(ViewOnClickListenerC0898m viewOnClickListenerC0898m, Context context, int i, String str, String str2, ActivityC0881ip activityC0881ip, C0537ce c0537ce) {
        super(context, i, str, str2);
        this.f2718a = viewOnClickListenerC0898m;
        this.f2719b = activityC0881ip;
        this.f2720c = c0537ce;
    }

    @Override // com.cyo.common.view.AbstractAlertDialogBuilderC1138be
    /* renamed from: a */
    public final boolean mo1851a(String str) {
        if (C0998bi.m2081a(str)) {
            return false;
        }
        ActivityC0881ip activityC0881ip = this.f2719b;
        ActivityC0881ip.m960a(C0896k.m1882a(), C0896k.m1889c(), null, 0);
        this.f2720c.f1667e = str;
        C0896k.m1886b(ViewOnClickListenerC0898m.m1895a(this.f2718a)).f1580l = true;
        C0896k.m1886b(ViewOnClickListenerC0898m.m1895a(this.f2718a)).f1588t = true;
        C0896k.m1893e(ViewOnClickListenerC0898m.m1895a(this.f2718a));
        C0896k.m1890c(ViewOnClickListenerC0898m.m1895a(this.f2718a));
        return true;
    }
}
