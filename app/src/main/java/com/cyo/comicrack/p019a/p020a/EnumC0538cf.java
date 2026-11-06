package com.cyo.comicrack.p019a.p020a;


/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.cf */
/* loaded from: classes.dex */
public enum EnumC0538cf {
    Default,
    Near,
    Far;


    /* renamed from: d */
    private static /* synthetic */ int[] f1677d;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0538cf[] valuesCustom() {
        EnumC0538cf[] enumC0538cfArrValuesCustom = values();
        int length = enumC0538cfArrValuesCustom.length;
        EnumC0538cf[] enumC0538cfArr = new EnumC0538cf[length];
        System.arraycopy(enumC0538cfArrValuesCustom, 0, enumC0538cfArr, 0, length);
        return enumC0538cfArr;
    }

    /* renamed from: b */
    private static /* synthetic */ int[] m1195b() {
        int[] iArr = f1677d;
        if (iArr == null) {
            iArr = new int[valuesCustom().length];
            try {
                iArr[Default.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Far.ordinal()] = 3;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Near.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            f1677d = iArr;
        }
        return iArr;
    }

    /* renamed from: a */
    public static EnumC0538cf m1194a(byte b) {
        switch (b) {
            case 1:
                return Near;
            case 2:
                return Far;
            default:
                return Default;
        }
    }

    /* renamed from: a */
    public final byte m1196a() {
        switch (m1195b()[ordinal()]) {
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            default:
                return (byte) 0;
        }
    }
}
