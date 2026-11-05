package com.p004a.p005a;

/* compiled from: DontLook */
/* renamed from: com.a.a.ar */
/* loaded from: classes.dex */
public final class C0265ar {

    /* renamed from: a */
    final byte[] f678a = new byte[256];

    /* renamed from: b */
    int f679b;

    /* renamed from: c */
    int f680c;

    public C0265ar(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f678a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            i2 = (i2 + this.f678a[i3] + bArr[i3 % bArr.length]) & 255;
            byte b = this.f678a[i3];
            this.f678a[i3] = this.f678a[i2];
            this.f678a[i2] = b;
        }
        this.f679b = 0;
        this.f680c = 0;
    }

    /* renamed from: a */
    public final void m619a(byte[] bArr) {
        int i = this.f679b;
        int i2 = this.f680c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f678a[i]) & 255;
            byte b = this.f678a[i];
            this.f678a[i] = this.f678a[i2];
            this.f678a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f678a[(this.f678a[i] + this.f678a[i2]) & 255]);
        }
        this.f679b = i;
        this.f680c = i2;
    }
}
