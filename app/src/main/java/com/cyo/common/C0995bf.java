package com.cyo.common;

import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bf */
/* loaded from: classes.dex */
public final class C0995bf {

    /* renamed from: a */
    String f2920a;

    /* renamed from: b */
    private HashMap f2921b = null;

    public C0995bf(String str) {
        this.f2920a = str;
    }

    /* renamed from: a */
    public final Iterable m2075a(String str) {
        if (C0998bi.m2081a(str)) {
            return null;
        }
        Iterable entries = f2921b != null ? (Iterable) f2921b.get(str) : null;
        if (entries == null) {
            entries = new C0996bg(this, str);
            if (f2921b != null) {
                f2921b.put(str, entries);
            }
        }
        return entries;
    }
}
