package com.cyo.comicrack.viewer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.widget.Button;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.C0998bi;
import com.cyo.common.view.C1136bc;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.dd */
/* loaded from: classes.dex */
public abstract class AbstractC0734dd extends PreferenceActivity {

    /* renamed from: a */
    private Class f2292a;

    /* renamed from: b */
    private String f2293b;

    /* renamed from: c */
    private int f2294c;

    /* renamed from: d */
    private int f2295d;

    /* renamed from: e */
    private Context f2296e;

    /* renamed from: f */
    private C0736df f2297f;

    /* renamed from: a */
    static /* synthetic */ int m1757a(AbstractC0734dd abstractC0734dd) {
        return abstractC0734dd.f2294c;
    }

    public AbstractC0734dd(Class cls, int i) {
        this.f2292a = cls;
        this.f2295d = i;
        this.f2293b = cls.getName();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2296e = getApplicationContext();
        setResult(0);
        Intent intent = getIntent();
        this.f2294c = intent.getExtras().getInt("appWidgetId", 0);
        if (this.f2294c == 0) {
            finish();
            return;
        }
        this.f2297f = new C0736df(this.f2296e, this.f2293b, this.f2294c);
        getPreferenceManager().setSharedPreferencesName(String.valueOf(this.f2293b) + this.f2294c);
        addPreferencesFromResource(this.f2295d);
        if ("android.appwidget.action.APPWIDGET_CONFIGURE".equals(intent.getAction())) {
            setContentView(C0804ft.preference_with_button);
            ((Button) findViewById(android.R.id.button1)).setOnClickListener(new ViewOnClickListenerC0735de(this));
        }
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (C0628f.f1889k) {
            C1136bc.m2411a(preferenceScreen, null, "widget_show_wifi");
            C1136bc.m2411a(preferenceScreen, null, "widget_comic_keywords");
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    protected void onDestroy() {
        C0736df c0736df = new C0736df(this.f2296e, this.f2293b, this.f2294c);
        AbstractC0733dc.m1755a(this.f2296e, this.f2292a, new int[]{this.f2294c}, (C0998bi.m2082a(this.f2297f.f2311m, c0736df.f2311m) && this.f2297f.f2307i == c0736df.f2307i) ? false : true);
        super.onDestroy();
    }
}
