package com.cyo.common;

import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bu */
/* loaded from: classes.dex */
public abstract class AbstractC1010bu {
    /* renamed from: a */
    public abstract void mo2100a();

    /* renamed from: a */
    public abstract void mo2101a(String str, int i);

    /* renamed from: a */
    public abstract void mo2102a(String str, String str2);

    /* renamed from: a */
    public abstract void mo2103a(String str, boolean z);

    /* renamed from: a */
    public abstract boolean mo2104a(String str);

    /* renamed from: b */
    public abstract int mo2105b(String str);

    /* renamed from: b */
    public abstract String mo2106b(String str, String str2);

    /* renamed from: a */
    public static AbstractC1010bu m2098a(Intent intent) {
        return new C1011bv(intent);
    }

    /* renamed from: a */
    public static AbstractC1010bu m2099a(SharedPreferences sharedPreferences) {
        return new C1012bw(sharedPreferences);
    }
}
