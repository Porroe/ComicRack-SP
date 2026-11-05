package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.InterfaceC0583as;
import com.cyo.comicrack.p019a.InterfaceC0634l;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.bs */
/* loaded from: classes.dex */
final class C0695bs implements InterfaceC0728cy {

    /* renamed from: a */
    final /* synthetic */ C0681be f2211a;

    C0695bs(C0681be c0681be) {
        this.f2211a = c0681be;
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0728cy
    /* renamed from: a */
    public final void mo1737a(C0725cv c0725cv) {
        InterfaceC0583as interfaceC0583asX = this.f2211a.m1831X();
        if (interfaceC0583asX instanceof InterfaceC0634l) {
            InterfaceC0634l interfaceC0634l = (InterfaceC0634l) interfaceC0583asX;
            if (interfaceC0634l.mo1249a() >= 0) {
                int iMo1249a = interfaceC0634l.mo1249a();
                boolean zMo1251b = interfaceC0634l.mo1251b();
                for (int i = 0; i < c0725cv.f2269c.length; i++) {
                    C0726cw c0726cwM1748a = c0725cv.m1748a(i);
                    c0726cwM1748a.f2272c = iMo1249a;
                    c0726cwM1748a.f2270a = zMo1251b;
                }
            }
        }
    }
}
