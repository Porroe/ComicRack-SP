package com.p004a.p005a.p011e;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.g */
/* loaded from: classes.dex */
public final class C0370g {

    /* renamed from: a */
    private static boolean f1049a = Log.isLoggable("GoogleAdsAssertion", 3);

    /* renamed from: a */
    public static void m905a(boolean z) {
        m909c(z, "Assertion failed.");
    }

    /* renamed from: a */
    public static void m906a(boolean z, String str) {
        m909c(z, str);
    }

    /* renamed from: b */
    public static void m907b(boolean z) {
        m909c(!z, "Assertion failed.");
    }

    /* renamed from: b */
    public static void m908b(boolean z, String str) {
        m909c(!z, str);
    }

    /* renamed from: a */
    public static void m902a(Object obj) {
        m909c(obj != null, "Assertion that an object is not null failed.");
    }

    /* renamed from: a */
    public static void m903a(Object obj, Object obj2) {
        m909c(obj == obj2, "Assertion that 'a' and 'b' refer to the same object failed.a: " + obj + ", b: " + obj2);
    }

    /* renamed from: a */
    public static void m904a(String str) {
        m909c(!TextUtils.isEmpty(str), "Expected a non empty string, got: " + str);
    }

    /* renamed from: c */
    private static void m909c(boolean z, String str) {
        if ((Log.isLoggable("GoogleAdsAssertion", 3) || f1049a) && !z) {
            C0371h c0371h = new C0371h(str);
            Log.d("GoogleAdsAssertion", str, c0371h);
            throw c0371h;
        }
    }
}
