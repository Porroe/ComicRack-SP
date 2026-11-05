package com.p004a.p012b.p013a.p014a;

/* renamed from: com.a.b.a.a.h */
/* loaded from: classes.dex */
final class C0435h {

    /* renamed from: a */
    final long f1372a;

    /* renamed from: b */
    final String f1373b;

    /* renamed from: c */
    int f1374c;

    /* renamed from: d */
    int f1375d;

    /* renamed from: e */
    int f1376e;

    /* renamed from: f */
    int f1377f;

    /* renamed from: g */
    int f1378g;

    /* renamed from: h */
    int f1379h;

    /* renamed from: i */
    int f1380i;

    /* renamed from: j */
    boolean f1381j;

    /* renamed from: k */
    boolean f1382k;

    /* renamed from: l */
    final String f1383l;

    /* renamed from: m */
    final String f1384m;

    /* renamed from: n */
    final String f1385n;

    /* renamed from: o */
    final int f1386o;

    /* renamed from: p */
    final int f1387p;

    /* renamed from: q */
    final int f1388q;

    /* renamed from: r */
    C0432e f1389r;

    /* renamed from: s */
    C0426aa f1390s;

    /* renamed from: t */
    C0443p f1391t;

    C0435h(long j, String str, int i, int i2, int i3, int i4, int i5, String str2, String str3, String str4, int i6, int i7, int i8) {
        this.f1372a = j;
        this.f1373b = str;
        this.f1374c = i;
        this.f1376e = i2;
        this.f1377f = i3;
        this.f1378g = i4;
        this.f1379h = i5;
        this.f1383l = str2;
        this.f1384m = str3;
        this.f1385n = str4;
        this.f1386o = i6;
        this.f1388q = i8;
        this.f1387p = i7;
        this.f1380i = -1;
        this.f1382k = false;
    }

    C0435h(C0435h c0435h, String str) {
        this(c0435h.f1372a, str, c0435h.f1374c, c0435h.f1376e, c0435h.f1377f, c0435h.f1378g, c0435h.f1379h, c0435h.f1383l, c0435h.f1384m, c0435h.f1385n, c0435h.f1386o, c0435h.f1387p, c0435h.f1388q);
        this.f1375d = c0435h.f1375d;
        this.f1380i = c0435h.f1380i;
        this.f1381j = c0435h.f1381j;
        this.f1382k = c0435h.f1382k;
        this.f1389r = c0435h.f1389r;
        this.f1390s = c0435h.f1390s;
        this.f1391t = c0435h.f1391t;
    }

    C0435h(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this(-1L, str, -1, -1, -1, -1, -1, str2, str3, str4, i, i2, i3);
    }

    public final String toString() {
        return "id:" + this.f1372a + " random:" + this.f1374c + " timestampCurrent:" + this.f1378g + " timestampPrevious:" + this.f1377f + " timestampFirst:" + this.f1376e + " visits:" + this.f1379h + " value:" + this.f1386o + " category:" + this.f1383l + " action:" + this.f1384m + " label:" + this.f1385n + " width:" + this.f1387p + " height:" + this.f1388q;
    }
}
