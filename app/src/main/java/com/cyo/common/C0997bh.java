package com.cyo.common;

import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bh */
/* loaded from: classes.dex */
final class C0997bh implements Iterator {

    /* renamed from: a */
    boolean f2924a = true;

    /* renamed from: b */
    int f2925b = 0;

    /* renamed from: c */
    int f2926c = -1;

    /* renamed from: d */
    final /* synthetic */ C0996bg f2927d;

    /* renamed from: e */
    private final /* synthetic */ String f2928e;

    C0997bh(C0996bg c0996bg, String str) {
        this.f2927d = c0996bg;
        this.f2928e = str;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f2926c == -1) {
            String strTrim = this.f2928e.substring(this.f2925b).trim();
            this.f2924a = false;
            return strTrim;
        }
        String strTrim2 = this.f2928e.substring(this.f2925b, this.f2926c).trim();
        this.f2925b = this.f2926c + C0996bg.m2076a(this.f2927d).f2920a.length();
        return strTrim2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iIndexOf = this.f2928e.indexOf(C0996bg.m2076a(this.f2927d).f2920a, this.f2925b);
        this.f2926c = iIndexOf;
        return iIndexOf != -1 || this.f2924a;
    }

    @Override // java.util.Iterator
    public final void remove() {
    }
}
