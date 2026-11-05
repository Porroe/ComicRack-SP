package com.p004a.p005a.p011e;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.l */
/* loaded from: classes.dex */
public class C0375l {

    /* renamed from: a */
    static final /* synthetic */ boolean f1059a;

    static {
        f1059a = !C0375l.class.desiredAssertionStatus();
    }

    /* renamed from: a */
    public static byte[] m921a(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        C0377n c0377n = new C0377n(new byte[(length * 3) / 4]);
        if (!c0377n.m922a(bytes, length)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (c0377n.f1061b == c0377n.f1060a.length) {
            return c0377n.f1060a;
        }
        byte[] bArr = new byte[c0377n.f1061b];
        System.arraycopy(c0377n.f1060a, 0, bArr, 0, c0377n.f1061b);
        return bArr;
    }

    private C0375l() {
    }
}
