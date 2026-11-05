package com.cyo.common;

import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.s */
/* loaded from: classes.dex */
public final class C1102s implements Iterable {

    /* renamed from: a */
    private final /* synthetic */ Iterable f3479a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC1105v f3480b;

    public C1102s(Iterable iterable, InterfaceC1105v interfaceC1105v) {
        this.f3479a = iterable;
        this.f3480b = interfaceC1105v;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1101r(this.f3479a.iterator(), this.f3480b);
    }
}
