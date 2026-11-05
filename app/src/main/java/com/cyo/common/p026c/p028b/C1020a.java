package com.cyo.common.p026c.p028b;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.b.a */
/* loaded from: classes.dex */
public final class C1020a extends Exception {

    /* renamed from: a */
    private EnumC1021b f3009a;

    public C1020a(Exception exc) {
        super(EnumC1021b.unkownError.name(), exc);
        this.f3009a = EnumC1021b.unkownError;
    }

    public C1020a(EnumC1021b enumC1021b) {
        super(enumC1021b.name());
        this.f3009a = enumC1021b;
    }
}
