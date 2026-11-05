package com.cyo.comicrack.p019a.p021b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p020a.C0505b;
import java.io.IOException;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.c */
/* loaded from: classes.dex */
public final class C0601c {

    /* renamed from: a */
    public View f1796a;

    /* renamed from: b */
    public InterfaceC0606h f1797b;

    /* renamed from: c */
    public C0505b f1798c;

    /* renamed from: d */
    public int f1799d;

    /* renamed from: e */
    public int f1800e;

    /* renamed from: f */
    public int f1801f;

    /* renamed from: g */
    public Drawable f1802g;

    /* renamed from: h */
    public boolean f1803h;

    /* renamed from: i */
    public boolean f1804i;

    public C0601c() {
        this.f1804i = true;
    }

    public C0601c(View view, InterfaceC0606h interfaceC0606h, C0505b c0505b, int i, int i2, int i3, Drawable drawable, boolean z) {
        this.f1804i = true;
        this.f1796a = view;
        this.f1797b = interfaceC0606h;
        this.f1798c = c0505b;
        this.f1799d = i;
        this.f1800e = i2;
        this.f1801f = i3;
        this.f1802g = drawable;
        this.f1804i = z;
    }

    /* renamed from: a */
    public final boolean m1287a() {
        C0601c c0601c = (C0601c) this.f1796a.getTag();
        return c0601c != null && this.f1798c == c0601c.f1798c && c0601c.f1799d == this.f1799d;
    }

    /* renamed from: b */
    public final boolean m1289b() {
        C0505b c0505bMo1298a;
        if (this.f1797b == null) {
            this.f1797b = C0628f.m1354a(this.f1798c, false);
        }
        if (this.f1799d < 0) {
            if (this.f1798c != null) {
                c0505bMo1298a = this.f1798c;
            } else {
                c0505bMo1298a = this.f1797b != null ? this.f1797b.mo1298a() : null;
            }
            this.f1799d = c0505bMo1298a == null ? 0 : c0505bMo1298a.m1180y();
        }
        return this.f1797b != null;
    }

    /* renamed from: c */
    public final void m1290c() {
        if (this.f1802g != null) {
            C0586a.m1262a(this.f1796a, this.f1802g);
        }
        this.f1796a.setTag(null);
    }

    /* renamed from: a */
    public final boolean m1288a(EnumC0590ad enumC0590ad) {
        Bitmap bitmapM1283a = C0628f.m1362b().m1283a(this.f1797b, this.f1799d, enumC0590ad);
        if (bitmapM1283a != null) {
            C0586a.m1261a(this.f1796a, bitmapM1283a, this.f1800e, enumC0590ad == EnumC0590ad.All);
        }
        return bitmapM1283a != null;
    }
}
