package com.cyo.common;

import android.widget.NumberPicker;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.am */
/* loaded from: classes.dex */
final class C0957am implements InterfaceC0991bb {

    /* renamed from: a */
    final /* synthetic */ C0956al f2848a;

    /* renamed from: b */
    private final /* synthetic */ NumberPicker f2849b;

    C0957am(C0956al c0956al, NumberPicker numberPicker) {
        this.f2848a = c0956al;
        this.f2849b = numberPicker;
    }

    @Override // com.cyo.common.InterfaceC0991bb
    /* renamed from: a */
    public final void mo2040a(int i) {
        this.f2849b.setValue(i);
    }

    @Override // com.cyo.common.InterfaceC0991bb
    /* renamed from: b */
    public final void mo2041b(int i) {
        this.f2849b.setMinValue(1);
        this.f2849b.setMaxValue(i);
    }

    @Override // com.cyo.common.InterfaceC0991bb
    /* renamed from: a */
    public final int mo2039a() {
        this.f2849b.clearFocus();
        return this.f2849b.getValue();
    }
}
