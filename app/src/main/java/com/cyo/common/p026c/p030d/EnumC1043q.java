package com.cyo.common.p026c.p030d;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.q */
/* loaded from: classes.dex */
public enum EnumC1043q {
    EA_HEAD((short) 256),
    UO_HEAD((short) 257),
    MAC_HEAD((short) 258),
    BEEA_HEAD((short) 259),
    NTACL_HEAD((short) 260),
    STREAM_HEAD((short) 261);


    /* renamed from: g */
    private short f3104g;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1043q[] valuesCustom() {
        EnumC1043q[] enumC1043qArrValuesCustom = values();
        int length = enumC1043qArrValuesCustom.length;
        EnumC1043q[] enumC1043qArr = new EnumC1043q[length];
        System.arraycopy(enumC1043qArrValuesCustom, 0, enumC1043qArr, 0, length);
        return enumC1043qArr;
    }

    EnumC1043q(short s) {
        this.f3104g = s;
    }

    /* renamed from: b */
    private boolean m2167b(short s) {
        return this.f3104g == s;
    }

    /* renamed from: a */
    public static EnumC1043q m2166a(short s) {
        if (EA_HEAD.m2167b(s)) {
            return EA_HEAD;
        }
        if (UO_HEAD.m2167b(s)) {
            return UO_HEAD;
        }
        if (MAC_HEAD.m2167b(s)) {
            return MAC_HEAD;
        }
        if (BEEA_HEAD.m2167b(s)) {
            return BEEA_HEAD;
        }
        if (NTACL_HEAD.m2167b(s)) {
            return NTACL_HEAD;
        }
        if (STREAM_HEAD.m2167b(s)) {
            return STREAM_HEAD;
        }
        return null;
    }

    /* renamed from: a */
    public final short m2168a() {
        return this.f3104g;
    }
}
