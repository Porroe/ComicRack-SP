package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p021b.C0588ab;
import java.util.TimerTask;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cq */
/* loaded from: classes.dex */
final class C0720cq extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ ComicRackApplication f2253a;

    C0720cq(ComicRackApplication comicRackApplication) {
        this.f2253a = comicRackApplication;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C0588ab c0588abM1362b = C0628f.m1362b();
        long jMax = c0588abM1362b.f1773a != null ? Math.max(c0588abM1362b.f1773a.f2983a, 0L) : 0L;
        if (c0588abM1362b.f1774b != null) {
            jMax = Math.max(c0588abM1362b.f1774b.f2983a, jMax);
        }
        if (jMax != 0 && System.currentTimeMillis() - jMax > 5000) {
            C0628f.m1362b().m1284a();
        }
    }
}
