package com.cyo.common.p022a;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.l */
/* loaded from: classes.dex */
final class C0941l implements InterfaceC0943n {

    /* renamed from: a */
    private final /* synthetic */ InterfaceC0942m f2829a;

    /* renamed from: b */
    private final /* synthetic */ int f2830b = 10;

    /* renamed from: c */
    private final /* synthetic */ int f2831c;

    C0941l(InterfaceC0942m interfaceC0942m, int i) {
        this.f2829a = interfaceC0942m;
        this.f2831c = i;
    }

    @Override // com.cyo.common.p022a.InterfaceC0943n
    /* renamed from: a */
    public final int mo1978a() {
        return (this.f2829a.mo1274c() / this.f2830b) - 1;
    }

    @Override // com.cyo.common.p022a.InterfaceC0943n
    /* renamed from: a */
    public final int mo1979a(int i) {
        return this.f2829a.mo1268a(this.f2831c, this.f2830b + (this.f2830b * i));
    }
}
