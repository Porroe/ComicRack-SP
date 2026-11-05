package com.cyo.comicrack.viewer;

import com.p004a.p005a.InterfaceC0354d;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hc */
/* loaded from: classes.dex */
final class C0841hc implements InterfaceC0354d {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2547a;

    /* renamed from: b */
    private final /* synthetic */ int f2548b;

    /* renamed from: c */
    private final /* synthetic */ Runnable f2549c;

    C0841hc(ReaderActivity readerActivity, int i, Runnable runnable) {
        this.f2547a = readerActivity;
        this.f2548b = i;
        this.f2549c = runnable;
    }

    @Override // com.p004a.p005a.InterfaceC0354d
    /* renamed from: a */
    public final void mo857a() {
    }

    @Override // com.p004a.p005a.InterfaceC0354d
    /* renamed from: c */
    public final void mo859c() {
    }

    @Override // com.p004a.p005a.InterfaceC0354d
    /* renamed from: b */
    public final void mo858b() {
        ReaderActivity.m1512A(this.f2547a).f2640e = this.f2548b;
        if (this.f2549c != null) {
            this.f2549c.run();
        }
    }
}
