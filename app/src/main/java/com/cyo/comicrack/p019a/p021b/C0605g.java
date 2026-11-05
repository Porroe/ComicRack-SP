package com.cyo.comicrack.p019a.p021b;

import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.InterfaceC0627e;
import com.cyo.comicrack.p019a.p020a.C0505b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.g */
/* loaded from: classes.dex */
final class C0605g implements InterfaceC0627e {

    /* renamed from: a */
    final /* synthetic */ C0603e f1811a;

    /* renamed from: b */
    private final /* synthetic */ List f1812b;

    /* renamed from: c */
    private final /* synthetic */ HashSet f1813c;

    /* renamed from: d */
    private final /* synthetic */ InterfaceC0624z f1814d;

    /* renamed from: e */
    private final /* synthetic */ int f1815e;

    C0605g(C0603e c0603e, List list, HashSet hashSet, InterfaceC0624z interfaceC0624z, int i) {
        this.f1811a = c0603e;
        this.f1812b = list;
        this.f1813c = hashSet;
        this.f1814d = interfaceC0624z;
        this.f1815e = i;
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0627e
    /* renamed from: a */
    public final boolean mo1296a() {
        int size = this.f1812b.size();
        Iterator it = this.f1813c.iterator();
        while (true) {
            int i = size;
            if (it.hasNext()) {
                InterfaceC0606h interfaceC0606hM1355a = C0628f.m1355a((String) it.next(), false);
                if (interfaceC0606hM1355a != null) {
                    C0505b c0505bMo1298a = interfaceC0606hM1355a.mo1298a();
                    c0505bMo1298a.f1586r = interfaceC0606hM1355a.mo1313h();
                    this.f1812b.add(c0505bMo1298a);
                }
                if (this.f1814d != null) {
                    this.f1814d.mo1349a(this.f1815e, i);
                }
                size = i + 1;
            } else {
                return true;
            }
        }
    }
}
