package com.cyo.comicrack.viewer;

import android.widget.SeekBar;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ga */
/* loaded from: classes.dex */
final class C0812ga implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2500a;

    C0812ga(ReaderActivity readerActivity) {
        this.f2500a = readerActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            ReaderActivity.m1580b(this.f2500a).setColorSaturation((i / 100.0f) - 1.0f);
        }
    }
}
