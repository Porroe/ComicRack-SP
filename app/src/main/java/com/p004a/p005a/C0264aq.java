package com.p004a.p005a;

import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.a.a.aq */
/* loaded from: classes.dex */
public final class C0264aq {

    /* renamed from: a */
    private static final char[] f674a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    /* renamed from: b */
    private static final char[] f675b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();

    /* renamed from: c */
    private static final byte[] f676c = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* renamed from: d */
    private static final byte[] f677d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* renamed from: a */
    public static String m617a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = f675b;
        int i = ((length + 2) / 3) * 4;
        char[] cArr2 = new char[i + (i / Integer.MAX_VALUE)];
        int i2 = length - 2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < i2) {
            int i6 = ((bArr[i5 + 0] << 24) >>> 8) | ((bArr[(i5 + 1) + 0] << 24) >>> 16) | ((bArr[(i5 + 2) + 0] << 24) >>> 24);
            cArr2[i4] = cArr[i6 >>> 18];
            cArr2[i4 + 1] = cArr[(i6 >>> 12) & 63];
            cArr2[i4 + 2] = cArr[(i6 >>> 6) & 63];
            cArr2[i4 + 3] = cArr[i6 & 63];
            int i7 = i3 + 4;
            if (i7 == Integer.MAX_VALUE) {
                cArr2[i4 + 4] = '\n';
                i4++;
                i7 = 0;
            }
            i5 += 3;
            i4 += 4;
            i3 = i7;
        }
        if (i5 < length) {
            int i8 = i5 + 0;
            int i9 = length - i5;
            int i10 = (i9 > 2 ? (bArr[i8 + 2] << 24) >>> 24 : 0) | (i9 > 0 ? (bArr[i8] << 24) >>> 8 : 0) | (i9 > 1 ? (bArr[i8 + 1] << 24) >>> 16 : 0);
            switch (i9) {
                case TwitterResponse.READ /* 1 */:
                    cArr2[i4] = cArr[i10 >>> 18];
                    cArr2[i4 + 1] = cArr[(i10 >>> 12) & 63];
                    cArr2[i4 + 2] = '=';
                    cArr2[i4 + 3] = '=';
                    break;
                case TwitterResponse.READ_WRITE /* 2 */:
                    cArr2[i4] = cArr[i10 >>> 18];
                    cArr2[i4 + 1] = cArr[(i10 >>> 12) & 63];
                    cArr2[i4 + 2] = cArr[(i10 >>> 6) & 63];
                    cArr2[i4 + 3] = '=';
                    break;
                case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                    cArr2[i4] = cArr[i10 >>> 18];
                    cArr2[i4 + 1] = cArr[(i10 >>> 12) & 63];
                    cArr2[i4 + 2] = cArr[(i10 >>> 6) & 63];
                    cArr2[i4 + 3] = cArr[i10 & 63];
                    break;
            }
            if (i3 + 4 == Integer.MAX_VALUE) {
                cArr2[i4 + 4] = '\n';
            }
        }
        int length2 = cArr2.length;
        while (length2 > 0 && cArr2[length2 - 1] == '=') {
            length2--;
        }
        return new String(cArr2, 0, length2);
    }

    /* renamed from: a */
    private static int m616a(char[] cArr, byte[] bArr, int i, byte[] bArr2) {
        if (cArr[2] == '=') {
            bArr[i] = (byte) ((((bArr2[cArr[0]] << 24) >>> 6) | ((bArr2[cArr[1]] << 24) >>> 12)) >>> 16);
            return 1;
        }
        if (cArr[3] == '=') {
            int i2 = ((bArr2[cArr[1]] << 24) >>> 12) | ((bArr2[cArr[0]] << 24) >>> 6) | ((bArr2[cArr[2]] << 24) >>> 18);
            bArr[i] = (byte) (i2 >>> 16);
            bArr[i + 1] = (byte) (i2 >>> 8);
            return 2;
        }
        int i3 = ((bArr2[cArr[1]] << 24) >>> 12) | ((bArr2[cArr[0]] << 24) >>> 6) | ((bArr2[cArr[2]] << 24) >>> 18) | ((bArr2[cArr[3]] << 24) >>> 24);
        bArr[i] = (byte) (i3 >> 16);
        bArr[i + 1] = (byte) (i3 >> 8);
        bArr[i + 2] = (byte) i3;
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m618a(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p005a.C0264aq.m618a(java.lang.String):byte[]");
    }
}
