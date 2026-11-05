package com.cyo.comicrack.p019a;

import com.cyo.comicrack.p019a.p020a.C0505b;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.i */
/* loaded from: classes.dex */
public final class C0631i implements InterfaceC0630h {

    /* renamed from: a */
    InterfaceC0630h f1904a;

    public C0631i(InterfaceC0630h interfaceC0630h) {
        this.f1904a = interfaceC0630h;
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0630h
    /* renamed from: a */
    public final int mo1374a(C0505b c0505b) {
        int iMo1374a = this.f1904a.mo1374a(c0505b);
        if ((iMo1374a & 1) != 0) {
            return iMo1374a | 2;
        }
        return iMo1374a;
    }
}
