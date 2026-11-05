package com.cyo.comicrack.viewer;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hk */
/* loaded from: classes.dex */
final class ViewOnTouchListenerC0849hk implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2564a;

    ViewOnTouchListenerC0849hk(ReaderActivity readerActivity) {
        this.f2564a = readerActivity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ReaderActivity.m1555a(this.f2564a, motionEvent.getX());
        return false;
    }
}
