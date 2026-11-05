package android.support.v4.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.C0163ax;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class SlidingPaneLayout extends ViewGroup {

    // The APK has no constructor for this class.
    private SlidingPaneLayout(android.content.Context context) {
        super(context);
        throw new AssertionError("No constructor in the original APK");
    }

    /* renamed from: a */
    static final InterfaceC0236s f583a;

    /* renamed from: b */
    private int f584b;

    /* renamed from: c */
    private int f585c;

    /* renamed from: d */
    private Drawable f586d;

    /* renamed from: e */
    private Drawable f587e;

    /* renamed from: f */
    private final int f588f;

    /* renamed from: g */
    private boolean f589g;

    /* renamed from: h */
    private View f590h;

    /* renamed from: i */
    private float f591i;

    /* renamed from: j */
    private float f592j;

    /* renamed from: k */
    private int f593k;

    /* renamed from: l */
    private boolean f594l;

    /* renamed from: m */
    private int f595m;

    /* renamed from: n */
    private float f596n;

    /* renamed from: o */
    private float f597o;

    /* renamed from: p */
    private InterfaceC0234q f598p;

    /* renamed from: q */
    private final C0240w f599q;

    /* renamed from: r */
    private boolean f600r;

    /* renamed from: s */
    private boolean f601s;

    /* renamed from: t */
    private final Rect f602t;

    /* renamed from: u */
    private final ArrayList f603u;

    /* renamed from: a */
    static /* synthetic */ ArrayList m516a(SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.f603u;
    }

    /* renamed from: a */
    static /* synthetic */ void m517a(SlidingPaneLayout slidingPaneLayout, View view) {
        slidingPaneLayout.m518a(view);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            f583a = new C0239v();
        } else if (i >= 16) {
            f583a = new C0238u();
        } else {
            f583a = new C0237t();
        }
    }

    public final void setParallaxDistance(int i) {
        this.f595m = i;
        requestLayout();
    }

    public final int getParallaxDistance() {
        return this.f595m;
    }

    public final void setSliderFadeColor(int i) {
        this.f584b = i;
    }

    public final int getSliderFadeColor() {
        return this.f584b;
    }

    public final void setCoveredFadeColor(int i) {
        this.f585c = i;
    }

    public final int getCoveredFadeColor() {
        return this.f585c;
    }

    public final void setPanelSlideListener(InterfaceC0234q interfaceC0234q) {
        this.f598p = interfaceC0234q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f601s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f601s = true;
        int size = this.f603u.size();
        for (int i = 0; i < size; i++) {
            ((RunnableC0232o) this.f603u.get(i)).run();
        }
        this.f603u.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9 A[PHI: r3
      0x00c9: PHI (r3v12 float) = (r3v11 float), (r3v14 float) binds: [B:34:0x00c0, B:36:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f601s = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f589g) {
            this.f600r = view == this.f590h;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r2 = 0
            r1 = 1
            int r3 = android.support.v4.view.C0141ab.m391a(r7)
            boolean r0 = r6.f589g
            if (r0 != 0) goto L2d
            if (r3 != 0) goto L2d
            int r0 = r6.getChildCount()
            if (r0 <= r1) goto L2d
            android.view.View r0 = r6.getChildAt(r1)
            if (r0 == 0) goto L2d
            android.support.v4.widget.w r4 = r6.f599q
            float r4 = r7.getX()
            int r4 = (int) r4
            float r5 = r7.getY()
            int r5 = (int) r5
            boolean r0 = android.support.v4.widget.C0240w.m571b(r0, r4, r5)
            if (r0 != 0) goto L41
            r0 = r1
        L2b:
            r6.f600r = r0
        L2d:
            boolean r0 = r6.f589g
            if (r0 == 0) goto L37
            boolean r0 = r6.f594l
            if (r0 == 0) goto L43
            if (r3 == 0) goto L43
        L37:
            android.support.v4.widget.w r0 = r6.f599q
            r0.m586e()
            boolean r2 = super.onInterceptTouchEvent(r7)
        L40:
            return r2
        L41:
            r0 = r2
            goto L2b
        L43:
            r0 = 3
            if (r3 == r0) goto L48
            if (r3 != r1) goto L4e
        L48:
            android.support.v4.widget.w r0 = r6.f599q
            r0.m586e()
            goto L40
        L4e:
            switch(r3) {
                case 0: goto L5e;
                case 1: goto L51;
                case 2: goto L82;
                default: goto L51;
            }
        L51:
            r0 = r2
        L52:
            android.support.v4.widget.w r3 = r6.f599q
            boolean r3 = r3.m579a(r7)
            if (r3 != 0) goto L5c
            if (r0 == 0) goto L40
        L5c:
            r2 = r1
            goto L40
        L5e:
            r6.f594l = r2
            float r0 = r7.getX()
            float r3 = r7.getY()
            r6.f596n = r0
            r6.f597o = r3
            android.support.v4.widget.w r4 = r6.f599q
            android.view.View r4 = r6.f590h
            int r0 = (int) r0
            int r3 = (int) r3
            boolean r0 = android.support.v4.widget.C0240w.m571b(r4, r0, r3)
            if (r0 == 0) goto L51
            android.view.View r0 = r6.f590h
            boolean r0 = r6.m523b(r0)
            if (r0 == 0) goto L51
            r0 = r1
            goto L52
        L82:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f596n
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            float r4 = r6.f597o
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            android.support.v4.widget.w r4 = r6.f599q
            int r4 = r4.m585d()
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L51
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L51
            android.support.v4.widget.w r0 = r6.f599q
            r0.m586e()
            r6.f594l = r1
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f589g) {
            return super.onTouchEvent(motionEvent);
        }
        this.f599q.m583b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case TwitterResponse.NONE /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f596n = x;
                this.f597o = y;
                return true;
            case TwitterResponse.READ /* 1 */:
                if (m523b(this.f590h)) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = x2 - this.f596n;
                    float f2 = y2 - this.f597o;
                    int iM585d = this.f599q.m585d();
                    if ((f * f) + (f2 * f2) < iM585d * iM585d) {
                        C0240w c0240w = this.f599q;
                        if (C0240w.m571b(this.f590h, (int) x2, (int) y2)) {
                            View view = this.f590h;
                            m520a();
                        }
                    }
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: a */
    private boolean m520a() {
        if (!this.f601s && !m521a(0.0f)) {
            return false;
        }
        this.f600r = false;
        return true;
    }

    /* renamed from: a */
    private void m519a(View view, float f, int i) {
        C0233p c0233p = (C0233p) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (16777215 & i);
            if (c0233p.f623d == null) {
                c0233p.f623d = new Paint();
            }
            c0233p.f623d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (C0163ax.m434d(view) != 2) {
                C0163ax.m426a(view, 2, c0233p.f623d);
            }
            m518a(view);
            return;
        }
        if (C0163ax.m434d(view) != 0) {
            if (c0233p.f623d != null) {
                c0233p.f623d.setColorFilter(null);
            }
            RunnableC0232o runnableC0232o = new RunnableC0232o(this, view);
            this.f603u.add(runnableC0232o);
            C0163ax.m429a(this, runnableC0232o);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild;
        C0233p c0233p = (C0233p) view.getLayoutParams();
        int iSave = canvas.save(2);
        if (this.f589g && !c0233p.f621b && this.f590h != null) {
            canvas.getClipBounds(this.f602t);
            if (m522b()) {
                this.f602t.left = Math.max(this.f602t.left, this.f590h.getRight());
            } else {
                this.f602t.right = Math.min(this.f602t.right, this.f590h.getLeft());
            }
            canvas.clipRect(this.f602t);
        }
        if (Build.VERSION.SDK_INT < 11) {
            if (c0233p.f622c && this.f591i > 0.0f) {
                if (!view.isDrawingCacheEnabled()) {
                    view.setDrawingCacheEnabled(true);
                }
                Bitmap drawingCache = view.getDrawingCache();
                if (drawingCache != null) {
                    canvas.drawBitmap(drawingCache, view.getLeft(), view.getTop(), c0233p.f623d);
                    zDrawChild = false;
                } else {
                    Log.e("SlidingPaneLayout", "drawChild: child view " + view + " returned null drawing cache");
                }
            } else if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            zDrawChild = super.drawChild(canvas, view, j);
        } else {
            zDrawChild = super.drawChild(canvas, view, j);
        }
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    /* renamed from: a */
    private void m518a(View view) {
        f583a.mo559a(this, view);
    }

    /* renamed from: a */
    private boolean m521a(float f) {
        int paddingLeft;
        if (!this.f589g) {
            return false;
        }
        boolean zM522b = m522b();
        C0233p c0233p = (C0233p) this.f590h.getLayoutParams();
        if (zM522b) {
            paddingLeft = (int) (getWidth() - (((c0233p.rightMargin + getPaddingRight()) + (this.f593k * f)) + this.f590h.getWidth()));
        } else {
            paddingLeft = (int) (c0233p.leftMargin + getPaddingLeft() + (this.f593k * f));
        }
        if (!this.f599q.m580a(this.f590h, paddingLeft, this.f590h.getTop())) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        C0163ax.m431b(this);
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f599q.m588g()) {
            if (!this.f589g) {
                this.f599q.m587f();
            } else {
                C0163ax.m431b(this);
            }
        }
    }

    @Deprecated
    public final void setShadowDrawable(Drawable drawable) {
        this.f586d = drawable;
    }

    public final void setShadowDrawableLeft(Drawable drawable) {
        this.f586d = drawable;
    }

    public final void setShadowDrawableRight(Drawable drawable) {
        this.f587e = drawable;
    }

    @Deprecated
    public final void setShadowResource(int i) {
        this.f586d = getResources().getDrawable(i);
    }

    public final void setShadowResourceLeft(int i) {
        this.f586d = getResources().getDrawable(i);
    }

    public final void setShadowResourceRight(int i) {
        this.f587e = getResources().getDrawable(i);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int left;
        int right;
        super.draw(canvas);
        if (m522b()) {
            drawable = this.f587e;
        } else {
            drawable = this.f586d;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m522b()) {
                right = childAt.getRight();
                left = right + intrinsicWidth;
            } else {
                left = childAt.getLeft();
                right = left - intrinsicWidth;
            }
            drawable.setBounds(right, top, left, bottom);
            drawable.draw(canvas);
        }
    }

    /* renamed from: b */
    private boolean m523b(View view) {
        if (view == null) {
            return false;
        }
        return this.f589g && ((C0233p) view.getLayoutParams()).f622c && this.f591i > 0.0f;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0233p();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0233p((ViewGroup.MarginLayoutParams) layoutParams) : new C0233p(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0233p) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0233p(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f589g) {
            z = !this.f589g || this.f591i == 1.0f;
        } else {
            z = this.f600r;
        }
        savedState.f604a = z;
        return savedState;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f604a) {
            View view = this.f590h;
            if (this.f601s || m521a(1.0f)) {
                this.f600r = true;
            }
        } else {
            View view2 = this.f590h;
            m520a();
        }
        this.f600r = savedState.f604a;
    }

    /* compiled from: DontLook */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0235r();

        /* renamed from: a */
        boolean f604a;

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f604a = parcel.readInt() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f604a ? 1 : 0);
        }
    }

    /* renamed from: b */
    private boolean m522b() {
        return C0163ax.m435e(this) == 1;
    }
}
