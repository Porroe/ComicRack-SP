package com.cyo.common;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.by */
/* loaded from: classes.dex */
final class C1014by extends Thread {

    /* renamed from: a */
    final /* synthetic */ C1013bx f2980a;

    public C1014by(C1013bx c1013bx, String str, int i) {
        this.f2980a = c1013bx;
        setPriority(i);
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1015bz c1015bz;
        while (true) {
            synchronized (this.f2980a.f2978a) {
                while (this.f2980a.f2978a.isEmpty()) {
                    try {
                        this.f2980a.f2978a.wait();
                    } catch (InterruptedException e) {
                    }
                }
                c1015bz = (C1015bz) this.f2980a.f2978a.removeFirst();
            }
            try {
                c1015bz.f2982b.run();
            } catch (RuntimeException e2) {
            }
        }
    }
}
