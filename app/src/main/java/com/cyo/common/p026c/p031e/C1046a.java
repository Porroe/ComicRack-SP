package com.cyo.common.p026c.p031e;

import com.cyo.common.p026c.C1017a;
import com.cyo.common.p026c.C1022c;
import com.cyo.common.p026c.p027a.C1018a;
import com.cyo.common.p026c.p029c.C1026d;
import com.cyo.common.p026c.p030d.C1033g;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.e.a */
/* loaded from: classes.dex */
public final class C1046a {

    /* renamed from: a */
    public long f3121a;

    /* renamed from: b */
    public boolean f3122b;

    /* renamed from: c */
    public boolean f3123c;

    /* renamed from: d */
    public OutputStream f3124d;

    /* renamed from: e */
    public C1033g f3125e;

    /* renamed from: f */
    public boolean f3126f;

    /* renamed from: g */
    public boolean f3127g;

    /* renamed from: h */
    public boolean f3128h;

    /* renamed from: i */
    public long f3129i;

    /* renamed from: j */
    public long f3130j;

    /* renamed from: k */
    public long f3131k;

    /* renamed from: l */
    public long f3132l;

    /* renamed from: m */
    public long f3133m;

    /* renamed from: n */
    public long f3134n;

    /* renamed from: o */
    public long f3135o;

    /* renamed from: p */
    public long f3136p;

    /* renamed from: q */
    public long f3137q;

    /* renamed from: r */
    public long f3138r;

    /* renamed from: s */
    public int f3139s;

    /* renamed from: t */
    public int f3140t;

    /* renamed from: u */
    public int f3141u;

    /* renamed from: v */
    public char f3142v;

    /* renamed from: w */
    private final C1017a f3143w;

    /* renamed from: x */
    private InputStream f3144x;

    public C1046a(C1017a c1017a) {
        this.f3143w = c1017a;
    }

    /* renamed from: a */
    public final void m2173a(C1033g c1033g) throws java.io.IOException {
        long jE = c1033g.m2151e() + c1033g.m2150d();
        this.f3121a = c1033g.f3050l;
        this.f3144x = new C1026d(this.f3143w.m2128b(), jE, this.f3121a + jE);
        this.f3125e = c1033g;
        this.f3132l = 0L;
        this.f3131k = 0L;
        this.f3138r = -1L;
    }

    /* renamed from: a */
    public final int m2172a(byte[] bArr, int i, int i2) throws IOException, com.cyo.common.p026c.p028b.C1020a {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int i7 = i2;
        while (i7 > 0) {
            int i8 = this.f3144x.read(bArr, i, ((long) i7) > this.f3121a ? (int) this.f3121a : i7);
            if (i8 < 0) {
                throw new EOFException();
            }
            if (this.f3125e.m2154g()) {
                this.f3138r = C1018a.m2134a((int) this.f3138r, bArr, i, i8);
            }
            this.f3132l += i8;
            i4 = i5 + i8;
            i += i8;
            i7 -= i8;
            this.f3121a -= i8;
            this.f3143w.m2125a(i8);
            if (this.f3121a != 0 || !this.f3125e.m2154g()) {
                i3 = i8;
                break;
            }
            if (!C1022c.m2138a(this.f3143w, this)) {
                this.f3128h = true;
                return -1;
            }
            i5 = i4;
            i6 = i8;
        }
        i3 = i6;
        i4 = i5;
        return i3 != -1 ? i4 : i3;
    }

    /* renamed from: b */
    public final void m2174b(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f3122b) {
            this.f3124d.write(bArr, i, i2);
        }
        this.f3133m += i2;
        if (!this.f3123c) {
            if (this.f3143w.m2133g()) {
                this.f3137q = C1018a.m2135a((short) this.f3137q, bArr, i2);
            } else {
                this.f3137q = C1018a.m2134a((int) this.f3137q, bArr, i, i2);
            }
        }
    }
}
