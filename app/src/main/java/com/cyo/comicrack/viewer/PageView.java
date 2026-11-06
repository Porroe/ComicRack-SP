package com.cyo.comicrack.viewer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p021b.AbstractC0587aa;
import com.cyo.comicrack.p019a.p021b.C0620v;
import com.cyo.common.C0950af;
import com.cyo.common.C0951ag;
import com.cyo.common.p022a.C0932c;
import com.cyo.common.p022a.C0944o;
import com.cyo.common.view.AbstractC1159n;
import com.cyo.common.view.C1165t;
import com.cyo.common.view.EnumC1164s;
import com.cyo.common.view.GestureDetectorOnDoubleTapListenerC1167v;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class PageView extends GestureDetectorOnDoubleTapListenerC1167v {

    /* renamed from: a */
    public static final EnumC0790ff f1997a = EnumC0790ff.Page;

    /* renamed from: y */
    private static /* synthetic */ int[] f1998y;

    /* renamed from: j */
    private AbstractC0587aa f1999j;

    /* renamed from: k */
    private boolean f2000k;

    /* renamed from: l */
    private boolean f2001l;

    /* renamed from: m */
    private boolean f2002m;

    /* renamed from: n */
    private EnumC0790ff f2003n;

    /* renamed from: o */
    private float f2004o;

    /* renamed from: p */
    private float f2005p;

    /* renamed from: q */
    private float f2006q;

    /* renamed from: r */
    private boolean f2007r;

    /* renamed from: s */
    private boolean f2008s;

    /* renamed from: t */
    private boolean f2009t;

    /* renamed from: u */
    private float f2010u;

    /* renamed from: v */
    private float f2011v;

    /* renamed from: w */
    private float f2012w;

    /* renamed from: x */
    private ColorMatrixColorFilter f2013x;

    /* renamed from: i */
    private static /* synthetic */ int[] m1504i() {
        int[] iArr = f1998y;
        if (iArr == null) {
            iArr = new int[EnumC0790ff.valuesCustom().length];
            try {
                iArr[EnumC0790ff.Black.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0790ff.Page.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0790ff.White.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            f1998y = iArr;
        }
        return iArr;
    }

    /* renamed from: a */
    static /* synthetic */ AbstractC0587aa m1492a(PageView pageView) {
        return pageView.f1999j;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m1501b(PageView pageView) {
        return pageView.f2002m;
    }

    public PageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2001l = true;
        this.f2003n = f1997a;
        this.f2007r = true;
        this.f2010u = -100.0f;
    }

    public PageView(Context context) {
        this(context, null);
    }

    @Override // com.cyo.common.view.GestureDetectorOnDoubleTapListenerC1167v, com.cyo.common.view.InterfaceC1163r
    /* renamed from: a */
    public final void mo1508a(AbstractC1159n abstractC1159n) {
        if (abstractC1159n instanceof C0795fk) {
            C0795fk c0795fk = (C0795fk) abstractC1159n;
            if (!c0795fk.f3664n) {
                this.f2000k = false;
                c0795fk.f2484d = this.f1999j;
                setPageBitmap(c0795fk.f2483c);
            } else {
                setContentLayout(c0795fk.f2481a.f2477h);
            }
        }
        super.mo1508a(abstractC1159n);
    }

    /* renamed from: a */
    private void m1494a(AbstractC0587aa abstractC0587aa, EnumC0793fi enumC0793fi, boolean z) {
        if (abstractC0587aa != null) {
            m2490a(abstractC0587aa.mo1273b(), abstractC0587aa.mo1274c());
            C1165t contentLayout = getContentLayout();
            if (enumC0793fi != EnumC0793fi.Backward) {
                if (z) {
                    contentLayout.m2463a(1000000.0f, 0.0f);
                } else {
                    contentLayout.m2463a(0.0f, 0.0f);
                }
            } else if (z) {
                contentLayout.m2463a(0.0f, 1000000.0f);
            } else {
                contentLayout.m2463a(1000000.0f, 1000000.0f);
            }
            setContentLayout(contentLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.cyo.common.view.GestureDetectorOnDoubleTapListenerC1167v
    /* renamed from: a */
    public final void mo1506a(Canvas canvas, Matrix matrix, boolean z) {
        super.mo1506a(canvas, matrix, z);
        if (this.f1999j != null) {
            Paint paintM1489a = m1489a(canvas, z);
            canvas.concat(matrix);
            m1491a(this.f1999j, canvas, paintM1489a);
        }
    }

    /* renamed from: b */
    static /* synthetic */ Paint m1499b(Canvas canvas) {
        return m1489a(canvas, true);
    }

    /* renamed from: a */
    private static Paint m1489a(Canvas canvas, boolean z) {
        if (z && !C0951ag.m1998a(canvas)) {
            return null;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.cyo.common.view.GestureDetectorOnDoubleTapListenerC1167v
    /* renamed from: a */
    public final void mo1505a(Canvas canvas) {
        super.mo1505a(canvas);
        int iM1488a = m1488a(this.f1999j);
        Paint paintM1490a = m1490a((Paint) null);
        if (paintM1490a == null) {
            canvas.drawColor(iM1488a);
        } else {
            paintM1490a.setColor(iM1488a);
            canvas.drawPaint(paintM1490a);
        }
    }

    /* renamed from: a */
    private int m1488a(AbstractC0587aa abstractC0587aa) {
        switch (m1504i()[this.f2003n.ordinal()]) {
            case TwitterResponse.READ /* 1 */:
                if (abstractC0587aa != null) {
                    break;
                }
                break;
        }
        return -16777216;
    }

    public AbstractC0587aa getPageBitmap() {
        return this.f1999j;
    }

    public void setPageBitmap(AbstractC0587aa abstractC0587aa) {
        if (this.f2000k && this.f1999j != null) {
            this.f1999j.m1279h();
            this.f1999j = null;
        }
        this.f2000k = true;
        this.f1999j = abstractC0587aa;
    }

    /* renamed from: a */
    public final void m1507a(AbstractC0587aa abstractC0587aa, C0794fj c0794fj, InterfaceC0792fh interfaceC0792fh) {
        C1165t contentLayout;
        EnumC0793fi enumC0793fi = c0794fj.f2471b;
        if (m1511a(enumC0793fi) && this.f1999j != null && abstractC0587aa != null) {
            c0794fj.f2477h = getContentLayout();
            EnumC1164s fitting = getFitting();
            float scale = getScale();
            boolean splitDoublePages = getSplitDoublePages();
            C1165t c1165tA = m2488a(0.0f, 0.0f, 1.0f, 0.0f);
            if (this.f2008s && !c0794fj.f2472c) {
                c1165tA.f3685a = EnumC1164s.FitAll;
                c1165tA.f3688d = false;
            }
            m2492a(c1165tA, true, this.f3699b);
            this.f3705h.m2440a(new C0795fk(this, abstractC0587aa, c0794fj), c0794fj.f2478i);
            m1494a(abstractC0587aa, enumC0793fi, c0794fj.f2474e);
            if (interfaceC0792fh != null) {
                contentLayout = interfaceC0792fh.mo1843a(scale, fitting, splitDoublePages);
            } else {
                contentLayout = getContentLayout();
                contentLayout.f3685a = fitting;
                contentLayout.f3688d = splitDoublePages;
                if (enumC0793fi != EnumC0793fi.Backward) {
                    if (c0794fj.f2474e) {
                        contentLayout.m2464a(1000000.0f, 0.0f, scale);
                    } else {
                        contentLayout.m2464a(0.0f, 0.0f, scale);
                    }
                } else if (c0794fj.f2474e) {
                    contentLayout.m2464a(0.0f, 1000000.0f, scale);
                } else {
                    contentLayout.m2464a(1000000.0f, 1000000.0f, scale);
                }
            }
            m2492a(contentLayout, true, this.f3699b);
            m2496c();
            return;
        }
        mo1508a(new C0795fk(this, abstractC0587aa, c0794fj));
        m1494a(this.f1999j, enumC0793fi, c0794fj.f2474e);
        if (this.f3704g.f3686b <= 0 && this.f3704g.f3687c <= 0) {
            this.f3704g.f3686b = this.f3704g.f3691g;
            this.f3704g.f3687c = this.f3704g.f3692h;
            if (this.f3704g.f3686b > this.f3704g.f3687c) {
                this.f3704g.f3686b /= 2;
            }
        }
        if (getContentLayout().m2466a() && interfaceC0792fh != null) {
            m2492a(interfaceC0792fh.mo1843a(getScale(), getFitting(), getSplitDoublePages()), false, 0.0f);
        }
        post(new RunnableC0789fe(this));
    }

    /* renamed from: a */
    public final void m1509a(boolean z, boolean z2) {
        this.f2001l = z;
        this.f2008s = z2;
    }

    /* renamed from: a */
    public final boolean m1511a(EnumC0793fi enumC0793fi) {
        return enumC0793fi != EnumC0793fi.None && this.f2001l && C0628f.f1885g == 1;
    }

    public void setOverlapExpandToLeft(boolean z) {
        this.f2002m = z;
    }

    public void setBackgroundStyle(String str) {
        EnumC0790ff enumC0790ffValueOf = f1997a;
        try {
            enumC0790ffValueOf = EnumC0790ff.valueOf(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (enumC0790ffValueOf != this.f2003n) {
            this.f2003n = enumC0790ffValueOf;
            invalidate();
        }
    }

    public float getColorSaturation() {
        return this.f2004o;
    }

    public void setColorSaturation(float f) {
        float fM1989a = C0950af.m1989a(f, -1.0f, 1.0f);
        if (this.f2004o != fM1989a) {
            this.f2004o = fM1989a;
            invalidate();
        }
    }

    public float getColorBrightness() {
        return this.f2005p;
    }

    public void setColorBrightness(float f) {
        this.f2005p = C0950af.m1989a(this.f2005p, -1.0f, 1.0f);
        if (this.f2005p != f) {
            this.f2005p = f;
            invalidate();
        }
    }

    public float getColorContrast() {
        return this.f2006q;
    }

    public void setColorContrast(float f) {
        float fM1989a = C0950af.m1989a(f, -1.0f, 1.0f);
        if (this.f2006q != fM1989a) {
            this.f2006q = fM1989a;
            invalidate();
        }
    }

    /* renamed from: a */
    public final boolean m1510a() {
        return this.f2007r;
    }

    public void setColorEnabled(boolean z) {
        if (this.f2007r != z) {
            this.f2007r = z;
            invalidate();
        }
    }

    /* renamed from: a */
    private Rect m1491a(AbstractC0587aa pageBitmap, Canvas canvas, Paint paint) {
        Rect pageClip = null;
        C0944o pageSize = new C0944o(pageBitmap.mo1273b(), pageBitmap.mo1274c());
        C0944o canvasSize = new C0944o(canvas.getWidth(), canvas.getHeight());
        if (pageSize.f2833b <= 0 || canvasSize.f2833b <= 0) {
            return null;
        }
        boolean canvasSaved = false;
        float pageAspectRatio = (float) pageSize.f2832a / pageSize.f2833b;
        float canvasAspectRatio = (float) canvasSize.f2832a / canvasSize.f2833b;
        Paint pagePaint = m1490a(paint);
        Matrix canvasToPage = new Matrix();
        Matrix pageToCanvas = canvas.getMatrix();
        if (pageToCanvas != null && pageToCanvas.invert(canvasToPage)) {
            Paint edgePaint = pagePaint != null ? new Paint(pagePaint) : new Paint();
            edgePaint.setColor(C0932c.m1960a(edgePaint.getAlpha(), m1488a(pageBitmap)));
            RectF canvasBounds = new RectF(0.0f, 0.0f, canvasSize.f2832a - 1, canvasSize.f2833b - 1);
            float[] canvasCorners = {canvasBounds.left, canvasBounds.top, canvasBounds.right, canvasBounds.top, canvasBounds.right, canvasBounds.bottom, canvasBounds.left, canvasBounds.bottom};
            canvasToPage.mapPoints(canvasCorners);
            RectF visiblePageBounds = new RectF(canvasCorners[0], canvasCorners[1], canvasCorners[2], canvasCorners[5]);
            float aspectRatioScale = canvasAspectRatio / pageAspectRatio;
            canvas.save();
            if (aspectRatioScale > 1.0f) {
                int horizontalPadding = ((int) (Math.min(aspectRatioScale * pageSize.f2832a, Math.max(pageSize.f2832a, visiblePageBounds.width())) - pageSize.f2832a)) / 2;
                int left = (-horizontalPadding) - 5;
                int right = horizontalPadding + pageSize.f2832a + 5;
                Rect horizontalClip = new Rect(left, 0, right, pageSize.f2833b);
                canvas.clipRect(horizontalClip);
                canvas.drawRect(left, 0.0f, 1.0f, pageSize.f2833b, edgePaint);
                canvas.drawRect(pageSize.f2832a - 1, 0.0f, right, pageSize.f2833b, edgePaint);
                pageBitmap.mo1272a(false, true, false, true);
                canvasSaved = true;
                pageClip = horizontalClip;
            } else {
                int verticalPadding = ((int) (Math.min(pageSize.f2833b / aspectRatioScale, Math.max(pageSize.f2833b, visiblePageBounds.height())) - pageSize.f2833b)) / 2;
                int top = (-verticalPadding) - 5;
                int bottom = verticalPadding + pageSize.f2833b + 5;
                Rect verticalClip = new Rect(0, top, pageSize.f2832a, bottom);
                canvas.clipRect(verticalClip);
                canvas.drawRect(0.0f, top, pageSize.f2832a, 1.0f, edgePaint);
                canvas.drawRect(0.0f, pageSize.f2833b - 1, pageSize.f2832a, bottom, edgePaint);
                pageBitmap.mo1272a(true, false, true, false);
                canvasSaved = true;
                pageClip = verticalClip;
            }
        }
        pageBitmap.m1270a(canvas, pagePaint);
        pageBitmap.mo1272a(true, true, true, true);
        if (canvasSaved) {
            canvas.restore();
            return pageClip;
        }
        return pageClip;
    }

    /* renamed from: a */
    private Paint m1490a(Paint paint) {
        if (this.f2009t != this.f2007r || this.f2010u != this.f2004o || this.f2011v != this.f2005p || this.f2012w != this.f2006q) {
            this.f2009t = this.f2007r;
            this.f2010u = this.f2004o;
            this.f2011v = this.f2005p;
            this.f2012w = this.f2006q;
            if (this.f2007r && (this.f2004o != 0.0f || this.f2005p != 0.0f || this.f2006q != 0.0f)) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(this.f2004o + 1.0f);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setScale(this.f2006q + 1.0f, this.f2006q + 1.0f, this.f2006q + 1.0f, 1.0f);
                ColorMatrix colorMatrix3 = new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, this.f2005p * 255.0f, 0.0f, 1.0f, 0.0f, 0.0f, this.f2005p * 255.0f, 0.0f, 0.0f, 1.0f, 0.0f, this.f2005p * 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                colorMatrix.postConcat(colorMatrix2);
                colorMatrix.postConcat(colorMatrix3);
                this.f2013x = new ColorMatrixColorFilter(colorMatrix);
            } else {
                this.f2013x = null;
            }
        }
        if (this.f2013x != null) {
            if (paint == null) {
                paint = new Paint();
            }
            paint.setColorFilter(this.f2013x);
        }
        return paint;
    }

    /* renamed from: a */
    private static void m1493a(Canvas canvas, int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        Rect rect = new Rect(Math.min(i, i3), i2, Math.max(i, i3), i4);
        paint.setShader(new LinearGradient(i, 0.0f, i3, 0.0f, C0932c.m1960a(192, -16777216), 0, Shader.TileMode.CLAMP));
        canvas.drawRect(rect, paint);
    }

    /* renamed from: b */
    static /* synthetic */ void m1500b(PageView pageView, Canvas canvas, C1165t c1165t, EnumC0793fi enumC0793fi, boolean z, float f, AbstractC0587aa abstractC0587aa, AbstractC0587aa abstractC0587aa2, Paint paint) {
        C1165t c1165t2 = new C1165t(c1165t);
        C1165t c1165t3 = new C1165t(c1165t2);
        c1165t3.f3691g = abstractC0587aa2.mo1273b();
        c1165t3.f3692h = abstractC0587aa2.mo1274c();
        m1497a(c1165t3, enumC0793fi, z);
        canvas.save();
        if (!z) {
            if (enumC0793fi == EnumC0793fi.Forward) {
                if (f < 1.0f) {
                    Matrix matrixM2481o = c1165t2.m2481o();
                    matrixM2481o.postTranslate((-c1165t2.f3686b) * f, 0.0f);
                    canvas.concat(matrixM2481o);
                    pageView.m1491a(abstractC0587aa, canvas, paint);
                }
                canvas.restore();
                Matrix matrixM2481o2 = c1165t3.m2481o();
                matrixM2481o2.postTranslate(c1165t3.f3686b - (c1165t3.f3686b * f), 0.0f);
                canvas.concat(matrixM2481o2);
                pageView.m1491a(abstractC0587aa2, canvas, paint);
                return;
            }
            Matrix matrixM2481o3 = c1165t2.m2481o();
            matrixM2481o3.postTranslate(c1165t2.f3686b * f, 0.0f);
            canvas.concat(matrixM2481o3);
            pageView.m1491a(abstractC0587aa, canvas, paint);
            canvas.restore();
            Matrix matrixM2481o4 = c1165t3.m2481o();
            matrixM2481o4.postTranslate((c1165t3.f3686b * f) + (-c1165t3.f3686b), 0.0f);
            canvas.concat(matrixM2481o4);
            pageView.m1491a(abstractC0587aa2, canvas, paint);
            return;
        }
        if (enumC0793fi != EnumC0793fi.Forward) {
            Matrix matrixM2481o5 = c1165t3.m2481o();
            matrixM2481o5.postTranslate((c1165t3.f3686b * f) + (-c1165t3.f3686b), 0.0f);
            canvas.concat(matrixM2481o5);
            pageView.m1491a(abstractC0587aa2, canvas, paint);
            canvas.restore();
            Matrix matrixM2481o6 = c1165t2.m2481o();
            matrixM2481o6.postTranslate(c1165t2.f3686b * f, 0.0f);
            canvas.concat(matrixM2481o6);
            pageView.m1491a(abstractC0587aa, canvas, paint);
            return;
        }
        Matrix matrixM2481o7 = c1165t3.m2481o();
        matrixM2481o7.postTranslate(c1165t3.f3686b - (c1165t3.f3686b * f), 0.0f);
        canvas.concat(matrixM2481o7);
        pageView.m1491a(abstractC0587aa2, canvas, paint);
        canvas.restore();
        if (f < 1.0f) {
            Matrix matrixM2481o8 = c1165t2.m2481o();
            matrixM2481o8.postTranslate((-c1165t2.f3686b) * f, 0.0f);
            canvas.concat(matrixM2481o8);
            pageView.m1491a(abstractC0587aa, canvas, paint);
        }
    }

    /* renamed from: a */
    private static void m1497a(C1165t c1165t, EnumC0793fi enumC0793fi, boolean z) {
        if (enumC0793fi != EnumC0793fi.Backward) {
            if (z) {
                c1165t.m2463a(0.0f, 1000000.0f);
                return;
            } else {
                c1165t.m2463a(0.0f, 0.0f);
                return;
            }
        }
        if (z) {
            c1165t.m2463a(1000000.0f, 0.0f);
        } else {
            c1165t.m2463a(1000000.0f, 1000000.0f);
        }
    }

    /* renamed from: b */
    private static int m1498b(AbstractC0587aa abstractC0587aa) {
        int iMo1273b = abstractC0587aa.mo1273b();
        if (abstractC0587aa.m1278g()) {
            iMo1273b /= 2;
        }
        return (iMo1273b * 1) / 100;
    }

    /* renamed from: d */
    static /* synthetic */ void m1503d(PageView pageView, Canvas canvas, C1165t c1165t, EnumC0793fi enumC0793fi, boolean z, float f, AbstractC0587aa abstractC0587aa, AbstractC0587aa abstractC0587aa2, Paint paint) {
        C1165t c1165t2 = new C1165t(c1165t);
        C1165t c1165t3 = new C1165t(c1165t2);
        c1165t3.f3691g = abstractC0587aa2.mo1273b();
        c1165t3.f3692h = abstractC0587aa2.mo1274c();
        m1497a(c1165t3, enumC0793fi, z);
        canvas.save();
        if (z) {
            if (enumC0793fi == EnumC0793fi.Forward) {
                canvas.concat(c1165t2.m2481o());
                pageView.m1491a(abstractC0587aa, canvas, paint);
                canvas.restore();
                float fMin = Math.min(f, 1.0f);
                Matrix matrixM2481o = c1165t3.m2481o();
                matrixM2481o.postTranslate(c1165t3.f3686b - (fMin * c1165t3.f3686b), 0.0f);
                canvas.concat(matrixM2481o);
                Rect rectM1491a = pageView.m1491a(abstractC0587aa2, canvas, paint);
                if (rectM1491a != null) {
                    m1493a(canvas, rectM1491a.left, rectM1491a.top, rectM1491a.left - m1498b(abstractC0587aa2), rectM1491a.bottom);
                    return;
                }
                return;
            }
            canvas.concat(c1165t3.m2481o());
            pageView.m1491a(abstractC0587aa2, canvas, paint);
            canvas.restore();
            float fMin2 = Math.min(f, 1.0f);
            Matrix matrixM2481o2 = c1165t2.m2481o();
            matrixM2481o2.postTranslate(c1165t2.f3686b * fMin2, 0.0f);
            canvas.concat(matrixM2481o2);
            Rect rectM1491a2 = pageView.m1491a(abstractC0587aa, canvas, paint);
            if (rectM1491a2 != null) {
                m1493a(canvas, rectM1491a2.left, rectM1491a2.top, rectM1491a2.left - m1498b(abstractC0587aa), rectM1491a2.bottom);
                return;
            }
            return;
        }
        if (enumC0793fi == EnumC0793fi.Forward) {
            canvas.concat(c1165t3.m2481o());
            pageView.m1491a(abstractC0587aa2, canvas, paint);
            canvas.restore();
            if (f < 1.0f) {
                Matrix matrixM2481o3 = c1165t2.m2481o();
                matrixM2481o3.postTranslate((-c1165t2.f3686b) * f, 0.0f);
                canvas.concat(matrixM2481o3);
                Rect rectM1491a3 = pageView.m1491a(abstractC0587aa, canvas, paint);
                if (rectM1491a3 != null) {
                    m1493a(canvas, rectM1491a3.right, rectM1491a3.top, rectM1491a3.right + m1498b(abstractC0587aa), rectM1491a3.bottom);
                    return;
                }
                return;
            }
            return;
        }
        canvas.concat(c1165t2.m2481o());
        pageView.m1491a(abstractC0587aa, canvas, paint);
        canvas.restore();
        float fMin3 = Math.min(f, 1.0f);
        Matrix matrixM2481o4 = c1165t3.m2481o();
        matrixM2481o4.postTranslate((1.0f - fMin3) * (-c1165t3.f3686b), 0.0f);
        canvas.concat(matrixM2481o4);
        Rect rectM1491a4 = pageView.m1491a(abstractC0587aa2, canvas, paint);
        if (rectM1491a4 != null) {
            m1493a(canvas, rectM1491a4.right, rectM1491a4.top, rectM1491a4.right + m1498b(abstractC0587aa), rectM1491a4.bottom);
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m1502c(PageView pageView, Canvas canvas, C1165t c1165t, EnumC0793fi enumC0793fi, boolean z, float f, AbstractC0587aa abstractC0587aa, AbstractC0587aa abstractC0587aa2, Paint paint) {
        C1165t c1165t2 = new C1165t(c1165t);
        C1165t c1165t3 = new C1165t(c1165t2);
        c1165t3.f3691g = abstractC0587aa2.mo1273b();
        c1165t3.f3692h = abstractC0587aa2.mo1274c();
        m1497a(c1165t3, enumC0793fi, z);
        canvas.save();
        if (paint == null) {
            paint = new Paint();
        }
        float fMin = Math.min(1.0f, f / 0.7f);
        float fMax = Math.max(0.0f, f - 0.3f) / 0.7f;
        if (enumC0793fi != EnumC0793fi.Forward) {
            Matrix matrixM2481o = c1165t2.m2481o();
            matrixM2481o.postTranslate(c1165t2.f3686b * fMin, 0.0f);
            canvas.concat(matrixM2481o);
            pageView.m1491a(abstractC0587aa, canvas, paint);
            canvas.restore();
            Matrix matrixM2481o2 = c1165t3.m2481o();
            matrixM2481o2.postTranslate((-c1165t3.f3686b) / 2, (-c1165t3.f3686b) / 2);
            matrixM2481o2.postScale(2.0f - fMax, 2.0f - fMax);
            matrixM2481o2.postTranslate(c1165t3.f3686b / 2, c1165t3.f3686b / 2);
            paint.setAlpha((int) (255.0f * fMax));
            canvas.concat(matrixM2481o2);
            pageView.m1491a(abstractC0587aa2, canvas, paint);
            return;
        }
        Matrix matrixM2481o3 = c1165t3.m2481o();
        matrixM2481o3.postTranslate((-c1165t3.f3686b) / 2, (-c1165t3.f3686b) / 2);
        matrixM2481o3.postScale(fMax, fMax);
        matrixM2481o3.postTranslate(c1165t3.f3686b / 2, c1165t3.f3686b / 2);
        canvas.concat(matrixM2481o3);
        paint.setAlpha((int) (255.0f * fMax));
        pageView.m1491a(abstractC0587aa2, canvas, paint);
        canvas.restore();
        if (f < 1.0f) {
            Matrix matrixM2481o4 = c1165t2.m2481o();
            matrixM2481o4.postTranslate((-c1165t2.f3686b) * fMin, 0.0f);
            canvas.concat(matrixM2481o4);
            paint.setAlpha((int) (255.0f * (1.0f - (fMin / 2.0f))));
            pageView.m1491a(abstractC0587aa, canvas, paint);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m1496a(PageView pageView, Canvas canvas, C1165t c1165t, EnumC0793fi enumC0793fi, boolean z, float f, AbstractC0587aa abstractC0587aa, AbstractC0587aa abstractC0587aa2, Paint paint) {
        C1165t c1165t2 = new C1165t(c1165t);
        c1165t2.f3691g = abstractC0587aa2.mo1273b();
        c1165t2.f3692h = abstractC0587aa2.mo1274c();
        m1497a(c1165t2, enumC0793fi, z);
        Paint paint2 = paint == null ? new Paint() : new Paint(paint);
        canvas.save();
        canvas.concat(c1165t.m2481o());
        pageView.m1491a(abstractC0587aa, canvas, paint2);
        canvas.restore();
        canvas.concat(c1165t2.m2481o());
        paint2.setAlpha((int) (255.0f * f));
        pageView.m1491a(abstractC0587aa2, canvas, paint2);
    }

    /* renamed from: a */
    static /* synthetic */ void m1495a(PageView pageView, Canvas canvas, C1165t c1165t, float f, AbstractC0587aa abstractC0587aa, AbstractC0587aa abstractC0587aa2, boolean z, boolean z2) {
        C0791fg c0791fg;
        C1165t c1165t2 = new C1165t(c1165t);
        boolean zMo1276e = abstractC0587aa.mo1276e();
        boolean zMo1276e2 = abstractC0587aa2.mo1276e();
        float fM1989a = C0950af.m1989a(f, 0.0f, 1.0f);
        c1165t.f3689e = true;
        if (z2) {
            float f2 = 2.0f * fM1989a;
            if (f2 < 1.0f) {
                c0791fg = new C0791fg(abstractC0587aa, 1.0f - f2, z ? 1 : 0);
            } else {
                c0791fg = new C0791fg(abstractC0587aa2, f2 - 1.0f, z ? 0 : 1);
            }
        } else if (zMo1276e2) {
            c0791fg = new C0791fg(abstractC0587aa2, fM1989a, (C0620v.m1333a(abstractC0587aa2) ? !z : z) ? 1 : 0);
        } else {
            if (!zMo1276e) {
                c1165t2.f3691g = abstractC0587aa2.mo1273b();
                c1165t2.f3692h = abstractC0587aa2.mo1274c();
                canvas.concat(c1165t2.m2481o());
                pageView.m1491a(abstractC0587aa2, canvas, (Paint) null);
                return;
            }
            c0791fg = new C0791fg(abstractC0587aa, 1.0f - fM1989a, (C0620v.m1333a(abstractC0587aa) ? !z : z) ? 1 : 0);
        }
        c1165t2.f3691g = (int) ((c0791fg.f2463a.mo1273b() / 2) * (Math.abs(c0791fg.f2464b) + 1.0f));
        c1165t2.f3692h = c0791fg.f2463a.mo1274c();
        canvas.concat(c1165t2.m2481o());
        Paint paintM1490a = pageView.m1490a((Paint) null);
        if (c0791fg.f2465c == 0) {
            c0791fg.m1842a(canvas, true, paintM1490a);
            c0791fg.m1842a(canvas, false, paintM1490a);
        } else {
            c0791fg.m1842a(canvas, false, paintM1490a);
            c0791fg.m1842a(canvas, true, paintM1490a);
        }
    }
}
