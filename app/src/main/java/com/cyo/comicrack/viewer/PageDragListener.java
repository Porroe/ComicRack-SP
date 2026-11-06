package com.cyo.comicrack.viewer;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.cyo.common.C0950af;
import com.cyo.common.C0951ag;
import com.cyo.common.view.C1165t;
import com.cyo.common.view.EnumC1109ac;
import com.cyo.common.view.EnumC1162q;
import com.cyo.common.view.InterfaceC1108ab;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hu */
/* loaded from: classes.dex */
final class PageDragListener implements InterfaceC1108ab {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2586a;

    /* renamed from: b */
    private int f2587b;

    /* renamed from: c */
    private float f2588c;

    /* renamed from: d */
    private float f2589d;

    /* renamed from: e */
    private boolean f2590e;

    /* renamed from: f */
    private VelocityTracker f2591f;

    private PageDragListener(ReaderActivity readerActivity) {
        this.f2586a = readerActivity;
    }

    /* synthetic */ PageDragListener(ReaderActivity readerActivity, byte b) {
        this(readerActivity);
    }

    @Override // com.cyo.common.view.InterfaceC1108ab
    /* renamed from: a */
    public final void mo1857a() {
        this.f2588c = 0.0f;
        this.f2590e = false;
        if (this.f2591f != null) {
            this.f2591f.recycle();
            this.f2591f = null;
        }
    }

    /* renamed from: a */
    private float m1855a(float f) {
        return this.f2586a.m1634n() ? -f : f;
    }

    @Override // com.cyo.common.view.InterfaceC1108ab
    /* renamed from: a */
    public final EnumC1109ac mo1856a(MotionEvent motionEvent, float f, float f2) {
        if (!ReaderActivity.m1571a(this.f2586a) || ReaderActivity.m1580b(this.f2586a).m2502h()) {
            return EnumC1109ac.None;
        }
        C1165t contentLayout = ReaderActivity.m1580b(this.f2586a).getContentLayout();
        if (!C0950af.m1992b(contentLayout.f3690f, 1.0f, 0.01f) || ((contentLayout.m2468b() && f < 0.0f) || ((contentLayout.m2469c() && f > 0.0f) || Math.abs(f2) > Math.abs(f) / 2.0f))) {
            this.f2588c = 0.0f;
            if (this.f2591f != null) {
                this.f2591f.recycle();
                this.f2591f = null;
            }
            return EnumC1109ac.None;
        }
        if (this.f2591f == null) {
            this.f2591f = VelocityTracker.obtain();
        }
        float fM1855a = m1855a(f);
        this.f2591f.addMovement(motionEvent);
        this.f2588c = fM1855a + this.f2588c;
        if (Math.abs(this.f2588c) < C0951ag.m1993a(this.f2586a, 50.0f)) {
            return EnumC1109ac.None;
        }
        this.f2587b = this.f2588c > 0.0f ? 1 : -1;
        this.f2589d = motionEvent.getX();
        C0794fj c0794fj = new C0794fj(this.f2587b > 0 ? EnumC0793fi.Forward : EnumC0793fi.Backward, ReaderActivity.m1585c(this.f2586a), true, true);
        c0794fj.f2478i = (int) (c0794fj.f2478i * 0.75f);
        if (!ReaderActivity.m1580b(this.f2586a).m1511a(c0794fj.f2471b)) {
            ReaderActivity.m1574a(this.f2586a, this.f2587b, false);
            return EnumC1109ac.Cancel;
        }
        ReaderActivity.m1580b(this.f2586a).m2497c(true);
        if (!ReaderActivity.m1573a(this.f2586a, this.f2587b, c0794fj)) {
            ReaderActivity.m1572a(this.f2586a, this.f2587b < 0 ? C0806fv.reached_start_of_book : C0806fv.reached_end_of_book, this.f2587b);
            ReaderActivity.m1580b(this.f2586a).m2497c(false);
            return EnumC1109ac.Cancel;
        }
        ReaderActivity.m1580b(this.f2586a).setManualTransitionProgress(0.0f);
        return EnumC1109ac.Ok;
    }

    @Override // com.cyo.common.view.InterfaceC1108ab
    /* renamed from: a */
    public final void mo1858a(MotionEvent motionEvent) {
        this.f2591f.addMovement(motionEvent);
        float fM1855a = (m1855a(this.f2589d - motionEvent.getX()) / ReaderActivity.m1580b(this.f2586a).getWidth()) * this.f2587b;
        float manualPosition = fM1855a - ReaderActivity.m1580b(this.f2586a).getManualPosition();
        if (!C0950af.m1992b(manualPosition, 0.0f, 1.0E-6f)) {
            if (manualPosition >= 0.0f) {
                ReaderActivity.m1580b(this.f2586a).setManualResumeMode(EnumC1162q.Forward);
            } else {
                ReaderActivity.m1580b(this.f2586a).setManualResumeMode(EnumC1162q.Reverse);
            }
        }
        float dragProgress = ReaderActivity.m1580b(this.f2586a).setManualTransitionProgress(fM1855a);
        if (dragProgress > 0.005f) {
            this.f2590e = true;
        }
        if (this.f2590e && C0950af.m1992b(dragProgress, 0.0f, 0.005f)) {
            ReaderActivity.m1580b(this.f2586a).m2501g();
        }
    }

    @Override // com.cyo.common.view.InterfaceC1108ab
    /* renamed from: b */
    public final void mo1859b() {
        int width = ReaderActivity.m1580b(this.f2586a).getWidth();
        float fM1993a = width == 0 ? 0.05f : C0951ag.m1993a(this.f2586a, 50.0f) / width;
        float manualPosition = ReaderActivity.m1580b(this.f2586a).getManualPosition();
        this.f2591f.computeCurrentVelocity(1500);
        float f = ((-this.f2591f.getXVelocity()) * this.f2587b) / this.f2586a.getResources().getDisplayMetrics().density;
        if (manualPosition < fM1993a && f < 1000.0f) {
            ReaderActivity.m1580b(this.f2586a).setManualResumeMode(EnumC1162q.Reverse);
        } else if (manualPosition > 1.0f - fM1993a && f < 1000.0f) {
            ReaderActivity.m1580b(this.f2586a).setManualResumeMode(EnumC1162q.Forward);
        }
        ReaderActivity.m1580b(this.f2586a).setManualTransitionProgress(C0950af.m1989a(manualPosition, 0.01f, 0.99f));
        ReaderActivity.m1580b(this.f2586a).m2497c(false);
    }
}
