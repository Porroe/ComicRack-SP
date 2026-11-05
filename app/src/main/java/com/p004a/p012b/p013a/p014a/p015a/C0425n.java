package com.p004a.p012b.p013a.p014a.p015a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;

/* compiled from: DontLook */
/* renamed from: com.a.b.a.a.a.n */
/* loaded from: classes.dex */
public class C0425n extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0413b.m944a().m947a((Context) this);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        C0413b.m944a().m945a((Activity) this);
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        Object objOnRetainNonConfigurationInstance = super.onRetainNonConfigurationInstance();
        C0413b.m944a().f1329i = false;
        return objOnRetainNonConfigurationInstance;
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        C0413b.m944a().m952c();
    }
}
