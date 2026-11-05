package com.cyo.comicrack.viewer;

import android.os.AsyncTask;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gq */
/* loaded from: classes.dex */
final class RunnableC0828gq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC0827gp f2528a;

    /* renamed from: b */
    private final /* synthetic */ AsyncTask f2529b;

    RunnableC0828gq(RunnableC0827gp runnableC0827gp, AsyncTask asyncTask) {
        this.f2528a = runnableC0827gp;
        this.f2529b = asyncTask;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2529b.execute(new String[0]);
    }
}
