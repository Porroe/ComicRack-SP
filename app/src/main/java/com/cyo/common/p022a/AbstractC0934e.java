package com.cyo.common.p022a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.e */
/* loaded from: classes.dex */
public abstract class AbstractC0934e {
    /* renamed from: a */
    public abstract void mo1926a();

    /* renamed from: a */
    public abstract void mo1927a(float f, float f2);

    /* renamed from: a */
    public abstract void mo1928a(Bitmap bitmap, Rect rect, Rect rect2, Paint paint);

    /* renamed from: a */
    public abstract void mo1929a(Matrix matrix);

    /* renamed from: a */
    public abstract void mo1930a(Rect rect);

    /* renamed from: a */
    public abstract void mo1931a(Rect rect, Paint paint);

    /* renamed from: b */
    public abstract void mo1932b();

    /* renamed from: b */
    public abstract void mo1933b(float f, float f2);

    /* renamed from: c */
    public abstract void mo1934c();

    /* renamed from: d */
    public abstract void mo1935d();

    /* renamed from: e */
    public abstract void mo1936e();

    /* renamed from: f */
    public abstract int mo1937f();

    /* renamed from: g */
    public abstract int mo1938g();

    /* renamed from: h */
    public abstract boolean mo1939h();

    /* renamed from: i */
    public void mo1940i() {
    }

    /* renamed from: a */
    public final void m1963a(Bitmap bitmap, Paint paint) {
        if (bitmap != null) {
            Rect rect = new Rect(0, 0, bitmap.getWidth() + 0, bitmap.getHeight() + 0);
            if (bitmap != null) {
                mo1928a(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), rect, paint);
            }
        }
    }
}
