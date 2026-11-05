package com.cyo.common.p026c.p030d;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.k */
/* loaded from: classes.dex */
public final class C1037k extends C1028b {

    /* renamed from: f */
    private short f3075f;

    /* renamed from: g */
    private int f3076g;

    /* renamed from: h */
    private byte f3077h;

    public C1037k(C1028b c1028b, byte[] bArr) {
        super(c1028b);
        this.f3075f = C1024b.m2142a(bArr, 0);
        this.f3076g = C1024b.m2145b(bArr, 2);
        if (m2149c()) {
            this.f3077h = (byte) (this.f3077h | (bArr[6] & 255));
        }
    }

    /* renamed from: g */
    public final boolean m2161g() {
        return (this.f3032d & 128) != 0;
    }

    /* renamed from: h */
    public final boolean m2162h() {
        return (this.f3032d & 8) != 0;
    }

    /* renamed from: i */
    public final boolean m2163i() {
        return (this.f3032d & 16) != 0;
    }
}
