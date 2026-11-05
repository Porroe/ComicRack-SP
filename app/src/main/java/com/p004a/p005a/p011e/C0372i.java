package com.p004a.p005a.p011e;

import android.util.Log;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.i */
/* loaded from: classes.dex */
public final class C0372i {

    /* renamed from: a */
    public static InterfaceC0374k f1050a = null;

    /* renamed from: b */
    private static int f1051b = 5;

    /* renamed from: a */
    private static void m910a() {
        if (f1050a != null) {
            InterfaceC0374k interfaceC0374k = f1050a;
        }
    }

    /* renamed from: a */
    public static void m911a(String str) {
        if (m913a("Ads", 3)) {
            Log.d("Ads", str);
        }
        EnumC0373j enumC0373j = EnumC0373j.DEBUG;
        m910a();
    }

    /* renamed from: a */
    public static void m912a(String str, Throwable th) {
        if (m913a("Ads", 3)) {
            Log.d("Ads", str, th);
        }
        EnumC0373j enumC0373j = EnumC0373j.DEBUG;
        m910a();
    }

    /* renamed from: b */
    public static void m914b(String str) {
        if (m913a("Ads", 6)) {
            Log.e("Ads", str);
        }
        EnumC0373j enumC0373j = EnumC0373j.ERROR;
        m910a();
    }

    /* renamed from: b */
    public static void m915b(String str, Throwable th) {
        if (m913a("Ads", 6)) {
            Log.e("Ads", str);
            Log.i("Ads", "The following was caught and handled:", th);
        }
        EnumC0373j enumC0373j = EnumC0373j.ERROR;
        m910a();
    }

    /* renamed from: c */
    public static void m916c(String str) {
        if (m913a("Ads", 4)) {
            Log.i("Ads", str);
        }
        EnumC0373j enumC0373j = EnumC0373j.INFO;
        m910a();
    }

    /* renamed from: c */
    public static void m917c(String str, Throwable th) {
        if (m913a("Ads", 4)) {
            Log.i("Ads", str, th);
        }
        EnumC0373j enumC0373j = EnumC0373j.INFO;
        m910a();
    }

    /* renamed from: d */
    public static void m918d(String str) {
        if (m913a("Ads", 2)) {
            Log.v("Ads", str);
        }
        EnumC0373j enumC0373j = EnumC0373j.VERBOSE;
        m910a();
    }

    /* renamed from: e */
    public static void m920e(String str) {
        if (m913a("Ads", 5)) {
            Log.w("Ads", str);
        }
        EnumC0373j enumC0373j = EnumC0373j.WARN;
        m910a();
    }

    /* renamed from: d */
    public static void m919d(String str, Throwable th) {
        if (m913a("Ads", 5)) {
            Log.w("Ads", str);
            Log.i("Ads", "The following was caught and handled:", th);
        }
        EnumC0373j enumC0373j = EnumC0373j.WARN;
        m910a();
    }

    /* renamed from: a */
    private static boolean m913a(String str, int i) {
        return (i >= f1051b) || Log.isLoggable(str, i);
    }
}
