package com.cyo.comicrack.p019a.p021b;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.m */
/* loaded from: classes.dex */
final class C0611m implements InterfaceC0612n {

    /* renamed from: a */
    private final /* synthetic */ byte[] f1826a;

    C0611m(byte[] bArr) {
        this.f1826a = bArr;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0612n
    /* renamed from: a */
    public final InputStream mo1321a() {
        return new ByteArrayInputStream(this.f1826a);
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0612n
    /* renamed from: b */
    public final void mo1322b() {
    }
}
