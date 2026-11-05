package com.p004a.p005a.p007b;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.g */
/* loaded from: classes.dex */
final class ViewOnTouchListenerC0292g implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C0290e f781a;

    ViewOnTouchListenerC0292g(C0290e c0290e) {
        this.f781a = c0290e;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() == 2;
    }
}
