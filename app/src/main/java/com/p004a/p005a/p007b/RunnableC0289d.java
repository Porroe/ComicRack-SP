package com.p004a.p005a.p007b;

import android.os.Handler;
import com.p004a.p005a.C0330bs;
import com.p004a.p005a.p011e.C0372i;
import java.lang.ref.WeakReference;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.d */
/* loaded from: classes.dex */
final class RunnableC0289d implements Runnable {

    /* renamed from: a */
    private final WeakReference f773a;

    public RunnableC0289d(C0288c c0288c) {
        this.f773a = new WeakReference(c0288c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0288c c0288c = (C0288c) this.f773a.get();
        if (c0288c == null) {
            C0372i.m918d("The video must be gone, so cancelling the timeupdate task.");
        } else {
            c0288c.m708e();
            ((Handler) C0330bs.m837a().f946c.m898a()).postDelayed(this, 250L);
        }
    }

    /* renamed from: a */
    public final void m709a() {
        ((Handler) C0330bs.m837a().f946c.m898a()).postDelayed(this, 250L);
    }
}
