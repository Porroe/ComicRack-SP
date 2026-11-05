package com.cyo.common.view;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cyo.comicrack.viewer.C0804ft;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.am */
/* loaded from: classes.dex */
public abstract class AbstractAlertDialogBuilderC1119am extends AlertDialog.Builder implements DialogInterface.OnClickListener, InterfaceC1132az {

    /* renamed from: a */
    private C1120an f3570a;

    /* renamed from: b */
    private AlertDialog f3571b;

    /* renamed from: a */
    public abstract boolean mo1820a(String str);

    public AbstractAlertDialogBuilderC1119am(Context context, String str, String str2, String str3) {
        super(context);
        setTitle(str);
        setPositiveButton(R.string.ok, this);
        setNegativeButton(R.string.cancel, this);
        View viewInflate = LayoutInflater.from(context).inflate(C0804ft.folder_browser, (ViewGroup) null, false);
        this.f3570a = new C1120an(viewInflate, str2, str3, this);
        setView(viewInflate);
    }

    @Override // android.app.AlertDialog.Builder
    public AlertDialog create() {
        AlertDialog alertDialogCreate = super.create();
        this.f3571b = alertDialogCreate;
        return alertDialogCreate;
    }

    @Override // com.cyo.common.view.InterfaceC1132az
    /* renamed from: a */
    public final void mo2378a(boolean z) {
        if (this.f3571b != null) {
            this.f3571b.getButton(-1).setEnabled(z);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            mo1820a(this.f3570a.f3576e.getAbsolutePath());
            dialogInterface.dismiss();
        } else {
            dialogInterface.dismiss();
        }
    }
}
