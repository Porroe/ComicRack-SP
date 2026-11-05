package com.cyo.comicrack.p019a.p020a;

import java.util.Comparator;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.bw */
/* loaded from: classes.dex */
public final class C0528bw implements Comparator {

    /* renamed from: a */
    static C0530by f1607a = new C0530by();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return m1155a((C0505b) obj, (C0505b) obj2);
    }

    /* renamed from: a */
    public static int m1155a(C0505b c0505b, C0505b c0505b2) {
        int iCompareTo = Integer.valueOf(c0505b.f1625J).compareTo(Integer.valueOf(c0505b2.f1625J));
        if (iCompareTo == 0) {
            int iCompareTo2 = Integer.valueOf(c0505b.f1626K).compareTo(Integer.valueOf(c0505b2.f1626K));
            if (iCompareTo2 == 0) {
                int iCompareTo3 = Integer.valueOf(c0505b.f1627L).compareTo(Integer.valueOf(c0505b2.f1627L));
                if (iCompareTo3 == 0) {
                    C0530by c0530by = f1607a;
                    return C0530by.m1156a(c0505b, c0505b2);
                }
                return iCompareTo3;
            }
            return iCompareTo2;
        }
        return iCompareTo;
    }
}
