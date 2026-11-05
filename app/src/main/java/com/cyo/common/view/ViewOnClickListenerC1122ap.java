package com.cyo.common.view;

import android.view.View;
import com.cyo.comicrack.viewer.C0806fv;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.ap */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1122ap implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1120an f3587a;

    ViewOnClickListenerC1122ap(C1120an c1120an) {
        this.f3587a = c1120an;
    }

    /* renamed from: a */
    static /* synthetic */ C1120an m2408a(ViewOnClickListenerC1122ap viewOnClickListenerC1122ap) {
        return viewOnClickListenerC1122ap.f3587a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new AlertDialogBuilderC1123aq(this, this.f3587a.f3572a.getContext(), C0806fv.create_folder, C0806fv.name_of_the_new_folder).show();
    }
}
