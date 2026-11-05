package com.cyo.comicrack.viewer;

import com.cyo.common.view.InterfaceC1142bi;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ee */
/* loaded from: classes.dex */
final class C0762ee implements InterfaceC1142bi {

    /* renamed from: a */
    final /* synthetic */ LibraryActivity f2401a;

    C0762ee(LibraryActivity libraryActivity) {
        this.f2401a = libraryActivity;
    }

    @Override // com.cyo.common.view.InterfaceC1142bi
    /* renamed from: a */
    public final void mo1818a() {
        if (LibraryActivity.m1470a(this.f2401a) != null) {
            LibraryActivity.m1470a(this.f2401a).mo1804b(!LibraryActivity.m1473c(this.f2401a).m2392a());
            ((C0776es) LibraryActivity.m1472b(this.f2401a).mo1803b()).m1824a();
        }
    }

    @Override // com.cyo.common.view.InterfaceC1142bi
    /* renamed from: b */
    public final void mo1819b() {
        if (LibraryActivity.m1470a(this.f2401a) != null && this.f2401a.m1487l()) {
            LibraryActivity libraryActivity = this.f2401a;
            LibraryActivity.m1874p().m1432a(new RunnableC0763ef(this));
        }
    }
}
