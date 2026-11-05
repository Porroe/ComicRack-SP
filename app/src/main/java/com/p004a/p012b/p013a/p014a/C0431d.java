package com.p004a.p012b.p013a.p014a;

/* renamed from: com.a.b.a.a.d */
/* loaded from: classes.dex */
final class C0431d {

    /* renamed from: a */
    final int f1367a;

    /* renamed from: b */
    final String f1368b;

    /* renamed from: c */
    final String f1369c;

    /* renamed from: d */
    final int f1370d;

    public C0431d(int i, String str, String str2, int i2) {
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new IllegalArgumentException("Invalid Scope:" + i2);
        }
        if (i <= 0 || i > 5) {
            throw new IllegalArgumentException("Index must be between 1 and 5 inclusive.");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid argument for name:  Cannot be empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Invalid argument for value:  Cannot be empty");
        }
        int length = C0430c.m965a(str + str2, "UTF-8").length();
        if (length > 64) {
            throw new IllegalArgumentException("Encoded form of name and value must not exceed 64 characters combined.  Character length: " + length);
        }
        this.f1370d = i;
        this.f1367a = i2;
        this.f1368b = str;
        this.f1369c = str2;
    }
}
