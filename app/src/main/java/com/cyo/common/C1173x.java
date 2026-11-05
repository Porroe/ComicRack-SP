package com.cyo.common;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.x */
/* loaded from: classes.dex */
public final class C1173x {

    /* renamed from: c */
    static TimerTask f3726c;

    /* renamed from: a */
    public static int f3724a = 15000;

    /* renamed from: b */
    static final Timer f3725b = new Timer("Delayed Filescan", false);

    /* renamed from: d */
    static Set f3727d = new HashSet();

    /* renamed from: a */
    public static synchronized void m2506a(Context context, String str) {
        if (C0951ag.m2004d()) {
            f3727d.add(str);
            if (f3726c != null) {
                f3726c.cancel();
            }
            f3726c = new C1174y(context);
            f3725b.schedule(f3726c, f3724a);
        }
    }

    /* renamed from: a */
    public static void m2505a(Context context, File file) {
        m2506a(context, file.getAbsolutePath());
    }
}
