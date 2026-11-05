package com.p004a.p005a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.p004a.p005a.p007b.C0293h;
import java.util.Date;

/* compiled from: DontLook */
/* renamed from: com.a.a.at */
/* loaded from: classes.dex */
public final class C0267at {

    /* renamed from: a */
    private static final C0293h f683a = (C0293h) C0293h.f782a.mo727a();

    /* renamed from: a */
    public static boolean m621a(Context context, long j) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        if (!((defaultSharedPreferences.contains("drt") && defaultSharedPreferences.contains("drt_ts") && defaultSharedPreferences.getLong("drt_ts", 0L) >= new Date().getTime() - j) ? false : true)) {
            return false;
        }
        new Thread(new RunnableC0268au(context)).start();
        return true;
    }

    /* renamed from: a */
    public static void m620a(Activity activity) {
        new Thread(new RunnableC0269av(activity)).start();
    }
}
