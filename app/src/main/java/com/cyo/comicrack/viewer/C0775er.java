package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.C0569ae;
import com.cyo.comicrack.p019a.EnumC0570af;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.comicrack.p019a.InterfaceC0584at;
import com.cyo.common.InterfaceC1093j;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.er */
/* loaded from: classes.dex */
final class C0775er implements InterfaceC1093j {

    /* renamed from: a */
    public InterfaceC0571ag f2417a;

    /* renamed from: b */
    final /* synthetic */ C0774eq f2418b;

    @Override // com.cyo.common.InterfaceC1093j
    /* renamed from: a */
    public final /* synthetic */ void mo1250a(Object obj, Object obj2) {
        C0569ae c0569ae = (C0569ae) obj2;
        if ((this.f2417a instanceof InterfaceC0584at) || c0569ae.f1732b == EnumC0570af.Removed) {
            this.f2418b.notifyDataSetChanged();
        }
    }

    private C0775er(C0774eq c0774eq) {
        this.f2418b = c0774eq;
    }

    /* synthetic */ C0775er(C0774eq c0774eq, byte b) {
        this(c0774eq);
    }
}
