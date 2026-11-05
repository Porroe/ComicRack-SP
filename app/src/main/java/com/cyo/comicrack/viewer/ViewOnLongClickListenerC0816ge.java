package com.cyo.comicrack.viewer;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ge */
/* loaded from: classes.dex */
final class ViewOnLongClickListenerC0816ge implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2506a;

    /* renamed from: b */
    private final /* synthetic */ boolean f2507b = false;

    /* renamed from: c */
    private final /* synthetic */ EnumC0860hv f2508c;

    ViewOnLongClickListenerC0816ge(ReaderActivity readerActivity, EnumC0860hv enumC0860hv) {
        this.f2506a = readerActivity;
        this.f2508c = enumC0860hv;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f2507b) {
            ReaderActivity.m1604k(this.f2506a);
        }
        ReaderActivity.m1558a(this.f2506a, this.f2508c, EnumC0861hw.Button);
        return true;
    }
}
