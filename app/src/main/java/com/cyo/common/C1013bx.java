package com.cyo.common;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bx */
/* loaded from: classes.dex */
public final class C1013bx {

    /* renamed from: a */
    public final LinkedList f2978a = new LinkedList();

    /* renamed from: b */
    private final C1014by[] f2979b;

    public C1013bx(String str, int i, int i2) {
        this.f2979b = new C1014by[i];
        int iM1990a = C0950af.m1990a(i, 1, Runtime.getRuntime().availableProcessors());
        for (int i3 = 0; i3 < iM1990a; i3++) {
            this.f2979b[i3] = new C1014by(this, String.valueOf(str) + ":" + i3, i2);
            this.f2979b[i3].start();
        }
    }

    /* renamed from: a */
    public final void m2109a(Object obj, Runnable runnable) {
        synchronized (this.f2978a) {
            m2108a(obj);
            this.f2978a.addLast(new C1015bz(obj, runnable));
            this.f2978a.notify();
        }
    }

    /* renamed from: a */
    public final void m2110a(Runnable runnable) {
        m2109a(null, runnable);
    }

    /* renamed from: a */
    public final void m2108a(Object obj) {
        if (obj != null) {
            Iterator it = this.f2978a.iterator();
            while (it.hasNext()) {
                if (obj.equals(((C1015bz) it.next()).f2981a)) {
                    it.remove();
                }
            }
        }
    }
}
