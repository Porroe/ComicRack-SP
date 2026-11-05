package com.p004a.p012b.p013a.p014a;

/* renamed from: com.a.b.a.a.q */
/* loaded from: classes.dex */
public final class C0444q {

    /* renamed from: a */
    final String f1425a;

    /* renamed from: b */
    final String f1426b;

    /* renamed from: c */
    final double f1427c;

    /* renamed from: d */
    final long f1428d;

    /* renamed from: e */
    String f1429e = null;

    /* renamed from: f */
    String f1430f = null;

    public C0444q(String str, String str2, double d, long j) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("orderId must not be empty or null");
        }
        if (str2 == null || str2.trim().length() == 0) {
            throw new IllegalArgumentException("itemSKU must not be empty or null");
        }
        this.f1425a = str;
        this.f1426b = str2;
        this.f1427c = d;
        this.f1428d = j;
    }
}
