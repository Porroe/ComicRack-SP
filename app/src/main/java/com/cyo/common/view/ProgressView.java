package com.cyo.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.cyo.comicrack.viewer.C0808fx;
import com.cyo.common.p022a.C0933d;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class ProgressView extends View {

    /* renamed from: a */
    Paint f3520a;

    /* renamed from: b */
    private int f3521b;

    /* renamed from: c */
    private int f3522c;

    /* renamed from: d */
    private int f3523d;

    /* renamed from: e */
    private int f3524e;

    public ProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3521b = 50;
        this.f3522c = 75;
        this.f3523d = -16711936;
        this.f3524e = -65536;
        this.f3520a = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0808fx.ProgressView);
        this.f3521b = typedArrayObtainStyledAttributes.getInt(C0808fx.ProgressView_percent1, this.f3521b);
        this.f3523d = typedArrayObtainStyledAttributes.getColor(C0808fx.ProgressView_color1, this.f3523d);
        this.f3522c = typedArrayObtainStyledAttributes.getInt(C0808fx.ProgressView_percent2, this.f3522c);
        this.f3524e = typedArrayObtainStyledAttributes.getColor(C0808fx.ProgressView_color2, this.f3524e);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ProgressView(Context context) {
        this(context, null);
    }

    public int getPercent1() {
        return this.f3521b;
    }

    public void setPercent1(int i) {
        if (this.f3521b != i) {
            this.f3521b = i;
            invalidate();
        }
    }

    public int getColor1() {
        return this.f3523d;
    }

    public void setColor1(int i) {
        if (this.f3523d != i) {
            this.f3523d = i;
            invalidate();
        }
    }

    public int getPercent2() {
        return this.f3521b;
    }

    public void setPercent2(int i) {
        if (this.f3522c != i) {
            this.f3522c = i;
            invalidate();
        }
    }

    public int getColor2() {
        return this.f3524e;
    }

    public void setColor2(int i) {
        if (this.f3524e != i) {
            this.f3524e = i;
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3520a.setColor(this.f3524e);
        canvas.drawRect(C0933d.m1962a(0, 0, (getWidth() * this.f3522c) / 100, getHeight()), this.f3520a);
        this.f3520a.setColor(this.f3523d);
        canvas.drawRect(C0933d.m1962a(0, 0, (getWidth() * this.f3521b) / 100, getHeight()), this.f3520a);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }
}
