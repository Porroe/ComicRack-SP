package com.cyo.common.p026c.p030d;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.i */
/* loaded from: classes.dex */
public enum EnumC1035i {
    msdos((byte) 0),
    os2((byte) 1),
    win32((byte) 2),
    unix((byte) 3),
    macos((byte) 4),
    beos((byte) 5);


    /* renamed from: g */
    private byte f3072g;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1035i[] valuesCustom() {
        EnumC1035i[] enumC1035iArrValuesCustom = values();
        int length = enumC1035iArrValuesCustom.length;
        EnumC1035i[] enumC1035iArr = new EnumC1035i[length];
        System.arraycopy(enumC1035iArrValuesCustom, 0, enumC1035iArr, 0, length);
        return enumC1035iArr;
    }

    /* renamed from: a */
    public static EnumC1035i m2159a(byte b) {
        if (msdos.m2160b(b)) {
            return msdos;
        }
        if (os2.m2160b(b)) {
            return os2;
        }
        if (win32.m2160b(b)) {
            return win32;
        }
        if (unix.m2160b(b)) {
            return unix;
        }
        if (macos.m2160b(b)) {
            return macos;
        }
        if (beos.m2160b(b)) {
            return beos;
        }
        return null;
    }

    EnumC1035i(byte b) {
        this.f3072g = b;
    }

    /* renamed from: b */
    private boolean m2160b(byte b) {
        return this.f3072g == b;
    }
}
