package com.cyo.comicrack.p019a.p021b;

import android.graphics.Bitmap;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p020a.C0537ce;
import com.cyo.comicrack.p019a.p020a.EnumC0539cg;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.x */
/* loaded from: classes.dex */
public final class C0622x {

    /* renamed from: a */
    public int f1854a;

    /* renamed from: b */
    public int f1855b;

    /* renamed from: c */
    public C0537ce f1856c;

    /* renamed from: d */
    public C0537ce f1857d;

    /* renamed from: e */
    public int f1858e;

    /* renamed from: f */
    public int f1859f;

    /* renamed from: g */
    public int f1860g;

    /* renamed from: h */
    final /* synthetic */ C0620v f1861h;

    public C0622x(C0620v c0620v, int i, C0537ce c0537ce) {
        this.f1861h = c0620v;
        this.f1854a = -1;
        this.f1855b = -1;
        this.f1858e = -1;
        this.f1854a = i;
        this.f1856c = c0537ce;
        m1348d();
    }

    public C0622x(C0620v c0620v, int i, C0537ce c0537ce, int i2, C0537ce c0537ce2, boolean z) {
        this.f1861h = c0620v;
        this.f1854a = -1;
        this.f1855b = -1;
        this.f1858e = -1;
        if (!z) {
            c0537ce2 = c0537ce;
            c0537ce = c0537ce2;
            i2 = i;
            i = i2;
        }
        this.f1854a = i2;
        this.f1856c = c0537ce2;
        this.f1855b = i;
        this.f1857d = c0537ce;
        m1348d();
    }

    /* renamed from: a */
    public final boolean m1344a() {
        return this.f1855b == -1;
    }

    /* renamed from: b */
    public final int m1346b() {
        return this.f1854a >= 0 ? this.f1854a : this.f1855b;
    }

    /* renamed from: c */
    public final int m1347c() {
        return this.f1855b >= 0 ? this.f1855b : this.f1854a;
    }

    /* renamed from: a */
    public final boolean m1345a(EnumC0539cg enumC0539cg) {
        EnumC0539cg[] enumC0539cgArr;
        try {
            if (m1344a()) {
                enumC0539cgArr = new EnumC0539cg[]{C0620v.m1332a(this.f1861h).mo1299a(this.f1854a).mo1193f()};
            } else if (this.f1854a < 0 || this.f1855b < 0) {
                enumC0539cgArr = this.f1854a >= 0 ? new EnumC0539cg[]{C0620v.m1332a(this.f1861h).mo1299a(this.f1854a).mo1193f()} : new EnumC0539cg[]{C0620v.m1332a(this.f1861h).mo1299a(this.f1855b).mo1193f()};
            } else {
                enumC0539cgArr = new EnumC0539cg[]{C0620v.m1332a(this.f1861h).mo1299a(this.f1854a).mo1193f(), C0620v.m1332a(this.f1861h).mo1299a(this.f1855b).mo1193f()};
            }
            for (EnumC0539cg enumC0539cg2 : enumC0539cgArr) {
                if (enumC0539cg2 == enumC0539cg) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: a */
    final Bitmap m1343a(int i) {
        if (i < 0) {
            return null;
        }
        return C0628f.m1362b().m1282a(C0620v.m1332a(this.f1861h), i);
    }

    /* renamed from: d */
    final void m1348d() {
        C0537ce c0537ce = this.f1856c == null ? this.f1857d : this.f1856c;
        C0537ce c0537ce2 = this.f1857d == null ? this.f1856c : this.f1857d;
        int i = this.f1854a == -1 ? 0 : c0537ce.f1669g;
        int i2 = this.f1855b == -1 ? 0 : c0537ce2.f1669g;
        this.f1860g = Math.max(c0537ce.f1670h, c0537ce2.f1670h);
        this.f1859f = (this.f1860g == 0 ? 0 : (c0537ce.f1670h * i) / this.f1860g) + (this.f1860g != 0 ? (c0537ce2.f1670h * i2) / this.f1860g : 0);
    }
}
