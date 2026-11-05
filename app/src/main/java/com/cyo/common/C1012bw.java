package com.cyo.common;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bw */
/* loaded from: classes.dex */
final class C1012bw extends AbstractC1010bu {

    /* renamed from: a */
    SharedPreferences f2976a;

    /* renamed from: b */
    SharedPreferences.Editor f2977b;

    public C1012bw(SharedPreferences sharedPreferences) {
        this.f2976a = sharedPreferences;
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: a */
    public final void mo2103a(String str, boolean z) {
        m2107b().putBoolean(str, z);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: a */
    public final boolean mo2104a(String str) {
        return this.f2976a.getBoolean(str, false);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: a */
    public final void mo2102a(String str, String str2) {
        m2107b().putString(str, str2);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: b */
    public final String mo2106b(String str, String str2) {
        return this.f2976a.getString(str, str2);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: a */
    public final void mo2101a(String str, int i) {
        m2107b().putInt(str, i);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: b */
    public final int mo2105b(String str) {
        return this.f2976a.getInt(str, 0);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: a */
    public final void mo2100a() {
        if (this.f2977b != null) {
            this.f2977b.commit();
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    private SharedPreferences.Editor m2107b() {
        if (this.f2977b == null) {
            this.f2977b = this.f2976a.edit();
        }
        return this.f2977b;
    }
}
