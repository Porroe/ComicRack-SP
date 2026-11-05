package com.p004a.p005a.p007b;

import android.app.Activity;
import android.app.AlertDialog;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.gesture.GestureStore;
import android.gesture.Prediction;
import com.p004a.p005a.p011e.C0372i;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.ah */
/* loaded from: classes.dex */
public final class C0283ah implements GestureOverlayView.OnGesturePerformedListener {

    /* renamed from: a */
    private final GestureStore f757a;

    /* renamed from: b */
    private Activity f758b;

    /* renamed from: c */
    private C0308w f759c;

    /* renamed from: a */
    static /* synthetic */ C0308w m700a(C0283ah c0283ah) {
        return c0283ah.f759c;
    }

    /* renamed from: b */
    static /* synthetic */ Activity m701b(C0283ah c0283ah) {
        return c0283ah.f758b;
    }

    public C0283ah(Activity activity, C0308w c0308w, GestureStore gestureStore) {
        this.f758b = activity;
        this.f759c = c0308w;
        this.f757a = gestureStore;
    }

    @Override // android.gesture.GestureOverlayView.OnGesturePerformedListener
    public final void onGesturePerformed(GestureOverlayView gestureOverlayView, Gesture gesture) {
        ArrayList<Prediction> arrayListRecognize = this.f757a.recognize(gesture);
        Iterator<Prediction> it = arrayListRecognize.iterator();
        while (it.hasNext()) {
            Prediction next = it.next();
            C0372i.m911a("Gesture: '" + next.name + "' = " + next.score);
        }
        if (arrayListRecognize.size() == 0) {
            C0372i.m911a("Gesture: No remotely reasonable predictions");
        } else if (arrayListRecognize.get(0).score > 2.0d && "debug".equals(arrayListRecognize.get(0).name) && this.f759c != null) {
            String strM777c = this.f759c.m777c() == null ? "[No diagnostics available]" : this.f759c.m777c();
            new AlertDialog.Builder(this.f758b).setMessage(strM777c).setTitle("Ad Information").setPositiveButton("Share", new DialogInterfaceOnClickListenerC0286ak(this, strM777c)).setNeutralButton("Report", new DialogInterfaceOnClickListenerC0285aj(this)).setNegativeButton("Close", new DialogInterfaceOnClickListenerC0284ai(this)).create().show();
        }
    }
}
