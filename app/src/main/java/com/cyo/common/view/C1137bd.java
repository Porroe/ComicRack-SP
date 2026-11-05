package com.cyo.common.view;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bd */
/* loaded from: classes.dex */
public final class C1137bd {

    /* renamed from: a */
    public int f3608a;

    /* renamed from: b */
    public int f3609b;

    /* renamed from: c */
    public int f3610c;

    /* renamed from: d */
    private int f3611d;

    /* renamed from: e */
    private int f3612e;

    /* renamed from: f */
    private int[] f3613f;

    /* renamed from: g */
    private int f3614g;

    /* renamed from: h */
    private int f3615h;

    public C1137bd(int[] iArr) {
        this.f3613f = iArr;
        for (int i : iArr) {
            this.f3608a = i + this.f3608a;
        }
        this.f3614g = iArr[0];
    }

    /* renamed from: a */
    public final void m2412a(int i, int i2) {
        if (this.f3612e < this.f3613f.length - 1 && i2 < this.f3611d) {
            this.f3615h += this.f3614g;
            int[] iArr = this.f3613f;
            int i3 = this.f3612e + 1;
            this.f3612e = i3;
            this.f3614g = iArr[i3];
        }
        this.f3610c = this.f3615h + this.f3614g;
        this.f3609b = this.f3615h + ((this.f3614g * i2) / i);
        this.f3611d = i2;
    }
}
