package com.cyo.comicrack.p019a.p021b;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import com.cyo.common.p022a.AbstractC0934e;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.r */
/* loaded from: classes.dex */
public final class C0616r extends AbstractC0587aa {

    /* renamed from: a */
    private AbstractC0587aa f1830a;

    /* renamed from: b */
    private Rect f1831b;

    /* renamed from: f */
    private boolean f1832f = true;

    /* renamed from: g */
    private boolean f1833g = true;

    /* renamed from: h */
    private boolean f1834h = true;

    /* renamed from: i */
    private boolean f1835i = true;

    public C0616r(AbstractC0587aa abstractC0587aa, Rect rect) {
        this.f1830a = abstractC0587aa;
        this.f1831b = rect;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: a */
    protected final void mo1269a() {
        if (this.f1830a != null) {
            this.f1830a.m1279h();
            this.f1830a = null;
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: b */
    public final int mo1273b() {
        return this.f1831b.width();
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: c */
    public final int mo1274c() {
        return this.f1831b.height();
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: a */
    public final void mo1271a(AbstractC0934e abstractC0934e, Paint paint) {
        if (this.f1830a != null) {
            abstractC0934e.mo1934c();
            abstractC0934e.mo1927a(-this.f1831b.left, -this.f1831b.top);
            abstractC0934e.mo1930a(new Rect(this.f1833g ? this.f1831b.left : 0, this.f1832f ? this.f1831b.top : 0, this.f1834h ? this.f1831b.right : this.f1830a.mo1273b(), this.f1835i ? this.f1831b.bottom : this.f1830a.mo1274c()));
            this.f1830a.mo1271a(abstractC0934e, paint);
            abstractC0934e.mo1935d();
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: a */
    public final void mo1272a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f1833g = z;
        this.f1832f = z2;
        this.f1834h = z3;
        this.f1835i = z4;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: d */
    public final Bitmap mo1275d() {
        if (this.f1830a == null) {
            return null;
        }
        return this.f1830a.mo1275d();
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: a */
    public final int mo1268a(int i, int i2) {
        if (this.f1830a == null) {
            return -16777216;
        }
        return this.f1830a.mo1268a(this.f1831b.left + i, this.f1831b.top + i2);
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: e */
    public final boolean mo1276e() {
        return this.f1830a != null && this.f1830a.mo1276e();
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: f */
    public final int mo1277f() {
        if (this.f1830a == null) {
            return -16777216;
        }
        return this.f1830a.mo1277f();
    }
}
