package com.cyo.common.p026c.p030d;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.r */
/* loaded from: classes.dex */
public final class C1044r extends C1042p {

    /* renamed from: i */
    private int f3105i;

    /* renamed from: j */
    private int f3106j;

    /* renamed from: k */
    private String f3107k;

    /* renamed from: l */
    private String f3108l;

    public C1044r(C1042p c1042p, byte[] bArr) {
        super(c1042p);
        this.f3105i = C1024b.m2142a(bArr, 0) & 65535;
        this.f3106j = C1024b.m2142a(bArr, 2) & 65535;
        if (this.f3105i + 4 < bArr.length) {
            byte[] bArr2 = new byte[this.f3105i];
            System.arraycopy(bArr, 4, bArr2, 0, this.f3105i);
            this.f3107k = new String(bArr2);
        }
        int i = this.f3105i + 4;
        if (this.f3106j + i < bArr.length) {
            byte[] bArr3 = new byte[this.f3106j];
            System.arraycopy(bArr, i, bArr3, 0, this.f3106j);
            this.f3108l = new String(bArr3);
        }
    }
}
