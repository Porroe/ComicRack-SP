package com.cyo.common;

import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.t */
/* loaded from: classes.dex */
final class C1103t implements Iterator {

    /* renamed from: a */
    boolean f3481a = false;

    /* renamed from: b */
    private final /* synthetic */ Object f3482b;

    C1103t(Object obj) {
        this.f3482b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f3481a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f3481a = true;
        return this.f3482b;
    }

    @Override // java.util.Iterator
    public final void remove() {
    }
}
