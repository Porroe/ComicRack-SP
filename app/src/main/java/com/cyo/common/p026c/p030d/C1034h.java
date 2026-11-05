package com.cyo.common.p026c.p030d;

import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.h */
/* loaded from: classes.dex */
public final class C1034h {
    /* renamed from: a */
    public static String m2158a(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = bArr[i] & 255;
        StringBuffer stringBuffer = new StringBuffer();
        int i7 = 0;
        int i8 = i + 1;
        int i9 = 0;
        while (i8 < bArr.length) {
            if (i5 == 0) {
                i3 = bArr[i8] & 255;
                i4 = i8 + 1;
                i2 = 8;
            } else {
                i2 = i5;
                i3 = i9;
                i4 = i8;
            }
            switch (i3 >> 6) {
                case TwitterResponse.NONE /* 0 */:
                    i8 = i4 + 1;
                    stringBuffer.append((char) (bArr[i4] & 255));
                    i7++;
                    break;
                case TwitterResponse.READ /* 1 */:
                    i8 = i4 + 1;
                    stringBuffer.append((char) ((bArr[i4] & 255) + (i6 << 8)));
                    i7++;
                    break;
                case TwitterResponse.READ_WRITE /* 2 */:
                    stringBuffer.append((char) ((bArr[i4] & 255) + ((bArr[i4 + 1] & 255) << 8)));
                    i7++;
                    i8 = i4 + 2;
                    break;
                case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                    int i10 = i4 + 1;
                    int i11 = bArr[i4] & 255;
                    if ((i11 & 128) != 0) {
                        i8 = i10 + 1;
                        int i12 = bArr[i10] & 255;
                        int i13 = (i11 & 127) + 2;
                        while (i13 > 0 && i7 < bArr.length) {
                            stringBuffer.append((char) ((((bArr[i7] & 255) + i12) & 255) + (i6 << 8)));
                            i13--;
                            i7++;
                        }
                        break;
                    } else {
                        int i14 = i11 + 2;
                        while (i14 > 0 && i7 < bArr.length) {
                            stringBuffer.append((char) (bArr[i7] & 255));
                            i14--;
                            i7++;
                        }
                        i8 = i10;
                        break;
                    }
                default:
                    i8 = i4;
                    break;
            }
            i9 = (i3 << 2) & 255;
            i5 = i2 - 2;
        }
        return stringBuffer.toString();
    }
}
