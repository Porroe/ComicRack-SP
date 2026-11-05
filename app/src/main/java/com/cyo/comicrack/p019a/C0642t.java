package com.cyo.comicrack.p019a;

import android.text.format.Time;
import com.cyo.comicrack.p019a.p020a.C0505b;
import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.t */
/* loaded from: classes.dex */
final class C0642t implements InterfaceC0581aq {
    C0642t() {
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0581aq
    /* renamed from: a */
    public final void mo1254a(C0580ap c0580ap, Iterable iterable) {
        Time timeM1373f = C0628f.m1373f();
        c0580ap.m1988z();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C0505b c0505b = (C0505b) it.next();
            if (c0505b.m1145k().after(timeM1373f)) {
                c0580ap.m1237a((InterfaceC0571ag) new C0572ah(c0505b));
            }
        }
        C0575ak.m1235a((C0575ak) c0580ap, 5, false);
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0581aq
    /* renamed from: a */
    public final boolean mo1255a(C0569ae c0569ae) {
        return c0569ae.f1732b == EnumC0570af.Removed;
    }
}
