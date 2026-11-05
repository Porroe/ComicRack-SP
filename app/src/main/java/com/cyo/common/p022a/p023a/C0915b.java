package com.cyo.common.p022a.p023a;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.a.b */
/* loaded from: classes.dex */
public class C0915b extends AbstractC0914a {

    /* renamed from: b */
    protected int f2757b;

    /* renamed from: c */
    protected int f2758c;

    /* renamed from: d */
    protected int f2759d;

    /* renamed from: e */
    protected int f2760e;

    /* renamed from: f */
    protected int f2761f;

    /* renamed from: g */
    protected int f2762g;

    /* renamed from: h */
    private int[] f2763h;

    @Override // com.cyo.common.p022a.p023a.AbstractC0914a, com.cyo.common.p022a.p023a.InterfaceC0919f
    /* renamed from: a */
    public /* bridge */ /* synthetic */ EGLConfig mo1915a(EGL10 egl10, EGLDisplay eGLDisplay) {
        return super.mo1915a(egl10, eGLDisplay);
    }

    public C0915b() {
        super(new int[]{12324, 4, 12323, 4, 12322, 4, 12321, 0, 12325, 16, 12326, 0, 12344});
        this.f2763h = new int[1];
        this.f2757b = 4;
        this.f2758c = 4;
        this.f2759d = 4;
        this.f2760e = 0;
        this.f2761f = 16;
        this.f2762g = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    @Override // com.cyo.common.p022a.p023a.AbstractC0914a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final javax.microedition.khronos.egl.EGLConfig mo1916a(javax.microedition.khronos.egl.EGL10 r11, javax.microedition.khronos.egl.EGLDisplay r12, javax.microedition.khronos.egl.EGLConfig[] r13) {
        /*
            r10 = this;
            r3 = 0
            r1 = 1000(0x3e8, float:1.401E-42)
            int r5 = r13.length
            r0 = 0
            r4 = r0
        L6:
            if (r4 < r5) goto L9
            return r3
        L9:
            r2 = r13[r4]
            r0 = 12325(0x3025, float:1.7271E-41)
            int r0 = r10.m1917a(r11, r12, r2, r0)
            r6 = 12326(0x3026, float:1.7272E-41)
            int r6 = r10.m1917a(r11, r12, r2, r6)
            int r7 = r10.f2761f
            if (r0 < r7) goto L61
            int r0 = r10.f2762g
            if (r6 < r0) goto L61
            r0 = 12324(0x3024, float:1.727E-41)
            int r0 = r10.m1917a(r11, r12, r2, r0)
            r6 = 12323(0x3023, float:1.7268E-41)
            int r6 = r10.m1917a(r11, r12, r2, r6)
            r7 = 12322(0x3022, float:1.7267E-41)
            int r7 = r10.m1917a(r11, r12, r2, r7)
            r8 = 12321(0x3021, float:1.7265E-41)
            int r8 = r10.m1917a(r11, r12, r2, r8)
            int r9 = r10.f2757b
            int r0 = r0 - r9
            int r0 = java.lang.Math.abs(r0)
            int r9 = r10.f2758c
            int r6 = r6 - r9
            int r6 = java.lang.Math.abs(r6)
            int r0 = r0 + r6
            int r6 = r10.f2759d
            int r6 = r7 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r0 + r6
            int r6 = r10.f2760e
            int r6 = r8 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r0 + r6
            if (r0 >= r1) goto L61
            r1 = r2
        L5b:
            int r2 = r4 + 1
            r4 = r2
            r3 = r1
            r1 = r0
            goto L6
        L61:
            r0 = r1
            r1 = r3
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyo.common.p022a.p023a.C0915b.mo1916a(javax.microedition.khronos.egl.EGL10, javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig[]):javax.microedition.khronos.egl.EGLConfig");
    }

    /* renamed from: a */
    private int m1917a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f2763h)) {
            return this.f2763h[0];
        }
        return 0;
    }
}
