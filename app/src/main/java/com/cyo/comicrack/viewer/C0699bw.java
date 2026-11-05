package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.common.C1095l;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.bw */
/* loaded from: classes.dex */
final class C0699bw extends AbstractC0708ce {

    /* renamed from: a */
    final /* synthetic */ C0681be f2216a;

    /* renamed from: b */
    private int f2217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0699bw(C0681be c0681be) {
        super((byte) 0);
        this.f2216a = c0681be;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0708ce
    /* renamed from: a */
    public final int mo1738a() {
        return 4;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0708ce
    /* renamed from: a */
    public final String mo1739a(C0505b c0505b) {
        String strM1147m = c0505b.m1147m();
        if (this.f2217b >= strM1147m.length()) {
            return null;
        }
        String strSubstring = strM1147m.substring(this.f2217b);
        int iIndexOf = strSubstring.indexOf(47);
        return iIndexOf != -1 ? strSubstring.substring(0, iIndexOf) : strSubstring;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0708ce
    /* renamed from: b */
    public final boolean mo1741b(C0505b c0505b) {
        return c0505b.m1147m().length() != this.f2217b;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0708ce
    /* renamed from: a */
    public final void mo1740a(C0575ak c0575ak) {
        super.mo1740a(c0575ak);
        this.f2217b = C1095l.m2370a(C0635m.m1385a(c0575ak)).length();
    }
}
