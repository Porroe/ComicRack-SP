package com.p004a.p005a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p007b.C0309x;
import com.p004a.p005a.p011e.C0372i;

/* compiled from: DontLook */
/* renamed from: com.a.a.c */
/* loaded from: classes.dex */
public final class C0338c {
    /* renamed from: a */
    public static boolean m842a() {
        boolean z;
        synchronized (ActivityC0274b.m638d()) {
            z = ActivityC0274b.m639e() != null;
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m843b() {
        boolean z;
        synchronized (ActivityC0274b.m638d()) {
            z = ActivityC0274b.m640f() != null;
        }
        return z;
    }

    /* renamed from: a */
    public static void m841a(C0308w c0308w, C0309x c0309x) {
        synchronized (ActivityC0274b.m638d()) {
            if (ActivityC0274b.m641g() == null) {
                ActivityC0274b.m631a(c0308w);
            } else if (ActivityC0274b.m641g() != c0308w) {
                C0372i.m914b("Tried to launch a new AdActivity with a different AdManager.");
                return;
            }
            Activity activity = (Activity) c0308w.m783h().f964c.m901a();
            if (activity == null) {
                C0372i.m920e("activity was null while launching an AdActivity.");
                return;
            }
            Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) ActivityC0274b.class);
            Bundle bundle = new Bundle();
            bundle.putString("action", c0309x.f868a);
            bundle.putSerializable("params", c0309x.f869b);
            intent.putExtra("com.google.ads.AdOpener", bundle);
            try {
                C0372i.m911a("Launching AdActivity.");
                activity.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                C0372i.m915b("Activity not found.", e);
            }
        }
    }
}
