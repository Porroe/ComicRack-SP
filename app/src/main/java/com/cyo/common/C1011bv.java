package com.cyo.common;

import android.content.Intent;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bv */
/* loaded from: classes.dex */
final class C1011bv extends AbstractC1010bu {

    /* renamed from: a */
    private Intent f2975a;

    public C1011bv(Intent intent) {
        this.f2975a = intent;
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: a */
    public final void mo2103a(String str, boolean z) {
        this.f2975a.putExtra(str, z);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: a */
    public final boolean mo2104a(String str) {
        return this.f2975a.getBooleanExtra(str, false);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: a */
    public final void mo2102a(String str, String str2) {
        this.f2975a.putExtra(str, str2);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: b */
    public final String mo2106b(String str, String str2) {
        String stringExtra = this.f2975a.getStringExtra(str);
        return stringExtra != null ? stringExtra : str2;
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: a */
    public final void mo2101a(String str, int i) {
        this.f2975a.putExtra(str, i);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: b */
    public final int mo2105b(String str) {
        return this.f2975a.getIntExtra(str, 0);
    }

    @Override // com.cyo.common.AbstractC1010bu
    /* renamed from: a */
    public final void mo2100a() {
    }
}
