package com.cyo.common.p022a;


/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.i */
/* loaded from: classes.dex */
public enum EnumC0938i {
    None,
    Rotate90,
    Rotate180,
    Rotate270;


    /* renamed from: e */
    private static /* synthetic */ int[] f2823e;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0938i[] valuesCustom() {
        EnumC0938i[] enumC0938iArrValuesCustom = values();
        int length = enumC0938iArrValuesCustom.length;
        EnumC0938i[] enumC0938iArr = new EnumC0938i[length];
        System.arraycopy(enumC0938iArrValuesCustom, 0, enumC0938iArr, 0, length);
        return enumC0938iArr;
    }

    /* renamed from: b */
    private static /* synthetic */ int[] m1969b() {
        int[] iArr = f2823e;
        if (iArr == null) {
            iArr = new int[valuesCustom().length];
            try {
                iArr[None.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Rotate180.ordinal()] = 3;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Rotate270.ordinal()] = 4;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Rotate90.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            f2823e = iArr;
        }
        return iArr;
    }

    /* renamed from: a */
    public static EnumC0938i m1968a(byte b) {
        switch (b) {
            case 1:
                return Rotate90;
            case 2:
                return Rotate180;
            case 3:
                return Rotate270;
            default:
                return None;
        }
    }

    /* renamed from: a */
    public final byte m1970a() {
        switch (m1969b()[ordinal()]) {
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            default:
                return (byte) 0;
        }
    }
}
