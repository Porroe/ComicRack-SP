package com.cyo.common.p026c.p031e.p034c;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.c.d */
/* loaded from: classes.dex */
public enum EnumC1073d {
    VM_MOV(0),
    VM_CMP(1),
    VM_ADD(2),
    VM_SUB(3),
    VM_JZ(4),
    VM_JNZ(5),
    VM_INC(6),
    VM_DEC(7),
    VM_JMP(8),
    VM_XOR(9),
    VM_AND(10),
    VM_OR(11),
    VM_TEST(12),
    VM_JS(13),
    VM_JNS(14),
    VM_JB(15),
    VM_JBE(16),
    VM_JA(17),
    VM_JAE(18),
    VM_PUSH(19),
    VM_POP(20),
    VM_CALL(21),
    VM_RET(22),
    VM_NOT(23),
    VM_SHL(24),
    VM_SHR(25),
    VM_SAR(26),
    VM_NEG(27),
    VM_PUSHA(28),
    VM_POPA(29),
    VM_PUSHF(30),
    VM_POPF(31),
    VM_MOVZX(32),
    VM_MOVSX(33),
    VM_XCHG(34),
    VM_MUL(35),
    VM_DIV(36),
    VM_ADC(37),
    VM_SBB(38),
    VM_PRINT(39),
    VM_MOVB(40),
    VM_MOVD(41),
    VM_CMPB(42),
    VM_CMPD(43),
    VM_ADDB(44),
    VM_ADDD(45),
    VM_SUBB(46),
    VM_SUBD(47),
    VM_INCB(48),
    VM_INCD(49),
    VM_DECB(50),
    VM_DECD(51),
    VM_NEGB(52),
    VM_NEGD(53),
    VM_STANDARD(54);


    /* renamed from: ad */
    private int f3398ad;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1073d[] valuesCustom() {
        EnumC1073d[] enumC1073dArrValuesCustom = values();
        int length = enumC1073dArrValuesCustom.length;
        EnumC1073d[] enumC1073dArr = new EnumC1073d[length];
        System.arraycopy(enumC1073dArrValuesCustom, 0, enumC1073dArr, 0, length);
        return enumC1073dArr;
    }

    EnumC1073d(int i) {
        this.f3398ad = i;
    }

    /* renamed from: a */
    public final int m2339a() {
        return this.f3398ad;
    }

    /* renamed from: b */
    private boolean m2338b(int i) {
        return this.f3398ad == i;
    }

    /* renamed from: a */
    public static EnumC1073d m2337a(int i) {
        if (VM_MOV.m2338b(i)) {
            return VM_MOV;
        }
        if (VM_CMP.m2338b(i)) {
            return VM_CMP;
        }
        if (VM_ADD.m2338b(i)) {
            return VM_ADD;
        }
        if (VM_SUB.m2338b(i)) {
            return VM_SUB;
        }
        if (VM_JZ.m2338b(i)) {
            return VM_JZ;
        }
        if (VM_JNZ.m2338b(i)) {
            return VM_JNZ;
        }
        if (VM_INC.m2338b(i)) {
            return VM_INC;
        }
        if (VM_DEC.m2338b(i)) {
            return VM_DEC;
        }
        if (VM_JMP.m2338b(i)) {
            return VM_JMP;
        }
        if (VM_XOR.m2338b(i)) {
            return VM_XOR;
        }
        if (VM_AND.m2338b(i)) {
            return VM_AND;
        }
        if (VM_OR.m2338b(i)) {
            return VM_OR;
        }
        if (VM_TEST.m2338b(i)) {
            return VM_TEST;
        }
        if (VM_JS.m2338b(i)) {
            return VM_JS;
        }
        if (VM_JNS.m2338b(i)) {
            return VM_JNS;
        }
        if (VM_JB.m2338b(i)) {
            return VM_JB;
        }
        if (VM_JBE.m2338b(i)) {
            return VM_JBE;
        }
        if (VM_JA.m2338b(i)) {
            return VM_JA;
        }
        if (VM_JAE.m2338b(i)) {
            return VM_JAE;
        }
        if (VM_PUSH.m2338b(i)) {
            return VM_PUSH;
        }
        if (VM_POP.m2338b(i)) {
            return VM_POP;
        }
        if (VM_CALL.m2338b(i)) {
            return VM_CALL;
        }
        if (VM_RET.m2338b(i)) {
            return VM_RET;
        }
        if (VM_NOT.m2338b(i)) {
            return VM_NOT;
        }
        if (VM_SHL.m2338b(i)) {
            return VM_SHL;
        }
        if (VM_SHR.m2338b(i)) {
            return VM_SHR;
        }
        if (VM_SAR.m2338b(i)) {
            return VM_SAR;
        }
        if (VM_NEG.m2338b(i)) {
            return VM_NEG;
        }
        if (VM_PUSHA.m2338b(i)) {
            return VM_PUSHA;
        }
        if (VM_POPA.m2338b(i)) {
            return VM_POPA;
        }
        if (VM_PUSHF.m2338b(i)) {
            return VM_PUSHF;
        }
        if (VM_POPF.m2338b(i)) {
            return VM_POPF;
        }
        if (VM_MOVZX.m2338b(i)) {
            return VM_MOVZX;
        }
        if (VM_MOVSX.m2338b(i)) {
            return VM_MOVSX;
        }
        if (VM_XCHG.m2338b(i)) {
            return VM_XCHG;
        }
        if (VM_MUL.m2338b(i)) {
            return VM_MUL;
        }
        if (VM_DIV.m2338b(i)) {
            return VM_DIV;
        }
        if (VM_ADC.m2338b(i)) {
            return VM_ADC;
        }
        if (VM_SBB.m2338b(i)) {
            return VM_SBB;
        }
        if (VM_PRINT.m2338b(i)) {
            return VM_PRINT;
        }
        if (VM_MOVB.m2338b(i)) {
            return VM_MOVB;
        }
        if (VM_MOVD.m2338b(i)) {
            return VM_MOVD;
        }
        if (VM_CMPB.m2338b(i)) {
            return VM_CMPB;
        }
        if (VM_CMPD.m2338b(i)) {
            return VM_CMPD;
        }
        if (VM_ADDB.m2338b(i)) {
            return VM_ADDB;
        }
        if (VM_ADDD.m2338b(i)) {
            return VM_ADDD;
        }
        if (VM_SUBB.m2338b(i)) {
            return VM_SUBB;
        }
        if (VM_SUBD.m2338b(i)) {
            return VM_SUBD;
        }
        if (VM_INCB.m2338b(i)) {
            return VM_INCB;
        }
        if (VM_INCD.m2338b(i)) {
            return VM_INCD;
        }
        if (VM_DECB.m2338b(i)) {
            return VM_DECB;
        }
        if (VM_DECD.m2338b(i)) {
            return VM_DECD;
        }
        if (VM_NEGB.m2338b(i)) {
            return VM_NEGB;
        }
        if (VM_NEGD.m2338b(i)) {
            return VM_NEGD;
        }
        if (VM_STANDARD.m2338b(i)) {
            return VM_STANDARD;
        }
        return null;
    }
}
