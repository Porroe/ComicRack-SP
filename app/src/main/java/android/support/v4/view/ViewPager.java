package android.support.v4.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p001b.C0092b;
import android.support.v4.p001b.C0094d;
import android.support.v4.widget.C0226i;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: A */
    private boolean f402A;

    /* renamed from: B */
    private boolean f403B;

    /* renamed from: C */
    private int f404C;

    /* renamed from: D */
    private int f405D;

    /* renamed from: E */
    private int f406E;

    /* renamed from: F */
    private float f407F;

    /* renamed from: G */
    private float f408G;

    /* renamed from: H */
    private float f409H;

    /* renamed from: I */
    private float f410I;

    /* renamed from: J */
    private int f411J;

    /* renamed from: K */
    private VelocityTracker f412K;

    /* renamed from: L */
    private int f413L;

    /* renamed from: M */
    private int f414M;

    /* renamed from: N */
    private int f415N;

    /* renamed from: O */
    private int f416O;

    /* renamed from: P */
    private boolean f417P;

    /* renamed from: Q */
    private C0226i f418Q;

    /* renamed from: R */
    private C0226i f419R;

    /* renamed from: S */
    private boolean f420S;

    /* renamed from: T */
    private boolean f421T;

    /* renamed from: U */
    private boolean f422U;

    /* renamed from: V */
    private int f423V;

    /* renamed from: W */
    private InterfaceC0189bw f424W;

    /* renamed from: aa */
    private InterfaceC0189bw f425aa;

    /* renamed from: ab */
    private InterfaceC0188bv f426ab;

    /* renamed from: ac */
    private InterfaceC0190bx f427ac;

    /* renamed from: ad */
    private Method f428ad;

    /* renamed from: ae */
    private int f429ae;

    /* renamed from: af */
    private ArrayList f430af;

    /* renamed from: ah */
    private final Runnable f431ah;

    /* renamed from: ai */
    private int f432ai;

    /* renamed from: b */
    private int f433b;

    /* renamed from: e */
    private final ArrayList f434e;

    /* renamed from: f */
    private final C0185bs f435f;

    /* renamed from: g */
    private final Rect f436g;

    /* renamed from: h */
    private AbstractC0145af f437h;

    /* renamed from: i */
    private int f438i;

    /* renamed from: j */
    private int f439j;

    /* renamed from: k */
    private Parcelable f440k;

    /* renamed from: l */
    private ClassLoader f441l;

    /* renamed from: m */
    private Scroller f442m;

    /* renamed from: n */
    private C0191by f443n;

    /* renamed from: o */
    private int f444o;

    /* renamed from: p */
    private Drawable f445p;

    /* renamed from: q */
    private int f446q;

    /* renamed from: r */
    private int f447r;

    /* renamed from: s */
    private float f448s;

    /* renamed from: t */
    private float f449t;

    /* renamed from: u */
    private int f450u;

    /* renamed from: v */
    private int f451v;

    /* renamed from: w */
    private boolean f452w;

    /* renamed from: x */
    private boolean f453x;

    /* renamed from: y */
    private boolean f454y;

    /* renamed from: z */
    private int f455z;

    /* renamed from: a */
    private static final int[] f398a = {R.attr.layout_gravity};

    /* renamed from: c */
    private static final Comparator f400c = new C0181bo();

    /* renamed from: d */
    private static final Interpolator f401d = new InterpolatorC0182bp();

    /* renamed from: ag */
    private static final C0194ca f399ag = new C0194ca();

    /* renamed from: a */
    static /* synthetic */ void m304a(ViewPager viewPager) {
        viewPager.setScrollState(0);
    }

    /* renamed from: b */
    static /* synthetic */ AbstractC0145af m310b(ViewPager viewPager) {
        return viewPager.f437h;
    }

    /* renamed from: c */
    static /* synthetic */ int m313c(ViewPager viewPager) {
        return viewPager.f438i;
    }

    /* renamed from: d */
    static /* synthetic */ int[] m316d() {
        return f398a;
    }

    public ViewPager(Context context) {
        super(context);
        this.f434e = new ArrayList();
        this.f435f = new C0185bs();
        this.f436g = new Rect();
        this.f439j = -1;
        this.f440k = null;
        this.f441l = null;
        this.f448s = -3.4028235E38f;
        this.f449t = Float.MAX_VALUE;
        this.f455z = 1;
        this.f411J = -1;
        this.f420S = true;
        this.f421T = false;
        this.f431ah = new RunnableC0183bq(this);
        this.f432ai = 0;
        m317e();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f434e = new ArrayList();
        this.f435f = new C0185bs();
        this.f436g = new Rect();
        this.f439j = -1;
        this.f440k = null;
        this.f441l = null;
        this.f448s = -3.4028235E38f;
        this.f449t = Float.MAX_VALUE;
        this.f455z = 1;
        this.f411J = -1;
        this.f420S = true;
        this.f421T = false;
        this.f431ah = new RunnableC0183bq(this);
        this.f432ai = 0;
        m317e();
    }

    /* renamed from: e */
    private void m317e() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f442m = new Scroller(context, f401d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f406E = C0175bi.m462a(viewConfiguration);
        this.f413L = (int) (400.0f * f);
        this.f414M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f418Q = new C0226i(context);
        this.f419R = new C0226i(context);
        this.f415N = (int) (25.0f * f);
        this.f416O = (int) (2.0f * f);
        this.f404C = (int) (16.0f * f);
        C0163ax.m428a(this, new C0187bu(this));
        if (C0163ax.m433c(this) == 0) {
            C0163ax.m432b(this, 1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f431ah);
        super.onDetachedFromWindow();
    }

    private void setScrollState(int i) {
        if (this.f432ai != i) {
            this.f432ai = i;
            if (this.f427ac != null) {
                boolean z = i != 0;
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    C0163ax.m426a(getChildAt(i2), z ? 2 : 0, null);
                }
            }
            if (this.f424W != null) {
                this.f424W.mo416b(i);
            }
        }
    }

    public void setAdapter(AbstractC0145af abstractC0145af) throws Resources.NotFoundException {
        if (this.f437h != null) {
            this.f437h.m406b(this.f443n);
            AbstractC0145af abstractC0145af2 = this.f437h;
            for (int i = 0; i < this.f434e.size(); i++) {
                C0185bs c0185bs = (C0185bs) this.f434e.get(i);
                this.f437h.mo252a(this, c0185bs.f506b, c0185bs.f505a);
            }
            this.f437h.mo250a();
            this.f434e.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C0186bt) getChildAt(i2).getLayoutParams()).f510a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f438i = 0;
            scrollTo(0, 0);
        }
        AbstractC0145af abstractC0145af3 = this.f437h;
        this.f437h = abstractC0145af;
        this.f433b = 0;
        if (this.f437h != null) {
            if (this.f443n == null) {
                this.f443n = new C0191by(this, (byte) 0);
            }
            this.f437h.m404a(this.f443n);
            this.f454y = false;
            boolean z = this.f420S;
            this.f420S = true;
            this.f433b = this.f437h.mo408c();
            if (this.f439j >= 0) {
                this.f437h.mo251a(this.f440k, this.f441l);
                m302a(this.f439j, false, true);
                this.f439j = -1;
                this.f440k = null;
                this.f441l = null;
            } else if (!z) {
                m326b();
            } else {
                requestLayout();
            }
        }
        if (this.f426ab != null && abstractC0145af3 != abstractC0145af) {
            this.f426ab.mo415a(abstractC0145af3, abstractC0145af);
        }
    }

    public AbstractC0145af getAdapter() {
        return this.f437h;
    }

    void setOnAdapterChangeListener(InterfaceC0188bv interfaceC0188bv) {
        this.f426ab = interfaceC0188bv;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) throws Resources.NotFoundException {
        this.f454y = false;
        m302a(i, !this.f420S, false);
    }

    /* renamed from: a */
    public final void m325a(int i, boolean z) throws Resources.NotFoundException {
        this.f454y = false;
        m302a(i, z, false);
    }

    public int getCurrentItem() {
        return this.f438i;
    }

    /* renamed from: a */
    private void m302a(int i, boolean z, boolean z2) throws Resources.NotFoundException {
        m303a(i, z, z2, 0);
    }

    /* renamed from: a */
    private void m303a(int i, boolean z, boolean z2, int i2) throws Resources.NotFoundException {
        if (this.f437h == null || this.f437h.mo408c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f438i == i && this.f434e.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f437h.mo408c()) {
            i = this.f437h.mo408c() - 1;
        }
        int i3 = this.f455z;
        if (i > this.f438i + i3 || i < this.f438i - i3) {
            for (int i4 = 0; i4 < this.f434e.size(); i4++) {
                ((C0185bs) this.f434e.get(i4)).f507c = true;
            }
        }
        boolean z3 = this.f438i != i;
        if (this.f420S) {
            this.f438i = i;
            if (z3 && this.f424W != null) {
                this.f424W.mo413a(i);
            }
            if (z3 && this.f425aa != null) {
                this.f425aa.mo413a(i);
            }
            requestLayout();
            return;
        }
        m298a(i);
        m301a(i, z, i2, z3);
    }

    /* renamed from: a */
    private void m301a(int i, boolean z, int i2, boolean z2) throws Resources.NotFoundException {
        int iAbs;
        C0185bs c0185bsM311b = m311b(i);
        int clientWidth = 0;
        if (c0185bsM311b != null) {
            clientWidth = (int) (getClientWidth() * Math.max(this.f448s, Math.min(c0185bsM311b.f509e, this.f449t)));
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i3 = clientWidth - scrollX;
                int i4 = 0 - scrollY;
                if (i3 == 0 && i4 == 0) {
                    m307a(false);
                    m326b();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth2 = getClientWidth();
                    int i5 = clientWidth2 / 2;
                    float fSin = (i5 * ((float) Math.sin((float) ((Math.min(1.0f, (1.0f * Math.abs(i3)) / clientWidth2) - 0.5f) * 0.4712389167638204d)))) + i5;
                    int iAbs2 = Math.abs(i2);
                    if (iAbs2 > 0) {
                        iAbs = Math.round(1000.0f * Math.abs(fSin / iAbs2)) * 4;
                    } else {
                        AbstractC0145af abstractC0145af = this.f437h;
                        int i6 = this.f438i;
                        iAbs = (int) (((Math.abs(i3) / ((clientWidth2 * 1.0f) + this.f444o)) + 1.0f) * 100.0f);
                    }
                    this.f442m.startScroll(scrollX, scrollY, i3, i4, Math.min(iAbs, 600));
                    C0163ax.m431b(this);
                }
            }
            if (z2 && this.f424W != null) {
                this.f424W.mo413a(i);
            }
            if (z2 && this.f425aa != null) {
                this.f425aa.mo413a(i);
                return;
            }
            return;
        }
        if (z2 && this.f424W != null) {
            this.f424W.mo413a(i);
        }
        if (z2 && this.f425aa != null) {
            this.f425aa.mo413a(i);
        }
        m307a(false);
        scrollTo(clientWidth, 0);
        dispatchPageScroll(clientWidth);
    }

    public void setOnPageChangeListener(InterfaceC0189bw interfaceC0189bw) {
        this.f424W = interfaceC0189bw;
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.f428ad == null) {
                try {
                    this.f428ad = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.f428ad.invoke(this, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f429ae == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0186bt) ((View) this.f430af.get(i2)).getLayoutParams()).f515f;
    }

    /* renamed from: a */
    final InterfaceC0189bw m323a(InterfaceC0189bw interfaceC0189bw) {
        InterfaceC0189bw interfaceC0189bw2 = this.f425aa;
        this.f425aa = interfaceC0189bw;
        return interfaceC0189bw2;
    }

    public int getOffscreenPageLimit() {
        return this.f455z;
    }

    public void setOffscreenPageLimit(int i) throws Resources.NotFoundException {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f455z) {
            this.f455z = i;
            m326b();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f444o;
        this.f444o = i;
        int width = getWidth();
        m300a(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.f444o;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f445p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f445p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f445p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    private C0185bs m296a(int i, int i2) {
        C0185bs c0185bs = new C0185bs();
        c0185bs.f506b = i;
        c0185bs.f505a = this.f437h.mo249a((ViewGroup) this, i);
        AbstractC0145af abstractC0145af = this.f437h;
        c0185bs.f508d = 1.0f;
        if (i2 < 0 || i2 >= this.f434e.size()) {
            this.f434e.add(c0185bs);
        } else {
            this.f434e.add(i2, c0185bs);
        }
        return c0185bs;
    }

    /* renamed from: a */
    final void m324a() throws Resources.NotFoundException {
        int iMo408c = this.f437h.mo408c();
        this.f433b = iMo408c;
        boolean z = this.f434e.size() < (this.f455z * 2) + 1 && this.f434e.size() < iMo408c;
        int i = this.f438i;
        for (int i2 = 0; i2 < this.f434e.size(); i2++) {
            C0185bs c0185bs = (C0185bs) this.f434e.get(i2);
            AbstractC0145af abstractC0145af = this.f437h;
            Object obj = c0185bs.f505a;
        }
        Collections.sort(this.f434e, f400c);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C0186bt c0186bt = (C0186bt) getChildAt(i3).getLayoutParams();
                if (!c0186bt.f510a) {
                    c0186bt.f512c = 0.0f;
                }
            }
            m302a(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: b */
    final void m326b() throws Resources.NotFoundException {
        m298a(this.f438i);
    }

    /* renamed from: a */
    private void m298a(int i) throws Resources.NotFoundException {
        C0185bs c0185bs;
        int i2;
        String hexString;
        int i3;
        C0185bs c0185bs2;
        C0185bs c0185bsM297a;
        if (this.f438i == i) {
            c0185bs = null;
            i2 = 2;
        } else {
            int i4 = this.f438i < i ? 66 : 17;
            C0185bs c0185bsM311b = m311b(this.f438i);
            this.f438i = i;
            c0185bs = c0185bsM311b;
            i2 = i4;
        }
        if (this.f437h == null) {
            m318f();
            return;
        }
        if (this.f454y) {
            m318f();
            return;
        }
        if (getWindowToken() != null) {
            AbstractC0145af abstractC0145af = this.f437h;
            int i5 = this.f455z;
            int iMax = Math.max(0, this.f438i - i5);
            int iMo408c = this.f437h.mo408c();
            int iMin = Math.min(iMo408c - 1, i5 + this.f438i);
            if (iMo408c != this.f433b) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException e) {
                    hexString = Integer.toHexString(getId());
                }
                throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f433b + ", found: " + iMo408c + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f437h.getClass());
            }
            c0185bs2 = null;
            for (i3 = 0; i3 < this.f434e.size(); i3++) {
                C0185bs item = (C0185bs) this.f434e.get(i3);
                if (item.f506b >= this.f438i) {
                    if (item.f506b == this.f438i) {
                        c0185bs2 = item;
                    }
                    break;
                }
            }
            C0185bs c0185bsM296a = (c0185bs2 != null || iMo408c <= 0) ? c0185bs2 : m296a(this.f438i, i3);
            if (c0185bsM296a != null) {
                int i7 = i3 - 1;
                C0185bs c0185bs3 = i7 >= 0 ? (C0185bs) this.f434e.get(i7) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c0185bsM296a.f508d) + ((float) getPaddingLeft() / clientWidth);
                float f = 0.0f;
                int i8 = i3;
                int i9 = i7;
                for (int i10 = this.f438i - 1; i10 >= 0; i10--) {
                    if (f >= paddingLeft && i10 < iMax) {
                        if (c0185bs3 == null) {
                            break;
                        }
                        if (i10 == c0185bs3.f506b && !c0185bs3.f507c) {
                            this.f434e.remove(i9);
                            this.f437h.mo252a(this, i10, c0185bs3.f505a);
                            i9--;
                            i8--;
                            c0185bs3 = i9 >= 0 ? (C0185bs) this.f434e.get(i9) : null;
                        }
                    } else if (c0185bs3 != null && i10 == c0185bs3.f506b) {
                        f += c0185bs3.f508d;
                        i9--;
                        c0185bs3 = i9 >= 0 ? (C0185bs) this.f434e.get(i9) : null;
                    } else {
                        f += m296a(i10, i9 + 1).f508d;
                        i8++;
                        c0185bs3 = i9 >= 0 ? (C0185bs) this.f434e.get(i9) : null;
                    }
                }
                float f2 = c0185bsM296a.f508d;
                int i11 = i8 + 1;
                if (f2 < 2.0f) {
                    C0185bs c0185bs4 = i11 < this.f434e.size() ? (C0185bs) this.f434e.get(i11) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : ((float) getPaddingRight() / clientWidth) + 2.0f;
                    C0185bs c0185bs5 = c0185bs4;
                    int i12 = i11;
                    int i13 = this.f438i + 1;
                    C0185bs c0185bs6 = c0185bs5;
                    while (i13 < iMo408c) {
                        if (f2 >= paddingRight && i13 > iMin) {
                            if (c0185bs6 == null) {
                                break;
                            }
                            if (i13 == c0185bs6.f506b && !c0185bs6.f507c) {
                                this.f434e.remove(i12);
                                this.f437h.mo252a(this, i13, c0185bs6.f505a);
                                c0185bs6 = i12 < this.f434e.size() ? (C0185bs) this.f434e.get(i12) : null;
                            }
                        } else if (c0185bs6 != null && i13 == c0185bs6.f506b) {
                            f2 += c0185bs6.f508d;
                            i12++;
                            c0185bs6 = i12 < this.f434e.size() ? (C0185bs) this.f434e.get(i12) : null;
                        } else {
                            C0185bs c0185bsM296a2 = m296a(i13, i12);
                            i12++;
                            f2 += c0185bsM296a2.f508d;
                            c0185bs6 = i12 < this.f434e.size() ? (C0185bs) this.f434e.get(i12) : null;
                        }
                        i13++;
                        c0185bs6 = c0185bs6;
                        f2 = f2;
                    }
                }
                calculatePageOffsets(c0185bsM296a, i8, c0185bs);
            }
            this.f437h.mo255b(this, this.f438i, c0185bsM296a != null ? c0185bsM296a.f505a : null);
            this.f437h.mo250a();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                C0186bt c0186bt = (C0186bt) childAt.getLayoutParams();
                c0186bt.f515f = i14;
                if (!c0186bt.f510a && c0186bt.f512c == 0.0f && (c0185bsM297a = m297a(childAt)) != null) {
                    c0186bt.f512c = c0185bsM297a.f508d;
                    c0186bt.f514e = c0185bsM297a.f506b;
                }
            }
            m318f();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                C0185bs c0185bsM312b = viewFindFocus != null ? m312b(viewFindFocus) : null;
                if (c0185bsM312b == null || c0185bsM312b.f506b != this.f438i) {
                    for (int i15 = 0; i15 < getChildCount(); i15++) {
                        View childAt2 = getChildAt(i15);
                        C0185bs c0185bsM297a2 = m297a(childAt2);
                        if (c0185bsM297a2 != null && c0185bsM297a2.f506b == this.f438i && childAt2.requestFocus(i2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private void m318f() {
        if (this.f429ae != 0) {
            if (this.f430af == null) {
                this.f430af = new ArrayList();
            } else {
                this.f430af.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f430af.add(getChildAt(i));
            }
            Collections.sort(this.f430af, f399ag);
        }
    }

    private void calculatePageOffsets(C0185bs currentPage, int currentIndex, C0185bs previousPage) {
        C0185bs c0185bs3;
        C0185bs c0185bs4;
        int iMo408c = this.f437h.mo408c();
        int clientWidth = getClientWidth();
        float marginOffset = clientWidth > 0 ? (float) this.f444o / clientWidth : 0.0f;
        if (previousPage != null) {
            int i2 = previousPage.f506b;
            if (i2 < currentPage.f506b) {
                float f2 = previousPage.f509e + previousPage.f508d + marginOffset;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= currentPage.f506b && i4 < this.f434e.size()) {
                    Object obj = this.f434e.get(i4);
                    while (true) {
                        c0185bs4 = (C0185bs) obj;
                        if (i3 <= c0185bs4.f506b || i4 >= this.f434e.size() - 1) {
                            break;
                        }
                        i4++;
                        obj = this.f434e.get(i4);
                    }
                    while (i3 < c0185bs4.f506b) {
                        AbstractC0145af abstractC0145af = this.f437h;
                        f2 += 1.0f + marginOffset;
                        i3++;
                    }
                    c0185bs4.f509e = f2;
                    f2 += c0185bs4.f508d + marginOffset;
                    i3++;
                }
            } else if (i2 > currentPage.f506b) {
                int size = this.f434e.size() - 1;
                float f3 = previousPage.f509e;
                int i5 = i2 - 1;
                while (i5 >= currentPage.f506b && size >= 0) {
                    Object obj2 = this.f434e.get(size);
                    while (true) {
                        c0185bs3 = (C0185bs) obj2;
                        if (i5 >= c0185bs3.f506b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f434e.get(size);
                    }
                    while (i5 > c0185bs3.f506b) {
                        AbstractC0145af abstractC0145af2 = this.f437h;
                        f3 -= 1.0f + marginOffset;
                        i5--;
                    }
                    f3 -= c0185bs3.f508d + marginOffset;
                    c0185bs3.f509e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.f434e.size();
        float f4 = currentPage.f509e;
        int i6 = currentPage.f506b - 1;
        this.f448s = currentPage.f506b == 0 ? currentPage.f509e : -3.4028235E38f;
        this.f449t = currentPage.f506b == iMo408c + (-1) ? (currentPage.f509e + currentPage.f508d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = currentIndex - 1; i7 >= 0; i7--) {
            C0185bs c0185bs5 = (C0185bs) this.f434e.get(i7);
            while (i6 > c0185bs5.f506b) {
                AbstractC0145af abstractC0145af3 = this.f437h;
                i6--;
                f4 -= 1.0f + marginOffset;
            }
            f4 -= c0185bs5.f508d + marginOffset;
            c0185bs5.f509e = f4;
            if (c0185bs5.f506b == 0) {
                this.f448s = f4;
            }
            i6--;
        }
        float f5 = currentPage.f509e + currentPage.f508d + marginOffset;
        int i8 = currentPage.f506b + 1;
        for (int i9 = currentIndex + 1; i9 < size2; i9++) {
            C0185bs c0185bs6 = (C0185bs) this.f434e.get(i9);
            while (i8 < c0185bs6.f506b) {
                AbstractC0145af abstractC0145af4 = this.f437h;
                i8++;
                f5 += 1.0f + marginOffset;
            }
            if (c0185bs6.f506b == iMo408c - 1) {
                this.f449t = (c0185bs6.f508d + f5) - 1.0f;
            }
            c0185bs6.f509e = f5;
            f5 += c0185bs6.f508d + marginOffset;
            i8++;
        }
        this.f421T = false;
    }

    /* compiled from: DontLook */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR;

        /* renamed from: a */
        int f456a;

        /* renamed from: b */
        Parcelable f457b;

        /* renamed from: c */
        ClassLoader f458c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f456a);
            parcel.writeParcelable(this.f457b, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f456a + "}";
        }

        static {
            C0192bz c0192bz = new C0192bz();
            if (Build.VERSION.SDK_INT >= 13) {
                new C0094d(c0192bz);
            }
            CREATOR = new C0092b(c0192bz);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f456a = parcel.readInt();
            this.f457b = parcel.readParcelable(classLoader);
            this.f458c = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f456a = this.f438i;
        if (this.f437h != null) {
            savedState.f457b = this.f437h.mo254b();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f437h != null) {
            this.f437h.mo251a(savedState.f457b, savedState.f458c);
            m302a(savedState.f456a, false, true);
        } else {
            this.f439j = savedState.f456a;
            this.f440k = savedState.f457b;
            this.f441l = savedState.f458c;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        C0186bt c0186bt = (C0186bt) layoutParamsGenerateLayoutParams;
        c0186bt.f510a |= view instanceof InterfaceC0184br;
        if (this.f452w) {
            if (c0186bt != null && c0186bt.f510a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0186bt.f513d = true;
            addViewInLayout(view, i, layoutParamsGenerateLayoutParams);
            return;
        }
        super.addView(view, i, layoutParamsGenerateLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f452w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: a */
    private C0185bs m297a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f434e.size()) {
                C0185bs c0185bs = (C0185bs) this.f434e.get(i2);
                if (!this.f437h.mo253a(view, c0185bs.f505a)) {
                    i = i2 + 1;
                } else {
                    return c0185bs;
                }
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    private C0185bs m312b(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return m297a(view);
            }
        }
        return null;
    }

    /* renamed from: b */
    private C0185bs m311b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.f434e.size()) {
                C0185bs c0185bs = (C0185bs) this.f434e.get(i3);
                if (c0185bs.f506b != i) {
                    i2 = i3 + 1;
                } else {
                    return c0185bs;
                }
            } else {
                return null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f420S = true;
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        setMeasuredDimension(getDefaultSize(0, widthSpec), getDefaultSize(0, heightSpec));
        int width = getMeasuredWidth();
        this.f405D = Math.min(width / 10, this.f404C);
        int availableWidth = width - getPaddingLeft() - getPaddingRight();
        int availableHeight = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();

        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            C0186bt params = (C0186bt) child.getLayoutParams();
            if (child.getVisibility() == GONE || params == null || !params.f510a) {
                continue;
            }
            int horizontal = params.f511b & Gravity.HORIZONTAL_GRAVITY_MASK;
            int vertical = params.f511b & Gravity.VERTICAL_GRAVITY_MASK;
            boolean consumesHeight = vertical == Gravity.TOP || vertical == Gravity.BOTTOM;
            boolean consumesWidth = horizontal == Gravity.LEFT || horizontal == Gravity.RIGHT;
            int childWidthMode = MeasureSpec.AT_MOST;
            int childHeightMode = MeasureSpec.AT_MOST;
            if (consumesHeight) {
                childWidthMode = MeasureSpec.EXACTLY;
            } else if (consumesWidth) {
                childHeightMode = MeasureSpec.EXACTLY;
            }
            int childWidth = availableWidth;
            int childHeight = availableHeight;
            if (params.width != LayoutParams.WRAP_CONTENT) {
                childWidthMode = MeasureSpec.EXACTLY;
                if (params.width != LayoutParams.MATCH_PARENT) {
                    childWidth = params.width;
                }
            }
            if (params.height != LayoutParams.WRAP_CONTENT) {
                childHeightMode = MeasureSpec.EXACTLY;
                if (params.height != LayoutParams.MATCH_PARENT) {
                    childHeight = params.height;
                }
            }
            child.measure(MeasureSpec.makeMeasureSpec(childWidth, childWidthMode),
                    MeasureSpec.makeMeasureSpec(childHeight, childHeightMode));
            if (consumesHeight) {
                availableHeight -= child.getMeasuredHeight();
            } else if (consumesWidth) {
                availableWidth -= child.getMeasuredWidth();
            }
        }
        this.f450u = MeasureSpec.makeMeasureSpec(availableWidth, MeasureSpec.EXACTLY);
        this.f451v = MeasureSpec.makeMeasureSpec(availableHeight, MeasureSpec.EXACTLY);
        this.f452w = true;
        try {
            m326b();
        } finally {
            this.f452w = false;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            C0186bt params = (C0186bt) child.getLayoutParams();
            if (child.getVisibility() != GONE && !params.f510a) {
                child.measure(MeasureSpec.makeMeasureSpec((int) (availableWidth * params.f512c),
                        MeasureSpec.EXACTLY), this.f451v);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m300a(i, i3, this.f444o, this.f444o);
        }
    }

    /* renamed from: a */
    private void m300a(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f434e.isEmpty()) {
            int paddingLeft = (int) ((((i - getPaddingLeft()) - getPaddingRight()) + i3) * (getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
            scrollTo(paddingLeft, getScrollY());
            if (!this.f442m.isFinished()) {
                this.f442m.startScroll(paddingLeft, 0, (int) (m311b(this.f438i).f509e * i), 0, this.f442m.getDuration() - this.f442m.timePassed());
                return;
            }
            return;
        }
        C0185bs c0185bsM311b = m311b(this.f438i);
        int iMin = (int) ((c0185bsM311b != null ? Math.min(c0185bsM311b.f509e, this.f449t) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m307a(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int width = right - left;
        int height = bottom - top;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int decorCount = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            C0186bt params = (C0186bt) child.getLayoutParams();
            if (child.getVisibility() == GONE || !params.f510a) {
                continue;
            }
            int childWidth = child.getMeasuredWidth();
            int childHeight = child.getMeasuredHeight();
            int childLeft = paddingLeft;
            int childTop = paddingTop;
            switch (params.f511b & Gravity.HORIZONTAL_GRAVITY_MASK) {
                case Gravity.LEFT:
                    paddingLeft += childWidth;
                    break;
                case Gravity.CENTER_HORIZONTAL:
                    childLeft = Math.max((width - childWidth) / 2, paddingLeft);
                    break;
                case Gravity.RIGHT:
                    childLeft = width - paddingRight - childWidth;
                    paddingRight += childWidth;
                    break;
            }
            switch (params.f511b & Gravity.VERTICAL_GRAVITY_MASK) {
                case Gravity.TOP:
                    paddingTop += childHeight;
                    break;
                case Gravity.CENTER_VERTICAL:
                    childTop = Math.max((height - childHeight) / 2, paddingTop);
                    break;
                case Gravity.BOTTOM:
                    childTop = height - paddingBottom - childHeight;
                    paddingBottom += childHeight;
                    break;
            }
            childLeft += scrollX;
            child.layout(childLeft, childTop, childLeft + childWidth, childTop + childHeight);
            decorCount++;
        }

        int availableWidth = width - paddingLeft - paddingRight;
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            C0186bt params = (C0186bt) child.getLayoutParams();
            if (child.getVisibility() == GONE || params.f510a) {
                continue;
            }
            C0185bs item = m297a(child);
            if (item == null) {
                continue;
            }
            int childLeft = paddingLeft + (int) (availableWidth * item.f509e);
            if (params.f513d) {
                params.f513d = false;
                child.measure(MeasureSpec.makeMeasureSpec((int) (availableWidth * params.f512c), MeasureSpec.EXACTLY),
                        MeasureSpec.makeMeasureSpec(height - paddingTop - paddingBottom, MeasureSpec.EXACTLY));
            }
            child.layout(childLeft, paddingTop, childLeft + child.getMeasuredWidth(),
                    paddingTop + child.getMeasuredHeight());
        }
        this.f446q = paddingTop;
        this.f447r = height - paddingBottom;
        this.f423V = decorCount;
        if (this.f420S) {
            m301a(this.f438i, false, 0, false);
        }
        this.f420S = false;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.f442m.isFinished() && this.f442m.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f442m.getCurrX();
            int currY = this.f442m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!dispatchPageScroll(currX)) {
                    this.f442m.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            C0163ax.m431b(this);
            return;
        }
        m307a(true);
    }

    private boolean dispatchPageScroll(int scrollPixels) {
        if (this.f434e.isEmpty()) {
            this.f422U = false;
            m299a(0, 0.0f);
            if (this.f422U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0185bs page = findPageForScrollPosition();
        int clientWidth = getClientWidth();
        float marginOffset = clientWidth > 0 ? (float) this.f444o / clientWidth : 0;
        float scrollOffset = clientWidth > 0 ? (float) scrollPixels / clientWidth : 0;
        float pageOffset = (scrollOffset - page.f509e) / (page.f508d + marginOffset);
        this.f422U = false;
        m299a(page.f506b, pageOffset);
        if (!this.f422U) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    /* renamed from: a */
    private void m299a(int i, float f) {
        int i2;
        int i3;
        int measuredWidth;
        if (this.f423V > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = getChildAt(i4);
                C0186bt c0186bt = (C0186bt) childAt.getLayoutParams();
                if (c0186bt.f510a) {
                    switch (c0186bt.f511b & 7) {
                        case 1:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i5 = paddingRight;
                            i2 = paddingLeft;
                            i3 = i5;
                            break;
                        case 2:
                        case 4:
                        default:
                            measuredWidth = paddingLeft;
                            int i6 = paddingRight;
                            i2 = paddingLeft;
                            i3 = i6;
                            break;
                        case 3:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i7 = paddingLeft;
                            i3 = paddingRight;
                            i2 = width2;
                            measuredWidth = i7;
                            break;
                        case 5:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i2 = paddingLeft;
                            i3 = measuredWidth2;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                } else {
                    int i8 = paddingRight;
                    i2 = paddingLeft;
                    i3 = i8;
                }
                i4++;
                int i9 = i3;
                paddingLeft = i2;
                paddingRight = i9;
            }
        }
        if (this.f424W != null) {
            this.f424W.mo414a(i, f);
        }
        if (this.f425aa != null) {
            this.f425aa.mo414a(i, f);
        }
        if (this.f427ac != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = getChildAt(i10);
                if (!((C0186bt) childAt2.getLayoutParams()).f510a) {
                    childAt2.getLeft();
                    getClientWidth();
                    InterfaceC0190bx interfaceC0190bx = this.f427ac;
                }
            }
        }
        this.f422U = true;
    }

    /* renamed from: a */
    private void m307a(boolean z) {
        boolean z2 = this.f432ai == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f442m.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f442m.getCurrX();
            int currY = this.f442m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.f454y = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f434e.size(); i++) {
            C0185bs c0185bs = (C0185bs) this.f434e.get(i);
            if (c0185bs.f507c) {
                c0185bs.f507c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C0163ax.m429a(this, this.f431ah);
            } else {
                this.f431ah.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f402A = false;
            this.f403B = false;
            this.f411J = -1;
            if (this.f412K == null) {
                return false;
            }
            this.f412K.recycle();
            this.f412K = null;
            return false;
        }
        if (action != 0) {
            if (this.f402A) {
                return true;
            }
            if (this.f403B) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.f409H = x;
                this.f407F = x;
                float y = motionEvent.getY();
                this.f410I = y;
                this.f408G = y;
                this.f411J = C0141ab.m394b(motionEvent, 0);
                this.f403B = false;
                this.f442m.computeScrollOffset();
                if (this.f432ai == 2 && Math.abs(this.f442m.getFinalX() - this.f442m.getCurrX()) > this.f416O) {
                    this.f442m.abortAnimation();
                    this.f454y = false;
                    m326b();
                    this.f402A = true;
                    m319g();
                    setScrollState(1);
                    break;
                } else {
                    m307a(false);
                    this.f402A = false;
                }
                break;
            case 2:
                int i = this.f411J;
                if (i != -1) {
                    int iM392a = C0141ab.m392a(motionEvent, i);
                    float fM395c = C0141ab.m395c(motionEvent, iM392a);
                    float f = fM395c - this.f407F;
                    float fAbs = Math.abs(f);
                    float fM397d = C0141ab.m397d(motionEvent, iM392a);
                    float fAbs2 = Math.abs(fM397d - this.f410I);
                    if (f != 0.0f) {
                        float f2 = this.f407F;
                        if (!((f2 < ((float) this.f405D) && f > 0.0f) || (f2 > ((float) (getWidth() - this.f405D)) && f < 0.0f)) && m309a(this, false, (int) f, (int) fM395c, (int) fM397d)) {
                            this.f407F = fM395c;
                            this.f408G = fM397d;
                            this.f403B = true;
                            return false;
                        }
                    }
                    if (fAbs > this.f406E && 0.5f * fAbs > fAbs2) {
                        this.f402A = true;
                        m319g();
                        setScrollState(1);
                        this.f407F = f > 0.0f ? this.f409H + this.f406E : this.f409H - this.f406E;
                        this.f408G = fM397d;
                        setScrollingCacheEnabled(true);
                    } else if (fAbs2 > this.f406E) {
                        this.f403B = true;
                    }
                    if (this.f402A && m308a(fM395c)) {
                        C0163ax.m431b(this);
                        break;
                    }
                }
                break;
            case 6:
                m306a(motionEvent);
                break;
        }
        if (this.f412K == null) {
            this.f412K = VelocityTracker.obtain();
        }
        this.f412K.addMovement(motionEvent);
        return this.f402A;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        boolean zM543c = false;
        if (this.f417P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f437h == null || this.f437h.mo408c() == 0) {
            return false;
        }
        if (this.f412K == null) {
            this.f412K = VelocityTracker.obtain();
        }
        this.f412K.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f442m.abortAnimation();
                this.f454y = false;
                m326b();
                float x = motionEvent.getX();
                this.f409H = x;
                this.f407F = x;
                float y = motionEvent.getY();
                this.f410I = y;
                this.f408G = y;
                this.f411J = C0141ab.m394b(motionEvent, 0);
                break;
            case 1:
                if (this.f402A) {
                    VelocityTracker velocityTracker = this.f412K;
                    velocityTracker.computeCurrentVelocity(1000, this.f414M);
                    int velocity = (int) C0159at.m420a(velocityTracker, this.f411J);
                    this.f454y = true;
                    int clientWidth = getClientWidth();
                    C0185bs page = findPageForScrollPosition();
                    float marginOffset = (float) this.f444o / clientWidth;
                    float pageOffset = ((float) getScrollX() / clientWidth - page.f509e)
                            / (page.f508d + marginOffset);
                    int pointerIndex = C0141ab.m392a(motionEvent, this.f411J);
                    int dragDistance = (int) (C0141ab.m395c(motionEvent, pointerIndex) - this.f409H);
                    int targetPage;
                    if (Math.abs(dragDistance) <= this.f415N || Math.abs(velocity) <= this.f413L) {
                        float settleBias = page.f506b >= this.f438i ? 0.4f : 0.6f;
                        targetPage = (int) (page.f506b + pageOffset + settleBias);
                    } else {
                        targetPage = velocity > 0 ? page.f506b : page.f506b + 1;
                    }
                    if (!this.f434e.isEmpty()) {
                        int firstPage = ((C0185bs) this.f434e.get(0)).f506b;
                        int lastPage = ((C0185bs) this.f434e.get(this.f434e.size() - 1)).f506b;
                        targetPage = Math.max(firstPage, Math.min(targetPage, lastPage));
                    }
                    m303a(targetPage, true, true, velocity);
                    this.f411J = -1;
                    m321i();
                    zM543c = this.f418Q.m543c() | this.f419R.m543c();
                }
                break;
            case 2:
                if (!this.f402A) {
                    int iM392a = C0141ab.m392a(motionEvent, this.f411J);
                    float fM395c = C0141ab.m395c(motionEvent, iM392a);
                    float fAbs = Math.abs(fM395c - this.f407F);
                    float fM397d = C0141ab.m397d(motionEvent, iM392a);
                    float fAbs2 = Math.abs(fM397d - this.f408G);
                    if (fAbs > this.f406E && fAbs > fAbs2) {
                        this.f402A = true;
                        m319g();
                        this.f407F = fM395c - this.f409H > 0.0f ? this.f409H + this.f406E : this.f409H - this.f406E;
                        this.f408G = fM397d;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f402A) {
                    zM543c = m308a(C0141ab.m395c(motionEvent, C0141ab.m392a(motionEvent, this.f411J))) | false;
                    break;
                }
                break;
            case 3:
                if (this.f402A) {
                    m301a(this.f438i, true, 0, false);
                    this.f411J = -1;
                    m321i();
                    zM543c = this.f418Q.m543c() | this.f419R.m543c();
                    break;
                }
                break;
            case 5:
                int iM393b = C0141ab.m393b(motionEvent);
                this.f407F = C0141ab.m395c(motionEvent, iM393b);
                this.f411J = C0141ab.m394b(motionEvent, iM393b);
                break;
            case 6:
                m306a(motionEvent);
                this.f407F = C0141ab.m395c(motionEvent, C0141ab.m392a(motionEvent, this.f411J));
                break;
        }
        if (zM543c) {
            C0163ax.m431b(this);
        }
        return true;
    }

    /* renamed from: g */
    private void m319g() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: a */
    private boolean m308a(float f) {
        boolean zM540a = false;
        boolean z;
        float f2;
        boolean z2 = true;
        float f3 = this.f407F - f;
        this.f407F = f;
        float scrollX = getScrollX() + f3;
        int clientWidth = getClientWidth();
        float f4 = clientWidth * this.f448s;
        float f5 = clientWidth * this.f449t;
        C0185bs c0185bs = (C0185bs) this.f434e.get(0);
        C0185bs c0185bs2 = (C0185bs) this.f434e.get(this.f434e.size() - 1);
        if (c0185bs.f506b != 0) {
            f4 = c0185bs.f509e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0185bs2.f506b != this.f437h.mo408c() - 1) {
            f2 = c0185bs2.f509e * clientWidth;
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                zM540a = this.f418Q.m540a(Math.abs(f4 - scrollX) / clientWidth);
            }
        } else if (scrollX > f2) {
            zM540a = z2 ? this.f419R.m540a(Math.abs(scrollX - f2) / clientWidth) : false;
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.f407F += f4 - ((int) f4);
        scrollTo((int) f4, getScrollY());
        dispatchPageScroll((int) f4);
        return zM540a;
    }

    private C0185bs findPageForScrollPosition() {
        int clientWidth = getClientWidth();
        // Pages before a directly selected collection can have negative offsets.
        // Integer division here rounds their fractional positions toward zero.
        float scrollOffset = clientWidth > 0 ? (float) getScrollX() / clientWidth : 0;
        float marginOffset = clientWidth > 0 ? (float) this.f444o / clientWidth : 0;
        float previousOffset = 0;
        float previousWidth = 0;
        int previousPosition = -1;
        C0185bs previousPage = null;
        for (int index = 0; index < this.f434e.size(); index++) {
            C0185bs page = (C0185bs) this.f434e.get(index);
            if (previousPage != null && page.f506b != previousPosition + 1) {
                page = this.f435f;
                page.f509e = previousOffset + previousWidth + marginOffset;
                page.f506b = previousPosition + 1;
                page.f508d = 1.0f;
                index--;
            }
            float pageStart = page.f509e;
            float pageEnd = pageStart + page.f508d + marginOffset;
            if (previousPage != null && scrollOffset < pageStart) {
                return previousPage;
            }
            if (scrollOffset < pageEnd || index == this.f434e.size() - 1) {
                return page;
            }
            previousPosition = page.f506b;
            previousOffset = pageStart;
            previousWidth = page.f508d;
            previousPage = page;
        }
        return previousPage;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zM541a = false;
        int iM424a = C0163ax.m424a(this);
        if (iM424a == 0 || (iM424a == 1 && this.f437h != null && this.f437h.mo408c() > 1)) {
            if (!this.f418Q.m539a()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f448s * width);
                this.f418Q.m538a(height, width);
                zM541a = this.f418Q.m541a(canvas) | false;
                canvas.restoreToCount(iSave);
            }
            if (!this.f419R.m539a()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f449t + 1.0f)) * width2);
                this.f419R.m538a(height2, width2);
                zM541a |= this.f419R.m541a(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f418Q.m542b();
            this.f419R.m542b();
        }
        if (zM541a) {
            C0163ax.m431b(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f444o > 0 && this.f445p != null && this.f434e.size() > 0 && this.f437h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = (float) this.f444o / width;
            C0185bs c0185bs = (C0185bs) this.f434e.get(0);
            float f3 = c0185bs.f509e;
            int size = this.f434e.size();
            int i = c0185bs.f506b;
            int i2 = ((C0185bs) this.f434e.get(size - 1)).f506b;
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                while (i4 > c0185bs.f506b && i3 < size) {
                    i3++;
                    c0185bs = (C0185bs) this.f434e.get(i3);
                }
                if (i4 == c0185bs.f506b) {
                    f = (c0185bs.f509e + c0185bs.f508d) * width;
                    f3 = c0185bs.f509e + c0185bs.f508d + f2;
                } else {
                    AbstractC0145af abstractC0145af = this.f437h;
                    f = (1.0f + f3) * width;
                    f3 += 1.0f + f2;
                }
                if (this.f444o + f > scrollX) {
                    this.f445p.setBounds((int) f, this.f446q, (int) (this.f444o + f + 0.5f), this.f447r);
                    this.f445p.draw(canvas);
                }
                if (f > scrollX + width) {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean m327c() {
        return this.f417P;
    }

    /* renamed from: a */
    private void m306a(MotionEvent motionEvent) {
        int iM393b = C0141ab.m393b(motionEvent);
        if (C0141ab.m394b(motionEvent, iM393b) == this.f411J) {
            int i = iM393b == 0 ? 1 : 0;
            this.f407F = C0141ab.m395c(motionEvent, i);
            this.f411J = C0141ab.m394b(motionEvent, i);
            if (this.f412K != null) {
                this.f412K.clear();
            }
        }
    }

    /* renamed from: i */
    private void m321i() {
        this.f402A = false;
        this.f403B = false;
        if (this.f412K != null) {
            this.f412K.recycle();
            this.f412K = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f453x != z) {
            this.f453x = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f437h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f448s)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f449t));
    }

    /* renamed from: a */
    private boolean m309a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && m309a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && C0163ax.m430a(view, -i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[FALL_THROUGH] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            r1 = 1
            r0 = 0
            boolean r2 = super.dispatchKeyEvent(r5)
            if (r2 != 0) goto L18
            int r2 = r5.getAction()
            if (r2 != 0) goto L15
            int r2 = r5.getKeyCode()
            switch(r2) {
                case 21: goto L1a;
                case 22: goto L21;
                case 61: goto L28;
                default: goto L15;
            }
        L15:
            r2 = r0
        L16:
            if (r2 == 0) goto L19
        L18:
            r0 = r1
        L19:
            return r0
        L1a:
            r2 = 17
            boolean r2 = r4.m315d(r2)
            goto L16
        L21:
            r2 = 66
            boolean r2 = r4.m315d(r2)
            goto L16
        L28:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r2 < r3) goto L15
            boolean r2 = android.support.v4.view.C0214w.m494b(r5)
            if (r2 == 0) goto L3a
            r2 = 2
            boolean r2 = r4.m315d(r2)
            goto L16
        L3a:
            boolean r2 = android.support.v4.view.C0214w.m493a(r5)
            if (r2 == 0) goto L15
            boolean r2 = r4.m315d(r1)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        if (r10 != 2) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m315d(int r10) throws android.content.res.Resources.NotFoundException {
        /*
            r9 = this;
            r1 = 0
            r8 = 66
            r7 = 17
            r4 = 0
            r3 = 1
            android.view.View r2 = r9.findFocus()
            if (r2 != r9) goto L3f
            r0 = r1
        Le:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r9, r0, r10)
            if (r1 == 0) goto Lbd
            if (r1 == r0) goto Lbd
            if (r10 != r7) goto La1
            android.graphics.Rect r2 = r9.f436g
            android.graphics.Rect r2 = r9.m295a(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r9.f436g
            android.graphics.Rect r3 = r9.m295a(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L9c
            if (r2 < r3) goto L9c
            boolean r0 = r9.m322j()
        L34:
            r4 = r0
        L35:
            if (r4 == 0) goto L3e
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r10)
            r9.playSoundEffect(r0)
        L3e:
            return r4
        L3f:
            if (r2 == 0) goto Le9
            android.view.ViewParent r0 = r2.getParent()
        L45:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto Lec
            if (r0 != r9) goto L7c
            r0 = r3
        L4c:
            if (r0 != 0) goto Le9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r5.append(r0)
            android.view.ViewParent r0 = r2.getParent()
        L62:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L81
            java.lang.String r2 = " => "
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r2.append(r6)
            android.view.ViewParent r0 = r0.getParent()
            goto L62
        L7c:
            android.view.ViewParent r0 = r0.getParent()
            goto L45
        L81:
            java.lang.String r0 = "ViewPager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "arrowScroll tried to find focus based on non-child current focused view "
            r2.<init>(r6)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r0, r2)
            r0 = r1
            goto Le
        L9c:
            boolean r0 = r1.requestFocus()
            goto L34
        La1:
            if (r10 != r8) goto L35
            android.graphics.Rect r2 = r9.f436g
            android.graphics.Rect r2 = r9.m295a(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r5 = r9.f436g
            android.graphics.Rect r5 = r9.m295a(r5, r0)
            int r5 = r5.left
            if (r0 == 0) goto Lb7
            if (r2 <= r5) goto Lcc
        Lb7:
            boolean r0 = r1.requestFocus()
            goto L34
        Lbd:
            if (r10 == r7) goto Lc1
            if (r10 != r3) goto Lc7
        Lc1:
            boolean r0 = r9.m322j()
            goto L34
        Lc7:
            if (r10 == r8) goto Lcc
            r0 = 2
            if (r10 != r0) goto L35
        Lcc:
            android.support.v4.view.af r0 = r9.f437h
            if (r0 == 0) goto Le6
            int r0 = r9.f438i
            android.support.v4.view.af r1 = r9.f437h
            int r1 = r1.mo408c()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto Le6
            int r0 = r9.f438i
            int r0 = r0 + 1
            r9.m325a(r0, r3)
            r0 = r3
            goto L34
        Le6:
            r0 = r4
            goto L34
        Le9:
            r0 = r2
            goto Le
        Lec:
            r0 = r4
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.m315d(int):boolean");
    }

    /* renamed from: a */
    private Rect m295a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    /* renamed from: j */
    private boolean m322j() throws Resources.NotFoundException {
        if (this.f438i <= 0) {
            return false;
        }
        m325a(this.f438i - 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        C0185bs c0185bsM297a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c0185bsM297a = m297a(childAt)) != null && c0185bsM297a.f506b == this.f438i) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        C0185bs c0185bsM297a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0185bsM297a = m297a(childAt)) != null && c0185bsM297a.f506b == this.f438i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        C0185bs c0185bsM297a;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c0185bsM297a = m297a(childAt)) != null && c0185bsM297a.f506b == this.f438i && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0185bs c0185bsM297a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0185bsM297a = m297a(childAt)) != null && c0185bsM297a.f506b == this.f438i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0186bt();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0186bt) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0186bt(getContext(), attributeSet);
    }
}
