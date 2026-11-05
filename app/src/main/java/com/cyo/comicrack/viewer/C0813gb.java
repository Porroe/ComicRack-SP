package com.cyo.comicrack.viewer;

import android.widget.CompoundButton;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gb */
/* loaded from: classes.dex */
final class C0813gb implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2501a;

    C0813gb(ReaderActivity readerActivity) {
        this.f2501a = readerActivity;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ReaderActivity.m1580b(this.f2501a).setColorEnabled(z);
    }
}
