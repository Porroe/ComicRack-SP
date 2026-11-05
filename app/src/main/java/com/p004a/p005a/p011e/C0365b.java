package com.p004a.p005a.p011e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.b */
/* loaded from: classes.dex */
public final class C0365b extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
            C0358a.m876a(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            C0358a.m876a(false);
        }
    }
}
