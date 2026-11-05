package com.cyo.common;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.ax */
/* loaded from: classes.dex */
final class RunnableC0968ax implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0967aw f2857a;

    /* renamed from: b */
    private final /* synthetic */ C0965au f2858b;

    /* renamed from: c */
    private final /* synthetic */ int f2859c = 0;

    RunnableC0968ax(C0967aw c0967aw, C0965au c0965au) {
        this.f2857a = c0967aw;
        this.f2858b = c0965au;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2857a.f2856a.setSelection(this.f2858b.f2854a);
        this.f2857a.f2856a.post(new RunnableC0969ay(this, this.f2858b, this.f2859c));
    }
}
