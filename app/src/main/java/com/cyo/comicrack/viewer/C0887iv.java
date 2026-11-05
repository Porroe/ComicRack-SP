package com.cyo.comicrack.viewer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.iv */
/* loaded from: classes.dex */
final class C0887iv extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ WifiSyncService f2686a;

    C0887iv(WifiSyncService wifiSyncService) {
        this.f2686a = wifiSyncService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.cyo.comicracksp.WIFI_REQUEST_SYNC".equals(action)) {
                WifiSyncService.m1659a(this.f2686a, this.f2686a);
            } else if ("com.cyo.comicracksp.WIFI_ABORT_SYNC".equals(action)) {
                WifiSyncService.m1682f(this.f2686a);
            }
        }
    }
}
