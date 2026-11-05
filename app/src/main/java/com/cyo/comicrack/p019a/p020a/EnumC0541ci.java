package com.cyo.comicrack.p019a.p020a;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.ci */
/* loaded from: classes.dex */
public enum EnumC0541ci {
    Unknown,
    No,
    Yes;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0541ci[] valuesCustom() {
        EnumC0541ci[] enumC0541ciArrValuesCustom = values();
        int length = enumC0541ciArrValuesCustom.length;
        EnumC0541ci[] enumC0541ciArr = new EnumC0541ci[length];
        System.arraycopy(enumC0541ciArrValuesCustom, 0, enumC0541ciArr, 0, length);
        return enumC0541ciArr;
    }

    /* renamed from: a */
    public static EnumC0541ci m1201a(String str, EnumC0541ci enumC0541ci) {
        try {
            return valueOf(str);
        } catch (Exception e) {
            return enumC0541ci;
        }
    }
}
