package com.cyo.common.p024b.p025a;

import android.os.Handler;
import com.cyo.common.C1013bx;
import twitter4j.Twitter;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.a */
/* loaded from: classes.dex */
public final class C0973a {

    /* renamed from: a */
    private static C1013bx f2873a = new C1013bx("Twitter", 1, 5);

    /* renamed from: b */
    private static Handler f2874b;

    /* renamed from: a */
    static /* synthetic */ Handler m2060a() {
        return f2874b;
    }

    /* renamed from: a */
    private static void m2061a(AbstractC0975c abstractC0975c, C0977e c0977e) {
        if (f2874b == null) {
            f2874b = new Handler();
        }
        f2873a.m2110a((Runnable) new RunnableC0974b(c0977e, abstractC0975c));
    }

    /* renamed from: a */
    public static void m2063a(AbstractC0975c abstractC0975c, C0982j c0982j, Twitter twitter) {
        m2061a(abstractC0975c, new C0977e(c0982j, twitter));
    }

    /* renamed from: a */
    public static void m2062a(AbstractC0975c abstractC0975c, C0982j c0982j) {
        m2061a(abstractC0975c, new C0977e(c0982j, null));
    }
}
