package com.cyo.comicrack.p019a.p020a;


/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.cg */
/* loaded from: classes.dex */
public enum EnumC0539cg {
    FrontCover,
    InnerCover,
    Roundup,
    Story,
    Advertisement,
    Editorial,
    Letters,
    Preview,
    BackCover,
    Other,
    Deleted;


    /* renamed from: l */
    private static /* synthetic */ int[] f1690l;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0539cg[] valuesCustom() {
        EnumC0539cg[] enumC0539cgArrValuesCustom = values();
        int length = enumC0539cgArrValuesCustom.length;
        EnumC0539cg[] enumC0539cgArr = new EnumC0539cg[length];
        System.arraycopy(enumC0539cgArrValuesCustom, 0, enumC0539cgArr, 0, length);
        return enumC0539cgArr;
    }

    /* renamed from: b */
    private static /* synthetic */ int[] m1198b() {
        int[] iArr = f1690l;
        if (iArr == null) {
            iArr = new int[valuesCustom().length];
            try {
                iArr[Advertisement.ordinal()] = 5;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[BackCover.ordinal()] = 9;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Deleted.ordinal()] = 11;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Editorial.ordinal()] = 6;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[FrontCover.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[InnerCover.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[Letters.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Other.ordinal()] = 10;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Preview.ordinal()] = 8;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Roundup.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[Story.ordinal()] = 4;
            } catch (NoSuchFieldError e11) {
            }
            f1690l = iArr;
        }
        return iArr;
    }

    /* renamed from: a */
    public final byte m1199a() {
        switch (m1198b()[ordinal()]) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
            default:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 7;
            case 9:
                return (byte) 8;
            case 10:
                return (byte) 9;
            case 11:
                return (byte) 10;
        }
    }

    /* renamed from: a */
    public static EnumC0539cg m1197a(byte b) {
        switch (b) {
            case 0:
                return FrontCover;
            case 1:
                return InnerCover;
            case 2:
                return Roundup;
            case 3:
            default:
                return Story;
            case 4:
                return Advertisement;
            case 5:
                return Editorial;
            case 6:
                return Letters;
            case 7:
                return Preview;
            case 8:
                return BackCover;
            case 9:
                return Other;
            case 10:
                return Deleted;
        }
    }
}
