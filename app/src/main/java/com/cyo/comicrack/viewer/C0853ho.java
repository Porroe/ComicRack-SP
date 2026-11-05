package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.p021b.AbstractC0587aa;
import com.cyo.comicrack.p019a.p021b.InterfaceC0606h;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ho */
/* loaded from: classes.dex */
final class C0853ho {

    /* renamed from: a */
    AbstractC0587aa f2568a;

    /* renamed from: b */
    int f2569b;

    /* renamed from: c */
    Object f2570c = new Object();

    /* renamed from: d */
    final /* synthetic */ ReaderActivity f2571d;

    public C0853ho(ReaderActivity readerActivity, InterfaceC0606h interfaceC0606h, int i) {
        this.f2571d = readerActivity;
        this.f2569b = -1;
        this.f2569b = i;
        new Thread(new RunnableC0854hp(this, interfaceC0606h)).start();
    }

    public C0853ho(ReaderActivity readerActivity, AbstractC0587aa abstractC0587aa, int i) {
        this.f2571d = readerActivity;
        this.f2569b = -1;
        this.f2568a = abstractC0587aa;
        this.f2569b = i;
    }

    /* renamed from: a */
    public final AbstractC0587aa m1853a() {
        synchronized (this.f2570c) {
            if (this.f2568a == null) {
                try {
                    this.f2570c.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return this.f2568a;
        }
    }

    /* renamed from: b */
    public final void m1854b() {
        AbstractC0587aa abstractC0587aaM1853a = m1853a();
        if (abstractC0587aaM1853a != null) {
            abstractC0587aaM1853a.m1279h();
        }
    }
}
