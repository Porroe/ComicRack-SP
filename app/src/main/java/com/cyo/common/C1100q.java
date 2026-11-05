package com.cyo.common;

import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.q */
/* loaded from: classes.dex */
public final class C1100q implements Iterable {

    /* renamed from: a */
    private final /* synthetic */ Iterable[] f3476a;

    public C1100q(Iterable[] iterableArr) {
        this.f3476a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator[] itArr = new Iterator[this.f3476a.length];
        for (int i = 0; i < this.f3476a.length; i++) {
            itArr[i] = this.f3476a[i] != null ? this.f3476a[i].iterator() : null;
        }
        return itArr.length == 0 ? new C1098o() : new C1099p(itArr);
    }
}
