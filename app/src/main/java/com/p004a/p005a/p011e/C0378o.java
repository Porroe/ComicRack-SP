package com.p004a.p005a.p011e;

import android.os.Build;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.o */
/* loaded from: classes.dex */
final class C0378o {

    /* renamed from: d */
    static final C0378o f1067d = new C0378o();

    /* renamed from: e */
    static final C0378o f1068e = new C0378o("unknown", "generic", "generic");

    /* renamed from: f */
    static final C0378o f1069f = new C0378o("unknown", "generic_x86", "Android");

    /* renamed from: a */
    public final String f1070a;

    /* renamed from: b */
    public final String f1071b;

    /* renamed from: c */
    public final String f1072c;

    C0378o() {
        this.f1070a = Build.BOARD;
        this.f1071b = Build.DEVICE;
        this.f1072c = Build.BRAND;
    }

    private C0378o(String str, String str2, String str3) {
        this.f1070a = str;
        this.f1071b = str2;
        this.f1072c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0378o)) {
            return false;
        }
        C0378o c0378o = (C0378o) obj;
        return m923a(this.f1070a, c0378o.f1070a) && m923a(this.f1071b, c0378o.f1071b) && m923a(this.f1072c, c0378o.f1072c);
    }

    /* renamed from: a */
    private static boolean m923a(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        return str == str2;
    }

    public final int hashCode() {
        int iHashCode = 0;
        if (this.f1070a != null) {
            iHashCode = this.f1070a.hashCode() + 0;
        }
        if (this.f1071b != null) {
            iHashCode += this.f1071b.hashCode();
        }
        if (this.f1072c != null) {
            return iHashCode + this.f1072c.hashCode();
        }
        return iHashCode;
    }
}
