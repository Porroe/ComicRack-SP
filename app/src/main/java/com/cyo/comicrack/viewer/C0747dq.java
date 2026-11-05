package com.cyo.comicrack.viewer;

import java.util.TimerTask;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.dq */
/* loaded from: classes.dex */
final class C0747dq extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC0744dn f2367a;

    C0747dq(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        this.f2367a = sharedPreferencesOnSharedPreferenceChangeListenerC0744dn;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1778h(this.f2367a);
    }
}
