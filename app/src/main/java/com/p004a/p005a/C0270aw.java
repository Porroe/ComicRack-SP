package com.p004a.p005a;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: DontLook */
/* renamed from: com.a.a.aw */
/* loaded from: classes.dex */
public final class C0270aw {

    /* renamed from: a */
    final byte[] f687a;

    /* renamed from: b */
    final int f688b;

    /* renamed from: e */
    final OutputStream f691e;

    /* renamed from: d */
    int f690d = 0;

    /* renamed from: c */
    int f689c = 0;

    C0270aw(OutputStream outputStream, byte[] bArr) {
        this.f691e = outputStream;
        this.f687a = bArr;
        this.f688b = bArr.length;
    }

    /* renamed from: a */
    final void m622a() throws IOException {
        if (this.f691e == null) {
            throw new C0271ax();
        }
        this.f691e.write(this.f687a, 0, this.f689c);
        this.f689c = 0;
    }

    /* renamed from: a */
    public final void m623a(int i) throws IOException {
        byte b = (byte) i;
        if (this.f689c == this.f688b) {
            m622a();
        }
        byte[] bArr = this.f687a;
        int i2 = this.f689c;
        this.f689c = i2 + 1;
        bArr[i2] = b;
        this.f690d++;
    }

    /* renamed from: a */
    public final void m624a(int i, int i2) throws IOException {
        m625b(C0272ay.m626a(i, i2));
    }

    /* renamed from: b */
    public final void m625b(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m623a((i & 127) | 128);
            i >>>= 7;
        }
        m623a(i);
    }
}
