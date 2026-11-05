package com.cyo.common.p022a.p023a;

import android.view.SurfaceHolder;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.a.l */
/* loaded from: classes.dex */
public final class C0925l extends Thread {

    /* renamed from: a */
    public SurfaceHolder f2783a;

    /* renamed from: b */
    public boolean f2784b;

    /* renamed from: d */
    private C0925l f2786d;

    /* renamed from: e */
    private InterfaceC0919f f2787e;

    /* renamed from: f */
    private InterfaceC0920g f2788f;

    /* renamed from: g */
    private InterfaceC0921h f2789g;

    /* renamed from: h */
    private InterfaceC0930q f2790h;

    /* renamed from: j */
    private boolean f2792j;

    /* renamed from: k */
    private boolean f2793k;

    /* renamed from: l */
    private boolean f2794l;

    /* renamed from: m */
    private boolean f2795m;

    /* renamed from: n */
    private int f2796n;

    /* renamed from: o */
    private int f2797o;

    /* renamed from: q */
    private boolean f2799q;

    /* renamed from: r */
    private boolean f2800r;

    /* renamed from: s */
    private InterfaceC0929p f2801s;

    /* renamed from: u */
    private C0922i f2803u;

    /* renamed from: c */
    private final C0926m f2785c = new C0926m(this, (byte) 0);

    /* renamed from: i */
    private boolean f2791i = true;

    /* renamed from: p */
    private int f2798p = 0;

    /* renamed from: t */
    private ArrayList f2802t = new ArrayList();

    /* renamed from: a */
    static /* synthetic */ C0925l m1941a(C0925l c0925l) {
        return c0925l.f2786d;
    }

    /* renamed from: a */
    static /* synthetic */ void m1942a(C0925l c0925l, C0925l c0925l2) {
        c0925l.f2786d = c0925l2;
    }

    public C0925l(InterfaceC0929p interfaceC0929p, InterfaceC0919f interfaceC0919f, InterfaceC0920g interfaceC0920g, InterfaceC0921h interfaceC0921h, InterfaceC0930q interfaceC0930q) {
        this.f2801s = interfaceC0929p;
        this.f2787e = interfaceC0919f;
        this.f2788f = interfaceC0920g;
        this.f2789g = interfaceC0921h;
        this.f2790h = interfaceC0930q;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("GLThread " + getId());
        try {
            m1944f();
        } catch (InterruptedException e) {
        } finally {
            this.f2785c.m1954a(this);
        }
    }

    /* renamed from: e */
    private void m1943e() {
        if (this.f2795m) {
            this.f2795m = false;
            this.f2801s.mo1789c();
            C0922i c0922i = this.f2803u;
            if (c0922i.f2766c != null && c0922i.f2766c != EGL10.EGL_NO_SURFACE) {
                c0922i.f2764a.eglMakeCurrent(c0922i.f2765b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                c0922i.f2771h.mo1921a(c0922i.f2764a, c0922i.f2765b, c0922i.f2766c);
                c0922i.f2766c = null;
            }
            this.f2785c.m1956c(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0015, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        throw new java.lang.RuntimeException("createContext failed");
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0223  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1944f() throws InterruptedException {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyo.common.p022a.p023a.C0925l.m1944f():void");
    }

    /* renamed from: g */
    private boolean m1945g() {
        boolean z;
        synchronized (this.f2785c) {
            z = this.f2784b;
        }
        return z;
    }

    /* renamed from: a */
    public final void m1948a(int i) {
        synchronized (this.f2785c) {
            if (i == this.f2798p) {
                return;
            }
            this.f2798p = i;
            if (i == 1) {
                this.f2785c.notifyAll();
            }
        }
    }

    /* renamed from: a */
    public final void m1950a(SurfaceHolder surfaceHolder) {
        this.f2783a = surfaceHolder;
        synchronized (this.f2785c) {
            this.f2793k = true;
            this.f2785c.notifyAll();
        }
    }

    /* renamed from: a */
    public final void m1947a() {
        synchronized (this.f2785c) {
            this.f2793k = false;
            this.f2785c.notifyAll();
            while (!this.f2794l && isAlive() && !this.f2784b) {
                try {
                    this.f2785c.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1951b() {
        synchronized (this.f2785c) {
            this.f2792j = true;
            this.f2785c.notifyAll();
        }
    }

    /* renamed from: c */
    public final void m1952c() {
        synchronized (this.f2785c) {
            this.f2792j = false;
            this.f2799q = true;
            this.f2785c.notifyAll();
        }
    }

    /* renamed from: a */
    public final void m1949a(int i, int i2) {
        synchronized (this.f2785c) {
            this.f2796n = i;
            this.f2797o = i2;
            this.f2791i = true;
            this.f2785c.notifyAll();
        }
    }

    /* renamed from: d */
    public final void m1953d() {
        synchronized (this.f2785c) {
            this.f2784b = true;
            this.f2785c.notifyAll();
        }
        try {
            join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: h */
    private Runnable m1946h() {
        synchronized (this) {
            if (this.f2802t.size() > 0) {
                return (Runnable) this.f2802t.remove(0);
            }
            return null;
        }
    }
}
