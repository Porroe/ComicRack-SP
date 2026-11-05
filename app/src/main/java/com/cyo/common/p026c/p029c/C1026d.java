package com.cyo.common.p026c.p029c;
 
import java.io.IOException;

import java.io.InputStream;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.c.d */
/* loaded from: classes.dex */
public final class C1026d extends InputStream {

    /* renamed from: a */
    private InterfaceC1023a f3021a;

    /* renamed from: b */
    private long f3022b;

    /* renamed from: c */
    private final long f3023c;

    /* renamed from: d */
    private final long f3024d;

    public C1026d(InterfaceC1023a interfaceC1023a, long j, long j2) throws java.io.IOException {
        this.f3021a = interfaceC1023a;
        this.f3023c = j;
        this.f3022b = j;
        this.f3024d = j2;
        interfaceC1023a.mo2141a(this.f3022b);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f3022b == this.f3024d) {
            return -1;
        }
        int i = this.f3021a.read();
        this.f3022b++;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f3022b == this.f3024d) {
            return -1;
        }
        int i3 = this.f3021a.read(bArr, i, (int) Math.min(i2, this.f3024d - this.f3022b));
        this.f3022b += i3;
        return i3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
