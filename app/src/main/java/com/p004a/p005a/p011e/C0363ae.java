package com.p004a.p005a.p011e;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.ae */
/* loaded from: classes.dex */
public final class C0363ae extends AbstractC0361ac {

    /* renamed from: d */
    final /* synthetic */ AbstractC0360ab f1039d;

    /* renamed from: e */
    private boolean f1040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363ae(AbstractC0360ab abstractC0360ab, String str) {
        super(abstractC0360ab, str, (byte) 0);
        this.f1039d = abstractC0360ab;
        this.f1040e = false;
        this.f1040e = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363ae(AbstractC0360ab abstractC0360ab, String str, Object obj) {
        super(abstractC0360ab, str, obj, (byte) 0);
        this.f1039d = abstractC0360ab;
        this.f1040e = false;
        this.f1040e = false;
    }

    /* renamed from: a */
    public final synchronized Object m899a() {
        return this.f1035a;
    }

    /* renamed from: a */
    public final synchronized void m900a(Object obj) {
        C0372i.m918d("State changed - " + this.f1039d.toString() + "." + this.f1036b + ": '" + obj + "' <-- '" + this.f1035a + "'.");
        this.f1035a = obj;
        this.f1040e = true;
    }

    @Override // com.p004a.p005a.p011e.AbstractC0361ac
    public final String toString() {
        return super.toString() + (this.f1040e ? " (*)" : "");
    }
}
