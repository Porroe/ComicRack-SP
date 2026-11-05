package com.cyo.common.p022a.p023a;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.a.a */
/* loaded from: classes.dex */
abstract class AbstractC0914a implements InterfaceC0919f {

    /* renamed from: a */
    protected int[] f2756a;

    /* renamed from: a */
    abstract EGLConfig mo1916a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

    public AbstractC0914a(int[] iArr) {
        this.f2756a = iArr;
    }

    @Override // com.cyo.common.p022a.p023a.InterfaceC0919f
    /* renamed from: a */
    public EGLConfig mo1915a(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, this.f2756a, null, 0, iArr);
        int i = iArr[0];
        if (i <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        egl10.eglChooseConfig(eGLDisplay, this.f2756a, eGLConfigArr, i, iArr);
        EGLConfig eGLConfigMo1916a = mo1916a(egl10, eGLDisplay, eGLConfigArr);
        if (eGLConfigMo1916a == null) {
            throw new IllegalArgumentException("No config chosen");
        }
        return eGLConfigMo1916a;
    }
}
