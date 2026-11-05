package com.p004a.p005a.p007b;

import android.os.Handler;
import com.p004a.p005a.C0330bs;
import com.p004a.p005a.C0331bt;
import com.p004a.p005a.C0332bu;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.a */
/* loaded from: classes.dex */
public final class C0275a extends C0290e {

    /* renamed from: a */
    public boolean f719a;

    /* renamed from: c */
    private volatile boolean f720c;

    /* renamed from: d */
    private int f721d;

    /* renamed from: e */
    private int f722e;

    /* renamed from: f */
    private final C0279ad f723f;

    public C0275a(C0332bu c0332bu) {
        super(c0332bu, null);
        this.f720c = true;
        this.f719a = true;
        this.f721d = 0;
        this.f722e = 0;
        if (C0358a.f1021a < ((Integer) ((C0331bt) ((C0330bs) c0332bu.f965d.m898a()).f945b.m898a()).f949c.m899a()).intValue()) {
            C0372i.m911a("Disabling hardware acceleration for an activation overlay.");
            m712f();
        }
        this.f723f = C0279ad.m692a((C0308w) c0332bu.f963b.m898a(), C0293h.f784c, true, true);
        setWebViewClient(this.f723f);
    }

    public final void setOverlayEnabled(boolean z) {
        if (!z) {
            ((Handler) C0330bs.m837a().f946c.m898a()).post(new RunnableC0287b(this, this));
        }
        this.f720c = z;
    }

    public final void setOverlayActivated(boolean z) {
        this.f719a = z;
    }

    /* renamed from: a */
    public final boolean m647a() {
        return this.f720c;
    }

    /* renamed from: b */
    public final int m648b() {
        return this.f722e;
    }

    public final void setYPosition(int i) {
        this.f722e = i;
    }

    /* renamed from: c */
    public final int m649c() {
        return this.f721d;
    }

    public final void setXPosition(int i) {
        this.f721d = i;
    }

    /* renamed from: d */
    public final C0279ad m650d() {
        return this.f723f;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return false;
    }
}
