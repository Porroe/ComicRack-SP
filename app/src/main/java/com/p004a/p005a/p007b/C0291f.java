package com.p004a.p005a.p007b;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.p004a.p005a.ActivityC0274b;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.f */
/* loaded from: classes.dex */
final class C0291f implements DownloadListener {

    /* renamed from: a */
    final /* synthetic */ C0290e f780a;

    C0291f(C0290e c0290e) {
        this.f780a = c0290e;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            ActivityC0274b activityC0274bM714h = this.f780a.m714h();
            if (activityC0274bM714h != null && C0358a.m879a(intent, activityC0274bM714h)) {
                activityC0274bM714h.startActivity(intent);
            }
        } catch (ActivityNotFoundException e) {
            C0372i.m911a("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        } catch (Throwable th) {
            C0372i.m915b("Unknown error trying to start activity to view URL: " + str, th);
        }
    }
}
