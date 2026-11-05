package com.cyo.comicrack.viewer;

import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.el */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0769el implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LibraryActivity f2409a;

    DialogInterfaceOnClickListenerC0769el(LibraryActivity libraryActivity) {
        this.f2409a = libraryActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2409a.m1878r().edit().putBoolean("show_empty_folder_help", false).commit();
        dialogInterface.dismiss();
    }
}
