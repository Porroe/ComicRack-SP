package com.cyo.comicrack.p019a.p021b;

import android.util.Log;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.b */
/* loaded from: classes.dex */
final class RunnableC0600b implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0601c f1795a;

    RunnableC0600b(C0601c c0601c) {
        this.f1795a = c0601c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if ((this.f1795a.f1796a.getParent() != null) && this.f1795a.m1287a()) {
            C0601c c0601c = (C0601c) this.f1795a.f1796a.getTag();
            if (!(c0601c != null && c0601c.f1803h)) {
                if (!this.f1795a.m1289b()) {
                    this.f1795a.m1290c();
                    return;
                }
                if (this.f1795a.m1288a(EnumC0590ad.Disk)) {
                    this.f1795a.f1803h = true;
                    return;
                }
                if (!this.f1795a.m1288a(EnumC0590ad.All)) {
                    this.f1795a.m1290c();
                }
                this.f1795a.f1803h = true;
                Log.d("Thumb", "Loaded: " + this.f1795a.f1798c.m1171c(false));
                if (this.f1795a.f1804i) {
                    try {
                        Thread.sleep(50L);
                        return;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            }
        }
        Log.d("Thumb", "Already Completed: " + this.f1795a.f1798c.m1171c(false));
    }
}
