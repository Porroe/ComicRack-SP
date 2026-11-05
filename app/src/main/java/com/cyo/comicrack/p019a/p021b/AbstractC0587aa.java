package com.cyo.comicrack.p019a.p021b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.cyo.common.p022a.AbstractC0934e;
import com.cyo.common.p022a.C0931b;
import com.cyo.common.p022a.C0932c;
import com.cyo.common.p022a.C0939j;
import com.cyo.common.p022a.InterfaceC0942m;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.aa */
/* loaded from: classes.dex */
public abstract class AbstractC0587aa implements InterfaceC0942m {

    /* renamed from: c */
    public boolean f1770c = true;

    /* renamed from: d */
    public boolean f1771d = false;

    /* renamed from: e */
    int f1772e;

    @Override // com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: a */
    public abstract int mo1268a(int i, int i2);

    /* renamed from: a */
    protected abstract void mo1269a();

    /* renamed from: a */
    public abstract void mo1271a(AbstractC0934e abstractC0934e, Paint paint);

    @Override // com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: b */
    public abstract int mo1273b();

    @Override // com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: c */
    public abstract int mo1274c();

    /* renamed from: d */
    public abstract Bitmap mo1275d();

    /* renamed from: a */
    public void mo1272a(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    /* renamed from: a */
    public final void m1270a(Canvas canvas, Paint paint) {
        mo1271a(new C0931b(canvas), paint);
    }

    /* renamed from: e */
    public boolean mo1276e() {
        return false;
    }

    /* renamed from: g */
    public final boolean m1278g() {
        return mo1273b() > mo1274c();
    }

    /* renamed from: h */
    public final void m1279h() {
        this.f1771d = true;
        if (this.f1770c) {
            mo1269a();
        }
    }

    /* renamed from: f */
    public int mo1277f() {
        if (this.f1772e != 0) {
            return this.f1772e;
        }
        int right = mo1273b() - 6;
        int bottom = mo1274c() - 6;
        int[] corners = {
                C0939j.m1971a(this, 2, 2),
                C0939j.m1971a(this, right, 2),
                C0939j.m1971a(this, right, bottom),
                C0939j.m1971a(this, 2, bottom)
        };
        int alpha = 0;
        int red = 0;
        int green = 0;
        int blue = 0;
        for (int color : corners) {
            alpha += Color.alpha(color);
            red += Color.red(color);
            green += Color.green(color);
            blue += Color.blue(color);
        }
        int mean = Color.argb(alpha / corners.length, red / corners.length,
                green / corners.length, blue / corners.length);
        boolean preferDark = C0932c.m1961b(mean) < 128;
        int selected = 0;
        for (int color : corners) {
            int brightness = C0932c.m1961b(color);
            int previous = C0932c.m1961b(selected);
            if (selected == 0 || (preferDark ? brightness < previous : brightness > previous)) {
                selected = color;
            }
        }
        this.f1772e = selected;
        return selected;
    }
}
