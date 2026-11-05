package com.p004a.p005a;

import android.content.Context;
import twitter4j.HttpResponseCode;

/* compiled from: DontLook */
/* renamed from: com.a.a.h */
/* loaded from: classes.dex */
public final class C0392h {

    /* renamed from: a */
    public static final C0392h f1092a = new C0392h(-1, -2, "mb");

    /* renamed from: b */
    public static final C0392h f1093b = new C0392h(320, 50, "mb");

    /* renamed from: c */
    public static final C0392h f1094c = new C0392h(HttpResponseCode.MULTIPLE_CHOICES, 250, "as");

    /* renamed from: d */
    public static final C0392h f1095d = new C0392h(468, 60, "as");

    /* renamed from: e */
    public static final C0392h f1096e = new C0392h(728, 90, "as");

    /* renamed from: f */
    public static final C0392h f1097f = new C0392h(160, 600, "as");

    /* renamed from: g */
    private final int f1098g;

    /* renamed from: h */
    private final int f1099h;

    /* renamed from: i */
    private boolean f1100i;

    /* renamed from: j */
    private boolean f1101j;

    /* renamed from: k */
    private boolean f1102k;

    /* renamed from: l */
    private String f1103l;

    public C0392h(int i, int i2) {
        this(i, i2, null);
        if (m928f()) {
            this.f1102k = false;
            this.f1103l = "mb";
        } else {
            this.f1102k = true;
        }
    }

    private C0392h(int i, int i2, String str) {
        this.f1098g = i;
        this.f1099h = i2;
        this.f1103l = str;
        this.f1100i = i == -1;
        this.f1101j = i2 == -2;
        this.f1102k = false;
    }

    /* renamed from: a */
    public static C0392h m927a(C0392h c0392h, Context context) {
        int iM929a;
        int iM930b;
        if (context == null || !c0392h.m928f()) {
            return c0392h.m928f() ? f1093b : c0392h;
        }
        if (c0392h.f1100i) {
            iM929a = (int) (context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density);
        } else {
            iM929a = c0392h.m929a();
        }
        if (c0392h.f1101j) {
            int i = (int) (context.getResources().getDisplayMetrics().heightPixels / context.getResources().getDisplayMetrics().density);
            if (i <= 400) {
                iM930b = 32;
            } else {
                iM930b = i <= 720 ? 50 : 90;
            }
        } else {
            iM930b = c0392h.m930b();
        }
        C0392h c0392h2 = new C0392h(iM929a, iM930b, c0392h.f1103l);
        c0392h2.f1101j = c0392h.f1101j;
        c0392h2.f1100i = c0392h.f1100i;
        c0392h2.f1102k = c0392h.f1102k;
        return c0392h2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0392h)) {
            return false;
        }
        C0392h c0392h = (C0392h) obj;
        return this.f1098g == c0392h.f1098g && this.f1099h == c0392h.f1099h;
    }

    public final int hashCode() {
        return (Integer.valueOf(this.f1098g).hashCode() << 16) | (Integer.valueOf(this.f1099h).hashCode() & 65535);
    }

    /* renamed from: a */
    public final int m929a() {
        if (this.f1098g < 0) {
            throw new UnsupportedOperationException("Ad size was not set before getWidth() was called.");
        }
        return this.f1098g;
    }

    /* renamed from: b */
    public final int m930b() {
        if (this.f1099h < 0) {
            throw new UnsupportedOperationException("Ad size was not set before getHeight() was called.");
        }
        return this.f1099h;
    }

    /* renamed from: f */
    private boolean m928f() {
        return this.f1098g < 0 || this.f1099h < 0;
    }

    /* renamed from: c */
    public final boolean m931c() {
        return this.f1100i;
    }

    /* renamed from: d */
    public final boolean m932d() {
        return this.f1101j;
    }

    /* renamed from: e */
    public final boolean m933e() {
        return this.f1102k;
    }

    public final String toString() {
        return m929a() + "x" + m930b() + (this.f1103l == null ? "" : "_" + this.f1103l);
    }
}
