package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class PagerTabStrip extends C0148ai {

    /* renamed from: f */
    private int f382f;

    /* renamed from: g */
    private int f383g;

    /* renamed from: h */
    private int f384h;

    /* renamed from: i */
    private int f385i;

    /* renamed from: j */
    private int f386j;

    /* renamed from: k */
    private int f387k;

    /* renamed from: l */
    private final Paint f388l;

    /* renamed from: m */
    private final Rect f389m;

    /* renamed from: n */
    private int f390n;

    /* renamed from: o */
    private boolean f391o;

    /* renamed from: p */
    private boolean f392p;

    /* renamed from: q */
    private int f393q;

    /* renamed from: r */
    private boolean f394r;

    /* renamed from: s */
    private float f395s;

    /* renamed from: t */
    private float f396t;

    /* renamed from: u */
    private int f397u;

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f388l = new Paint();
        this.f389m = new Rect();
        this.f390n = 255;
        this.f391o = false;
        this.f392p = false;
        this.f382f = this.f485e;
        this.f388l.setColor(this.f382f);
        float f = context.getResources().getDisplayMetrics().density;
        this.f383g = (int) ((3.0f * f) + 0.5f);
        this.f384h = (int) ((6.0f * f) + 0.5f);
        this.f385i = (int) (64.0f * f);
        this.f387k = (int) ((16.0f * f) + 0.5f);
        this.f393q = (int) ((1.0f * f) + 0.5f);
        this.f386j = (int) ((f * 32.0f) + 0.5f);
        this.f397u = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f482b.setFocusable(true);
        this.f482b.setOnClickListener(new ViewOnClickListenerC0146ag(this));
        this.f484d.setFocusable(true);
        this.f484d.setOnClickListener(new ViewOnClickListenerC0147ah(this));
        if (getBackground() == null) {
            this.f391o = true;
        }
    }

    public void setTabIndicatorColor(int i) {
        this.f382f = i;
        this.f388l.setColor(this.f382f);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(getContext().getResources().getColor(i));
    }

    public int getTabIndicatorColor() {
        return this.f382f;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f384h) {
            i4 = this.f384h;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.support.v4.view.C0148ai
    public void setTextSpacing(int i) {
        if (i < this.f385i) {
            i = this.f385i;
        }
        super.setTextSpacing(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f392p) {
            this.f391o = drawable == null;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f392p) {
            this.f391o = ((-16777216) & i) == 0;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f392p) {
            this.f391o = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f391o = z;
        this.f392p = true;
        invalidate();
    }

    public boolean getDrawFullUnderline() {
        return this.f391o;
    }

    @Override // android.support.v4.view.C0148ai
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f386j);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction();
        if (action != 0 && this.f394r) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.f395s = x;
                this.f396t = y;
                this.f394r = false;
                break;
            case 1:
                if (x >= this.f483c.getLeft() - this.f387k) {
                    if (x > this.f483c.getRight() + this.f387k) {
                        this.f481a.setCurrentItem(this.f481a.getCurrentItem() + 1);
                        break;
                    }
                } else {
                    this.f481a.setCurrentItem(this.f481a.getCurrentItem() - 1);
                    break;
                }
                break;
            case 2:
                if (Math.abs(x - this.f395s) > this.f397u || Math.abs(y - this.f396t) > this.f397u) {
                    this.f394r = true;
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f483c.getLeft() - this.f387k;
        int right = this.f483c.getRight() + this.f387k;
        int i = height - this.f383g;
        this.f388l.setColor((this.f390n << 24) | (this.f382f & 16777215));
        canvas.drawRect(left, i, right, height, this.f388l);
        if (this.f391o) {
            this.f388l.setColor((-16777216) | (this.f382f & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f393q, getWidth() - getPaddingRight(), height, this.f388l);
        }
    }

    @Override // android.support.v4.view.C0148ai
    /* renamed from: a */
    final void mo294a(int i, float f, boolean z) {
        Rect rect = this.f389m;
        int height = getHeight();
        int left = this.f483c.getLeft() - this.f387k;
        int right = this.f483c.getRight() + this.f387k;
        int i2 = height - this.f383g;
        rect.set(left, i2, right, height);
        super.mo294a(i, f, z);
        this.f390n = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f483c.getLeft() - this.f387k, i2, this.f483c.getRight() + this.f387k, height);
        invalidate(rect);
    }
}
