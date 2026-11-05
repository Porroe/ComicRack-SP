package com.cyo.common.p026c.p030d;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.l */
/* loaded from: classes.dex */
public final class C1038l extends C1028b {

    /* renamed from: f */
    public boolean f3078f;

    public C1038l(C1028b c1028b) {
        super(c1028b);
        this.f3078f = false;
    }

    /* renamed from: g */
    public final boolean m2164g() {
        byte[] bArr = new byte[7];
        C1024b.m2144a(bArr, 0, this.f3030b);
        bArr[2] = this.f3031c;
        C1024b.m2144a(bArr, 3, this.f3032d);
        C1024b.m2144a(bArr, 5, this.f3033e);
        if (bArr[0] == 82) {
            if (bArr[1] == 69 && bArr[2] == 126 && bArr[3] == 94) {
                this.f3078f = true;
                return true;
            }
            if (bArr[1] == 97 && bArr[2] == 114 && bArr[3] == 33 && bArr[4] == 26 && bArr[5] == 7 && bArr[6] == 0) {
                this.f3078f = false;
                return true;
            }
        }
        return false;
    }
}
