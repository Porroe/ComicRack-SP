package com.cyo.common.p026c.p031e.p034c;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.c.k */
/* loaded from: classes.dex */
public enum EnumC1080k {
    VMSF_NONE(0),
    VMSF_E8(1),
    VMSF_E8E9(2),
    VMSF_ITANIUM(3),
    VMSF_RGB(4),
    VMSF_AUDIO(5),
    VMSF_DELTA(6),
    VMSF_UPCASE(7);


    /* renamed from: i */
    private int f3438i;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1080k[] valuesCustom() {
        EnumC1080k[] enumC1080kArrValuesCustom = values();
        int length = enumC1080kArrValuesCustom.length;
        EnumC1080k[] enumC1080kArr = new EnumC1080k[length];
        System.arraycopy(enumC1080kArrValuesCustom, 0, enumC1080kArr, 0, length);
        return enumC1080kArr;
    }

    EnumC1080k(int i) {
        this.f3438i = i;
    }

    /* renamed from: a */
    public final int m2343a() {
        return this.f3438i;
    }

    /* renamed from: b */
    private boolean m2342b(int i) {
        return this.f3438i == i;
    }

    /* renamed from: a */
    public static EnumC1080k m2341a(int i) {
        if (VMSF_NONE.m2342b(i)) {
            return VMSF_NONE;
        }
        if (VMSF_E8.m2342b(i)) {
            return VMSF_E8;
        }
        if (VMSF_E8E9.m2342b(i)) {
            return VMSF_E8E9;
        }
        if (VMSF_ITANIUM.m2342b(i)) {
            return VMSF_ITANIUM;
        }
        if (VMSF_RGB.m2342b(i)) {
            return VMSF_RGB;
        }
        if (VMSF_AUDIO.m2342b(i)) {
            return VMSF_AUDIO;
        }
        if (VMSF_DELTA.m2342b(i)) {
            return VMSF_DELTA;
        }
        return null;
    }
}
