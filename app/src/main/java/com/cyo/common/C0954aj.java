package com.cyo.common;

import android.widget.TextView;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.aj */
/* loaded from: classes.dex */
final class C0954aj implements InterfaceC0991bb {

    /* renamed from: a */
    int f2843a = Integer.MIN_VALUE;

    /* renamed from: b */
    int f2844b = Integer.MAX_VALUE;

    /* renamed from: c */
    final /* synthetic */ C0953ai f2845c;

    /* renamed from: d */
    private final /* synthetic */ TextView f2846d;

    C0954aj(C0953ai c0953ai, TextView textView) {
        this.f2845c = c0953ai;
        this.f2846d = textView;
    }

    @Override // com.cyo.common.InterfaceC0991bb
    /* renamed from: a */
    public final void mo2040a(int i) {
        this.f2846d.setText(Integer.toString(C0950af.m1990a(i, this.f2843a, this.f2844b)));
    }

    @Override // com.cyo.common.InterfaceC0991bb
    /* renamed from: b */
    public final void mo2041b(int i) {
        this.f2843a = 1;
        this.f2844b = i;
    }

    @Override // com.cyo.common.InterfaceC0991bb
    /* renamed from: a */
    public final int mo2039a() {
        try {
            this.f2846d.clearFocus();
            return C0950af.m1990a(Integer.parseInt(this.f2846d.getText().toString()), this.f2843a, this.f2844b);
        } catch (Exception e) {
            return 0;
        }
    }
}
