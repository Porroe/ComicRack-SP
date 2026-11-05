package com.cyo.comicrack.p019a.p021b;

import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.InterfaceC0625c;
import com.cyo.comicrack.p019a.p020a.C0505b;
import java.util.HashSet;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.f */
/* loaded from: classes.dex */
final class C0604f implements InterfaceC0625c {

    /* renamed from: a */
    final /* synthetic */ C0603e f1806a;

    /* renamed from: b */
    private final /* synthetic */ HashSet f1807b;

    /* renamed from: c */
    private final /* synthetic */ List f1808c;

    /* renamed from: d */
    private final /* synthetic */ InterfaceC0624z f1809d;

    /* renamed from: e */
    private final /* synthetic */ int f1810e;

    C0604f(C0603e c0603e, HashSet hashSet, List list, InterfaceC0624z interfaceC0624z, int i) {
        this.f1806a = c0603e;
        this.f1807b = hashSet;
        this.f1808c = list;
        this.f1809d = interfaceC0624z;
        this.f1810e = i;
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0625c
    /* renamed from: a */
    public final void mo1295a(C0505b c0505b) {
        if (c0505b.f1587s != 0 && this.f1807b.contains(c0505b.f1655v)) {
            InterfaceC0606h interfaceC0606hM1354a = C0628f.m1354a(c0505b, false);
            c0505b.f1586r = interfaceC0606hM1354a.mo1313h();
            if (interfaceC0606hM1354a.mo1314i() == c0505b.f1585q) {
                this.f1808c.add(c0505b);
                this.f1807b.remove(c0505b.f1655v);
                if (this.f1809d != null) {
                    this.f1809d.mo1349a(this.f1810e, this.f1808c.size());
                }
            }
        }
    }
}
