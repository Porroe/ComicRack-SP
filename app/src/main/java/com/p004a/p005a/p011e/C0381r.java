package com.p004a.p005a.p011e;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebSettings;
import com.p004a.p005a.C0330bs;
import com.p004a.p005a.C0331bt;
import com.p004a.p005a.C0332bu;
import java.io.File;

/* compiled from: DontLook */
@TargetApi(11)
/* renamed from: com.a.a.e.r */
/* loaded from: classes.dex */
public final class C0381r {
    /* renamed from: a */
    public static void m925a(WebSettings webSettings, C0332bu c0332bu) {
        Context context = (Context) c0332bu.f967f.m898a();
        C0331bt c0331bt = (C0331bt) ((C0330bs) c0332bu.f965d.m898a()).f945b.m898a();
        webSettings.setAppCacheEnabled(true);
        webSettings.setAppCacheMaxSize(((Long) c0331bt.f955i.m899a()).longValue());
        webSettings.setAppCachePath(new File(context.getCacheDir(), "admob").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDatabasePath(context.getDatabasePath("admob").getAbsolutePath());
        webSettings.setDomStorageEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
    }
}
