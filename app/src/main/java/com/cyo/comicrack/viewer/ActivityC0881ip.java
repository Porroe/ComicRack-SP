package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.AbstractC0004ab;
import android.support.v4.app.AbstractC0081q;
import android.support.v4.app.DialogInterfaceOnCancelListenerC0072h;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.common.view.C1106a;
import com.cyo.common.view.C1145bl;
import com.cyo.common.view.C1151f;
import com.p004a.p012b.p013a.p014a.p015a.ActivityC0424m;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ip */
/* loaded from: classes.dex */
public class ActivityC0881ip extends ActivityC0424m {

    /* renamed from: s */
    protected C1106a f2676s;

    /* renamed from: u */
    private boolean f2678u;

    /* renamed from: v */
    private SharedPreferences f2679v;

    /* renamed from: q */
    public boolean f2674q = true;

    /* renamed from: n */
    private Bundle f2671n = null;

    /* renamed from: r */
    C0883ir f2675r = null;

    /* renamed from: o */
    private boolean f2672o = false;

    /* renamed from: p */
    private boolean f2673p = false;

    /* renamed from: t */
    private boolean f2677t = false;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.p004a.p012b.p013a.p014a.p015a.ActivityC0424m, android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(
                    android.window.OnBackInvokedDispatcher.PRIORITY_DEFAULT, this::onBackPressed);
        }
        m1871l();
        ComicRackApplication comicRackApplication = ComicRackApplication.f1954i;
        this.f2676s = new C1106a(this, ComicRackApplication.m1417l());
        if (ComicRackApplication.f1954i.m1440d()) {
            m1870c(bundle);
        } else {
            this.f2671n = bundle;
            startActivityForResult(new Intent(this, (Class<?>) SplashActivity.class), 1);
        }
    }

    /* renamed from: l */
    private void m1871l() {
        if (this.f2675r == null) {
            AbstractC0081q abstractC0081qD = m187d();
            this.f2675r = (C0883ir) abstractC0081qD.mo190a("dataFragment");
            if (this.f2675r == null) {
                AbstractC0004ab abstractC0004abMo191a = abstractC0081qD.mo191a();
                this.f2675r = new C0883ir();
                abstractC0004abMo191a.mo93a(this.f2675r, "dataFragment");
                abstractC0004abMo191a.mo89a();
            }
        }
    }

    /* renamed from: c */
    private void m1870c(Bundle bundle) {
        mo1399a(bundle);
        this.f2673p = true;
        this.f2672o = true;
        if (ComicRackApplication.f1954i.m1438c() != null) {
            this.f2675r.f2682b = ComicRackApplication.f1954i.m1438c().f1930j;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f2676s != null) {
            C1106a c1106a = this.f2676s;
            if (c1106a.f3558b != null) {
                for (Object entry : c1106a.f3558b) {
                    C1151f c1151f = (C1151f) entry;
                    if (c1151f.f3646g != null) {
                        c1151f.f3646g.mo2421a();
                    }
                }
            }
        }
        if (this.f2677t) {
            System.runFinalizersOnExit(true);
            System.exit(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            switch (i2) {
                case 0:
                case SplashActivity.RESULT_FOLDER_SELECTION_CANCELLED:
                    m1872m();
                    return;
                case SplashActivity.RESULT_LICENSE_CHECK_FAILED:
                    new AlertDialog.Builder(this).setTitle(C0806fv.license_check).setIcon(C0802fr.icon).setMessage(getString(C0806fv.failed_to_check_android_market_license)).setCancelable(false).setPositiveButton(C0806fv.close, new DialogInterfaceOnClickListenerC0882iq(this)).show();
                    break;
            }
            this.f2672o = true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m1869a(ActivityC0881ip activityC0881ip) {
        activityC0881ip.m1872m();
    }

    /* renamed from: m */
    private void m1872m() {
        this.f2677t = true;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.p004a.p012b.p013a.p014a.p015a.ActivityC0424m, android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onStart() {
        super.onStart();
        if (m1873n()) {
            m1879s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f2678u = true;
        if (m1873n()) {
            mo1485j();
            ComicRackApplication.f1954i.refreshAfterStartup(this);
        }
        if (this.f2676s != null) {
            this.f2676s.m2402c();
        }
        ComicRackApplication.f1954i.libraryRefresh().attach(this);
    }

    /* renamed from: n */
    private boolean m1873n() {
        ComicRackApplication.f1954i.m1425a((Activity) this);
        if (!this.f2672o) {
            return false;
        }
        if (!this.f2673p) {
            m1871l();
            m1870c(this.f2671n);
            try {
                m187d().mo194b();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f2671n = null;
        }
        mo1483h();
        if (this.f2676s != null) {
            this.f2676s.m2398a();
        }
        return true;
    }

    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (m1881u()) {
            mo1627a(configuration);
            if (this.f2676s != null) {
                this.f2676s.m2398a();
                this.f2676s.m2400b();
                this.f2676s.m2402c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onPause() {
        ComicRackApplication.f1954i.libraryRefresh().detach(this);
        super.onPause();
        this.f2678u = false;
        if (m1881u()) {
            mo1484i();
        }
        if (this.f2676s != null) {
            this.f2676s.m2400b();
        }
        ComicRackApplication.f1954i.m1443g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f2673p) {
            mo1630b(bundle);
        } else if (this.f2671n != null) {
            bundle.putAll(this.f2671n);
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onBackPressed() {
        if (m1881u()) {
            mo1486k();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.p004a.p012b.p013a.p014a.p015a.ActivityC0424m, android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onStop() {
        super.onStop();
        if (m1881u()) {
            mo1629a_();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 6, 0, C0806fv.preferences).setIcon(android.R.drawable.ic_menu_preferences);
        menu.add(0, 12, 0, C0806fv.about_comicrack).setIcon(C0802fr.ic_menu_about);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (mo1480a(new C0756dz(menuItem.getItemId()))) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: a */
    public boolean mo1480a(C0756dz c0756dz) {
        return ComicRackApplication.f1954i.m1434a(this, c0756dz, this.f2674q);
    }

    /* renamed from: p */
    public static ComicRackApplication m1874p() {
        return ComicRackApplication.f1954i;
    }

    /* renamed from: q */
    public static C0635m m1875q() {
        return ComicRackApplication.f1954i.m1438c();
    }

    /* renamed from: a */
    public final void m1877a(Object obj) {
        this.f2675r.f2681a = obj;
    }

    /* renamed from: a */
    public final void m1876a(DialogInterfaceOnCancelListenerC0072h dialogInterfaceOnCancelListenerC0072h, String str) {
        AbstractC0081q abstractC0081qD = m187d();
        Fragment fragmentMo190a = abstractC0081qD.mo190a(str);
        AbstractC0004ab abstractC0004abMo191a = abstractC0081qD.mo191a();
        if (fragmentMo190a != null) {
            abstractC0004abMo191a.mo92a(fragmentMo190a);
        }
        dialogInterfaceOnCancelListenerC0072h.m172a(abstractC0004abMo191a, str);
        m961c(str);
    }

    /* renamed from: a */
    protected void mo1399a(Bundle bundle) {
    }

    /* renamed from: h */
    protected void mo1483h() {
    }

    /* renamed from: j */
    protected void mo1485j() {
        ComicRackApplication.f1954i.m1436b();
        ComicRackApplication.f1954i.m1437b(this);
        m1880t();
    }

    /* renamed from: i */
    protected void mo1484i() {
        ComicRackApplication.f1954i.m1446m();
    }

    /* renamed from: a_ */
    protected void mo1629a_() {
    }

    /* renamed from: b */
    protected void mo1630b(Bundle bundle) {
    }

    /* renamed from: k */
    protected void mo1486k() {
        super.onBackPressed();
    }

    /* renamed from: a */
    protected void mo1627a(Configuration configuration) {
    }

    /* renamed from: r */
    protected final SharedPreferences m1878r() {
        if (this.f2679v == null) {
            this.f2679v = getPreferences(0);
        }
        return this.f2679v;
    }

    /* renamed from: s */
    public final void m1879s() {
        if (!ComicRackApplication.f1954i.m1444h()) {
            ComicRackApplication.f1954i.m1429a(this);
        } else {
            m1880t();
        }
    }

    /* renamed from: t */
    public final void m1880t() {
        if (this.f2678u) {
            C0635m c0635mM1438c = ComicRackApplication.f1954i.m1438c();
            if (c0635mM1438c != null) {
                boolean z = ComicRackApplication.f1954i.m1441e().getBoolean("general_library_use_volumes", true);
                if (c0635mM1438c.f1935o != z) {
                    c0635mM1438c.f1935o = z;
                    c0635mM1438c.m1395a(C0635m.f1921b);
                }
                if (c0635mM1438c.f1932l != C0635m.f1920a) {
                    c0635mM1438c.m1389a((Context) this);
                }
            }
            if (c0635mM1438c.f1930j != this.f2675r.f2682b) {
                mo1401e();
                this.f2675r.f2682b = c0635mM1438c.f1930j;
                if (ComicRackApplication.f1954i.m1438c() != null && ComicRackApplication.f1954i.m1438c().f1934n) {
                    new C1145bl(this, getString(C0806fv.free_version_book_limit, new Object[]{100})).m2415a().m2414a(1);
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo1401e() {
        return false;
    }

    /* renamed from: u */
    public final boolean m1881u() {
        return this.f2672o && this.f2673p;
    }

    /* renamed from: g */
    public void mo1403g() {
    }
}
