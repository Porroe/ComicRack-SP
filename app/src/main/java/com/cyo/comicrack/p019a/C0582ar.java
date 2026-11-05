package com.cyo.comicrack.p019a;

import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p020a.C0530by;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.ar */
/* loaded from: classes.dex */
public final class C0582ar {

    /* renamed from: a */
    private Map f1764a = new HashMap();

    public C0582ar(Collection collection) {
        ArrayList<C0505b> arrayList = new ArrayList(collection);
        Collections.sort(arrayList, new C0530by());
        Locale locale = Locale.getDefault();
        int i = -1;
        String str = null;
        int i2 = 0;
        for (C0505b c0505b : arrayList) {
            if (str == null || !str.equalsIgnoreCase(c0505b.f1657x)) {
                if (str != null) {
                    this.f1764a.put(str, Boolean.valueOf(i2 != 0));
                }
                String lowerCase = c0505b.f1657x;
                lowerCase = lowerCase != null ? lowerCase.toLowerCase(locale) : lowerCase;
                i = c0505b.f1616A;
                str = lowerCase;
                i2 = 0;
            } else if (i != c0505b.f1616A) {
                i = c0505b.f1616A;
                i2++;
            }
        }
        if (str != null) {
            this.f1764a.put(str, Boolean.valueOf(i2 != 0));
        }
    }

    /* renamed from: a */
    public final boolean m1257a(String str) {
        if (str == null) {
            return true;
        }
        Boolean bool = (Boolean) this.f1764a.get(str.toLowerCase(Locale.getDefault()));
        return bool != null && bool.booleanValue();
    }

    /* renamed from: a */
    public final boolean m1256a(C0505b c0505b) {
        return c0505b != null && m1257a(c0505b.f1657x);
    }
}
