package com.cyo.comicrack.p019a.p020a;

import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.a */
/* loaded from: classes.dex */
public final class C0478a {

    /* renamed from: a */
    public int f1535a;

    /* renamed from: b */
    public String f1536b;

    public C0478a() {
    }

    public C0478a(int i, String str) {
        this.f1535a = i;
        this.f1536b = str;
    }

    /* renamed from: a */
    public static int m1108a(List list, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < list.size()) {
                if (i <= ((C0478a) list.get(i3)).f1535a) {
                    return i3;
                }
                i2 = i3 + 1;
            } else {
                return list.size();
            }
        }
    }

    /* renamed from: b */
    public static int m1110b(List list, int i) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (i >= ((C0478a) list.get(size)).f1535a) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m1109a(List list, C0478a c0478a) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < list.size()) {
                C0478a c0478a2 = (C0478a) list.get(i2);
                if (c0478a.f1535a == c0478a2.f1535a) {
                    return i2;
                }
                if (c0478a.f1535a >= c0478a2.f1535a) {
                    i = i2 + 1;
                } else {
                    list.add(i2, c0478a);
                    return i2;
                }
            } else {
                list.add(c0478a);
                return list.size() - 1;
            }
        }
    }
}
