package com.cyo.common;

import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bg */
/* loaded from: classes.dex */
final class C0996bg implements Iterable {

    /* renamed from: a */
    final /* synthetic */ C0995bf f2922a;

    /* renamed from: b */
    private final /* synthetic */ String f2923b;

    C0996bg(C0995bf c0995bf, String str) {
        this.f2922a = c0995bf;
        this.f2923b = str;
    }

    /* renamed from: a */
    static /* synthetic */ C0995bf m2076a(C0996bg c0996bg) {
        return c0996bg.f2922a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0997bh(this, this.f2923b);
    }
}
