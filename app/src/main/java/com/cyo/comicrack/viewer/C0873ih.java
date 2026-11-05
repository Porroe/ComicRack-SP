package com.cyo.comicrack.viewer;

import com.p004a.p012b.p016b.p017a.InterfaceC0468m;
import twitter4j.MediaEntity;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ih */
/* loaded from: classes.dex */
final class C0873ih implements InterfaceC0468m {

    /* renamed from: a */
    final /* synthetic */ SplashActivity f2651a;

    C0873ih(SplashActivity splashActivity) {
        this.f2651a = splashActivity;
    }

    @Override // com.p004a.p012b.p016b.p017a.InterfaceC0468m
    /* renamed from: a */
    public final void mo1078a() {
        m1864d();
    }

    @Override // com.p004a.p012b.p016b.p017a.InterfaceC0468m
    /* renamed from: b */
    public final void mo1079b() {
        this.f2651a.setResult(MediaEntity.Size.CROP);
        m1864d();
    }

    @Override // com.p004a.p012b.p016b.p017a.InterfaceC0468m
    /* renamed from: c */
    public final void mo1080c() {
        mo1079b();
    }

    /* renamed from: d */
    private void m1864d() {
        SplashActivity.m1646h(this.f2651a);
        SplashActivity.m1643e(this.f2651a);
    }
}
