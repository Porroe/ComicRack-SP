package com.p004a.p005a;

/* compiled from: DontLook */
/* renamed from: com.a.a.f */
/* loaded from: classes.dex */
public enum EnumC0390f {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");


    /* renamed from: e */
    private final String f1087e;

    EnumC0390f(String str) {
        this.f1087e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f1087e;
    }
}
