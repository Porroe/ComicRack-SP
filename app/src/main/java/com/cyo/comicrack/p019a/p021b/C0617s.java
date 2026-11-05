package com.cyo.comicrack.p019a.p021b;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.cyo.common.p022a.AbstractC0934e;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.s */
/* loaded from: classes.dex */
public final class C0617s extends AbstractC0587aa {

    /* renamed from: a */
    private Bitmap f1836a;

    /* renamed from: b */
    private int f1837b;

    /* renamed from: f */
    private int f1838f;

    public C0617s(Bitmap bitmap) {
        this.f1836a = bitmap;
        if (bitmap != null) {
            this.f1837b = bitmap.getWidth();
            this.f1838f = bitmap.getHeight();
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: a */
    public final void mo1271a(AbstractC0934e abstractC0934e, Paint paint) {
        if (this.f1836a != null) {
            abstractC0934e.m1963a(this.f1836a, paint);
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: a */
    protected final void mo1269a() {
        if (this.f1836a != null && !this.f1836a.isRecycled()) {
            this.f1836a.recycle();
        }
        this.f1836a = null;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: b */
    public final int mo1273b() {
        return this.f1837b;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: c */
    public final int mo1274c() {
        return this.f1838f;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa
    /* renamed from: d */
    public final Bitmap mo1275d() {
        return this.f1836a;
    }

    @Override // com.cyo.comicrack.p019a.p021b.AbstractC0587aa, com.cyo.common.p022a.InterfaceC0942m
    /* renamed from: a */
    public final int mo1268a(int i, int i2) {
        return this.f1836a.getPixel(i, i2);
    }
}
