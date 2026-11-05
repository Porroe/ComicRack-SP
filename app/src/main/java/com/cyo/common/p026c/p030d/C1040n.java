package com.cyo.common.p026c.p030d;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.n */
/* loaded from: classes.dex */
public final class C1040n extends C1029c {

    /* renamed from: h */
    private byte f3088h;

    /* renamed from: i */
    private short f3089i;

    /* renamed from: j */
    private int f3090j;

    /* renamed from: k */
    private byte f3091k;

    public C1040n(C1029c c1029c, byte[] bArr) {
        super(c1029c);
        this.f3088h = (byte) (this.f3088h | (bArr[0] & 255));
        this.f3089i = C1024b.m2142a(bArr, 0);
        this.f3090j = C1024b.m2145b(bArr, 2);
        this.f3091k = (byte) (this.f3091k | (bArr[6] & 255));
    }
}
