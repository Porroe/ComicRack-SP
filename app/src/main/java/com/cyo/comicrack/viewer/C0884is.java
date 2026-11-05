package com.cyo.comicrack.viewer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.is */
/* loaded from: classes.dex */
final class C0884is extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ WifiSyncService f2683a;

    C0884is(WifiSyncService wifiSyncService) {
        this.f2683a = wifiSyncService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        WifiSyncService.m1662a(this.f2683a, intent.getIntExtra("wifi_state", 1) == 3 ? NetworkInfo.State.CONNECTED : NetworkInfo.State.UNKNOWN);
    }
}
