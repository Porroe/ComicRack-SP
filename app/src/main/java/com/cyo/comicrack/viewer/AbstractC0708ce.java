package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0578an;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.common.C1175z;
import java.util.Collections;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ce */
/* loaded from: classes.dex */
abstract class AbstractC0708ce {
    /* renamed from: a */
    public abstract int mo1738a();

    /* renamed from: a */
    public abstract String mo1739a(C0505b c0505b);

    private AbstractC0708ce() {
    }

    /* synthetic */ AbstractC0708ce(byte b) {
        this();
    }

    /* renamed from: a */
    public void mo1740a(C0575ak c0575ak) {
        int[] iArr = {mo1738a(), 1};
        C1175z c1175z = new C1175z();
        for (int i : iArr) {
            c1175z.f3729a.add(C0575ak.m1236c(i));
        }
        Collections.sort(c0575ak.m1986x(), new C0578an(c1175z));
    }

    /* renamed from: b */
    public boolean mo1741b(C0505b c0505b) {
        return true;
    }
}
