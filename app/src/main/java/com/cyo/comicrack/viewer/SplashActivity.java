package com.cyo.comicrack.viewer;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Html;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.C0951ag;
import com.cyo.common.view.InterfaceC1116aj;
import com.p004a.p012b.p013a.p014a.p015a.ActivityC0423l;
import com.p004a.p012b.p016b.p017a.C0454a;
import com.p004a.p012b.p016b.p017a.C0475t;
import com.p004a.p012b.p016b.p017a.ServiceConnectionC0464i;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class SplashActivity extends ActivityC0423l implements InterfaceC1116aj {
    private static final int CHOOSE_LIBRARY_FOLDER = 1002;
    static final int RESULT_FOLDER_SELECTION_CANCELLED = 100;
    static final int RESULT_LICENSE_CHECK_FAILED = 101;


    /* renamed from: a */
    private ProgressBar f2099a;

    /* renamed from: b */
    private TextView f2100b;

    /* renamed from: c */
    private Button f2101c;

    /* renamed from: d */
    private AlertDialog f2102d;

    /* renamed from: e */
    private AsyncTask f2103e;

    /* renamed from: f */
    private ServiceConnectionC0464i f2104f;

    /* renamed from: g */
    private boolean f2105g;

    /* renamed from: h */
    private boolean f2106h;

    /* renamed from: i */
    private boolean f2107i;

    /* renamed from: b */
    static /* synthetic */ ProgressBar m1640b(SplashActivity splashActivity) {
        return splashActivity.f2099a;
    }

    /* renamed from: f */
    static /* synthetic */ TextView m1644f(SplashActivity splashActivity) {
        return splashActivity.f2100b;
    }

    /* renamed from: g */
    static /* synthetic */ Button m1645g(SplashActivity splashActivity) {
        return splashActivity.f2101c;
    }

    /* renamed from: a */
    static /* synthetic */ AlertDialog m1636a(SplashActivity splashActivity) {
        return splashActivity.f2102d;
    }

    /* renamed from: a */
    static /* synthetic */ void m1638a(SplashActivity splashActivity, AlertDialog alertDialog) {
        splashActivity.f2102d = alertDialog;
    }

    /* renamed from: c */
    static /* synthetic */ void m1641c(SplashActivity splashActivity) {
        splashActivity.f2103e = null;
    }

    /* renamed from: d */
    static /* synthetic */ void m1642d(SplashActivity splashActivity) {
        splashActivity.f2105g = true;
    }

    /* renamed from: h */
    static /* synthetic */ void m1646h(SplashActivity splashActivity) {
        splashActivity.f2106h = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m1639a(SplashActivity splashActivity, boolean z) {
        splashActivity.f2107i = z;
    }

    @Override // com.p004a.p012b.p013a.p014a.p015a.ActivityC0423l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(
                    android.window.OnBackInvokedDispatcher.PRIORITY_DEFAULT, this::onBackPressed);
        }
        if (ComicRackApplication.f1954i.m1440d()) {
            setResult(0);
            finish();
            return;
        }
        setResult(-1);
        setContentView(C0804ft.splash_screen);
        SystemBarInsets.applyToContent(this);
        this.f2099a = (ProgressBar) findViewById(C0803fs.splashProgress);
        this.f2099a.setProgress(0);
        this.f2100b = (TextView) findViewById(C0803fs.splashMessage);
        this.f2100b.setVisibility(4);
        this.f2101c = (Button) findViewById(C0803fs.splashChooseFolder);
        this.f2101c.setOnClickListener(view ->
                startActivityForResult(new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE), CHOOSE_LIBRARY_FOLDER));
        ((TextView) findViewById(C0803fs.splashEdition)).setText(Html.fromHtml(String.valueOf(getString(C0628f.f1889k ? C0806fv.free_edition : C0806fv.full_edition)) + " <b>V " + C0951ag.m2003d(this) + "</b>"));
        this.f2099a.post(this::startLibraryInitialization);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent result) {
        super.onActivityResult(requestCode, resultCode, result);
        if (requestCode == CHOOSE_LIBRARY_FOLDER && resultCode == RESULT_OK) {
            android.net.Uri folder = com.cyo.comicrack.storage.ComicDocuments.persistReadGrant(result);
            if (folder != null) {
                ComicRackApplication.f1954i.setLibraryFolder("general_library_path", folder);
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f2104f != null) {
            this.f2104f.m1073a();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.f2107i) {
            setResult(0);
            if (this.f2103e != null) {
                this.f2103e.cancel(true);
            }
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m1637a(SplashActivity splashActivity, int i, boolean z) {
        splashActivity.f2100b.post(new RunnableC0872ig(splashActivity, i, z));
    }

    /* renamed from: e */
    static /* synthetic */ void m1643e(SplashActivity splashActivity) {
        if (splashActivity.f2105g && splashActivity.f2106h) {
            splashActivity.finish();
        }
    }

    @Override // com.cyo.common.view.InterfaceC1116aj
    /* renamed from: a */
    public final void mo1647a(boolean z) {
        if (!z) {
            setResult(RESULT_FOLDER_SELECTION_CANCELLED);
            finish();
            return;
        }
        startLibraryInitialization();
    }

    private void startLibraryInitialization() {
        this.f2103e = new AsyncTaskC0870ie(this).execute(this);
        if (C0628f.f1889k) {
            this.f2106h = true;
            return;
        }
        this.f2104f = new ServiceConnectionC0464i(this, new C0475t(this, new C0454a(ComicRackApplication.f1948a, getPackageName(), Settings.Secure.getString(getContentResolver(), "android_id"))), getString(C0806fv.public_market_key));
        this.f2104f.m1074a(new C0873ih(this));
    }
}
