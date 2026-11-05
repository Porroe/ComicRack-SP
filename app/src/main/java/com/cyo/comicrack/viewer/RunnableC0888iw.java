package com.cyo.comicrack.viewer;

import android.content.Context;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.iw */
/* loaded from: classes.dex */
final class RunnableC0888iw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WifiSyncService f2687a;

    /* renamed from: b */
    private final /* synthetic */ Context f2688b;

    RunnableC0888iw(WifiSyncService wifiSyncService, Context context) {
        this.f2687a = wifiSyncService;
        this.f2688b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WifiSyncService.m1660a(this.f2687a, this.f2688b, 7615, true);
        WifiSyncService.m1661a(this.f2687a, this.f2688b, true);
    }
}
