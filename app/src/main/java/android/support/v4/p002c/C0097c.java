package android.support.v4.p002c;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.c */
/* loaded from: classes.dex */
final class C0097c {

    /* renamed from: a */
    static final int[] f338a = new int[0];

    /* renamed from: b */
    static final long[] f339b = new long[0];

    /* renamed from: c */
    static final Object[] f340c = new Object[0];

    /* renamed from: a */
    public static int m269a() {
        return 13;
    }

    /* renamed from: a */
    public static boolean m271a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static int m270a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return i4 ^ (-1);
    }
}
