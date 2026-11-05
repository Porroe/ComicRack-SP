package com.cyo.common.p026c.p030d;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.d */
/* loaded from: classes.dex */
public final class C1030d extends C1028b {

    /* renamed from: f */
    private short f3036f;

    /* renamed from: g */
    private byte f3037g;

    /* renamed from: h */
    private byte f3038h;

    /* renamed from: i */
    private short f3039i;

    public C1030d(C1028b c1028b, byte[] bArr) {
        super(c1028b);
        this.f3036f = C1024b.m2142a(bArr, 0);
        this.f3037g = (byte) (this.f3037g | (bArr[2] & 255));
        this.f3038h = (byte) (this.f3038h | (bArr[3] & 255));
        this.f3039i = C1024b.m2142a(bArr, 4);
    }
}
