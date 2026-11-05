package com.cyo.comicrack.viewer;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cg */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0710cg implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ComicRackApplication f2231a;

    /* renamed from: b */
    private final /* synthetic */ SharedPreferences f2232b;

    DialogInterfaceOnClickListenerC0710cg(ComicRackApplication comicRackApplication, SharedPreferences sharedPreferences) {
        this.f2231a = comicRackApplication;
        this.f2232b = sharedPreferences;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2232b.edit().putBoolean("general_rate_comic", false).commit();
    }
}
