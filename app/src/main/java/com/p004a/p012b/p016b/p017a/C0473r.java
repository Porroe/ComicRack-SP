package com.p004a.p012b.p016b.p017a;

import android.content.SharedPreferences;
import android.util.Log;

/* compiled from: DontLook */
/* renamed from: com.a.b.b.a.r */
/* loaded from: classes.dex */
public final class C0473r {

    /* renamed from: a */
    SharedPreferences.Editor f1514a = null;

    /* renamed from: b */
    private final SharedPreferences f1515b;

    /* renamed from: c */
    private final InterfaceC0471p f1516c;

    public C0473r(SharedPreferences sharedPreferences, InterfaceC0471p interfaceC0471p) {
        this.f1515b = sharedPreferences;
        this.f1516c = interfaceC0471p;
    }

    /* renamed from: a */
    public final void m1086a(String str, String str2) {
        if (this.f1514a == null) {
            this.f1514a = this.f1515b.edit();
        }
        this.f1514a.putString(str, this.f1516c.mo1054a(str2, str));
    }

    /* renamed from: b */
    public final String m1087b(String str, String str2) {
        String string = this.f1515b.getString(str, null);
        if (string != null) {
            try {
                return this.f1516c.mo1055b(string, str);
            } catch (C0476u e) {
                Log.w("PreferenceObfuscator", "Validation error while reading preference: " + str);
                return str2;
            }
        }
        return str2;
    }
}
