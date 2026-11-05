package com.cyo.comicrack.viewer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cf */
/* loaded from: classes.dex */
final class C0709cf extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ComicRackApplication f2230a;

    C0709cf(ComicRackApplication comicRackApplication) {
        this.f2230a = comicRackApplication;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            ComicRackApplication.m1408a(this.f2230a, intent.getBooleanExtra("Available", false));
        }
    }
}
