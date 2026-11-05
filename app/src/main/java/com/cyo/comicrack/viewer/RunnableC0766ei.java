package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.C0575ak;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ei */
/* loaded from: classes.dex */
final class RunnableC0766ei implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LibraryActivity f2405a;

    /* renamed from: b */
    private final /* synthetic */ C0575ak f2406b;

    RunnableC0766ei(LibraryActivity libraryActivity, C0575ak c0575ak) {
        this.f2405a = libraryActivity;
        this.f2406b = c0575ak;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2405a.m1481b(this.f2406b.mo1210e(), true);
        this.f2405a.m1479a(this.f2406b, false, true, false);
    }
}
