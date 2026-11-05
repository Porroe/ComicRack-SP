package com.cyo.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.cyo.comicrack.viewer.C0808fx;
import com.cyo.common.p022a.C0933d;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class SimpleRatingBar extends View {

    /* renamed from: a */
    private Drawable f3551a;

    /* renamed from: b */
    private Drawable f3552b;

    /* renamed from: c */
    private int f3553c;

    /* renamed from: d */
    private int f3554d;

    /* renamed from: e */
    private float f3555e;

    /* renamed from: f */
    private int f3556f;

    public SimpleRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3553c = 255;
        this.f3554d = 255;
        this.f3555e = 3.0f;
        this.f3556f = 5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0808fx.SimpleRatingBar);
        this.f3555e = typedArrayObtainStyledAttributes.getFloat(C0808fx.SimpleRatingBar_rating, this.f3555e);
        this.f3556f = typedArrayObtainStyledAttributes.getInt(C0808fx.SimpleRatingBar_max_rating, this.f3556f);
        this.f3551a = typedArrayObtainStyledAttributes.getDrawable(C0808fx.SimpleRatingBar_full);
        this.f3552b = typedArrayObtainStyledAttributes.getDrawable(C0808fx.SimpleRatingBar_empty);
        this.f3553c = typedArrayObtainStyledAttributes.getInt(C0808fx.SimpleRatingBar_full_alpha, this.f3553c);
        this.f3554d = typedArrayObtainStyledAttributes.getInt(C0808fx.SimpleRatingBar_empty_alpha, this.f3554d);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getMaxRating() {
        return this.f3556f;
    }

    public void setMaxRating(int i) {
        if (this.f3556f != i) {
            this.f3556f = i;
            invalidate();
        }
    }

    public float getRating() {
        return this.f3555e;
    }

    public void setRating(float f) {
        if (this.f3555e != f) {
            this.f3555e = f;
            invalidate();
        }
    }

    public Drawable getFullIndicator() {
        return this.f3551a;
    }

    public void setFullIndicator(Drawable drawable) {
        this.f3551a = drawable;
        invalidate();
    }

    public Drawable getEmptyIndicator() {
        return this.f3552b;
    }

    public void setEmptyIndicator(Drawable drawable) {
        this.f3552b = drawable;
        invalidate();
    }

    public int getFullIndicatorAlpha() {
        return this.f3553c;
    }

    public void setFullIndicatorAlpha(int i) {
        if (this.f3553c != i) {
            this.f3553c = i;
            invalidate();
        }
    }

    public int getEmptyIndicatorAlpha() {
        return this.f3554d;
    }

    public void setEmptyIndicatorAlpha(int i) {
        if (this.f3554d != i) {
            this.f3554d = i;
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m2394a(canvas, getWidth(), getHeight(), this.f3551a, this.f3553c, this.f3552b, this.f3554d, this.f3555e, this.f3556f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    /* renamed from: a */
    private static void m2394a(Canvas canvas, int i, int i2, Drawable drawable, int i3, Drawable drawable2, int i4, float f, int i5) {
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            C1165t c1165t = new C1165t(EnumC1164s.FitAll);
            c1165t.f3686b = i;
            c1165t.f3687c = i2;
            c1165t.m2465a(intrinsicWidth * i5, intrinsicHeight);
            canvas.save();
            canvas.concat(c1165t.m2481o());
            Rect rectM1962a = C0933d.m1962a(0, 0, intrinsicWidth, intrinsicHeight);
            if (drawable2 != null) {
                drawable2.setAlpha(i4);
                canvas.save();
                for (int i6 = 0; i6 < i5; i6++) {
                    drawable2.setBounds(rectM1962a);
                    drawable2.draw(canvas);
                    rectM1962a.left += intrinsicWidth;
                    rectM1962a.right += intrinsicWidth;
                }
                canvas.restore();
            }
            canvas.clipRect(C0933d.m1962a(0, 0, (int) ((c1165t.f3691g * f) / i5), c1165t.f3692h));
            drawable.setAlpha(i3);
            rectM1962a.left = 0;
            rectM1962a.right = intrinsicWidth;
            for (int i7 = 0; i7 < i5; i7++) {
                drawable.setBounds(rectM1962a);
                drawable.draw(canvas);
                rectM1962a.left += intrinsicWidth;
                rectM1962a.right += intrinsicWidth;
            }
            canvas.restore();
        }
    }

    /* renamed from: a */
    public static Bitmap m2393a(int i, int i2, Drawable drawable, Drawable drawable2, float f) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        m2394a(new Canvas(bitmapCreateBitmap), i, i2, drawable, 255, drawable2, 50, f, 5);
        return bitmapCreateBitmap;
    }
}
