package com.cyo.common.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.v4.view.C0205n;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import android.widget.ZoomButtonsController;
import com.cyo.comicrack.viewer.C0795fk;
import com.cyo.common.C0950af;
import com.cyo.common.p022a.AbstractC0934e;
import com.cyo.common.p022a.C0932c;
import com.cyo.common.p022a.C0944o;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.v */
/* loaded from: classes.dex */
public class GestureDetectorOnDoubleTapListenerC1167v extends View implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ZoomButtonsController.OnZoomListener, InterfaceC1163r {

    /* renamed from: a */
    private Scroller f3698a;

    /* renamed from: b */
    public float f3699b;

    /* renamed from: c */
    public float f3700c;

    /* renamed from: d */
    public float f3701d;

    /* renamed from: e */
    public float f3702e;

    /* renamed from: f */
    public boolean f3703f;

    /* renamed from: g */
    public C1165t f3704g;

    /* renamed from: h */
    public C1161p f3705h;

    /* renamed from: i */
    float f3706i;

    /* renamed from: j */
    private C0205n f3707j;

    /* renamed from: k */
    private C1168w f3708k;

    /* renamed from: l */
    private InterfaceC1171z f3709l;

    /* renamed from: m */
    private InterfaceC1107aa f3710m;

    /* renamed from: n */
    private InterfaceC1163r f3711n;

    /* renamed from: o */
    private InterfaceC1110ad f3712o;

    /* renamed from: p */
    private InterfaceC1108ab f3713p;

    /* renamed from: q */
    private boolean f3714q;

    /* renamed from: r */
    private float f3715r;

    /* renamed from: s */
    private EnumC1109ac f3716s;

    /* renamed from: t */
    private boolean f3717t;

    /* renamed from: u */
    private ZoomButtonsController f3718u;

    /* renamed from: v */
    private int f3719v;

    /* renamed from: a */
    static /* synthetic */ C1165t m2483a(GestureDetectorOnDoubleTapListenerC1167v gestureDetectorOnDoubleTapListenerC1167v) {
        return gestureDetectorOnDoubleTapListenerC1167v.f3704g;
    }

