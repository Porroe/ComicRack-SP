package com.cyo.common.view;

import android.content.Context;
import android.widget.Toast;
import com.cyo.comicrack.viewer.C0806fv;
import com.cyo.common.C0998bi;
import java.io.File;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.aq */
/* loaded from: classes.dex */
final class AlertDialogBuilderC1123aq extends AbstractAlertDialogBuilderC1138be {

    /* renamed from: a */
    final /* synthetic */ ViewOnClickListenerC1122ap f3588a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertDialogBuilderC1123aq(ViewOnClickListenerC1122ap viewOnClickListenerC1122ap, Context context, int i, int i2) {
        super(context, i, i2, (String) null);
        this.f3588a = viewOnClickListenerC1122ap;
    }

    @Override // com.cyo.common.view.AbstractAlertDialogBuilderC1138be
    /* renamed from: a */
    public final boolean mo1851a(String str) {
        if (C0998bi.m2081a(str)) {
            return false;
        }
        File file = new File(String.valueOf(ViewOnClickListenerC1122ap.m2408a(this.f3588a).f3576e.getAbsolutePath()) + "/" + str);
        if (file.mkdir()) {
            ViewOnClickListenerC1122ap.m2408a(this.f3588a).m2407a(file.getAbsolutePath());
        } else {
            Toast.makeText(ViewOnClickListenerC1122ap.m2408a(this.f3588a).f3572a.getContext(), C0806fv.failed_to_create_folder, 0).show();
        }
        return true;
    }
}
