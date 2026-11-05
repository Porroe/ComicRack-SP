package com.cyo.common.p022a;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.k */
/* loaded from: classes.dex */
final class C0940k implements InterfaceC0943n {

    /* renamed from: a */
    private final /* synthetic */ InterfaceC0942m f2826a;

    /* renamed from: b */
    private final /* synthetic */ int f2827b = 10;

    /* renamed from: c */
    private final /* synthetic */ int f2828c;

    C0940k(InterfaceC0942m interfaceC0942m, int i) {
        this.f2826a = interfaceC0942m;
        this.f2828c = i;
    }

    @Override // com.cyo.common.p022a.InterfaceC0943n
    /* renamed from: a */
    public final int mo1978a() {
        return (this.f2826a.mo1273b() / this.f2827b) - 1;
    }

    @Override // com.cyo.common.p022a.InterfaceC0943n
    /* renamed from: a */
    public final int mo1979a(int i) {
        return this.f2826a.mo1268a(this.f2827b + (this.f2827b * i), this.f2828c);
    }
}
