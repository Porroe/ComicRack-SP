package com.cyo.comicrack.viewer;

import android.content.DialogInterface;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ej */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0767ej implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LibraryActivity f2407a;

    DialogInterfaceOnClickListenerC0767ej(LibraryActivity libraryActivity) {
        this.f2407a = libraryActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        LibraryActivity libraryActivity = this.f2407a;
        String string = this.f2407a.getString(C0806fv.general_comics_location_title);
        LibraryActivity libraryActivity2 = this.f2407a;
        new AlertDialogBuilderC0768ek(this, libraryActivity, string, LibraryActivity.m1874p().f1956g, ComicRackApplication.m1415j()).show();
        dialogInterface.dismiss();
    }
}
