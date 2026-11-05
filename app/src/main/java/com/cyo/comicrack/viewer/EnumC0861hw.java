package com.cyo.comicrack.viewer;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hw */
/* loaded from: classes.dex */
public enum EnumC0861hw {
    Button,
    Tap,
    LongTouch,
    Fling,
    Key,
    Menu;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0861hw[] valuesCustom() {
        EnumC0861hw[] enumC0861hwArrValuesCustom = values();
        int length = enumC0861hwArrValuesCustom.length;
        EnumC0861hw[] enumC0861hwArr = new EnumC0861hw[length];
        System.arraycopy(enumC0861hwArrValuesCustom, 0, enumC0861hwArr, 0, length);
        return enumC0861hwArr;
    }

    /* renamed from: a */
    public static boolean m1860a(EnumC0861hw enumC0861hw) {
        return enumC0861hw == Tap || enumC0861hw == LongTouch;
    }
}
