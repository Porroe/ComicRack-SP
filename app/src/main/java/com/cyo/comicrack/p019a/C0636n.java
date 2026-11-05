package com.cyo.comicrack.p019a;

import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.common.InterfaceC0948ad;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.n */
/* loaded from: classes.dex */
final class C0636n implements InterfaceC0948ad {

    /* renamed from: a */
    final /* synthetic */ C0635m f1937a;

    /* renamed from: b */
    private final /* synthetic */ C0505b f1938b;

    C0636n(C0635m c0635m, C0505b c0505b) {
        this.f1937a = c0635m;
        this.f1938b = c0505b;
    }

    @Override // com.cyo.common.InterfaceC0948ad
    /* renamed from: a */
    public final /* synthetic */ boolean mo1248a(Object obj) {
        C0575ak c0575ak;
        int iM1241b;
        InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) obj;
        if (!(interfaceC0571ag instanceof C0575ak) || (iM1241b = (c0575ak = (C0575ak) interfaceC0571ag).m1241b(this.f1938b.f1570b)) == -1) {
            return false;
        }
        c0575ak.m1985e(iM1241b);
        return false;
    }
}
