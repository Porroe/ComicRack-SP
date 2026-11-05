package com.cyo.common;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.af */
/* loaded from: classes.dex */
public final class C0950af {
    /* renamed from: a */
    public static int m1990a(int i, int i2, int i3) {
        return Math.max(Math.min(i, i3), i2);
    }

    /* renamed from: a */
    public static float m1989a(float f, float f2, float f3) {
        return Math.max(Math.min(f, f3), f2);
    }

    /* renamed from: b */
    public static boolean m1992b(float f, float f2, float f3) {
        return Math.abs(f - f2) < f3;
    }

    /* renamed from: a */
    public static int m1991a(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return i;
        }
    }
}
