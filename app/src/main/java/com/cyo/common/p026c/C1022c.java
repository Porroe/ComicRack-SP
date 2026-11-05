package com.cyo.common.p026c;

import com.cyo.common.p026c.p028b.C1020a;
import com.cyo.common.p026c.p030d.C1033g;
import com.cyo.common.p026c.p031e.C1046a;
import java.io.File;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.c */
/* loaded from: classes.dex */
public final class C1022c {
    /* renamed from: a */
    public static boolean m2138a(C1017a c1017a, C1046a c1046a) throws C1020a, java.io.FileNotFoundException, java.io.IOException {
        String string;
        C1033g c1033g = c1046a.f3125e;
        if (c1033g.f3047i >= 20 && c1033g.f3046h != -1 && c1046a.f3138r != (c1033g.f3046h ^ (-1))) {
            System.err.println("Data Bad CRC");
        }
        boolean z = !c1017a.m2132f().m2163i() || c1017a.m2133g();
        String absolutePath = c1017a.m2124a().getAbsolutePath();
        if (z) {
            int length = absolutePath.length();
            if (length <= 4 || absolutePath.charAt(length - 4) != '.') {
                string = null;
            } else {
                StringBuilder sb = new StringBuilder();
                int i = length - 3;
                sb.append((CharSequence) absolutePath, 0, i);
                if (m2137a(absolutePath.charAt(i + 1)) && m2137a(absolutePath.charAt(i + 2))) {
                    char[] cArr = new char[3];
                    absolutePath.getChars(i, length, cArr, 0);
                    int length2 = cArr.length;
                    while (true) {
                        length2--;
                        char c = (char) (cArr[length2] + 1);
                        cArr[length2] = c;
                        if (c != ':') {
                            break;
                        }
                        cArr[length2] = '0';
                    }
                    sb.append(cArr);
                } else {
                    sb.append("r00");
                }
                string = sb.toString();
            }
        } else {
            int length3 = absolutePath.length();
            int i2 = length3 - 1;
            while (i2 >= 0 && !m2137a(absolutePath.charAt(i2))) {
                i2--;
            }
            int i3 = i2 + 1;
            int i4 = i2 - 1;
            while (i4 >= 0 && m2137a(absolutePath.charAt(i4))) {
                i4--;
            }
            if (i4 < 0) {
                string = null;
            } else {
                int i5 = i4 + 1;
                StringBuilder sb2 = new StringBuilder(length3);
                sb2.append((CharSequence) absolutePath, 0, i5);
                char[] cArr2 = new char[(i2 - i5) + 1];
                absolutePath.getChars(i5, i2 + 1, cArr2, 0);
                int length4 = cArr2.length - 1;
                while (length4 >= 0) {
                    char c2 = (char) (cArr2[length4] + 1);
                    cArr2[length4] = c2;
                    if (c2 != ':') {
                        break;
                    }
                    cArr2[length4] = '0';
                    length4--;
                }
                if (length4 < 0) {
                    sb2.append('1');
                }
                sb2.append(cArr2);
                sb2.append((CharSequence) absolutePath, i3, length3);
                string = sb2.toString();
            }
        }
        File file = new File(string);
        InterfaceC1019b interfaceC1019bM2131e = c1017a.m2131e();
        if ((interfaceC1019bM2131e != null && !interfaceC1019bM2131e.m2136a()) || !file.exists()) {
            return false;
        }
        c1017a.m2127a(file);
        C1033g c1033gM2130d = c1017a.m2130d();
        if (c1033gM2130d == null) {
            return false;
        }
        c1046a.m2173a(c1033gM2130d);
        return true;
    }

    /* renamed from: a */
    private static boolean m2137a(char c) {
        return c >= '0' && c <= '9';
    }
}
