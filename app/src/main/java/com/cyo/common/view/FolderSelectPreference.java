package com.cyo.common.view;

import android.app.AlertDialog;
import android.content.Context;
import android.preference.DialogPreference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import com.cyo.comicrack.viewer.C0804ft;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class FolderSelectPreference extends DialogPreference implements InterfaceC1132az {

    /* renamed from: a */
    private C1120an f3515a;

    /* renamed from: b */
    private boolean f3516b;

    public FolderSelectPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setPersistent(false);
        setDialogLayoutResource(C0804ft.folder_browser);
        this.f3516b = attributeSet.getAttributeBooleanValue(null, "allowReadOnly", false);
    }

    public FolderSelectPreference(Context context) {
        super(context, null);
    }

    @Override // android.preference.DialogPreference
    protected void onBindDialogView(View view) {
        super.onBindDialogView(view);
        this.f3515a = new C1120an(view, PreferenceManager.getDefaultSharedPreferences(getContext()).getString(getKey(), ""), null, this, this.f3516b);
    }

    @Override // android.preference.DialogPreference
    protected void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            String absolutePath = this.f3515a.f3576e.getAbsolutePath();
            callChangeListener(absolutePath);
            PreferenceManager.getDefaultSharedPreferences(getContext()).edit().putString(getKey(), absolutePath).commit();
        }
    }

    @Override // com.cyo.common.view.InterfaceC1132az
    /* renamed from: a */
    public final void mo2378a(boolean z) {
        ((AlertDialog) getDialog()).getButton(-1).setEnabled(z);
    }
}
