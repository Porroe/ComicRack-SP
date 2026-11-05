package com.cyo.comicrack.p019a.p021b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.cyo.common.p022a.AbstractC0934e;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.y */
/* loaded from: classes.dex */
public final class C0623y extends AbstractC0587aa {

    /* renamed from: a */
    int f1862a;

    /* renamed from: b */
    private C0618t f1863b;

    /* renamed from: f */
    private C0618t f1864f;

    /* renamed from: g */
    private int f1865g;

    /* renamed from: h */
    private int f1866h;

    /* renamed from: i */
    private int f1867i;

    /* renamed from: j */
    private int f1868j;

    /* renamed from: k */
    private boolean f1869k = true;

    /* renamed from: l */
    private boolean f1870l = true;

    /* renamed from: m */
    private boolean f1871m = true;

    /* renamed from: n */
    private boolean f1872n = true;

    public C0623y(int i, Bitmap bitmap, int i2, Bitmap bitmap2, int i3) {
        this.f1862a = i;
        this.f1863b = bitmap == null ? null : new C0618t(bitmap);
        this.f1865g = i2;
        this.f1864f = bitmap2 != null ? new C0618t(bitmap2) : null;
        this.f1866h = i3;
        C0618t c0618t = this.f1863b;
        C0618t c0618t2 = this.f1864f;
        if (c0618t == null && c0618t2 == null) {
            return;
        }
        this.f1868j = Math.max(c0618t2 == null ? 0 : c0618t2.mo1274c(), c0618t == null ? 0 : c0618t.mo1274c());
        if (this.f1863b == null) {
            this.f1867i = this.f1864f.f1840b << 1;
        } else if (this.f1864f == null) {
            this.f1867i = this.f1863b.f1840b << 1;
        } else {
            this.f1867i = ((c0618t.mo1273b() * this.f1868j) / c0618t.mo1274c()) + ((c0618t2.mo1273b() * this.f1868j) / c0618t2.mo1274c());
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: a */
    protected final void mo1269a() {
        if (this.f1863b != null) {
            this.f1863b.m1279h();
            this.f1863b = null;
        }
        if (this.f1864f != null) {
            this.f1864f.m1279h();
            this.f1864f = null;
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: b */
    public final int mo1273b() {
        return this.f1867i;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: c */
    public final int mo1274c() {
        return this.f1868j;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: e */
    public final boolean mo1276e() {
        return true;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: d */
    public final Bitmap mo1275d() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f1867i, this.f1868j, Bitmap.Config.RGB_565);
        m1270a(new Canvas(bitmapCreateBitmap), (Paint) null);
        return bitmapCreateBitmap;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: a */
    public final int mo1268a(int i, int i2) {
        C0618t c0618t = this.f1863b;
        C0618t c0618t2 = this.f1864f;
        if (c0618t == null && c0618t2 == null) {
            return 0;
        }
        if (c0618t == null) {
            c0618t = c0618t2;
        } else if (c0618t2 == null) {
            c0618t2 = c0618t;
        }
        int i3 = c0618t.f1839a;
        int i4 = c0618t2.f1839a;
        int i5 = (c0618t.f1840b * this.f1868j) / i3;
        if (i < i5) {
            if (this.f1863b == null) {
                return 0;
            }
            return this.f1863b.mo1268a((i * i3) / this.f1868j, (i2 * i3) / this.f1868j);
        }
        int i6 = i - i5;
        if (this.f1864f == null) {
            return 0;
        }
        return this.f1864f.mo1268a((i6 * i4) / this.f1868j, (i4 * i2) / this.f1868j);
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: a */
    public final void mo1271a(AbstractC0934e abstractC0934e, Paint paint) {
        C0618t c0618t = this.f1863b;
        C0618t c0618t2 = this.f1864f;
        if (c0618t != null || c0618t2 != null) {
            if (c0618t == null) {
                c0618t = c0618t2;
            } else if (c0618t2 == null) {
                c0618t2 = c0618t;
            }
            int i = (c0618t.f1840b * this.f1868j) / c0618t.f1839a;
            int i2 = (c0618t2.f1840b * this.f1868j) / c0618t2.f1839a;
            Paint paint2 = paint == null ? new Paint() : new Paint(paint);
            paint2.setColor(this.f1866h);
            Paint paint3 = paint == null ? new Paint() : new Paint(paint);
            paint3.setColor(mo1277f());
            if (paint != null && paint.getAlpha() < 250) {
                paint2.setAlpha((paint2.getAlpha() * paint.getAlpha()) / 255);
                paint3.setAlpha((paint3.getAlpha() * paint.getAlpha()) / 255);
            }
            Rect rect = new Rect(i - 1, 0, i2 + i + 1, this.f1868j);
            switch (this.f1865g) {
                case -3:
                    abstractC0934e.mo1931a(rect, paint3);
                    break;
                case -2:
                    abstractC0934e.mo1931a(rect, paint2);
                    break;
                default:
                    c0618t2.mo1272a(false, this.f1869k, this.f1871m, this.f1872n);
                    c0618t2.m1331a(abstractC0934e, rect, paint);
                    break;
            }
            Rect rect2 = new Rect(0, 0, i + 1, this.f1868j);
            switch (this.f1862a) {
                case -3:
                    abstractC0934e.mo1931a(rect2, paint3);
                    break;
                case -2:
                    abstractC0934e.mo1931a(rect2, paint2);
                    break;
                default:
                    c0618t.mo1272a(this.f1870l, this.f1869k, false, this.f1872n);
                    c0618t.m1331a(abstractC0934e, rect2, paint);
                    break;
            }
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: f */
    public final int mo1277f() {
        return this.f1863b != null ? this.f1863b.mo1277f() : this.f1864f.mo1277f();
    }
}
