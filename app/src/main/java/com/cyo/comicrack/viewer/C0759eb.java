package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.common.C1006bq;
import com.cyo.common.InterfaceC1008bs;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.eb */
/* loaded from: classes.dex */
final class C0759eb implements InterfaceC1008bs {

    /* renamed from: a */
    final /* synthetic */ LibraryActivity f2398a;

    C0759eb(LibraryActivity libraryActivity) {
        this.f2398a = libraryActivity;
    }

    @Override // com.cyo.common.InterfaceC1008bs
    /* renamed from: a */
    public final void mo1736a(C1006bq c1006bq) {
        LibraryActivity libraryActivity = this.f2398a;
        LibraryActivity.m960a("Library", "Category", c1006bq.f2967c, 0);
        C0575ak c0575ak = (C0575ak) c1006bq.f2969e;
        this.f2398a.m1481b(c0575ak, false);
        LibraryActivity libraryActivity2 = this.f2398a;
        LibraryActivity libraryActivity3 = this.f2398a;
        libraryActivity2.m1479a(LibraryActivity.m1469a(c0575ak), true, true, false);
    }
}
