package com.cyo.common.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.ag */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1113ag implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f3564a;

    /* renamed from: b */
    private final /* synthetic */ Activity f3565b;

    public DialogInterfaceOnClickListenerC1113ag(SharedPreferences sharedPreferences, Activity activity) {
        this.f3564a = sharedPreferences;
        this.f3565b = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3564a.edit().putBoolean("eula.accepted", true).commit();
        C1112af.m2403a(this.f3565b, true);
    }
}
