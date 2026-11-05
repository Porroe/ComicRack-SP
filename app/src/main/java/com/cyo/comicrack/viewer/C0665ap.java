package com.cyo.comicrack.viewer;

import android.content.Intent;
import android.net.Uri;
import com.cyo.common.view.InterfaceC1158m;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ap */
/* loaded from: classes.dex */
final class C0665ap implements InterfaceC1158m {

    /* renamed from: a */
    final /* synthetic */ C0906u f2161a;

    /* renamed from: b */
    private final /* synthetic */ String f2162b;

    /* renamed from: c */
    private final /* synthetic */ String f2163c;

    C0665ap(C0906u c0906u, String str, String str2) {
        this.f2161a = c0906u;
        this.f2162b = str;
        this.f2163c = str2;
    }

    @Override // com.cyo.common.view.InterfaceC1158m
    /* renamed from: a */
    public final void mo1701a(String str) {
        Intent intent;
        Uri uri = Uri.parse(String.valueOf(this.f2162b) + "=" + Uri.encode(this.f2163c == null ? str.trim() : this.f2163c));
        if (this.f2161a.m175b() != null) {
            this.f2161a.m173a();
            intent = new Intent("android.intent.action.VIEW", uri, this.f2161a.m55i(), LibraryActivity.class);
            intent.setFlags(603979776);
        } else {
            intent = new Intent("android.intent.action.VIEW", uri, this.f2161a.m55i(), ComicListActivity.class);
        }
        this.f2161a.m55i().startActivity(intent);
    }
}
