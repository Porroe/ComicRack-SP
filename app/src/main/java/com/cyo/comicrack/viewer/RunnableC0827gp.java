package com.cyo.comicrack.viewer;

import android.os.AsyncTask;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gp */
/* loaded from: classes.dex */
final class RunnableC0827gp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2526a;

    /* renamed from: b */
    private final /* synthetic */ AsyncTask f2527b;

    RunnableC0827gp(ReaderActivity readerActivity, AsyncTask asyncTask) {
        this.f2526a = readerActivity;
        this.f2527b = asyncTask;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ReaderActivity.m1561a(this.f2526a, new RunnableC0828gq(this, this.f2527b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
