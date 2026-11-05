package com.cyo.comicrack.p019a.p021b;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import com.cyo.common.C0951ag;
import com.cyo.common.p022a.AbstractC0934e;
import com.cyo.common.p022a.C0933d;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.t */
/* loaded from: classes.dex */
public final class C0618t extends AbstractC0587aa {

    /* renamed from: a */
    int f1839a;

    /* renamed from: b */
    int f1840b;

    /* renamed from: f */
    private Bitmap f1841f;

    /* renamed from: g */
    private C0619u[] f1842g;

    /* renamed from: h */
    private int f1843h;

    /* renamed from: i */
    private int f1844i;

    public C0618t(Bitmap bitmap, int i) {
        this.f1841f = bitmap;
        this.f1844i = i;
        if (bitmap != null) {
            this.f1840b = bitmap.getWidth();
            this.f1839a = bitmap.getHeight();
        }
        if (this.f1844i > 0) {
            m1330i();
        }
    }

    public C0618t(Bitmap bitmap) {
        this(bitmap, C0951ag.m2004d() ? 2048 : 0);
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: a */
    public final void mo1271a(AbstractC0934e abstractC0934e, Paint paint) {
        if (this.f1841f != null || this.f1842g != null) {
            if (this.f1842g == null && this.f1844i > 0) {
                m1330i();
            }
            if (this.f1842g == null) {
                if (!this.f1841f.isRecycled()) {
                    abstractC0934e.m1963a(this.f1841f, paint);
                    return;
                }
                return;
            }
            for (C0619u c0619u : this.f1842g) {
                if (c0619u != null && c0619u.f1845a != null && !c0619u.f1845a.isRecycled()) {
                    abstractC0934e.mo1928a(c0619u.f1845a, c0619u.f1846b, c0619u.f1847c, paint);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m1331a(AbstractC0934e abstractC0934e, Rect rect, Paint paint) {
        abstractC0934e.mo1934c();
        float fWidth = rect.width() / this.f1840b;
        float fHeight = rect.height() / this.f1839a;
        abstractC0934e.mo1933b(fWidth, fHeight);
        abstractC0934e.mo1927a(rect.left / fWidth, rect.top / fHeight);
        mo1271a(abstractC0934e, paint);
        abstractC0934e.mo1935d();
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: a */
    protected final void mo1269a() {
        if (this.f1842g != null) {
            for (C0619u c0619u : this.f1842g) {
                if (c0619u != null && c0619u.f1845a != null && !c0619u.f1845a.isRecycled()) {
                    c0619u.f1845a.recycle();
                }
            }
            this.f1842g = null;
        }
        if (this.f1841f != null && !this.f1841f.isRecycled()) {
            this.f1841f.recycle();
        }
        this.f1841f = null;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: b */
    public final int mo1273b() {
        return this.f1840b;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: c */
    public final int mo1274c() {
        return this.f1839a;
    }

    /* renamed from: i */
    private void m1330i() {
        if (this.f1841f != null) {
            int width = this.f1841f.getWidth();
            int height = this.f1841f.getHeight();
            this.f1843h = ((width - 1) / this.f1844i) + 1;
            int i = ((height - 1) / this.f1844i) + 1;
            this.f1842g = new C0619u[this.f1843h * i];
            if (this.f1842g.length == 1) {
                this.f1842g[0] = new C0619u(this.f1841f, C0933d.m1962a(0, 0, width, height));
            } else {
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    for (int i4 = 0; i4 < this.f1843h; i4++) {
                        int i5 = i4 * this.f1844i;
                        int i6 = i3 * this.f1844i;
                        int iMin = Math.min(this.f1844i, width - i5);
                        int iMin2 = Math.min(this.f1844i, height - i6);
                        int i7 = 0;
                        while (true) {
                            int i8 = i7;
                            int i9 = i2;
                            if (i8 >= 2) {
                                i2 = i9;
                                break;
                            }
                            try {
                                i2 = i9 + 1;
                            } catch (OutOfMemoryError e) {
                                i2 = i9;
                            }
                            try {
                                this.f1842g[i9] = new C0619u(Bitmap.createBitmap(this.f1841f, i5, i6, iMin, iMin2), C0933d.m1962a(i5, i6, iMin, iMin2));
                                break;
                            } catch (OutOfMemoryError e2) {
                                if (i8 == 0) {
                                    System.gc();
                                }
                                i7 = i8 + 1;
                            }
                            i7 = i8 + 1;
                        }
                    }
                }
                this.f1841f.recycle();
            }
            this.f1841f = null;
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: d */
    public final Bitmap mo1275d() {
        return null;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: a */
    public final int mo1268a(int i, int i2) {
        int pixel = 0;
        try {
            if (this.f1841f != null) {
                pixel = this.f1841f.getPixel(i, i2);
            } else if (this.f1842g != null && this.f1842g.length != 0) {
                if (this.f1842g.length == 1) {
                    pixel = this.f1842g[0].f1845a.getPixel(i, i2);
                } else {
                    pixel = this.f1842g[(i / this.f1844i) + ((i2 / this.f1844i) * this.f1843h)].f1845a.getPixel(i % this.f1844i, i2 % this.f1844i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pixel;
    }
}
