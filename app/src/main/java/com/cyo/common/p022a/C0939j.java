package com.cyo.common.p022a;

import android.graphics.Color;
import android.graphics.Rect;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.j */
/* loaded from: classes.dex */
public final class C0939j {

    /* renamed from: a */
    private static /* synthetic */ int[] f2825a;

    /* renamed from: a */
    public static /* synthetic */ int[] m1976a() {
        int[] iArr = f2825a;
        if (iArr == null) {
            iArr = new int[EnumC0938i.valuesCustom().length];
            try {
                iArr[EnumC0938i.None.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0938i.Rotate180.ordinal()] = 3;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0938i.Rotate270.ordinal()] = 4;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC0938i.Rotate90.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            f2825a = iArr;
        }
        return iArr;
    }

    /* renamed from: a */
    public static Rect m1973a(InterfaceC0942m interfaceC0942m, float f) {
        int iMax;
        int iMax2;
        int iMax3;
        int iMax4;
        if (interfaceC0942m == null) {
            return new Rect();
        }
        int iMo1274c = interfaceC0942m.mo1274c();
        int iMo1273b = interfaceC0942m.mo1273b();
        if (iMo1274c == 0 || iMo1273b == 0) {
            return new Rect();
        }
        Rect rectM1962a = C0933d.m1962a(0, 0, iMo1273b, iMo1274c);
        Rect rect = new Rect(rectM1962a);
        int i = (int) (iMo1274c * 0.2f);
        int i2 = iMo1274c - i;
        int i3 = (int) (iMo1273b * 0.2f);
        int i4 = iMo1273b - i3;
        while (rectM1962a.top < i && m1974a(interfaceC0942m, rectM1962a.top)) {
            rectM1962a.top++;
        }
        while (rectM1962a.bottom > i2 && m1974a(interfaceC0942m, rectM1962a.bottom - 1)) {
            rectM1962a.bottom--;
        }
        while (rectM1962a.left < i3 && m1977b(interfaceC0942m, rectM1962a.left)) {
            rectM1962a.left++;
        }
        while (rectM1962a.right > i4 && m1977b(interfaceC0942m, rectM1962a.right - 1)) {
            rectM1962a.right--;
        }
        int iAbs = Math.abs(rect.left - rectM1962a.left);
        int iAbs2 = Math.abs(rect.top - rectM1962a.top);
        int iAbs3 = Math.abs(rect.right - rectM1962a.right);
        int iAbs4 = Math.abs(rect.bottom - rectM1962a.bottom);
        if (f > 0.0f) {
            int iHeight = (int) (rectM1962a.height() * f);
            int iWidth = (int) ((rect.width() > rect.height() ? rectM1962a.width() / 2 : rectM1962a.width()) * f);
            iMax = Math.max(iAbs - iWidth, 0);
            iMax2 = Math.max(iAbs2 - iHeight, 0);
            iMax3 = Math.max(iAbs3 - iWidth, 0);
            iMax4 = Math.max(iAbs4 - iHeight, 0);
        } else {
            float f2 = 1.0f + f;
            iMax = (int) (iAbs * f2);
            iMax2 = (int) (iAbs2 * f2);
            iMax3 = (int) (iAbs3 * f2);
            iMax4 = (int) (f2 * iAbs4);
        }
        return new Rect(iMax + rect.left, iMax2 + rect.top, rect.right - iMax3, rect.bottom - iMax4);
    }

    /* renamed from: a */
    private static boolean m1975a(InterfaceC0943n interfaceC0943n) {
        if (interfaceC0943n == null || interfaceC0943n.mo1978a() == 0) {
            return false;
        }
        int iMo1978a = interfaceC0943n.mo1978a();
        int i = iMo1978a / 25;
        if (Color.alpha(interfaceC0943n.mo1979a(0)) == 0) {
            return false;
        }
        int iM1959a = C0932c.m1959a(interfaceC0943n.mo1979a(0));
        int i2 = 1;
        while (i2 < iMo1978a) {
            int iM1959a2 = C0932c.m1959a(interfaceC0943n.mo1979a(i2));
            if (Math.abs(iM1959a - iM1959a2) > 50 && i - 1 < 0) {
                return false;
            }
            i2++;
            iM1959a = iM1959a2;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m1974a(InterfaceC0942m interfaceC0942m, int i) {
        if (interfaceC0942m == null) {
            return false;
        }
        return m1975a(new C0940k(interfaceC0942m, i));
    }

    /* renamed from: b */
    private static boolean m1977b(InterfaceC0942m interfaceC0942m, int i) {
        if (interfaceC0942m == null) {
            return false;
        }
        return m1975a(new C0941l(interfaceC0942m, i));
    }

    /* renamed from: a */
    public static int m1971a(InterfaceC0942m interfaceC0942m, int i, int i2) {
        return m1972a(interfaceC0942m, new Rect(i, i2, i + 4, i2 + 4));
    }

    /* renamed from: a */
    private static int m1972a(InterfaceC0942m interfaceC0942m, Rect rect) {
        int iAlpha = 0;
        if (interfaceC0942m == null) {
            return -16777216;
        }
        int iWidth = rect.width() * rect.height();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = rect.left; i4 < rect.right; i4++) {
            int i5 = rect.top;
            while (i5 < rect.bottom) {
                int iMo1268a = interfaceC0942m.mo1268a(i4, i5);
                int iRed = Color.red(iMo1268a) + i3;
                int iGreen = Color.green(iMo1268a) + i2;
                int iBlue = Color.blue(iMo1268a) + i;
                i5++;
                iAlpha = Color.alpha(iMo1268a) + iAlpha;
                i = iBlue;
                i2 = iGreen;
                i3 = iRed;
            }
        }
        return Color.argb(iAlpha / iWidth, i3 / iWidth, i2 / iWidth, i / iWidth);
    }
}
