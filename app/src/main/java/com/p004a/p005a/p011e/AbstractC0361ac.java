package com.p004a.p005a.p011e;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.ac */
/* loaded from: classes.dex */
public abstract class AbstractC0361ac {

    /* renamed from: a */
    protected Object f1035a;

    /* renamed from: b */
    protected final String f1036b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0360ab f1037c;

    /* synthetic */ AbstractC0361ac(AbstractC0360ab abstractC0360ab, String str, byte b) {
        this(abstractC0360ab, str);
    }

    /* synthetic */ AbstractC0361ac(AbstractC0360ab abstractC0360ab, String str, Object obj, byte b) {
        this(abstractC0360ab, str, obj);
    }

    private AbstractC0361ac(AbstractC0360ab abstractC0360ab, String str) {
        this(abstractC0360ab, str, (Object) null);
    }

    private AbstractC0361ac(AbstractC0360ab abstractC0360ab, String str, Object obj) {
        this.f1037c = abstractC0360ab;
        this.f1036b = str;
        AbstractC0360ab.m897a(abstractC0360ab, this);
        this.f1035a = obj;
    }

    public String toString() {
        return this.f1037c.toString() + "." + this.f1036b + " = " + this.f1035a;
    }
}
