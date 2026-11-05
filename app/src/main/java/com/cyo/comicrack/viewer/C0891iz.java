package com.cyo.comicrack.viewer;

import android.content.Context;
import java.util.TimerTask;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.iz */
/* loaded from: classes.dex */
final class C0891iz extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ WifiSyncService f2696a;

    /* renamed from: b */
    private final /* synthetic */ Context f2697b;

    /* renamed from: c */
    private final /* synthetic */ int f2698c;

    C0891iz(WifiSyncService wifiSyncService, Context context, int i) {
        this.f2696a = wifiSyncService;
        this.f2697b = context;
        this.f2698c = i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        WifiSyncService.m1692o(this.f2696a);
        WifiSyncService.m1660a(this.f2696a, this.f2697b, this.f2698c, false);
        WifiSyncService.m1661a(this.f2696a, this.f2697b, false);
        WifiSyncService.m1657a(this.f2696a, WifiSyncService.m1693p(this.f2696a) - 1);
    }
}
