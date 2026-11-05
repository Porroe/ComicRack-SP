package com.p004a.p005a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: DontLook */
/* renamed from: com.a.a.au */
/* loaded from: classes.dex */
final class RunnableC0268au implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f684a;

    RunnableC0268au(Context context) {
        this.f684a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.f684a.getApplicationContext()).edit();
        editorEdit.putString("drt", "");
        editorEdit.putLong("drt_ts", 0L);
        editorEdit.commit();
    }
}
