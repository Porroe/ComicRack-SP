package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CheckBox;
import com.cyo.common.view.C1146bm;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ch */
/* loaded from: classes.dex */
final class DialogInterfaceOnDismissListenerC0711ch implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ ComicRackApplication f2233a;

    /* renamed from: b */
    private final /* synthetic */ SharedPreferences f2234b;

    /* renamed from: c */
    private final /* synthetic */ CheckBox f2235c;

    /* renamed from: d */
    private final /* synthetic */ Activity f2236d;

    /* renamed from: e */
    private final /* synthetic */ Runnable f2237e;

    DialogInterfaceOnDismissListenerC0711ch(ComicRackApplication comicRackApplication, SharedPreferences sharedPreferences, CheckBox checkBox, Activity activity, Runnable runnable) {
        this.f2233a = comicRackApplication;
        this.f2234b = sharedPreferences;
        this.f2235c = checkBox;
        this.f2236d = activity;
        this.f2237e = runnable;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2234b.edit().putBoolean("tweet_rating", this.f2235c.isChecked()).commit();
        C1146bm.m2419a(this.f2236d);
        if (this.f2237e != null) {
            this.f2237e.run();
        }
    }
}
