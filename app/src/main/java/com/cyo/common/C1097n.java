package com.cyo.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.n */
/* loaded from: classes.dex */
public final class C1097n {
    /* renamed from: a */
    public static List m2372a(List list, int i, Random random) {
        int size = list.size();
        int[] iArr = new int[i];
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int iNextInt = random.nextInt(size - i2);
            iArr[i2] = iNextInt;
            int i3 = iNextInt;
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                if (i3 >= iArr[i4]) {
                    i3++;
                }
            }
            arrayList.add(list.get(i3));
        }
        return arrayList;
    }
}
