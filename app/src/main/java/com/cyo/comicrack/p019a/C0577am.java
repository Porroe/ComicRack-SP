package com.cyo.comicrack.p019a;

import com.cyo.common.InterfaceC0948ad;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.am */
/* loaded from: classes.dex */
final class C0577am implements InterfaceC0948ad {

    /* renamed from: a */
    final /* synthetic */ C0575ak f1754a;

    /* renamed from: b */
    private final /* synthetic */ boolean f1755b;

    /* renamed from: c */
    private final /* synthetic */ String f1756c;

    C0577am(C0575ak c0575ak, boolean z, String str) {
        this.f1754a = c0575ak;
        this.f1755b = z;
        this.f1756c = str;
    }

    @Override // com.cyo.common.InterfaceC0948ad
    /* renamed from: a */
    public final /* synthetic */ boolean mo1248a(Object obj) {
        InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) obj;
        return this.f1755b ? interfaceC0571ag.mo1209d().equalsIgnoreCase(this.f1756c) : interfaceC0571ag.mo1209d().equals(this.f1756c);
    }
}
