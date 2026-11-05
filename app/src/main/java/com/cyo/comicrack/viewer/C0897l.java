package com.cyo.comicrack.viewer;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.l */
/* loaded from: classes.dex */
final class C0897l implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C0896k f2715a;

    C0897l(C0896k c0896k) {
        this.f2715a = c0896k;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C0896k.m1890c(this.f2715a);
    }
}
