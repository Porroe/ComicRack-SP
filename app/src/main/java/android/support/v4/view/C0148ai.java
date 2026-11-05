package android.support.v4.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.ai */
/* loaded from: classes.dex */
public class C0148ai extends ViewGroup implements InterfaceC0184br {

    /* renamed from: n */
    private static final int[] f478n = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: o */
    private static final int[] f479o = {R.attr.textAllCaps};

    /* renamed from: q */
    private static final InterfaceC0150ak f480q;

    /* renamed from: a */
    ViewPager f481a;

    /* renamed from: b */
    TextView f482b;

    /* renamed from: c */
    TextView f483c;

    /* renamed from: d */
    TextView f484d;

    /* renamed from: e */
    int f485e;

    /* renamed from: f */
    private int f486f;

    /* renamed from: g */
    private float f487g;

    /* renamed from: h */
    private int f488h;

    /* renamed from: i */
    private int f489i;

    /* renamed from: j */
    private boolean f490j;

    /* renamed from: k */
    private boolean f491k;

    /* renamed from: l */
    private final C0149aj f492l;

    /* renamed from: m */
    private WeakReference f493m;

    /* renamed from: p */
    private int f494p;

    /* renamed from: a */
    static /* synthetic */ float m410a(C0148ai c0148ai) {
        return c0148ai.f487g;
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f480q = new C0152am();
        } else {
            f480q = new C0151al();
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        f480q.mo417a(textView);
    }

    public C0148ai(Context context) {
        this(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148ai(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        boolean z = false;
        this.f486f = -1;
        this.f487g = -1.0f;
        this.f492l = new C0149aj(this, (byte) 0);
        TextView textView = new TextView(context);
        this.f482b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f483c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f484d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f478n);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f482b.setTextAppearance(context, resourceId);
            this.f483c.setTextAppearance(context, resourceId);
            this.f484d.setTextAppearance(context, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            this.f482b.setTextSize(0, f);
            this.f483c.setTextSize(0, f);
            this.f484d.setTextSize(0, f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f482b.setTextColor(color);
            this.f483c.setTextColor(color);
            this.f484d.setTextColor(color);
        }
        this.f489i = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f485e = this.f483c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f482b.setEllipsize(TextUtils.TruncateAt.END);
        this.f483c.setEllipsize(TextUtils.TruncateAt.END);
        this.f484d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f479o);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f482b);
            setSingleLineAllCaps(this.f483c);
            setSingleLineAllCaps(this.f484d);
        } else {
            this.f482b.setSingleLine();
            this.f483c.setSingleLine();
            this.f484d.setSingleLine();
        }
        this.f488h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    public void setTextSpacing(int i) {
        this.f488h = i;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.f488h;
    }

    public void setNonPrimaryAlpha(float f) {
        this.f494p = ((int) (255.0f * f)) & 255;
        int i = (this.f494p << 24) | (this.f485e & 16777215);
        this.f482b.setTextColor(i);
        this.f484d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f485e = i;
        this.f483c.setTextColor(i);
        int i2 = (this.f494p << 24) | (this.f485e & 16777215);
        this.f482b.setTextColor(i2);
        this.f484d.setTextColor(i2);
    }

    public void setGravity(int i) {
        this.f489i = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        AbstractC0145af adapter = viewPager.getAdapter();
        viewPager.m323a(this.f492l);
        viewPager.setOnAdapterChangeListener(this.f492l);
        this.f481a = viewPager;
        m412a(this.f493m != null ? (AbstractC0145af) this.f493m.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f481a != null) {
            m412a(this.f481a.getAdapter(), (AbstractC0145af) null);
            this.f481a.m323a((InterfaceC0189bw) null);
            this.f481a.setOnAdapterChangeListener(null);
            this.f481a = null;
        }
    }

