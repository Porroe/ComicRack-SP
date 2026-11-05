package com.cyo.common.view;

import android.content.DialogInterface;
import android.widget.Toast;
import com.cyo.comicrack.viewer.C0806fv;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.as */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1125as implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnClickListenerC1124ar f3590a;

    DialogInterfaceOnClickListenerC1125as(ViewOnClickListenerC1124ar viewOnClickListenerC1124ar) {
        this.f3590a = viewOnClickListenerC1124ar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String parent = ViewOnClickListenerC1124ar.m2409a(this.f3590a).f3576e.getParent();
        if (C1120an.m2404a(ViewOnClickListenerC1124ar.m2409a(this.f3590a).f3576e)) {
            ViewOnClickListenerC1124ar.m2409a(this.f3590a).m2407a(parent);
        } else {
            Toast.makeText(ViewOnClickListenerC1124ar.m2409a(this.f3590a).f3572a.getContext(), C0806fv.failed_to_delete_folder, 0).show();
        }
    }
}
