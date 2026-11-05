package com.cyo.common.p026c.p031e.p034c;

import com.cyo.common.p026c.p027a.C1018a;
import com.cyo.common.p026c.p029c.C1024b;
import java.util.List;
import java.util.Vector;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.c.b */
/* loaded from: classes.dex */
public final class C1071b extends C1070a {

    /* renamed from: g */
    private static /* synthetic */ int[] f3333g;

    /* renamed from: h */
    private static /* synthetic */ int[] f3334h;

    /* renamed from: c */
    public int f3337c;

    /* renamed from: e */
    public int f3339e;

    /* renamed from: f */
    public int f3340f;

    /* renamed from: b */
    public int[] f3336b = new int[8];

    /* renamed from: d */
    public int f3338d = 25000000;

    /* renamed from: a */
    public byte[] f3335a = null;

    /* renamed from: a */
    public static /* synthetic */ int[] m2328a() {
        int[] iArr = f3333g;
        if (iArr == null) {
            iArr = new int[EnumC1073d.valuesCustom().length];
            try {
                iArr[EnumC1073d.VM_ADC.ordinal()] = 38;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC1073d.VM_ADD.ordinal()] = 3;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC1073d.VM_ADDB.ordinal()] = 45;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC1073d.VM_ADDD.ordinal()] = 46;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[EnumC1073d.VM_AND.ordinal()] = 11;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[EnumC1073d.VM_CALL.ordinal()] = 22;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[EnumC1073d.VM_CMP.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[EnumC1073d.VM_CMPB.ordinal()] = 43;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[EnumC1073d.VM_CMPD.ordinal()] = 44;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[EnumC1073d.VM_DEC.ordinal()] = 8;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[EnumC1073d.VM_DECB.ordinal()] = 51;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[EnumC1073d.VM_DECD.ordinal()] = 52;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[EnumC1073d.VM_DIV.ordinal()] = 37;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[EnumC1073d.VM_INC.ordinal()] = 7;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[EnumC1073d.VM_INCB.ordinal()] = 49;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[EnumC1073d.VM_INCD.ordinal()] = 50;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[EnumC1073d.VM_JA.ordinal()] = 18;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[EnumC1073d.VM_JAE.ordinal()] = 19;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[EnumC1073d.VM_JB.ordinal()] = 16;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[EnumC1073d.VM_JBE.ordinal()] = 17;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[EnumC1073d.VM_JMP.ordinal()] = 9;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr[EnumC1073d.VM_JNS.ordinal()] = 15;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr[EnumC1073d.VM_JNZ.ordinal()] = 6;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr[EnumC1073d.VM_JS.ordinal()] = 14;
            } catch (NoSuchFieldError e24) {
            }
            try {
                iArr[EnumC1073d.VM_JZ.ordinal()] = 5;
            } catch (NoSuchFieldError e25) {
            }
            try {
                iArr[EnumC1073d.VM_MOV.ordinal()] = 1;
            } catch (NoSuchFieldError e26) {
            }
            try {
                iArr[EnumC1073d.VM_MOVB.ordinal()] = 41;
            } catch (NoSuchFieldError e27) {
            }
            try {
                iArr[EnumC1073d.VM_MOVD.ordinal()] = 42;
            } catch (NoSuchFieldError e28) {
            }
            try {
                iArr[EnumC1073d.VM_MOVSX.ordinal()] = 34;
            } catch (NoSuchFieldError e29) {
            }
            try {
                iArr[EnumC1073d.VM_MOVZX.ordinal()] = 33;
            } catch (NoSuchFieldError e30) {
            }
            try {
                iArr[EnumC1073d.VM_MUL.ordinal()] = 36;
            } catch (NoSuchFieldError e31) {
            }
            try {
                iArr[EnumC1073d.VM_NEG.ordinal()] = 28;
            } catch (NoSuchFieldError e32) {
            }
            try {
                iArr[EnumC1073d.VM_NEGB.ordinal()] = 53;
            } catch (NoSuchFieldError e33) {
            }
            try {
                iArr[EnumC1073d.VM_NEGD.ordinal()] = 54;
            } catch (NoSuchFieldError e34) {
            }
            try {
                iArr[EnumC1073d.VM_NOT.ordinal()] = 24;
            } catch (NoSuchFieldError e35) {
            }
            try {
                iArr[EnumC1073d.VM_OR.ordinal()] = 12;
            } catch (NoSuchFieldError e36) {
            }
            try {
                iArr[EnumC1073d.VM_POP.ordinal()] = 21;
            } catch (NoSuchFieldError e37) {
            }
            try {
                iArr[EnumC1073d.VM_POPA.ordinal()] = 30;
            } catch (NoSuchFieldError e38) {
            }
            try {
                iArr[EnumC1073d.VM_POPF.ordinal()] = 32;
            } catch (NoSuchFieldError e39) {
            }
            try {
                iArr[EnumC1073d.VM_PRINT.ordinal()] = 40;
            } catch (NoSuchFieldError e40) {
            }
            try {
                iArr[EnumC1073d.VM_PUSH.ordinal()] = 20;
            } catch (NoSuchFieldError e41) {
            }
            try {
                iArr[EnumC1073d.VM_PUSHA.ordinal()] = 29;
            } catch (NoSuchFieldError e42) {
            }
            try {
                iArr[EnumC1073d.VM_PUSHF.ordinal()] = 31;
            } catch (NoSuchFieldError e43) {
            }
            try {
                iArr[EnumC1073d.VM_RET.ordinal()] = 23;
            } catch (NoSuchFieldError e44) {
            }
            try {
                iArr[EnumC1073d.VM_SAR.ordinal()] = 27;
            } catch (NoSuchFieldError e45) {
            }
            try {
                iArr[EnumC1073d.VM_SBB.ordinal()] = 39;
            } catch (NoSuchFieldError e46) {
            }
            try {
                iArr[EnumC1073d.VM_SHL.ordinal()] = 25;
            } catch (NoSuchFieldError e47) {
            }
            try {
                iArr[EnumC1073d.VM_SHR.ordinal()] = 26;
            } catch (NoSuchFieldError e48) {
            }
            try {
                iArr[EnumC1073d.VM_STANDARD.ordinal()] = 55;
            } catch (NoSuchFieldError e49) {
            }
            try {
                iArr[EnumC1073d.VM_SUB.ordinal()] = 4;
            } catch (NoSuchFieldError e50) {
            }
            try {
                iArr[EnumC1073d.VM_SUBB.ordinal()] = 47;
            } catch (NoSuchFieldError e51) {
            }
            try {
                iArr[EnumC1073d.VM_SUBD.ordinal()] = 48;
            } catch (NoSuchFieldError e52) {
            }
            try {
                iArr[EnumC1073d.VM_TEST.ordinal()] = 13;
            } catch (NoSuchFieldError e53) {
            }
            try {
                iArr[EnumC1073d.VM_XCHG.ordinal()] = 35;
            } catch (NoSuchFieldError e54) {
            }
            try {
                iArr[EnumC1073d.VM_XOR.ordinal()] = 10;
            } catch (NoSuchFieldError e55) {
            }
            f3333g = iArr;
        }
        return iArr;
    }

    /* renamed from: b */
    public static /* synthetic */ int[] m2329b() {
        int[] iArr = f3334h;
        if (iArr == null) {
            iArr = new int[EnumC1080k.valuesCustom().length];
            try {
                iArr[EnumC1080k.VMSF_AUDIO.ordinal()] = 6;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC1080k.VMSF_DELTA.ordinal()] = 7;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC1080k.VMSF_E8.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC1080k.VMSF_E8E9.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[EnumC1080k.VMSF_ITANIUM.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[EnumC1080k.VMSF_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[EnumC1080k.VMSF_RGB.ordinal()] = 5;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[EnumC1080k.VMSF_UPCASE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            f3334h = iArr;
        }
        return iArr;
    }

    /* renamed from: a */
    private boolean m2327a(byte[] bArr) {
        return this.f3335a == bArr;
    }

    /* renamed from: a */
    public final int m2332a(boolean z, byte[] bArr, int i) {
        if (z) {
            if (m2327a(bArr)) {
                return bArr[i];
            }
            return bArr[i] & 255;
        }
        if (m2327a(bArr)) {
            return C1024b.m2145b(bArr, i);
        }
        return (((((((bArr[i] & 255) | 0) << 8) | (bArr[i + 1] & 255)) << 8) | (bArr[i + 2] & 255)) << 8) | (bArr[i + 3] & 255);
    }

    /* renamed from: a */
    public final void m2334a(boolean z, byte[] bArr, int i, int i2) {
        if (z) {
            if (m2327a(bArr)) {
                bArr[i] = (byte) i2;
                return;
            } else {
                bArr[i] = (byte) (((byte) (i2 & 255)) | 0);
                return;
            }
        }
        if (m2327a(bArr)) {
            C1024b.m2143a(bArr, i, i2);
            return;
        }
        bArr[i] = (byte) ((i2 >>> 24) & 255);
        bArr[i + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i + 3] = (byte) (i2 & 255);
    }

    /* renamed from: a */
    public static void m2326a(Vector vector, int i, int i2) {
        vector.set(i + 0, Byte.valueOf((byte) (i2 & 255)));
        vector.set(i + 1, Byte.valueOf((byte) ((i2 >>> 8) & 255)));
        vector.set(i + 2, Byte.valueOf((byte) ((i2 >>> 16) & 255)));
        vector.set(i + 3, Byte.valueOf((byte) ((i2 >>> 24) & 255)));
    }

    /* renamed from: a */
    public final int m2331a(C1077h c1077h) {
        if (c1077h.f3414a == EnumC1075f.VM_OPREGMEM) {
            return C1024b.m2145b(this.f3335a, (c1077h.f3417d + c1077h.f3416c) & 262143);
        }
        return C1024b.m2145b(this.f3335a, c1077h.f3417d);
    }

    /* renamed from: a */
    public final boolean m2336a(int i) {
        if (i >= this.f3339e) {
            return true;
        }
        int i2 = this.f3338d - 1;
        this.f3338d = i2;
        if (i2 <= 0) {
            return false;
        }
        this.f3340f = i;
        return true;
    }

    /* renamed from: a */
    public final void m2335a(byte[] bArr, int i, C1078i c1078i) {
        boolean z;
        EnumC1080k enumC1080k;
        int i2;
        m2319f();
        int iMin = Math.min(32768, i);
        for (int i3 = 0; i3 < iMin; i3++) {
            byte[] bArr2 = this.f3332am;
            bArr2[i3] = (byte) (bArr2[i3] | bArr[i3]);
        }
        byte b = 0;
        for (int i4 = 1; i4 < i; i4++) {
            b = (byte) (b ^ bArr[i4]);
        }
        m2318c(8);
        c1078i.f3420c = 0;
        if (b == bArr[0]) {
            C1079j[] c1079jArr = {new C1079j(53, -1386780537, EnumC1080k.VMSF_E8), new C1079j(57, 1020781950, EnumC1080k.VMSF_E8E9), new C1079j(120, 929663295, EnumC1080k.VMSF_ITANIUM), new C1079j(29, 235276157, EnumC1080k.VMSF_DELTA), new C1079j(149, 472669640, EnumC1080k.VMSF_RGB), new C1079j(216, -1132075263, EnumC1080k.VMSF_AUDIO), new C1079j(40, 1186579808, EnumC1080k.VMSF_UPCASE)};
            int iM2134a = C1018a.m2134a(-1, bArr, 0, bArr.length) ^ (-1);
            int i5 = 0;
            while (true) {
                if (i5 >= c1079jArr.length) {
                    enumC1080k = EnumC1080k.VMSF_NONE;
                    break;
                }
                if (c1079jArr[i5].f3427b == iM2134a && c1079jArr[i5].f3426a == bArr.length) {
                    enumC1080k = c1079jArr[i5].f3428c;
                    break;
                }
                i5++;
            }
            if (enumC1080k != EnumC1080k.VMSF_NONE) {
                C1076g c1076g = new C1076g();
                c1076g.f3410a = EnumC1073d.VM_STANDARD;
                c1076g.f3412c.f3415b = enumC1080k.m2343a();
                c1076g.f3412c.f3414a = EnumC1075f.VM_OPNONE;
                c1076g.f3413d.f3414a = EnumC1075f.VM_OPNONE;
                c1078i.f3418a.add(c1076g);
                c1078i.f3420c++;
                i = 0;
            }
            int iH = m2321h();
            m2318c(1);
            if ((iH & 32768) != 0) {
                long jM2324a = 0 & m2324a(this);
                for (int i6 = 0; this.f3330ak < i && i6 < jM2324a; i6++) {
                    c1078i.f3422e.add(Byte.valueOf((byte) (m2321h() >> 8)));
                    m2318c(8);
                }
            }
            while (this.f3330ak < i) {
                C1076g c1076g2 = new C1076g();
                int iH2 = m2321h();
                if ((iH2 & 32768) == 0) {
                    c1076g2.f3410a = EnumC1073d.m2337a(iH2 >> 12);
                    m2318c(4);
                } else {
                    c1076g2.f3410a = EnumC1073d.m2337a((iH2 >> 10) - 24);
                    m2318c(6);
                }
                if ((C1072c.f3341a[c1076g2.f3410a.m2339a()] & 4) != 0) {
                    c1076g2.f3411b = (m2321h() >> 15) == 1;
                    m2318c(1);
                } else {
                    c1076g2.f3411b = false;
                }
                c1076g2.f3412c.f3414a = EnumC1075f.VM_OPNONE;
                c1076g2.f3413d.f3414a = EnumC1075f.VM_OPNONE;
                int i7 = C1072c.f3341a[c1076g2.f3410a.m2339a()] & 3;
                if (i7 > 0) {
                    m2325a(c1076g2.f3412c, c1076g2.f3411b);
                    if (i7 == 2) {
                        m2325a(c1076g2.f3413d, c1076g2.f3411b);
                    } else if (c1076g2.f3412c.f3414a == EnumC1075f.VM_OPINT && (C1072c.f3341a[c1076g2.f3410a.m2339a()] & 24) != 0) {
                        int i8 = c1076g2.f3412c.f3415b;
                        if (i8 >= 256) {
                            i2 = i8 - 256;
                        } else {
                            if (i8 >= 136) {
                                i8 -= 264;
                            } else if (i8 >= 16) {
                                i8 -= 8;
                            } else if (i8 >= 8) {
                                i8 -= 16;
                            }
                            i2 = i8 + c1078i.f3420c;
                        }
                        c1076g2.f3412c.f3415b = i2;
                    }
                }
                c1078i.f3420c++;
                c1078i.f3418a.add(c1076g2);
            }
        }
        C1076g c1076g3 = new C1076g();
        c1076g3.f3410a = EnumC1073d.VM_RET;
        c1076g3.f3412c.f3414a = EnumC1075f.VM_OPNONE;
        c1076g3.f3413d.f3414a = EnumC1075f.VM_OPNONE;
        c1078i.f3418a.add(c1076g3);
        c1078i.f3420c++;
        if (i != 0) {
            List<C1076g> list = c1078i.f3418a;
            for (C1076g c1076g4 : list) {
                switch (m2328a()[c1076g4.f3410a.ordinal()]) {
                    case TwitterResponse.READ /* 1 */:
                        c1076g4.f3410a = c1076g4.f3411b ? EnumC1073d.VM_MOVB : EnumC1073d.VM_MOVD;
                        break;
                    case TwitterResponse.READ_WRITE /* 2 */:
                        c1076g4.f3410a = c1076g4.f3411b ? EnumC1073d.VM_CMPB : EnumC1073d.VM_CMPD;
                        break;
                    default:
                        if ((C1072c.f3341a[c1076g4.f3410a.m2339a()] & 64) != 0) {
                            z = false;
                            for (int next = list.indexOf(c1076g4) + 1; next < list.size(); next++) {
                                byte flags = C1072c.f3341a[list.get(next).f3410a.m2339a()];
                                if ((flags & 56) != 0) {
                                    z = true;
                                    break;
                                }
                                if ((flags & 64) != 0) {
                                    break;
                                }
                            }
                            if (z) {
                                break;
                            } else {
                                switch (m2328a()[c1076g4.f3410a.ordinal()]) {
                                    case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                                        c1076g4.f3410a = c1076g4.f3411b ? EnumC1073d.VM_ADDB : EnumC1073d.VM_ADDD;
                                        break;
                                    case 4:
                                        c1076g4.f3410a = c1076g4.f3411b ? EnumC1073d.VM_SUBB : EnumC1073d.VM_SUBD;
                                        break;
                                    case 7:
                                        c1076g4.f3410a = c1076g4.f3411b ? EnumC1073d.VM_INCB : EnumC1073d.VM_INCD;
                                        break;
                                    case 8:
                                        c1076g4.f3410a = c1076g4.f3411b ? EnumC1073d.VM_DECB : EnumC1073d.VM_DECD;
                                        break;
                                    case 28:
                                        c1076g4.f3410a = c1076g4.f3411b ? EnumC1073d.VM_NEGB : EnumC1073d.VM_NEGD;
                                        break;
                                }
                            }
                        } else {
                            break;
                        }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2325a(C1077h c1077h, boolean z) {
        int iH = m2321h();
        if ((32768 & iH) != 0) {
            c1077h.f3414a = EnumC1075f.VM_OPREG;
            c1077h.f3415b = (iH >> 12) & 7;
            c1077h.f3417d = c1077h.f3415b;
            m2318c(4);
            return;
        }
        if ((49152 & iH) == 0) {
            c1077h.f3414a = EnumC1075f.VM_OPINT;
            if (z) {
                c1077h.f3415b = (iH >> 6) & 255;
                m2318c(10);
                return;
            } else {
                m2318c(2);
                c1077h.f3415b = m2324a(this);
                return;
            }
        }
        c1077h.f3414a = EnumC1075f.VM_OPREGMEM;
        if ((iH & 8192) == 0) {
            c1077h.f3415b = (iH >> 10) & 7;
            c1077h.f3417d = c1077h.f3415b;
            c1077h.f3416c = 0;
            m2318c(6);
            return;
        }
        if ((iH & 4096) == 0) {
            c1077h.f3415b = (iH >> 9) & 7;
            c1077h.f3417d = c1077h.f3415b;
            m2318c(7);
        } else {
            c1077h.f3415b = 0;
            m2318c(4);
        }
        c1077h.f3416c = m2324a(this);
    }

    /* renamed from: a */
    public static int m2324a(C1070a c1070a) {
        int iM2321h = c1070a.m2321h();
        switch (49152 & iM2321h) {
            case TwitterResponse.NONE /* 0 */:
                c1070a.m2318c(6);
                return (iM2321h >> 10) & 15;
            case 16384:
                if ((iM2321h & 15360) == 0) {
                    int i = ((iM2321h >> 2) & 255) | (-256);
                    c1070a.m2318c(14);
                    return i;
                }
                int i2 = (iM2321h >> 6) & 255;
                c1070a.m2318c(10);
                return i2;
            case 32768:
                c1070a.m2318c(2);
                int iM2321h2 = c1070a.m2321h();
                c1070a.m2318c(16);
                return iM2321h2;
            default:
                c1070a.m2318c(2);
                int iM2321h3 = c1070a.m2321h() << 16;
                c1070a.m2318c(16);
                int iM2321h4 = iM2321h3 | c1070a.m2321h();
                c1070a.m2318c(16);
                return iM2321h4;
        }
    }

    /* renamed from: a */
    public final int m2330a(int i, int i2, int i3) {
        int i4 = i2 / 8;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        return (((((this.f3335a[i4 + i] & 255) | ((this.f3335a[i5 + i] & 255) << 8)) | ((this.f3335a[i6 + i] & 255) << 16)) | ((this.f3335a[(i6 + 1) + i] & 255) << 24)) >>> (i2 & 7)) & ((-1) >>> (32 - i3));
    }

    /* renamed from: a */
    public final void m2333a(int i, byte[] bArr, int i2, int i3) {
        if (i < 262144) {
            for (int i4 = 0; i4 < Math.min(bArr.length - i2, i3) && 262144 - i >= i4; i4++) {
                this.f3335a[i + i4] = bArr[i2 + i4];
            }
        }
    }
}
