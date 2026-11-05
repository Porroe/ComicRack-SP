package com.p004a.p005a.p011e;

import java.lang.ref.WeakReference;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.af */
/* loaded from: classes.dex */
public final class C0364af extends AbstractC0361ac {

    /* renamed from: d */
    final /* synthetic */ AbstractC0360ab f1041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0364af(AbstractC0360ab abstractC0360ab, String str, Object obj) {
        super(abstractC0360ab, str, new WeakReference(obj), (byte) 0);
        this.f1041d = abstractC0360ab;
    }

    /* renamed from: a */
    public final Object m901a() {
        return ((WeakReference) this.f1035a).get();
    }

    @Override // com.p004a.p005a.p011e.AbstractC0361ac
    public final String toString() {
        return this.f1041d.toString() + "." + this.f1036b + " = " + m901a() + " (?)";
    }
}
