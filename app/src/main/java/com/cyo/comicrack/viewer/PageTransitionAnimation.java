package com.cyo.comicrack.viewer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
import com.cyo.comicrack.p019a.p021b.AbstractC0587aa;
import com.cyo.common.view.ContentAnimation;
import com.cyo.common.view.C1165t;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.fk */
/* loaded from: classes.dex */
public class PageTransitionAnimation extends ContentAnimation {

    /* renamed from: h */
    private static /* synthetic */ int[] f2480h;

    /* renamed from: a */
    public C0794fj f2481a;

    /* renamed from: b */
    public C1165t f2482b;

    /* renamed from: c */
    public AbstractC0587aa f2483c;

    /* renamed from: d */
    public AbstractC0587aa f2484d;

    /* renamed from: e */
    final /* synthetic */ PageView f2485e;

    /* renamed from: f */
    private DecelerateInterpolator f2486f = new DecelerateInterpolator();

    /* renamed from: g */
    private float f2487g;

    /* renamed from: h */
    private static /* synthetic */ int[] m1845h() {
        int[] iArr = f2480h;
        if (iArr == null) {
            iArr = new int[EnumC0796fl.valuesCustom().length];
            try {
                iArr[EnumC0796fl.Deck.ordinal()] = 5;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0796fl.DoubleOverlap.ordinal()] = 7;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0796fl.Fade.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC0796fl.None.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[EnumC0796fl.Overlap.ordinal()] = 6;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[EnumC0796fl.Slide.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[EnumC0796fl.Stack.ordinal()] = 4;
            } catch (NoSuchFieldError e7) {
            }
            f2480h = iArr;
        }
        return iArr;
    }

    PageTransitionAnimation(PageView pageView, AbstractC0587aa abstractC0587aa, C0794fj c0794fj) {
        this.f2485e = pageView;
        this.f2483c = abstractC0587aa;
        this.f2481a = c0794fj;
        this.f2482b = pageView.getContentLayout();
    }

    @Override // com.cyo.common.view.ContentAnimation
    /* renamed from: a */
    protected final void mo1793a(float f) {
        if (!this.f2481a.f2473d) {
            f = this.f2486f.getInterpolation(f);
        }
        this.f2487g = f;
    }

    @Override // com.cyo.common.view.ContentAnimation
    /* renamed from: a */
    protected final void mo1792a() {
        this.f2485e.invalidate();
    }

    @Override // com.cyo.common.view.ContentAnimation
    /* renamed from: a */
    public final void mo1846a(Canvas canvas) {
        super.mo1846a(canvas);
        canvas.save();
        PageView pageView = this.f2485e;
        Paint paintM1499b = PageView.m1499b(canvas);
        EnumC0793fi enumC0793fiM1844a = this.f2481a.f2471b;
        if (this.f2481a.f2474e) {
            enumC0793fiM1844a = EnumC0793fi.m1844a(enumC0793fiM1844a);
        }
        switch (m1845h()[this.f2481a.f2470a.ordinal()]) {
            case TwitterResponse.READ_WRITE /* 2 */:
                PageView.m1500b(this.f2485e, canvas, this.f2482b, enumC0793fiM1844a, this.f2481a.f2474e, this.f2487g, PageView.m1492a(this.f2485e), this.f2483c, paintM1499b);
                break;
            case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                PageView.m1496a(this.f2485e, canvas, this.f2482b, enumC0793fiM1844a, this.f2481a.f2474e, this.f2487g, PageView.m1492a(this.f2485e), this.f2483c, paintM1499b);
                break;
            case 4:
                PageView.m1502c(this.f2485e, canvas, this.f2482b, enumC0793fiM1844a, this.f2481a.f2474e, this.f2487g, PageView.m1492a(this.f2485e), this.f2483c, paintM1499b);
                break;
            case 5:
                PageView.m1503d(this.f2485e, canvas, this.f2482b, enumC0793fiM1844a, this.f2481a.f2474e, this.f2487g, PageView.m1492a(this.f2485e), this.f2483c, paintM1499b);
                break;
            case 6:
                PageView.m1495a(this.f2485e, canvas, this.f2482b, this.f2487g, PageView.m1492a(this.f2485e), this.f2483c, PageView.m1501b(this.f2485e), false);
                break;
            case 7:
                PageView.m1495a(this.f2485e, canvas, this.f2482b, this.f2487g, PageView.m1492a(this.f2485e), this.f2483c, PageView.m1501b(this.f2485e), true);
                break;
        }
        canvas.restore();
    }
}