    /* renamed from: a */
    final void m411a(int i, AbstractC0145af abstractC0145af) {
        CharSequence charSequenceMo405b = null;
        int iMo408c = abstractC0145af != null ? abstractC0145af.mo408c() : 0;
        this.f490j = true;
        this.f482b.setText((i <= 0 || abstractC0145af == null) ? null : abstractC0145af.mo405b(i - 1));
        this.f483c.setText((abstractC0145af == null || i >= iMo408c) ? null : abstractC0145af.mo405b(i));
        if (i + 1 < iMo408c && abstractC0145af != null) {
            charSequenceMo405b = abstractC0145af.mo405b(i + 1);
        }
        this.f484d.setText(charSequenceMo405b);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (width * 0.8f), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
        this.f482b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f483c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f484d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f486f = i;
        if (!this.f491k) {
            mo294a(i, this.f487g, false);
        }
        this.f490j = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f490j) {
            super.requestLayout();
        }
    }

    /* renamed from: a */
    final void m412a(AbstractC0145af abstractC0145af, AbstractC0145af abstractC0145af2) {
        if (abstractC0145af != null) {
            abstractC0145af.m406b(this.f492l);
            this.f493m = null;
        }
        if (abstractC0145af2 != null) {
            abstractC0145af2.m404a(this.f492l);
            this.f493m = new WeakReference(abstractC0145af2);
        }
        if (this.f481a != null) {
            this.f486f = -1;
            this.f487g = -1.0f;
            m411a(this.f481a.getCurrentItem(), abstractC0145af2);
            requestLayout();
        }
    }

    /* renamed from: a */
    void mo294a(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i != this.f486f) {
            m411a(i, this.f481a.getAdapter());
        } else if (!z && f == this.f487g) {
            return;
        }
        this.f491k = true;
        int measuredWidth = this.f482b.getMeasuredWidth();
        int measuredWidth2 = this.f483c.getMeasuredWidth();
        int measuredWidth3 = this.f484d.getMeasuredWidth();
        int i5 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = paddingRight + i5;
        int i7 = (width - (paddingLeft + i5)) - i6;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i8 = ((width - i6) - ((int) (f2 * i7))) - i5;
        int i9 = i8 + measuredWidth2;
        int baseline = this.f482b.getBaseline();
        int baseline2 = this.f483c.getBaseline();
        int baseline3 = this.f484d.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i10 = iMax - baseline;
        int i11 = iMax - baseline2;
        int i12 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f482b.getMeasuredHeight() + i10, this.f483c.getMeasuredHeight() + i11), this.f484d.getMeasuredHeight() + i12);
        switch (this.f489i & 112) {
            case 16:
                int i13 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
                i2 = i13 + i10;
                i3 = i13 + i11;
                i4 = i13 + i12;
                break;
            case 80:
                int i14 = (height - paddingBottom) - iMax2;
                i2 = i14 + i10;
                i3 = i14 + i11;
                i4 = i14 + i12;
                break;
            default:
                i2 = paddingTop + i10;
                i3 = paddingTop + i11;
                i4 = paddingTop + i12;
                break;
        }
        this.f483c.layout(i8, i3, i9, this.f483c.getMeasuredHeight() + i3);
        int iMin = Math.min(paddingLeft, (i8 - this.f488h) - measuredWidth);
        this.f482b.layout(iMin, i2, measuredWidth + iMin, this.f482b.getMeasuredHeight() + i2);
        int iMax3 = Math.max((width - paddingRight) - measuredWidth3, this.f488h + i9);
        this.f484d.layout(iMax3, i4, iMax3 + measuredWidth3, this.f484d.getMeasuredHeight() + i4);
        this.f487g = f;
        this.f491k = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int minHeight = getMinHeight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (size * 0.8f), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - paddingTop, Integer.MIN_VALUE);
        this.f482b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f483c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f484d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        if (mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, Math.max(minHeight, this.f483c.getMeasuredHeight() + paddingTop));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f481a != null) {
            mo294a(this.f486f, this.f487g >= 0.0f ? this.f487g : 0.0f, true);
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background == null) {
            return 0;
        }
        return background.getIntrinsicHeight();
    }
}
