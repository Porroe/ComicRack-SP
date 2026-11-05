package com.cyo.common.p026c.p028b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.b.b */
/* loaded from: classes.dex */
public enum EnumC1021b {
    notImplementedYet,
    crcError,
    notRarArchive,
    badRarArchive,
    unkownError,
    headerNotInArchive,
    wrongHeaderType,
    ioError,
    rarEncryptedException;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1021b[] valuesCustom() {
        EnumC1021b[] enumC1021bArrValuesCustom = values();
        int length = enumC1021bArrValuesCustom.length;
        EnumC1021b[] enumC1021bArr = new EnumC1021b[length];
        System.arraycopy(enumC1021bArrValuesCustom, 0, enumC1021bArr, 0, length);
        return enumC1021bArr;
    }
}
