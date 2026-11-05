package com.cyo.comicrack.viewer;

import android.widget.ImageView;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p021b.C0586a;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ao */
/* loaded from: classes.dex */
final class RunnableC0664ao implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0906u f2158a;

    /* renamed from: b */
    private final /* synthetic */ ImageView f2159b;

    /* renamed from: c */
    private final /* synthetic */ C0505b f2160c;

    RunnableC0664ao(C0906u c0906u, ImageView imageView, C0505b c0505b) {
        this.f2158a = c0906u;
        this.f2159b = imageView;
        this.f2160c = c0505b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0586a.m1264a(this.f2159b, this.f2160c, false);
    }
}
