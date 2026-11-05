package com.cyo.common.p026c.p031e.p034c;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.c.e */
/* loaded from: classes.dex */
public enum EnumC1074e {
    VM_FC(1),
    VM_FZ(2),
    VM_FS(Integer.MIN_VALUE);


    /* renamed from: d */
    private int f3403d;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1074e[] valuesCustom() {
        EnumC1074e[] enumC1074eArrValuesCustom = values();
        int length = enumC1074eArrValuesCustom.length;
        EnumC1074e[] enumC1074eArr = new EnumC1074e[length];
        System.arraycopy(enumC1074eArrValuesCustom, 0, enumC1074eArr, 0, length);
        return enumC1074eArr;
    }

    EnumC1074e(int i) {
        this.f3403d = i;
    }

    /* renamed from: a */
    public final int m2340a() {
        return this.f3403d;
    }
}
