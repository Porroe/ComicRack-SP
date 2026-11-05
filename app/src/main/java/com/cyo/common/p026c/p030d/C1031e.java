package com.cyo.common.p026c.p030d;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.e */
/* loaded from: classes.dex */
public final class C1031e extends C1042p {

    /* renamed from: i */
    private int f3040i;

    /* renamed from: j */
    private byte f3041j;

    /* renamed from: k */
    private byte f3042k;

    /* renamed from: l */
    private int f3043l;

    public C1031e(C1042p c1042p, byte[] bArr) {
        super(c1042p);
        this.f3040i = C1024b.m2145b(bArr, 0);
        this.f3041j = (byte) (this.f3041j | (bArr[4] & 255));
        this.f3042k = (byte) (this.f3042k | (bArr[5] & 255));
        this.f3043l = C1024b.m2145b(bArr, 6);
    }
}
