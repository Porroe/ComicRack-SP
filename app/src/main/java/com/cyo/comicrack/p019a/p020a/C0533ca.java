package com.cyo.comicrack.p019a.p020a;

import com.cyo.common.C0998bi;
import java.util.Comparator;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.ca */
/* loaded from: classes.dex */
public final class C0533ca implements Comparator {

    /* renamed from: a */
    static C0528bw f1608a = new C0528bw();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C0505b c0505b = (C0505b) obj;
        C0505b c0505b2 = (C0505b) obj2;
        int iM2085c = C0998bi.m2085c(c0505b.f1617B, c0505b2.f1617B);
        if (iM2085c != 0) {
            return iM2085c;
        }
        int iM1157a = C0535cc.m1157a(c0505b.f1618C, c0505b2.f1618C);
        if (iM1157a != 0) {
            return iM1157a;
        }
        C0528bw c0528bw = f1608a;
        return C0528bw.m1155a(c0505b, c0505b2);
    }
}
