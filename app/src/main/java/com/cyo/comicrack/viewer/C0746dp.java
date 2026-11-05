package com.cyo.comicrack.viewer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.dp */
/* loaded from: classes.dex */
final class C0746dp extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC0744dn f2366a;

    C0746dp(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        this.f2366a = sharedPreferencesOnSharedPreferenceChangeListenerC0744dn;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        CoverWallpaperService.m1468a(ComicRackApplication.f1954i.m1441e(), intent);
    }
}
