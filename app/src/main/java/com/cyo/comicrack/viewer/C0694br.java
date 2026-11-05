package com.cyo.comicrack.viewer;

import com.cyo.common.C1006bq;
import com.cyo.common.InterfaceC1008bs;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.br */
/* loaded from: classes.dex */
final class C0694br implements InterfaceC1008bs {

    /* renamed from: a */
    final /* synthetic */ C0681be f2209a;

    /* renamed from: b */
    private final /* synthetic */ int f2210b;

    C0694br(C0681be c0681be, int i) {
        this.f2209a = c0681be;
        this.f2210b = i;
    }

    @Override // com.cyo.common.InterfaceC1008bs
    /* renamed from: a */
    public final void mo1736a(C1006bq c1006bq) {
        int iIntValue = ((Integer) c1006bq.f2969e).intValue();
        if (iIntValue == 10001) {
            this.f2209a.m1723a(this.f2209a.m1713P() + this.f2210b, true);
            return;
        }
        C0726cw c0726cwM1716S = this.f2209a.m1716S();
        if (iIntValue < 1000) {
            this.f2209a.m1834a("ComicList", "Sort", new StringBuilder().append(iIntValue).toString());
            if (c0726cwM1716S.f2272c == iIntValue) {
                c0726cwM1716S.f2270a = !c0726cwM1716S.f2270a;
            } else {
                c0726cwM1716S.f2272c = iIntValue;
                c0726cwM1716S.f2270a = false;
            }
        } else {
            int i = iIntValue - 1000;
            this.f2209a.m1834a("ComicList", "Stack", new StringBuilder().append(i).toString());
            c0726cwM1716S.f2273d = i;
            if (i == 2) {
                C0681be.m1707a(this.f2209a, i);
            }
        }
        this.f2209a.m1833Z();
    }
}
