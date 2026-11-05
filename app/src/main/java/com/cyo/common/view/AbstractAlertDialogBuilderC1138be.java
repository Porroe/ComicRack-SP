package com.cyo.common.view;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.widget.EditText;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.be */
/* loaded from: classes.dex */
public abstract class AbstractAlertDialogBuilderC1138be extends AlertDialog.Builder implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final EditText f3616a;

    /* renamed from: a */
    public abstract boolean mo1851a(String str);

    private AbstractAlertDialogBuilderC1138be(Context context, String str, String str2, String str3) {
        super(context);
        setTitle(str);
        setMessage(str2);
        this.f3616a = new EditText(context);
        this.f3616a.setSingleLine();
        this.f3616a.setSelectAllOnFocus(true);
        if (str3 != null) {
            this.f3616a.setText(str3);
        }
        setView(this.f3616a);
        setPositiveButton(R.string.ok, this);
        setNegativeButton(R.string.cancel, this);
        setOnKeyListener(new DialogInterfaceOnKeyListenerC1139bf(this));
    }

    public AbstractAlertDialogBuilderC1138be(Context context, int i, String str, String str2) {
        this(context, context.getString(i), str, str2);
    }

    public AbstractAlertDialogBuilderC1138be(Context context, int i, int i2, String str) {
        this(context, i, context.getString(i2), str);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            if (mo1851a(this.f3616a.getText().toString())) {
                dialogInterface.dismiss();
                return;
            }
            return;
        }
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    public final AbstractAlertDialogBuilderC1138be m2413a() {
        this.f3616a.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        return this;
    }
}
