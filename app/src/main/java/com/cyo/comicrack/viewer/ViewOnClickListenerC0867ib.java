package com.cyo.comicrack.viewer;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ib */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0867ib implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SplashActivity f2642a;

    ViewOnClickListenerC0867ib(SplashActivity splashActivity) {
        this.f2642a = splashActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SplashActivity.m1638a(this.f2642a, new AlertDialogBuilderC0868ic(this, this.f2642a, this.f2642a.getString(C0806fv.general_comics_location_title), ComicRackApplication.f1954i.f1956g, ComicRackApplication.m1415j()).create());
        SplashActivity.m1636a(this.f2642a).show();
    }
}
