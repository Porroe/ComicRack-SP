package com.cyo.common.p022a.p023a;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.a.i */
/* loaded from: classes.dex */
final class C0922i {

    /* renamed from: a */
    EGL10 f2764a;

    /* renamed from: b */
    EGLDisplay f2765b;

    /* renamed from: c */
    EGLSurface f2766c;

    /* renamed from: d */
    EGLContext f2767d;

    /* renamed from: e */
    EGLConfig f2768e;

    /* renamed from: f */
    InterfaceC0919f f2769f;

    /* renamed from: g */
    InterfaceC0920g f2770g;

    /* renamed from: h */
    InterfaceC0921h f2771h;

    /* renamed from: i */
    InterfaceC0930q f2772i;

    public C0922i(InterfaceC0919f interfaceC0919f, InterfaceC0920g interfaceC0920g, InterfaceC0921h interfaceC0921h, InterfaceC0930q interfaceC0930q) {
        this.f2769f = interfaceC0919f;
        this.f2770g = interfaceC0920g;
        this.f2771h = interfaceC0921h;
        this.f2772i = interfaceC0930q;
    }

    /* renamed from: a */
    public final void m1922a() {
        if (this.f2767d != null) {
            this.f2770g.mo1919a(this.f2764a, this.f2765b, this.f2767d);
            this.f2767d = null;
        }
        if (this.f2765b != null) {
            this.f2764a.eglTerminate(this.f2765b);
            this.f2765b = null;
        }
    }
}
