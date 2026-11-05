package com.cyo.common;

import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.r */
/* loaded from: classes.dex */
final class C1101r implements Iterator {

    /* renamed from: a */
    private final /* synthetic */ Iterator f3477a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC1105v f3478b;

    C1101r(Iterator it, InterfaceC1105v interfaceC1105v) {
        this.f3477a = it;
        this.f3478b = interfaceC1105v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3477a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f3478b.mo1206a(this.f3477a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3477a.remove();
    }
}
