package com.cyo.comicrack.viewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.AbstractC0004ab;
import com.cyo.comicrack.p019a.p020a.C0505b;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class ComicDetailsActivity extends ActivityC0881ip {

    /* renamed from: n */
    private C0906u f1946n;

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: a */
    public final void mo1399a(Bundle bundle) {
        super.mo1399a(bundle);
        setContentView(C0804ft.comic_details);
        Intent intent = getIntent();
        C0505b c0505bM1422a = ComicRackApplication.f1954i.m1422a(intent);
        if (c0505bM1422a == null) {
            finish();
            return;
        }
        AbstractC0004ab abstractC0004abMo191a = m187d().mo191a();
        this.f1946n = new C0906u();
        this.f1946n.m1909a(c0505bM1422a, ComicRackApplication.f1954i.m1438c().m1392a(intent));
        abstractC0004abMo191a.mo90a(C0803fs.comicDetailsContainer, this.f1946n);
        abstractC0004abMo191a.mo89a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.cyo.comicrack.viewer.ActivityC0881ip, android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onDestroy() {
        if (this.f1946n != null) {
            this.f1946n.m1911a(true, false);
        }
        super.onDestroy();
    }
}
