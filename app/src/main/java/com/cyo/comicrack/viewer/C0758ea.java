package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.C0575ak;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ea */
/* loaded from: classes.dex */
final class C0758ea implements InterfaceC0754dx {

    /* renamed from: a */
    final /* synthetic */ LibraryActivity f2397a;

    C0758ea(LibraryActivity libraryActivity) {
        this.f2397a = libraryActivity;
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0754dx
    /* renamed from: a */
    public final void mo1811a(int i) {
        if (LibraryActivity.m1470a(this.f2397a) != null) {
            C0575ak c0575akMo1798a = LibraryActivity.m1472b(this.f2397a).mo1798a(i);
            InterfaceC0753dw interfaceC0753dwM1470a = LibraryActivity.m1470a(this.f2397a);
            LibraryActivity libraryActivity = this.f2397a;
            interfaceC0753dwM1470a.mo1800a(LibraryActivity.m1875q(), c0575akMo1798a.f1750p, false);
            if (c0575akMo1798a.m1987y() > 0) {
                String strMo1808f = LibraryActivity.m1470a(this.f2397a).mo1808f();
                C0575ak c0575ak = strMo1808f == null ? null : (C0575ak) c0575akMo1798a.m1242b(strMo1808f, false);
                C0575ak c0575ak2 = c0575ak == null ? (C0575ak) c0575akMo1798a.m1983d(0) : c0575ak;
                LibraryActivity.m1470a(this.f2397a).mo1801a(c0575ak2.f1750p, false);
                ((C0776es) LibraryActivity.m1472b(this.f2397a).mo1803b()).m1840e(c0575ak2);
            }
        }
    }
}
