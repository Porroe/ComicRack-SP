package com.cyo.comicrack.viewer;

import android.widget.SeekBar;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hm */
/* loaded from: classes.dex */
final class C0851hm implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2566a;

    C0851hm(ReaderActivity readerActivity) {
        this.f2566a = readerActivity;
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
            ReaderActivity.m1580b(this.f2566a).setColorBrightness((i / 100.0f) - 1.0f);
        }
    }
}
