package com.cyo.common;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.ac */
/* loaded from: classes.dex */
final class C0947ac implements InterfaceC0948ad {

    /* renamed from: a */
    final /* synthetic */ C0945aa f2837a;

    /* renamed from: b */
    private final /* synthetic */ Object f2838b;

    C0947ac(C0945aa c0945aa, Object obj) {
        this.f2837a = c0945aa;
        this.f2838b = obj;
    }

    @Override // com.cyo.common.InterfaceC0948ad
    /* renamed from: a */
    public final boolean mo1248a(Object obj) {
        if (obj instanceof C0945aa) {
            C0945aa c0945aa = (C0945aa) obj;
            if (c0945aa.m1980a((InterfaceC0948ad) new C0946ab(c0945aa, this.f2838b), false) != null) {
                return true;
            }
        }
        return false;
    }
}
