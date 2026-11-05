package com.cyo.common.view;

import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.ba */
/* loaded from: classes.dex */
final class DialogInterfaceOnMultiChoiceClickListenerC1134ba implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    final /* synthetic */ ListPreferenceMultiSelect f3602a;

    DialogInterfaceOnMultiChoiceClickListenerC1134ba(ListPreferenceMultiSelect listPreferenceMultiSelect) {
        this.f3602a = listPreferenceMultiSelect;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        if (ListPreferenceMultiSelect.m2382a(this.f3602a, i)) {
            ListPreferenceMultiSelect.m2381a(this.f3602a, dialogInterface, z);
        }
        ListPreferenceMultiSelect.m2383a(this.f3602a)[i] = z;
    }
}
