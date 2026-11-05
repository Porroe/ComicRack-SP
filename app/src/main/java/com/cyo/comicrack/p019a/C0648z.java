package com.cyo.comicrack.p019a;

import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.common.C0998bi;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.z */
/* loaded from: classes.dex */
final class C0648z extends AbstractC0567ac {
    C0648z() {
        super((byte) 0);
    }

    @Override // com.cyo.comicrack.p019a.AbstractC0567ac
    /* renamed from: a */
    public final String mo1202a(C0505b c0505b) {
        String str = C0998bi.m2081a(c0505b.f1635T) ? "" : c0505b.f1635T;
        if (!C0998bi.m2081a(c0505b.f1636U)) {
            return String.valueOf(str) + "/" + c0505b.f1636U;
        }
        return str;
    }
}
