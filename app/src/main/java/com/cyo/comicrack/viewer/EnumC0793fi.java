package com.cyo.comicrack.viewer;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.fi */
/* loaded from: classes.dex */
public enum EnumC0793fi {
    None,
    Forward,
    Backward;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0793fi[] valuesCustom() {
        EnumC0793fi[] enumC0793fiArrValuesCustom = values();
        int length = enumC0793fiArrValuesCustom.length;
        EnumC0793fi[] enumC0793fiArr = new EnumC0793fi[length];
        System.arraycopy(enumC0793fiArrValuesCustom, 0, enumC0793fiArr, 0, length);
        return enumC0793fiArr;
    }

    /* renamed from: a */
    public static EnumC0793fi m1844a(EnumC0793fi enumC0793fi) {
        if (enumC0793fi == None) {
            return None;
        }
        return enumC0793fi == Forward ? Backward : Forward;
    }
}
