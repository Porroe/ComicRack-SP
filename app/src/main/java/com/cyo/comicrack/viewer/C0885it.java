package com.cyo.comicrack.viewer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.it */
/* loaded from: classes.dex */
final class C0885it extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ WifiSyncService f2684a;

    C0885it(WifiSyncService wifiSyncService) {
        this.f2684a = wifiSyncService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.USER_BACKGROUND")) {
            WifiSyncService.m1676c(this.f2684a);
        } else if (intent.getAction().equals("android.intent.action.USER_FOREGROUND")) {
            WifiSyncService.m1678d(this.f2684a);
        }
    }
}
