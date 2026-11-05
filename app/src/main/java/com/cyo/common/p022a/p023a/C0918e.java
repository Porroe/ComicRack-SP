package com.cyo.common.p022a.p023a;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.a.e */
/* loaded from: classes.dex */
public final class C0918e implements InterfaceC0921h {
    @Override // com.cyo.common.p022a.p023a.InterfaceC0921h
    /* renamed from: a */
    public final EGLSurface mo1920a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = null;
        while (eGLSurfaceEglCreateWindowSurface == null) {
            try {
                eGLSurfaceEglCreateWindowSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
                if (eGLSurfaceEglCreateWindowSurface == null) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e) {
                    }
                }
            } catch (Throwable th) {
                if (eGLSurfaceEglCreateWindowSurface == null) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e2) {
                    }
                }
                throw th;
            }
        }
        return eGLSurfaceEglCreateWindowSurface;
    }

    @Override // com.cyo.common.p022a.p023a.InterfaceC0921h
    /* renamed from: a */
    public final void mo1921a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }
}
