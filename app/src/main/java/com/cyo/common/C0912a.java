package com.cyo.common;

import android.content.Context;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a */
/* loaded from: classes.dex */
public final class C0912a {

    /* renamed from: a */
    private static byte[] f2752a;

    /* renamed from: a */
    public static byte m1913a(Context context, int i) {
        if (f2752a == null) {
            f2752a = C0951ag.m2008g(context);
        }
        if (f2752a == null) {
            return (byte) 0;
        }
        return f2752a[i];
    }
}
