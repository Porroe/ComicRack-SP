package com.cyo.common.p022a;

import android.graphics.Color;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.c */
/* loaded from: classes.dex */
public final class C0932c {
    /* renamed from: a */
    public static int m1959a(int i) {
        return (int) ((Color.red(i) * 0.2989f) + (Color.green(i) * 0.587f) + (Color.blue(i) * 0.114f));
    }

    /* renamed from: a */
    public static int m1960a(int i, int i2) {
        return Color.argb(i, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    /* renamed from: b */
    public static int m1961b(int i) {
        return (int) ((Color.red(i) * 0.2126f) + (Color.green(i) * 0.7152f) + (Color.blue(i) * 0.0722f));
    }
}
