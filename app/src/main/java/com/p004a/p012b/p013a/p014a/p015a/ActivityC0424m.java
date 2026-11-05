package com.p004a.p012b.p013a.p014a.p015a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityC0076l;

/* compiled from: DontLook */
/* renamed from: com.a.b.a.a.a.m */
/* loaded from: classes.dex */
public class ActivityC0424m extends ActivityC0076l {
    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0413b.m944a().m947a((Context) this);
    }

    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onStart() {
        super.onStart();
        C0413b.m944a().m945a((Activity) this);
    }

    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onStop() {
        super.onStop();
        C0413b.m944a().m952c();
    }

    /* renamed from: a */
    public static void m960a(String str, String str2, String str3, int i) {
        C0413b.m944a().m949a(str, str2, str3, i);
    }

    /* renamed from: c */
    public final void m961c(String str) {
        C0413b c0413bM944a = C0413b.m944a();
        c0413bM944a.m948a(new RunnableC0416e(c0413bM944a, String.valueOf(c0413bM944a.m951b(this)) + "/" + str));
    }
}
