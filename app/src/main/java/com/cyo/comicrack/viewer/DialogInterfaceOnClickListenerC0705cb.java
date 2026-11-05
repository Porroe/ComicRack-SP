package com.cyo.comicrack.viewer;

import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p020a.C0505b;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cb */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0705cb implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0681be f2223a;

    /* renamed from: b */
    private final /* synthetic */ C0505b f2224b;

    /* renamed from: c */
    private final /* synthetic */ EditText f2225c;

    /* renamed from: d */
    private final /* synthetic */ CheckBox f2226d;

    DialogInterfaceOnClickListenerC0705cb(C0681be c0681be, C0505b c0505b, EditText editText, CheckBox checkBox) {
        this.f2223a = c0681be;
        this.f2224b = c0505b;
        this.f2225c = editText;
        this.f2226d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (!C0628f.m1360a(this.f2224b, this.f2225c.getText().toString().trim(), this.f2226d.isChecked())) {
            Toast.makeText(this.f2223a.m55i(), C0806fv.failed_to_rename_ecomic, 1).show();
        } else {
            this.f2223a.m1835aa();
        }
    }
}
