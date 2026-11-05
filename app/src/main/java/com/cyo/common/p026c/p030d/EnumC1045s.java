package com.cyo.common.p026c.p030d;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.s */
/* loaded from: classes.dex */
public enum EnumC1045s {
    MainHeader((byte) 115),
    MarkHeader((byte) 114),
    FileHeader((byte) 116),
    CommHeader((byte) 117),
    AvHeader((byte) 118),
    SubHeader((byte) 119),
    ProtectHeader((byte) 120),
    SignHeader((byte) 121),
    NewSubHeader((byte) 122),
    EndArcHeader((byte) 123);


    /* renamed from: k */
    private byte f3120k;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1045s[] valuesCustom() {
        EnumC1045s[] enumC1045sArrValuesCustom = values();
        int length = enumC1045sArrValuesCustom.length;
        EnumC1045s[] enumC1045sArr = new EnumC1045s[length];
        System.arraycopy(enumC1045sArrValuesCustom, 0, enumC1045sArr, 0, length);
        return enumC1045sArr;
    }

    /* renamed from: a */
    public static EnumC1045s m2169a(byte b) {
        if (MarkHeader.m2171b(b)) {
            return MarkHeader;
        }
        if (MainHeader.m2171b(b)) {
            return MainHeader;
        }
        if (FileHeader.m2171b(b)) {
            return FileHeader;
        }
        if (EndArcHeader.m2171b(b)) {
            return EndArcHeader;
        }
        if (NewSubHeader.m2171b(b)) {
            return NewSubHeader;
        }
        if (SubHeader.m2171b(b)) {
            return SubHeader;
        }
        if (SignHeader.m2171b(b)) {
            return SignHeader;
        }
        if (ProtectHeader.m2171b(b)) {
            return ProtectHeader;
        }
        if (MarkHeader.m2171b(b)) {
            return MarkHeader;
        }
        if (MainHeader.m2171b(b)) {
            return MainHeader;
        }
        if (FileHeader.m2171b(b)) {
            return FileHeader;
        }
        if (EndArcHeader.m2171b(b)) {
            return EndArcHeader;
        }
        if (CommHeader.m2171b(b)) {
            return CommHeader;
        }
        if (AvHeader.m2171b(b)) {
            return AvHeader;
        }
        return null;
    }

    EnumC1045s(byte b) {
        this.f3120k = b;
    }

    /* renamed from: b */
    public final boolean m2171b(byte b) {
        return this.f3120k == b;
    }

    /* renamed from: a */
    public final byte m2170a() {
        return this.f3120k;
    }
}
