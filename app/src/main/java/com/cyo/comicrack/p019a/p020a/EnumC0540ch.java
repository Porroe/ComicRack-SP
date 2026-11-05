package com.cyo.comicrack.p019a.p020a;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.ch */
/* loaded from: classes.dex */
public enum EnumC0540ch {
    Unknown,
    No,
    Yes,
    YesAndRightToLeft;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0540ch[] valuesCustom() {
        EnumC0540ch[] enumC0540chArrValuesCustom = values();
        int length = enumC0540chArrValuesCustom.length;
        EnumC0540ch[] enumC0540chArr = new EnumC0540ch[length];
        System.arraycopy(enumC0540chArrValuesCustom, 0, enumC0540chArr, 0, length);
        return enumC0540chArr;
    }

    /* renamed from: a */
    public static EnumC0540ch m1200a(String str, EnumC0540ch enumC0540ch) {
        try {
            return valueOf(str);
        } catch (Exception e) {
            return enumC0540ch;
        }
    }
}
