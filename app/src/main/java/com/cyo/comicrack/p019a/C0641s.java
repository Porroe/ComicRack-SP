package com.cyo.comicrack.p019a;

import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p020a.EnumC0534cb;
import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.s */
/* loaded from: classes.dex */
final class C0641s implements InterfaceC0581aq {

    /* renamed from: a */
    final /* synthetic */ C0635m f1941a;

    /* renamed from: b */
    private final /* synthetic */ String f1942b;

    C0641s(C0635m c0635m, String str) {
        this.f1941a = c0635m;
        this.f1942b = str;
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0581aq
    /* renamed from: a */
    public final void mo1254a(C0580ap c0580ap, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C0505b c0505b = (C0505b) it.next();
            if (c0505b.m1137c(this.f1942b)) {
                c0580ap.m1237a((InterfaceC0571ag) new C0572ah(c0505b));
            }
        }
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0581aq
    /* renamed from: a */
    public final boolean mo1255a(C0569ae c0569ae) {
        return c0569ae.f1732b == EnumC0570af.Removed || c0569ae.f1733c == EnumC0534cb.Data;
    }
}
