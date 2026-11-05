package com.cyo.common.p026c.p030d;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.p */
/* loaded from: classes.dex */
public class C1042p extends C1029c {

    /* renamed from: h */
    public short f3095h;

    /* renamed from: i */
    private byte f3096i;

    public C1042p(C1042p c1042p) {
        super(c1042p);
        this.f3095h = EnumC1043q.m2166a(c1042p.f3095h).m2168a();
        this.f3096i = c1042p.f3096i;
    }

    public C1042p(C1029c c1029c, byte[] bArr) {
        super(c1029c);
        this.f3095h = C1024b.m2142a(bArr, 0);
        this.f3096i = (byte) (this.f3096i | (bArr[2] & 255));
    }
}
