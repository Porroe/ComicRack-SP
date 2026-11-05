package com.cyo.comicrack.viewer;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gd */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0815gd implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2503a;

    /* renamed from: b */
    private final /* synthetic */ boolean f2504b;

    /* renamed from: c */
    private final /* synthetic */ EnumC0860hv f2505c;

    ViewOnClickListenerC0815gd(ReaderActivity readerActivity, boolean z, EnumC0860hv enumC0860hv) {
        this.f2503a = readerActivity;
        this.f2504b = z;
        this.f2505c = enumC0860hv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f2504b) {
            ReaderActivity.m1604k(this.f2503a);
        }
        ReaderActivity.m1558a(this.f2503a, this.f2505c, EnumC0861hw.Button);
    }
}
