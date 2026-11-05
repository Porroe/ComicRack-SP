package com.cyo.common;

import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.u */
/* loaded from: classes.dex */
public final class C1104u implements Iterable {

    /* renamed from: a */
    private final /* synthetic */ Object f3483a;

    public C1104u(Object obj) {
        this.f3483a = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1103t(this.f3483a);
    }
}
