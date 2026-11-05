package com.cyo.comicrack.viewer;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.do */
/* loaded from: classes.dex */
final class C0745do extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC0744dn f2365a;

    C0745do(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        this.f2365a = sharedPreferencesOnSharedPreferenceChangeListenerC0744dn;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1773e(this.f2365a);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1774f(this.f2365a) != null) {
            try {
                SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1783m(this.f2365a).startActivity(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1772d(this.f2365a).f2329b.m1753a(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1783m(this.f2365a).getApplicationContext(), SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1774f(this.f2365a)));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1777g(this.f2365a) || !SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1772d(this.f2365a).f2330c) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1778h(this.f2365a);
        return true;
    }
}