    public GestureDetectorOnDoubleTapListenerC1167v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3699b = 1.1f;
        this.f3700c = 1.0f;
        this.f3701d = 3.0f;
        this.f3702e = 0.25f;
        this.f3703f = true;
        this.f3704g = new C1165t();
        this.f3705h = new C1161p();
        this.f3715r = 2.0f;
        this.f3716s = EnumC1109ac.None;
        this.f3719v = C0932c.m1960a(0, -16777216);
        this.f3698a = new Scroller(context);
        this.f3707j = new C0205n(context, this);
        this.f3708k = new C1168w(this, context);
        this.f3705h.f3666b = this;
    }

    public GestureDetectorOnDoubleTapListenerC1167v(Context context) {
        this(context, null);
    }

    public void setOnGetSizeListener(InterfaceC1107aa interfaceC1107aa) {
        this.f3710m = interfaceC1107aa;
        invalidate();
    }

    public void setOnContentAnimationListener(InterfaceC1163r interfaceC1163r) {
        this.f3711n = interfaceC1163r;
    }

    public void setOnTapListener(InterfaceC1110ad interfaceC1110ad) {
        this.f3712o = interfaceC1110ad;
    }

    public void setOnManualScrollListener(InterfaceC1108ab interfaceC1108ab) {
        this.f3713p = interfaceC1108ab;
    }

    /* renamed from: a */
    public final void m2490a(int i, int i2) {
        this.f3704g.f3691g = i;
        this.f3704g.f3692h = i2;
        invalidate();
    }

    public void setScale(float f) {
        if (f != this.f3704g.f3690f) {
            this.f3704g.f3690f = f;
            invalidate();
        }
    }

    public float getScale() {
        return this.f3704g.f3690f;
    }

    public void setFitting(EnumC1164s enumC1164s) {
        if (enumC1164s != this.f3704g.f3685a) {
            this.f3704g.f3685a = enumC1164s;
            invalidate();
        }
    }

    public EnumC1164s getFitting() {
        return this.f3704g.f3685a;
    }

    public boolean getSplitDoublePages() {
        return this.f3704g.f3688d;
    }

    public C1165t getContentLayout() {
        return this.f3704g.m2482p();
    }

    /* renamed from: a */
    public final void m2492a(C1165t c1165t, boolean z, float f) {
        boolean z2 = false;
        if (z) {
            Matrix matrixM2481o = this.f3704g.m2481o();
            Matrix matrixM2481o2 = c1165t.m2481o();
            float[] fArr = new float[9];
            float[] fArr2 = new float[9];
            matrixM2481o.getValues(fArr);
            matrixM2481o2.getValues(fArr2);
            int i = 0;
            while (true) {
                if (i < fArr.length) {
                    if (!C0950af.m1992b(fArr[i], fArr2[i], 0.001f)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                this.f3705h.m2440a(new C1170y(this, matrixM2481o, matrixM2481o2, f), 500L);
                m2496c();
            }
        }
        this.f3704g = c1165t.m2482p();
        m2484a();
        invalidate();
    }

    public void setContentLayout(C1165t c1165t) {
        m2492a(c1165t, false, 0.0f);
    }

    /* renamed from: a */
    private void m2485a(float f, float f2, float f3, boolean z, float f4) {
        boolean z2 = z & this.f3714q;
        if (this.f3718u != null) {
            this.f3718u.setZoomInEnabled(f3 < this.f3701d);
            this.f3718u.setZoomOutEnabled(f3 > this.f3700c);
        }
        m2492a(m2488a(f, f2, f3, f4), z2, this.f3699b);
    }

    /* renamed from: a */
    public final C1165t m2488a(float f, float f2, float f3, float f4) {
        float fMin = Math.min(Math.max(this.f3700c, f3), this.f3701d);
        C1165t c1165tM2482p = this.f3704g.m2482p();
        c1165tM2482p.m2464a(f, f2, fMin);
        if (f4 > 0.0f) {
            if (c1165tM2482p.f3693i < c1165tM2482p.f3691g * f4) {
                c1165tM2482p.f3693i = 0.0f;
            }
            if (c1165tM2482p.f3694j < c1165tM2482p.f3692h * f4) {
                c1165tM2482p.f3694j = 0.0f;
            }
            if (c1165tM2482p.m2480n() > c1165tM2482p.f3691g * (1.0f - f4)) {
                c1165tM2482p.f3693i = c1165tM2482p.f3691g - c1165tM2482p.m2477k();
            }
            if (c1165tM2482p.m2479m() > c1165tM2482p.f3692h * (1.0f - f4)) {
                c1165tM2482p.f3694j = c1165tM2482p.f3692h - c1165tM2482p.m2478l();
            }
        }
        return c1165tM2482p;
    }

    /* renamed from: a */
    public final void m2489a(float f, float f2, float f3, boolean z) {
        m2485a(f, f2, f3, z, 0.0f);
    }

    /* renamed from: a */
    public final void m2491a(EnumC1164s enumC1164s, boolean z) {
        if (enumC1164s != this.f3704g.f3685a) {
            boolean z2 = this.f3714q & z;
            C1165t c1165t = new C1165t(this.f3704g);
            c1165t.f3685a = enumC1164s;
            m2492a(c1165t, z2, this.f3699b);
        }
    }

    /* renamed from: a */
    public final void m2493a(boolean z) {
        if (this.f3704g.f3688d != z) {
            this.f3704g.f3688d = z;
            postInvalidate();
        }
    }

    /* renamed from: b */
    public final void m2494b() {
        C1161p c1161p = this.f3705h;
        synchronized (c1161p.f3665a) {
            Iterator it = c1161p.f3665a.iterator();
            while (it.hasNext()) {
                ((AbstractC1159n) it.next()).f3663m = null;
            }
            c1161p.f3665a.clear();
        }
    }

    /* renamed from: c */
    public final void m2496c() {
        this.f3705h.m2449e();
    }

    /* renamed from: a */
    public void mo1508a(AbstractC1159n abstractC1159n) {
        if (this.f3711n != null) {
            this.f3711n.mo1508a(abstractC1159n);
        }
    }

    /* renamed from: b */
    public final void m2495b(boolean z) {
        this.f3714q = z;
    }

    /* renamed from: d */
    public final void m2498d() {
        if (this.f3718u == null) {
            this.f3718u = new ZoomButtonsController(this);
        }
        this.f3718u.setOnZoomListener(this);
        this.f3718u.setZoomInEnabled(this.f3704g.f3690f < this.f3701d);
        this.f3718u.setZoomOutEnabled(this.f3704g.f3690f > this.f3700c);
    }

    /* renamed from: e */
    public final void m2499e() {
        if (this.f3718u != null) {
            this.f3718u.setVisible(true);
        }
    }

    /* renamed from: f */
    public final Bitmap m2500f() {
        if (!this.f3704g.m2466a()) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f3704g.f3686b, this.f3704g.f3687c, Bitmap.Config.ARGB_8888);
        mo1506a(new Canvas(bitmapCreateBitmap), this.f3704g.m2481o(), false);
        return bitmapCreateBitmap;
    }

    public int getOverlayColor() {
        return this.f3719v;
    }

    public void setOverlayColor(int i) {
        if (this.f3719v != i) {
            this.f3719v = i;
            postInvalidate();
        }
    }

    public int getOverlayColorAlpha() {
        return Color.alpha(this.f3719v);
    }

    public void setOverlayColorAlpha(int i) {
        setOverlayColor(C0932c.m1960a(i, this.f3719v));
    }

    public void setQuickScaleEnabled(boolean z) {
        if (this.f3708k != null) {
            this.f3708k.m2503a(z);
        }
    }

    /* renamed from: a */
    public void mo1506a(Canvas canvas, Matrix matrix, boolean z) {
        if (this.f3709l != null) {
            InterfaceC1171z interfaceC1171z = this.f3709l;
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation", "NewApi"})
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo1505a(canvas);
        C0944o c0944o = new C0944o(getWidth(), getHeight());
        if (this.f3710m != null) {
            this.f3710m.mo1852a(this, c0944o);
        }
        this.f3704g.f3686b = c0944o.f2832a;
        this.f3704g.f3687c = c0944o.f2833b;
        if (this.f3704g.m2466a()) {
            if (this.f3698a.computeScrollOffset()) {
                this.f3704g.f3693i = this.f3698a.getCurrX();
                this.f3704g.f3694j = this.f3698a.getCurrY();
                invalidate();
            }
            int iSave = canvas.save();
            try {
                if (!this.f3705h.m2443a(canvas, (AbstractC0934e) null)) {
                    mo1506a(canvas, this.f3704g.m2481o(), !this.f3698a.isFinished());
                }
            } finally {
                canvas.restoreToCount(iSave);
                if (Color.alpha(this.f3719v) > 5) {
                    canvas.drawColor(this.f3719v);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1505a(Canvas canvas) {
    }

    @Override // android.view.View
    protected int computeHorizontalScrollExtent() {
        if (this.f3704g.m2475i() > 0 && this.f3704g.f3691g != 0) {
            return Math.round((computeHorizontalScrollRange() * getWidth()) / this.f3704g.m2475i());
        }
        return 0;
    }

    @Override // android.view.View
    protected int computeHorizontalScrollOffset() {
        if (this.f3704g.f3691g == 0) {
            return 0;
        }
        return Math.round((computeHorizontalScrollRange() * this.f3704g.f3693i) / this.f3704g.f3691g);
    }

    @Override // android.view.View
    protected int computeVerticalScrollExtent() {
        if (this.f3704g.m2476j() > 0 && this.f3704g.f3692h != 0) {
            return Math.round((computeVerticalScrollRange() * getHeight()) / this.f3704g.m2476j());
        }
        return 0;
    }

    @Override // android.view.View
    protected int computeVerticalScrollOffset() {
        if (this.f3704g.f3692h == 0) {
            return 0;
        }
        return Math.round((computeVerticalScrollRange() * this.f3704g.f3694j) / this.f3704g.f3692h);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3718u != null) {
            this.f3718u.setVisible(false);
        }
    }

    @Override // android.view.View
    @TargetApi(8)
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f3718u != null && i != 0) {
            this.f3718u.setVisible(false);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            m2501g();
        }
        if (!this.f3698a.isFinished()) {
            this.f3698a.abortAnimation();
        }
        if (this.f3708k != null) {
            this.f3708k.f3720a.onTouchEvent(motionEvent);
            if (this.f3708k.f3720a.isInProgress()) {
                return true;
            }
        }
        return this.f3707j.m483a(motionEvent);
    }

    /* renamed from: g */
    public final void m2501g() {
        if (this.f3716s == EnumC1109ac.Ok) {
            this.f3716s = EnumC1109ac.None;
            if (this.f3713p != null) {
                this.f3713p.mo1859b();
            }
        }
        this.f3716s = EnumC1109ac.None;
        m2486i();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f3717t = false;
        m2486i();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f3717t) {
            if (!this.f3698a.isFinished()) {
                this.f3698a.abortAnimation();
            }
            C1166u c1166uM2470d = this.f3704g.m2470d();
            this.f3698a.fling((int) this.f3704g.m2471e(), (int) this.f3704g.m2472f(), -((int) (f / c1166uM2470d.f3696a)), -((int) (f2 / c1166uM2470d.f3697b)), 0, (int) this.f3704g.m2473g(), 0, (int) this.f3704g.m2474h());
            invalidate();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        if ((this.f3708k == null || !this.f3708k.f3720a.isInProgress()) && this.f3712o != null) {
            this.f3712o.mo1631b(motionEvent.getX(), motionEvent.getY());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f3716s == EnumC1109ac.Ok) {
            if (this.f3713p != null) {
                this.f3713p.mo1858a(motionEvent2);
            }
        } else if (this.f3716s != EnumC1109ac.Cancel) {
            this.f3716s = this.f3713p == null ? EnumC1109ac.None : this.f3713p.mo1856a(motionEvent2, f, f2);
            if (this.f3716s == EnumC1109ac.Ok && !this.f3698a.isFinished()) {
                this.f3698a.abortAnimation();
            }
            if (this.f3716s != EnumC1109ac.None) {
                this.f3717t = true;
            } else {
                C1166u c1166uM2470d = this.f3704g.m2470d();
                this.f3704g.f3693i += f / c1166uM2470d.f3696a;
                C1165t c1165t = this.f3704g;
                c1165t.f3694j = (f2 / c1166uM2470d.f3697b) + c1165t.f3694j;
                m2484a();
                invalidate();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        C1166u c1166uM2470d = this.f3704g.m2470d();
        this.f3704g.f3693i = i / c1166uM2470d.f3696a;
        this.f3704g.f3694j = i2 / c1166uM2470d.f3697b;
        m2484a();
        invalidate();
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        super.scrollBy(i, i2);
        C1166u c1166uM2470d = this.f3704g.m2470d();
        this.f3704g.f3693i += i / c1166uM2470d.f3696a;
        C1165t c1165t = this.f3704g;
        c1165t.f3694j = (i2 / c1166uM2470d.f3697b) + c1165t.f3694j;
        m2484a();
        invalidate();
    }

    /* renamed from: a */
    private void m2484a() {
        if (this.f3703f) {
            awakenScrollBars();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        PointF pointFM2467b = this.f3704g.m2467b(motionEvent.getX(), motionEvent.getY());
        if (this.f3704g.f3690f == 1.0f) {
            m2485a(pointFM2467b.x, pointFM2467b.y, this.f3715r, true, 0.1f);
        } else {
            this.f3715r = this.f3704g.f3690f;
            if (this.f3715r < 1.5f) {
                this.f3715r = 2.0f;
            }
            m2489a(pointFM2467b.x, pointFM2467b.y, 1.0f, true);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (this.f3712o == null) {
            return false;
        }
        InterfaceC1110ad interfaceC1110ad = this.f3712o;
        motionEvent.getX();
        motionEvent.getY();
        interfaceC1110ad.mo1632l();
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.f3712o != null && this.f3712o.mo1628a(motionEvent.getX(), motionEvent.getY());
    }

    @Override // android.widget.ZoomButtonsController.OnZoomListener
    public void onVisibilityChanged(boolean z) {
    }

    @Override // android.widget.ZoomButtonsController.OnZoomListener
    public void onZoom(boolean z) {
        C1165t c1165t = this.f3704g;
        PointF pointF = new PointF(c1165t.m2471e() + (c1165t.m2477k() / 2.0f), c1165t.m2478l() + c1165t.m2472f());
        m2489a(pointF.x, pointF.y, (z ? this.f3702e : -this.f3702e) + this.f3704g.f3690f, false);
    }

    /* renamed from: i */
    private void m2486i() {
        if (this.f3713p != null) {
            this.f3713p.mo1857a();
        }
    }

    public void setManualResumeMode(EnumC1162q enumC1162q) {
        this.f3705h.f3669e = enumC1162q;
    }

    public EnumC1162q getManualResumeMode() {
        return this.f3705h.f3669e;
    }

    /* renamed from: c */
    public final void m2497c(boolean z) {
        C1161p c1161p = this.f3705h;
        c1161p.f3670f = z;
        synchronized (c1161p.f3665a) {
            Iterator it = c1161p.f3665a.iterator();
            while (it.hasNext()) {
                ((AbstractC1159n) it.next()).m2425a(z);
            }
        }
        if (z) {
            return;
        }
        if (c1161p.f3669e == EnumC1162q.Forward) {
            synchronized (c1161p.f3665a) {
                Iterator it2 = c1161p.f3665a.iterator();
                while (it2.hasNext()) {
                    ((AbstractC1159n) it2.next()).m2432g();
                }
            }
            c1161p.m2450f();
            return;
        }
        synchronized (c1161p.f3665a) {
            for (int size = c1161p.f3665a.size() - 1; size >= 0 && ((AbstractC1159n) c1161p.f3665a.get(size)).f3662l <= 0.0f; size--) {
                c1161p.f3665a.remove(size);
            }
            Collections.reverse(c1161p.f3665a);
            for (AbstractC1159n abstractC1159n : c1161p.f3665a) {
                abstractC1159n.f3664n = true;
                abstractC1159n.m2432g();
            }
        }
        c1161p.m2450f();
    }

    /* renamed from: h */
    public final boolean m2502h() {
        return !this.f3705h.f3670f && this.f3705h.m2446b();
    }

    /* renamed from: a */
    public final float m2487a(float f) {
        AbstractC1159n abstractC1159nM2442a = this.f3705h.m2442a(C0795fk.class);
        C1161p c1161p = this.f3705h;
        int iIndexOf = c1161p.f3665a.indexOf(abstractC1159nM2442a);
        long jM2441a = iIndexOf == -1 ? 0L : c1161p.m2441a(iIndexOf);
        this.f3706i = C0950af.m1989a(f, 0.0f, 1.0f);
        C1161p c1161p2 = this.f3705h;
        long j = (long) (jM2441a * this.f3706i);
        c1161p2.f3671g = j / c1161p2.m2451g();
        synchronized (c1161p2.f3665a) {
            for (AbstractC1159n item : c1161p2.f3665a) {
                item.m2426b(j / item.f3661k);
                j -= item.f3661k;
            }
        }
        return this.f3706i;
    }

    public float getManualPosition() {
        return this.f3706i;
    }
}
