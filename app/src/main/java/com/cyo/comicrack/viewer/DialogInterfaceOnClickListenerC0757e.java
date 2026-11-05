package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.p004a.p012b.p013a.p014a.p015a.C0413b;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.e */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0757e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Activity f2396a;

    DialogInterfaceOnClickListenerC0757e(Activity activity) {
        this.f2396a = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ComicRackApplication.f1954i.m1441e().edit().putBoolean("tracking_enabled", true).commit();
        C0413b.m944a().m947a((Context) this.f2396a);
        C0413b.m944a().m946a(this.f2396a, true);
    }
}
