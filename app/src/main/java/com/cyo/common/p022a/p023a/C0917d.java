package com.cyo.common.p022a.p023a;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.a.d */
/* loaded from: classes.dex */
public final class C0917d implements InterfaceC0920g {
    @Override // com.cyo.common.p022a.p023a.InterfaceC0920g
    /* renamed from: a */
    public final EGLContext mo1918a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, null);
    }

    @Override // com.cyo.common.p022a.p023a.InterfaceC0920g
    /* renamed from: a */
    public final void mo1919a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }
}
