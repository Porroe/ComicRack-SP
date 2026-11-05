package com.cyo.common.p026c.p030d;

import com.cyo.common.p026c.p029c.C1024b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.d.b */
/* loaded from: classes.dex */
public class C1028b {

    /* renamed from: a */
    protected long f3029a;

    /* renamed from: b */
    protected short f3030b;

    /* renamed from: c */
    protected byte f3031c;

    /* renamed from: d */
    protected short f3032d;

    /* renamed from: e */
    protected short f3033e;

    public C1028b() {
        this.f3030b = (short) 0;
        this.f3031c = (byte) 0;
        this.f3032d = (short) 0;
        this.f3033e = (short) 0;
    }

    public C1028b(C1028b c1028b) {
        this.f3030b = (short) 0;
        this.f3031c = (byte) 0;
        this.f3032d = (short) 0;
        this.f3033e = (short) 0;
        this.f3032d = c1028b.f3032d;
        this.f3030b = c1028b.f3030b;
        this.f3031c = EnumC1045s.m2169a(c1028b.f3031c).m2170a();
        this.f3033e = c1028b.f3033e;
        this.f3029a = c1028b.f3029a;
    }

    public C1028b(byte[] bArr) {
        this.f3030b = (short) 0;
        this.f3031c = (byte) 0;
        this.f3032d = (short) 0;
        this.f3033e = (short) 0;
        this.f3030b = C1024b.m2142a(bArr, 0);
        this.f3031c = (byte) (this.f3031c | (bArr[2] & 255));
        this.f3032d = C1024b.m2142a(bArr, 3);
        this.f3033e = C1024b.m2142a(bArr, 5);
    }

    /* renamed from: a */
    public final boolean m2147a() {
        return (this.f3032d & 2) != 0;
    }

    /* renamed from: b */
    public final boolean m2148b() {
        return (this.f3032d & 8) != 0;
    }

    /* renamed from: c */
    public final boolean m2149c() {
        return (this.f3032d & 512) != 0;
    }

    /* renamed from: d */
    public final long m2150d() {
        return this.f3029a;
    }

    /* renamed from: e */
    public final short m2151e() {
        return this.f3033e;
    }

    /* renamed from: f */
    public final EnumC1045s m2152f() {
        return EnumC1045s.m2169a(this.f3031c);
    }

    /* renamed from: a */
    public final void m2146a(long j) {
        this.f3029a = j;
    }
}
