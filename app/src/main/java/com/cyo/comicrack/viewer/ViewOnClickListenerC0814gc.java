package com.cyo.comicrack.viewer;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gc */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0814gc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2502a;

    ViewOnClickListenerC0814gc(ReaderActivity readerActivity) {
        this.f2502a = readerActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ReaderActivity.m1580b(this.f2502a).setColorBrightness(0.0f);
        ReaderActivity.m1580b(this.f2502a).setColorSaturation(0.0f);
        ReaderActivity.m1580b(this.f2502a).setColorContrast(0.0f);
        ReaderActivity.m1603j(this.f2502a);
    }
}
