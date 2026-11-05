package com.cyo.common.p026c.p027a;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.a.a */
/* loaded from: classes.dex */
public final class C1018a {

    /* renamed from: a */
    private static final int[] f3008a = new int[256];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                if ((i2 & 1) != 0) {
                    i2 = (i2 >>> 1) ^ (-306674912);
                } else {
                    i2 >>>= 1;
                }
            }
            f3008a[i] = i2;
        }
    }

    /* renamed from: a */
    public static int m2134a(int i, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(bArr.length - i2, i3);
        for (int i4 = 0; i4 < iMin; i4++) {
            i = f3008a[(bArr[i2 + i4] ^ i) & 255] ^ (i >>> 8);
        }
        return i;
    }

    /* renamed from: a */
    public static short m2135a(short s, byte[] bArr, int i) {
        int iMin = Math.min(bArr.length, i);
        for (int i2 = 0; i2 < iMin; i2++) {
            short s2 = (short) (((short) (((short) (bArr[i2] & 255)) + s)) & (-1));
            s = (short) (((s2 >>> 15) | (s2 << 1)) & (-1));
        }
        return s;
    }
}
