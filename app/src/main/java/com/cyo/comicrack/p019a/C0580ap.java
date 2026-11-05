package com.cyo.comicrack.p019a;

import com.cyo.common.InterfaceC1093j;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.ap */
/* loaded from: classes.dex */
public final class C0580ap extends C0575ak implements InterfaceC0584at, InterfaceC0634l, InterfaceC1093j {

    /* renamed from: a */
    InterfaceC0581aq f1758a;

    /* renamed from: b */
    public int f1759b;

    /* renamed from: c */
    public boolean f1760c;

    /* renamed from: d */
    public boolean f1761d;

    /* renamed from: e */
    int f1762e;

    /* renamed from: f */
    boolean f1763f;

    @Override // com.cyo.common.InterfaceC1093j
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1250a(Object obj, Object obj2) {
        C0569ae c0569ae = (C0569ae) obj2;
        if (!this.f1761d || this.f1758a == null) {
            return;
        }
        this.f1760c |= this.f1758a.mo1255a(c0569ae);
    }

    public C0580ap(String str, String str2, String str3) {
        super(str, str2, 0, str3);
        this.f1760c = true;
        this.f1761d = true;
        this.f1762e = -1;
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0584at
    /* renamed from: j */
    public final boolean mo1252j() {
        if (this.f1758a == null || mo1222k() == null) {
            return false;
        }
        boolean z = (!this.f1761d) | false;
        if (!this.f1760c && !z) {
            return false;
        }
        m1988z();
        this.f1758a.mo1254a(this, mo1222k().f1931k);
        this.f1759b++;
        this.f1760c = false;
        return true;
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0584at
    /* renamed from: l */
    public final int mo1253l() {
        return this.f1759b;
    }

    @Override // com.cyo.comicrack.p019a.C0575ak, com.cyo.comicrack.p019a.InterfaceC0571ag
    /* renamed from: a */
    public final void mo1207a(C0635m c0635m) {
        super.mo1207a(c0635m);
        c0635m.m1397a((InterfaceC1093j) this);
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0634l
    /* renamed from: a */
    public final int mo1249a() {
        return this.f1762e;
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0634l
    /* renamed from: b */
    public final boolean mo1251b() {
        return this.f1763f;
    }
}
