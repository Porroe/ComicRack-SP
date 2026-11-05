package com.p004a.p012b.p013a.p014a.p015a;

import android.util.Log;

/* compiled from: DontLook */
/* renamed from: com.a.b.a.a.a.h */
/* loaded from: classes.dex */
final class C0419h extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0413b f1352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0419h(C0413b c0413b) {
        super("TrackerThread");
        this.f1352a = c0413b;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                ((Runnable) this.f1352a.f1332l.take()).run();
            } catch (Exception e) {
                Log.i("EZTracker", e.toString());
            }
        }
    }
}
