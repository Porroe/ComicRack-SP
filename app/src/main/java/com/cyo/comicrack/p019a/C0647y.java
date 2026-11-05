package com.cyo.comicrack.p019a;

import com.cyo.comicrack.p019a.p020a.C0505b;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.y */
/* loaded from: classes.dex */
final class C0647y extends AbstractC0567ac {

    /* renamed from: a */
    private final /* synthetic */ String f1945a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0647y(String str) {
        super((byte) 0);
        this.f1945a = str;
    }

    @Override // com.cyo.comicrack.p019a.AbstractC0567ac
    /* renamed from: a */
    public final String mo1202a(C0505b c0505b) {
        try {
            String strSubstring = c0505b.m1147m().substring(this.f1945a.length() - 1, c0505b.m1147m().length() - 1);
            if (strSubstring.length() == 0) {
                return "/";
            }
            return strSubstring;
        } catch (Exception e) {
            return "/";
        }
    }

    @Override // com.cyo.comicrack.p019a.AbstractC0567ac
    /* renamed from: d */
    public final String mo1205d(C0505b c0505b) {
        return c0505b.m1147m();
    }
}
