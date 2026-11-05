package com.cyo.comicrack.p019a.p021b;

import com.cyo.common.C1016c;
import com.cyo.common.InterfaceC1091h;
import java.io.IOException;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.ac */
/* loaded from: classes.dex */
final class RunnableC0589ac implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0588ab f1777a;

    /* renamed from: b */
    private final /* synthetic */ C1016c f1778b;

    /* renamed from: c */
    private final /* synthetic */ String f1779c;

    /* renamed from: d */
    private final /* synthetic */ InterfaceC1091h f1780d;

    RunnableC0589ac(C0588ab c0588ab, C1016c c1016c, String str, InterfaceC1091h interfaceC1091h) {
        this.f1777a = c0588ab;
        this.f1778b = c1016c;
        this.f1779c = str;
        this.f1780d = interfaceC1091h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1778b.m2121a(this.f1779c, this.f1780d);
    }
}
