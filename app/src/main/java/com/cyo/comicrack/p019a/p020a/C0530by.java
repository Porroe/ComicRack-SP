package com.cyo.comicrack.p019a.p020a;

import com.cyo.common.C0998bi;
import java.util.Comparator;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.by */
/* loaded from: classes.dex */
public final class C0530by implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return m1156a((C0505b) obj, (C0505b) obj2);
    }

    /* renamed from: a */
    public static int m1156a(C0505b c0505b, C0505b c0505b2) {
        int iM2087d = C0998bi.m2087d(c0505b.f1657x, c0505b2.f1657x);
        if (iM2087d == 0) {
            int iCompareTo = Integer.valueOf(c0505b.f1616A).compareTo(Integer.valueOf(c0505b2.f1616A));
            if (iCompareTo == 0) {
                int iM1157a = C0535cc.m1157a(c0505b.f1658y, c0505b2.f1658y);
                if (iM1157a == 0) {
                    return 0;
                }
                return iM1157a;
            }
            return iCompareTo;
        }
        return iM2087d;
    }
}
