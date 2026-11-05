package com.cyo.common.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import com.cyo.common.p022a.C0932c;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class FastThumbView extends View {

    /* renamed from: a */
    static Paint f3503a;

    /* renamed from: b */
    static Paint f3504b;

    /* renamed from: c */
    private static int f3505c = 0;

    /* renamed from: d */
    private static final int f3506d = Color.rgb(235, 235, 235);

    /* renamed from: e */
    private Drawable f3507e;

    /* renamed from: f */
    private Bitmap f3508f;

    /* renamed from: g */
    private C1165t f3509g;

    /* renamed from: h */
    private int f3510h;

    /* renamed from: i */
    private boolean f3511i;

    /* renamed from: j */
    private boolean f3512j;

    /* renamed from: k */
    private int f3513k;

    /* renamed from: l */
    private Animation f3514l;

    static {
        Paint paint = new Paint();
        f3504b = paint;
        paint.setColor(-7829368);
        f3504b.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        f3503a = paint2;
        paint2.setColor(f3506d);
        f3503a.setStrokeWidth(1.0f);
    }

    /* renamed from: a */
    static /* synthetic */ void m2374a(FastThumbView fastThumbView) {
        fastThumbView.f3514l = null;
    }

    public FastThumbView(Context context) {
        super(context);
        this.f3509g = new C1165t();
        this.f3512j = true;
        this.f3513k = 255;
    }

    public FastThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3509g = new C1165t();
        this.f3512j = true;
        this.f3513k = 255;
    }

    public FastThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3509g = new C1165t();
        this.f3512j = true;
        this.f3513k = 255;
    }

    public void setStackMarker(int i) {
        if (this.f3510h != i) {
            this.f3510h = i;
            postInvalidate();
        }
    }

    public int getStackMarker() {
        return this.f3510h;
    }

    public void setShade(boolean z) {
        if (this.f3511i != z) {
            this.f3511i = z;
            postInvalidate();
        }
    }

    public boolean getShade() {
        return this.f3511i;
    }

    public void setFilter(boolean z) {
        if (this.f3512j != z) {
            this.f3512j = z;
            postInvalidate();
        }
    }

    public void setImageAlpha(int i) {
        if (this.f3513k != i) {
            this.f3513k = i;
            postInvalidate();
        }
    }

    public int getImageAlpha() {
        return this.f3513k;
    }

    public void setSplitDoublePages(boolean z) {
        if (this.f3509g.f3688d != z) {
            this.f3509g.f3688d = z;
            postInvalidate();
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        this.f3509g.f3686b = width - (this.f3510h * 2);
        this.f3509g.f3687c = height;
        if (m2376a() && this.f3509g.m2466a()) {
            canvas.save();
            canvas.concat(this.f3509g.m2481o());
            if (this.f3508f != null) {
                Paint paint = new Paint();
                paint.setFilterBitmap(true);
                if (this.f3513k < 250) {
                    paint.setAlpha(this.f3513k);
                }
                canvas.drawBitmap(this.f3508f, 0.0f, 0.0f, paint);
            } else if (this.f3507e != null) {
                Drawable drawable = this.f3507e;
                C1165t c1165t = this.f3509g;
                drawable.setBounds(new Rect(0, 0, c1165t.f3691g, c1165t.f3692h));
                this.f3507e.setAlpha(this.f3513k);
                this.f3507e.setFilterBitmap(true);
                this.f3507e.draw(canvas);
            }
            canvas.restore();
            if (this.f3511i) {
                Paint paint2 = new Paint();
                Rect rect = new Rect(0, 0, width, height);
                float fWidth = rect.width() / 12;
                paint2.setShader(new LinearGradient(0.0f, 0.0f, fWidth, 0.0f, C0932c.m1960a(128, -16777216), 0, Shader.TileMode.CLAMP));
                canvas.drawRect(rect, paint2);
                paint2.setShader(new LinearGradient(rect.right, 0.0f, rect.right - fWidth, 0.0f, C0932c.m1960a(128, -16777216), 0, Shader.TileMode.CLAMP));
                canvas.drawRect(rect, paint2);
            }
            if (this.f3510h > 0) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < this.f3510h) {
                        int i3 = width - ((i2 + 1) * 2);
                        canvas.drawLine(i3, 0.0f, i3, height, f3504b);
                        canvas.drawLine(i3 + 1, 0.0f, i3 + 1, height, f3503a);
                        i = i2 + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    /* renamed from: a */
    public final void m2377a(Bitmap bitmap, boolean z) {
        if (this.f3508f != bitmap) {
            this.f3508f = bitmap;
            this.f3507e = null;
            m2375a(z);
        }
    }

    public final void setImageDrawable$4eb43225(Drawable drawable) {
        if (this.f3507e != drawable) {
            this.f3507e = drawable;
            this.f3508f = null;
            m2375a(false);
        }
    }

    /* renamed from: a */
    private boolean m2376a() {
        return (this.f3508f == null && this.f3507e == null) ? false : true;
    }

    /* renamed from: a */
    private void m2375a(boolean z) {
        if (this.f3508f != null) {
            this.f3509g.m2465a(this.f3508f.getWidth(), this.f3508f.getHeight());
        } else if (this.f3507e != null) {
            this.f3509g.m2465a(this.f3507e.getIntrinsicWidth(), this.f3507e.getIntrinsicHeight());
        }
        this.f3509g.f3695k = 0.1f;
        this.f3509g.f3685a = EnumC1164s.FitInside;
        this.f3509g.f3693i = this.f3509g.f3691g;
        postInvalidate();
        if (f3505c != 0) {
            if (this.f3514l != null) {
                clearAnimation();
                this.f3514l = null;
            }
            if (!z || !m2376a()) {
                setImageAlpha(255);
                return;
            }
            C1118al c1118al = new C1118al(this, (byte) 0);
            setImageAlpha(0);
            c1118al.setAnimationListener(new AnimationAnimationListenerC1117ak(this));
            c1118al.setDuration(f3505c);
            this.f3514l = c1118al;
            startAnimation(c1118al);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        setImageDrawable$4eb43225(drawable);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m2377a(bitmap, false);
    }

    public Drawable getImageDrawable() {
        return this.f3507e;
    }
}
