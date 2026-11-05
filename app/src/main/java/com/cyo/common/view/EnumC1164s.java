package com.cyo.common.view;

import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.s */
/* loaded from: classes.dex */
public enum EnumC1164s {
    None,
    Original,
    FitWidth,
    FitHeight,
    FitBest,
    FitInside,
    FitAll;


    /* renamed from: h */
    private static /* synthetic */ int[] f3682h;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1164s[] valuesCustom() {
        EnumC1164s[] enumC1164sArrValuesCustom = values();
        int length = enumC1164sArrValuesCustom.length;
        EnumC1164s[] enumC1164sArr = new EnumC1164s[length];
        System.arraycopy(enumC1164sArrValuesCustom, 0, enumC1164sArr, 0, length);
        return enumC1164sArr;
    }

    /* renamed from: b */
    private static /* synthetic */ int[] m2452b() {
        int[] iArr = f3682h;
        if (iArr == null) {
            iArr = new int[valuesCustom().length];
            try {
                iArr[FitAll.ordinal()] = 7;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[FitBest.ordinal()] = 5;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[FitHeight.ordinal()] = 4;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[FitInside.ordinal()] = 6;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[FitWidth.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[None.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[Original.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            f3682h = iArr;
        }
        return iArr;
    }

    /* renamed from: a */
    public final EnumC1164s m2453a() {
        switch (m2452b()[ordinal()]) {
            case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                return FitAll;
            case 4:
                return FitWidth;
            default:
                return FitHeight;
        }
    }
}
