package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.C0163ax;
import android.support.v4.view.C0210s;
import android.support.v4.view.C0214w;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class DrawerLayout extends ViewGroup {

    // The APK has no constructor for this class.
    private DrawerLayout(android.content.Context context) {
        super(context);
        throw new AssertionError("No constructor in the original APK");
    }

    /* renamed from: a */
    static final InterfaceC0219b f553a;

    /* renamed from: b */
    private static final int[] f554b = {R.attr.layout_gravity};

    /* renamed from: c */
    private static final boolean f555c;

    /* renamed from: A */
    private boolean f556A;

    /* renamed from: d */
    private final C0218a f557d;

    /* renamed from: e */
    private int f558e;

    /* renamed from: f */
    private int f559f;

    /* renamed from: g */
    private float f560g;

    /* renamed from: h */
    private Paint f561h;

    /* renamed from: i */
    private final C0240w f562i;

    /* renamed from: j */
    private final C0240w f563j;

    /* renamed from: k */
    private final C0225h f564k;

    /* renamed from: l */
    private final C0225h f565l;

    /* renamed from: m */
    private int f566m;

    /* renamed from: n */
    private boolean f567n;

    /* renamed from: o */
    private boolean f568o;

    /* renamed from: p */
    private int f569p;

    /* renamed from: q */
    private int f570q;

    /* renamed from: r */
    private boolean f571r;

    /* renamed from: s */
    private boolean f572s;

    /* renamed from: t */
    private InterfaceC0222e f573t;

    /* renamed from: u */
    private float f574u;

    /* renamed from: v */
    private float f575v;

    /* renamed from: w */
    private Drawable f576w;

    /* renamed from: x */
    private Drawable f577x;

    /* renamed from: y */
    private Drawable f578y;

    /* renamed from: z */
    private Object f579z;

    /* renamed from: a */
    static /* synthetic */ int[] m501a() {
        return f554b;
    }

    /* renamed from: e */
    static /* synthetic */ boolean m506e(View view) {
        return (C0163ax.m433c(view) == 4 || C0163ax.m433c(view) == 2) ? false : true;
    }

    static {
        f555c = Build.VERSION.SDK_INT >= 19;
        if (Build.VERSION.SDK_INT >= 21) {
            f553a = new C0220c();
        } else {
            f553a = new C0221d();
        }
    }

    public final void setScrimColor(int i) {
        this.f559f = i;
        invalidate();
    }

    public final void setDrawerListener(InterfaceC0222e interfaceC0222e) {
        this.f573t = interfaceC0222e;
    }

    public final void setDrawerLockMode(int i) {
        m498a(i, 3);
        m498a(i, 5);
    }

    /* renamed from: a */
    private void m498a(int i, int i2) {
        int iM491a = C0210s.m491a(i2, C0163ax.m435e(this));
        if (iM491a == 3) {
            this.f569p = i;
        } else if (iM491a == 5) {
            this.f570q = i;
        }
        if (i != 0) {
            (iM491a == 3 ? this.f562i : this.f563j).m586e();
        }
        switch (i) {
            case TwitterResponse.READ /* 1 */:
                View viewM511a = m511a(iM491a);
                if (viewM511a != null) {
                    m515d(viewM511a);
                    break;
                }
                break;
            case TwitterResponse.READ_WRITE /* 2 */:
                View viewM511a2 = m511a(iM491a);
                if (viewM511a2 != null) {
                    m509h(viewM511a2);
                    break;
                }
                break;
        }
    }

    /* renamed from: a */
    public final int m510a(View view) {
        int iM507f = m507f(view);
        if (iM507f == 3) {
            return this.f569p;
        }
        if (iM507f == 5) {
            return this.f570q;
        }
        return 0;
    }

    /* renamed from: a */
    final void m512a(int i, View view) {
        int i2;
        View rootView;
        int iM575a = this.f562i.m575a();
        int iM575a2 = this.f563j.m575a();
        if (iM575a == 1 || iM575a2 == 1) {
            i2 = 1;
        } else {
            i2 = (iM575a == 2 || iM575a2 == 2) ? 2 : 0;
        }
        if (view != null && i == 0) {
            C0223f c0223f = (C0223f) view.getLayoutParams();
            if (c0223f.f606b == 0.0f) {
                C0223f c0223f2 = (C0223f) view.getLayoutParams();
                if (c0223f2.f608d) {
                    c0223f2.f608d = false;
                    if (this.f573t != null) {
                        InterfaceC0222e interfaceC0222e = this.f573t;
                    }
                    m499a(view, false);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (c0223f.f606b == 1.0f) {
                C0223f c0223f3 = (C0223f) view.getLayoutParams();
                if (!c0223f3.f608d) {
                    c0223f3.f608d = true;
                    if (this.f573t != null) {
                        InterfaceC0222e interfaceC0222e2 = this.f573t;
                    }
                    m499a(view, true);
                    view.requestFocus();
                }
            }
        }
        if (i2 != this.f566m) {
            this.f566m = i2;
            if (this.f573t != null) {
                InterfaceC0222e interfaceC0222e3 = this.f573t;
            }
        }
    }

    /* renamed from: a */
    private void m499a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !m505c(childAt)) || (z && childAt == view)) {
                C0163ax.m432b(childAt, 1);
            } else {
                C0163ax.m432b(childAt, 4);
            }
        }
    }

    /* renamed from: a */
    final void m513a(View view, float f) {
        C0223f c0223f = (C0223f) view.getLayoutParams();
        if (f != c0223f.f606b) {
            c0223f.f606b = f;
            if (this.f573t != null) {
                InterfaceC0222e interfaceC0222e = this.f573t;
            }
        }
    }

    /* renamed from: b */
    static float m502b(View view) {
        return ((C0223f) view.getLayoutParams()).f606b;
    }

    /* renamed from: f */
    private int m507f(View view) {
        return C0210s.m491a(((C0223f) view.getLayoutParams()).f605a, C0163ax.m435e(this));
    }

    /* renamed from: a */
    final boolean m514a(View view, int i) {
        return (m507f(view) & i) == i;
    }

    /* renamed from: b */
    private View m503b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((C0223f) childAt.getLayoutParams()).f608d) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    final View m511a(int i) {
        int iM491a = C0210s.m491a(i, C0163ax.m435e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m507f(childAt) & 7) == iM491a) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f568o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f568o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0121 A[PHI: r2
      0x0121: PHI (r2v9 int) = (r2v1 int), (r2v1 int), (r2v0 int) binds: [B:10:0x0026, B:11:0x0028, B:4:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        this.f567n = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0223f c0223f = (C0223f) childAt.getLayoutParams();
                if (m508g(childAt)) {
                    childAt.layout(c0223f.leftMargin, c0223f.topMargin, c0223f.leftMargin + childAt.getMeasuredWidth(), c0223f.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m514a(childAt, 3)) {
                        i5 = ((int) (measuredWidth * c0223f.f606b)) + (-measuredWidth);
                        f = (measuredWidth + i5) / measuredWidth;
                    } else {
                        i5 = i6 - ((int) (measuredWidth * c0223f.f606b));
                        f = (i6 - i5) / measuredWidth;
                    }
                    boolean z2 = f != c0223f.f606b;
                    switch (c0223f.f605a & 112) {
                        case 16:
                            int i8 = i4 - i2;
                            int i9 = (i8 - measuredHeight) / 2;
                            if (i9 < c0223f.topMargin) {
                                i9 = c0223f.topMargin;
                            } else if (i9 + measuredHeight > i8 - c0223f.bottomMargin) {
                                i9 = (i8 - c0223f.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i5, i9, measuredWidth + i5, measuredHeight + i9);
                            break;
                        case 80:
                            int i10 = i4 - i2;
                            childAt.layout(i5, (i10 - c0223f.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i10 - c0223f.bottomMargin);
                            break;
                        default:
                            childAt.layout(i5, c0223f.topMargin, measuredWidth + i5, measuredHeight + c0223f.topMargin);
                            break;
                    }
                    if (z2) {
                        m513a(childAt, f);
                    }
                    int i11 = c0223f.f606b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        this.f567n = false;
        this.f568o = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.f567n) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C0223f) getChildAt(i).getLayoutParams()).f606b);
        }
        this.f560g = fMax;
        if (this.f562i.m588g() | this.f563j.m588g()) {
            C0163ax.m431b(this);
        }
    }

    public final void setStatusBarBackground(Drawable drawable) {
        this.f578y = drawable;
    }

    public final void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            drawable = Build.VERSION.SDK_INT >= 21 ? context.getDrawable(i) : context.getResources().getDrawable(i);
        } else {
            drawable = null;
        }
        this.f578y = drawable;
    }

    public final void setStatusBarBackgroundColor(int i) {
        this.f578y = new ColorDrawable(i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iMo524a;
        super.onDraw(canvas);
        if (this.f556A && this.f578y != null && (iMo524a = f553a.mo524a(this.f579z)) > 0) {
            this.f578y.setBounds(0, 0, getWidth(), iMo524a);
            this.f578y.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    /* renamed from: g */
    private static boolean m508g(View view) {
        return ((C0223f) view.getLayoutParams()).f605a == 0;
    }

    /* renamed from: c */
    static boolean m505c(View view) {
        return (C0210s.m491a(((C0223f) view.getLayoutParams()).f605a, C0163ax.m435e(view)) & 7) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r1 = 1
            r2 = 0
            int r0 = android.support.v4.view.C0141ab.m391a(r8)
            android.support.v4.widget.w r3 = r7.f562i
            boolean r3 = r3.m579a(r8)
            android.support.v4.widget.w r4 = r7.f563j
            boolean r4 = r4.m579a(r8)
            r3 = r3 | r4
            switch(r0) {
                case 0: goto L39;
                case 1: goto L76;
                case 2: goto L62;
                case 3: goto L76;
                default: goto L16;
            }
        L16:
            r0 = r2
        L17:
            if (r3 != 0) goto L37
            if (r0 != 0) goto L37
            int r4 = r7.getChildCount()
            r3 = r2
        L20:
            if (r3 >= r4) goto L82
            android.view.View r0 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.support.v4.widget.f r0 = (android.support.v4.widget.C0223f) r0
            boolean r0 = r0.f607c
            if (r0 == 0) goto L7e
            r0 = r1
        L31:
            if (r0 != 0) goto L37
            boolean r0 = r7.f572s
            if (r0 == 0) goto L38
        L37:
            r2 = r1
        L38:
            return r2
        L39:
            float r0 = r8.getX()
            float r4 = r8.getY()
            r7.f574u = r0
            r7.f575v = r4
            float r5 = r7.f560g
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L84
            android.support.v4.widget.w r5 = r7.f562i
            int r0 = (int) r0
            int r4 = (int) r4
            android.view.View r0 = r5.m582b(r0, r4)
            if (r0 == 0) goto L84
            boolean r0 = m508g(r0)
            if (r0 == 0) goto L84
            r0 = r1
        L5d:
            r7.f571r = r2
            r7.f572s = r2
            goto L17
        L62:
            android.support.v4.widget.w r0 = r7.f562i
            boolean r0 = r0.m589h()
            if (r0 == 0) goto L16
            android.support.v4.widget.h r0 = r7.f564k
            r0.m527a()
            android.support.v4.widget.h r0 = r7.f565l
            r0.m527a()
            r0 = r2
            goto L17
        L76:
            r7.m500a(r1)
            r7.f571r = r2
            r7.f572s = r2
            goto L16
        L7e:
            int r0 = r3 + 1
            r3 = r0
            goto L20
        L82:
            r0 = r2
            goto L31
        L84:
            r0 = r2
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM503b;
        this.f562i.m583b(motionEvent);
        this.f563j.m583b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case TwitterResponse.NONE /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f574u = x;
                this.f575v = y;
                this.f571r = false;
                this.f572s = false;
                return true;
            case TwitterResponse.READ /* 1 */:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View viewM582b = this.f562i.m582b((int) x2, (int) y2);
                if (viewM582b != null && m508g(viewM582b)) {
                    float f = x2 - this.f574u;
                    float f2 = y2 - this.f575v;
                    int iM585d = this.f562i.m585d();
                    z = (f * f) + (f2 * f2) >= ((float) (iM585d * iM585d)) || (viewM503b = m503b()) == null || m510a(viewM503b) == 2;
                    m500a(z);
                    this.f571r = false;
                } else {
                    z = true;
                    m500a(z);
                    this.f571r = false;
                }
                return true;
            case TwitterResponse.READ_WRITE /* 2 */:
            default:
                return true;
            case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                m500a(true);
                this.f571r = false;
                this.f572s = false;
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f571r = z;
        if (z) {
            m500a(true);
        }
    }

    /* renamed from: a */
    private void m500a(boolean z) {
        int childCount = getChildCount();
        boolean zM580a = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0223f c0223f = (C0223f) childAt.getLayoutParams();
            if (m505c(childAt) && (!z || c0223f.f607c)) {
                int width = childAt.getWidth();
                if (m514a(childAt, 3)) {
                    zM580a |= this.f562i.m580a(childAt, -width, childAt.getTop());
                } else {
                    zM580a |= this.f563j.m580a(childAt, getWidth(), childAt.getTop());
                }
                c0223f.f607c = false;
            }
        }
        this.f564k.m527a();
        this.f565l.m527a();
        if (zM580a) {
            invalidate();
        }
    }

    /* renamed from: h */
    private void m509h(View view) {
        if (!m505c(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.f568o) {
            C0223f c0223f = (C0223f) view.getLayoutParams();
            c0223f.f606b = 1.0f;
            c0223f.f608d = true;
            m499a(view, true);
        } else if (m514a(view, 3)) {
            this.f562i.m580a(view, 0, view.getTop());
        } else {
            this.f563j.m580a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    /* renamed from: d */
    public final void m515d(View view) {
        if (!m505c(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.f568o) {
            C0223f c0223f = (C0223f) view.getLayoutParams();
            c0223f.f606b = 0.0f;
            c0223f.f608d = false;
        } else if (m514a(view, 3)) {
            this.f562i.m580a(view, -view.getWidth(), view.getTop());
        } else {
            this.f563j.m580a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0223f();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0223f ? new C0223f((C0223f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0223f((ViewGroup.MarginLayoutParams) layoutParams) : new C0223f(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0223f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0223f(getContext(), attributeSet);
    }

    /* renamed from: c */
    private View m504c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m505c(childAt)) {
                if (!m505c(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((C0223f) childAt.getLayoutParams()).f606b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m504c() != null) {
                C0214w.m495c(keyEvent);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewM504c = m504c();
        if (viewM504c != null && m510a(viewM504c) == 0) {
            m500a(false);
        }
        return viewM504c != null;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        View viewM511a;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f580a != 0 && (viewM511a = m511a(savedState.f580a)) != null) {
            m509h(viewM511a);
        }
        m498a(savedState.f581b, 3);
        m498a(savedState.f582c, 5);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        View viewM503b = m503b();
        if (viewM503b != null) {
            savedState.f580a = ((C0223f) viewM503b.getLayoutParams()).f605a;
        }
        savedState.f581b = this.f569p;
        savedState.f582c = this.f570q;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m503b() != null || m505c(view)) {
            C0163ax.m432b(view, 4);
        } else {
            C0163ax.m432b(view, 1);
        }
        if (!f555c) {
            C0163ax.m428a(view, this.f557d);
        }
    }

    /* compiled from: DontLook */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0224g();

        /* renamed from: a */
        int f580a;

        /* renamed from: b */
        int f581b;

        /* renamed from: c */
        int f582c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f580a = 0;
            this.f581b = 0;
            this.f582c = 0;
            this.f580a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f580a = 0;
            this.f581b = 0;
            this.f582c = 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f580a);
        }
    }
}
