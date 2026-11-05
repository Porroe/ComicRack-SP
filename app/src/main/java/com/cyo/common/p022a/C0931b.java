package com.cyo.common.p022a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import com.cyo.common.C0951ag;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.b */
/* loaded from: classes.dex */
public final class C0931b extends AbstractC0934e {

    /* renamed from: a */
    private Canvas f2811a;

    public C0931b(Canvas canvas) {
        this.f2811a = canvas;
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1926a() {
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: b */
    public final void mo1932b() {
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: c */
    public final void mo1934c() {
        this.f2811a.save();
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: d */
    public final void mo1935d() {
        this.f2811a.restore();
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: e */
    public final void mo1936e() {
        this.f2811a.drawColor(-16777216);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1928a(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        this.f2811a.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: f */
    public final int mo1937f() {
        return this.f2811a.getWidth();
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: g */
    public final int mo1938g() {
        return this.f2811a.getHeight();
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: h */
    public final boolean mo1939h() {
        return C0951ag.m1998a(this.f2811a);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1930a(Rect rect) {
        this.f2811a.clipRect(rect);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1931a(Rect rect, Paint paint) {
        this.f2811a.drawRect(rect, paint);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1927a(float f, float f2) {
        this.f2811a.translate(f, f2);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: b */
    public final void mo1933b(float f, float f2) {
        this.f2811a.scale(f, f2);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1929a(Matrix matrix) {
        this.f2811a.concat(matrix);
    }
}
