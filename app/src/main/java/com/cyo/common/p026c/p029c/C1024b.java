package com.cyo.common.p026c.p029c;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.c.b */
/* loaded from: classes.dex */
public final class C1024b {
    /* renamed from: a */
    public static final short m2142a(byte[] bArr, int i) {
        return (short) (((short) (((short) ((bArr[i + 1] & 255) + 0)) << 8)) + (bArr[i] & 255));
    }

    /* renamed from: b */
    public static final int m2145b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: a */
    public static final void m2144a(byte[] bArr, int i, short s) {
        bArr[i + 1] = (byte) (s >>> 8);
        bArr[i] = (byte) (s & 255);
    }

    /* renamed from: a */
    public static final void m2143a(byte[] bArr, int i, int i2) {
        bArr[i + 3] = (byte) (i2 >>> 24);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i] = (byte) (i2 & 255);
    }
}
