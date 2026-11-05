package com.cyo.common.p026c.p030d;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.a */
/* loaded from: classes.dex */
public final class C1027a extends C1028b {

    /* renamed from: f */
    private byte f3025f;

    /* renamed from: g */
    private byte f3026g;

    /* renamed from: h */
    private byte f3027h;

    /* renamed from: i */
    private int f3028i;

    public C1027a(C1028b c1028b, byte[] bArr) {
        super(c1028b);
        this.f3025f = (byte) (this.f3025f | (bArr[0] & 255));
        this.f3026g = (byte) (this.f3026g | (bArr[1] & 255));
        this.f3027h = (byte) (this.f3027h | (bArr[2] & 255));
        this.f3028i = C1024b.m2145b(bArr, 3);
    }
}
