package com.cyo.comicrack.viewer;

import com.cyo.comicrack.storage.ComicDocuments;
import android.net.Uri;
import android.content.Intent;
import android.content.DialogInterface;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.comicrack.p019a.InterfaceC0584at;
import com.cyo.common.C0951ag;
import com.cyo.common.C0999bj;
import com.cyo.common.C1006bq;
import com.cyo.common.EnumC0993bd;
import com.cyo.common.view.Sidebar;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class LibraryActivity extends AbstractActivityC0773ep implements InterfaceC0786fb {
    private static final int OPEN_COMIC = 1001;
    private static final int CHOOSE_LIBRARY_FOLDER = 1002;
    private static final int REFRESH_LIBRARY = 1003;


    /* renamed from: o */
    private InterfaceC0753dw f1990o;

    /* renamed from: p */
    private InterfaceC0753dw f1991p;

    /* renamed from: t */
    private Sidebar f1992t;

    /* renamed from: w */
    private boolean f1995w;

    /* renamed from: u */
    private C0772eo f1993u = null;

    /* renamed from: v */
    private boolean f1994v = false;

    /* renamed from: x */
    private long f1996x = 0;

    /* renamed from: b */
    static /* synthetic */ InterfaceC0753dw m1472b(LibraryActivity libraryActivity) {
        return libraryActivity.f1990o;
    }

    /* renamed from: a */
    static /* synthetic */ InterfaceC0753dw m1470a(LibraryActivity libraryActivity) {
        return libraryActivity.f1991p;
    }

    /* renamed from: c */
    static /* synthetic */ Sidebar m1473c(LibraryActivity libraryActivity) {
        return libraryActivity.f1992t;
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: a */
    public final void mo1399a(Bundle bundle) {
        super.mo1399a(bundle);
        this.f2674q = !C0951ag.m1997a(this, EnumC0993bd.Large);
        this.f2415n = true;
        m1878r();
        setContentView(LibraryInterface.isMaterial(this) ? R.layout.material_library : C0804ft.library);
        if (initializeLibraryInterface()) {
            LibraryInterface.installHeader(this, C0803fs.libraryContainer);
        }
        SystemBarInsets.applyToContent(this);
        this.f2676s.m2395a(C0803fs.libraryContainer, C0800fp.comic_list_background_dark, -1);
        this.f1993u = (C0772eo) this.f2675r.f2681a;
        if (this.f1993u == null) {
            this.f1993u = new C0772eo();
            m1877a(this.f1993u);
        }
        if (C0951ag.m2004d()) {
            C0951ag.m1995a().mo2018a((Activity) this);
        }
        if (this.f1993u == null || this.f1990o == null) {
            if (findViewById(C0803fs.libraryListPager) != null) {
                this.f1990o = new C0874ii(this, C0776es.class, C0803fs.libraryListPager, C0803fs.libraryListPagerTitle, new C0758ea(this));
                this.f1990o.mo1805c().setPageMargin(getResources().getDimensionPixelSize(C0801fq.list_page_margin));
                this.f1990o.mo1805c().setPageMarginDrawable(C0800fp.comic_list_background_dark);
            } else {
                try {
                    this.f1990o = new C0866ia(this, C0776es.class, C0803fs.libraryListFragment);
                    ((C0776es) this.f1990o.mo1803b()).m1825a(new ViewOnClickListenerC0760ec(this));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (findViewById(C0803fs.comicListPager) == null) {
                this.f1990o.mo1802a(false);
            } else {
                this.f1991p = new C0874ii(this, C0681be.class, C0803fs.comicListPager, C0803fs.comicListPagerTitle, new LibraryCollectionPageListener(this));
                this.f1990o.mo1802a(true);
                this.f1991p.mo1805c().setPageMargin(getResources().getDimensionPixelSize(C0801fq.list_page_margin));
                this.f1991p.mo1805c().setPageMarginDrawable(C0800fp.comic_list_background_dark);
            }
            View viewFindViewById = findViewById(C0803fs.libraryListFragmentContainer);
            if (viewFindViewById instanceof Sidebar) {
                this.f1992t = (Sidebar) viewFindViewById;
                this.f1992t.setOverlayWidth(getResources().getDimensionPixelOffset(C0801fq.sidebar_shadow_width) + getResources().getDimensionPixelOffset(C0801fq.sidebar_extra));
                this.f1992t.setOnSidebarListener(new C0762ee(this));
            }
            this.f1994v = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: h */
    protected final void mo1483h() {
        boolean z = true;
        super.mo1483h();
        if (!LibraryInterface.isMaterial(this)) {
            m1471a(m1878r().getBoolean("sidebar_visible", true) || this.f1991p == null, false);
            if (!m1878r().getBoolean("sidebar_pinned", false) && this.f1991p != null) {
                z = false;
            }
            m1482b(z);
        }
        if (this.f1994v) {
            String string = m1878r().getString("current_library_list", null);
            String string2 = m1878r().getString("current_comic_list", null);
            m1475d(string);
            m1476e(string2);
            if (!m1821a(getIntent())) {
                try {
                    if (ComicRackApplication.f1954i.m1441e().getBoolean("general_startup_open_last", false)) {
                        InterfaceC0571ag interfaceC0571agM1242b = string2 == null ? null : ComicRackApplication.f1954i.m1438c().m1242b(string2, false);
                        if (interfaceC0571agM1242b != null && (interfaceC0571agM1242b instanceof C0575ak)) {
                            C0575ak c0575ak = (C0575ak) interfaceC0571agM1242b;
                            if (c0575ak.m1987y() == 0 && (c0575ak instanceof InterfaceC0584at)) {
                                ((InterfaceC0584at) c0575ak).mo1252j();
                            }
                            ComicRackApplication.f1954i.m1423a(this, c0575ak);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ComicRackApplication.f1954i.m1432a(new RunnableC0764eg(this));
            }
        } else {
            AbstractC0782ey abstractC0782eyMo1803b = this.f1990o.mo1803b();
            if (abstractC0782eyMo1803b != null) {
                abstractC0782eyMo1803b.m1840e(this.f1990o.mo1807e());
            }
        }
        this.f1994v = false;
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: i */
    protected final void mo1484i() {
        super.mo1484i();
        SharedPreferences.Editor editorEdit = m1878r().edit();
        editorEdit.putString("current_library_list", this.f1990o.mo1808f());
        if (this.f1991p != null) {
            editorEdit.putString("current_comic_list", this.f1991p.mo1808f());
        }
        if (!LibraryInterface.isMaterial(this)) {
            editorEdit.putBoolean("sidebar_visible", m1478n());
            editorEdit.putBoolean("sidebar_pinned", m1487l());
        }
        editorEdit.commit();
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: j */
    protected final void mo1485j() {
        super.mo1485j();
        LibraryInterface.updateResumeCard(this);
        LibraryInterface.updateCollectionTitle(this);
    }

    @Override // com.cyo.comicrack.viewer.AbstractActivityC0773ep, com.cyo.comicrack.viewer.ActivityC0881ip, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (!LibraryInterface.isMaterial(this)) {
            menu.add(0, 13, 0, C0806fv.quit).setIcon(C0802fr.ic_menu_stop);
        }
        return true;
    }

    @Override // com.cyo.comicrack.viewer.AbstractActivityC0773ep, com.cyo.comicrack.viewer.ActivityC0881ip, com.cyo.comicrack.viewer.InterfaceC0787fc
    /* renamed from: a */
    public final boolean mo1480a(C0756dz c0756dz) {
        C0575ak c0575ak = c0756dz.m1814a() instanceof C0575ak ? (C0575ak) c0756dz.m1814a() : null;
        switch (c0756dz.f2391a) {
            case 2:
                if (c0575ak != null && !(c0575ak instanceof C0572ah)) {
                    m960a("Library", "Comic List", "Show", 0);
                    m1479a(c0575ak, false, false, true);
                    if (!m1487l()) {
                        m1471a(false, true);
                    }
                    return true;
                }
                break;
            case 13:
                m960a("Application", "Quit", "", 0);
                this.f1995w = true;
                finish();
                return true;
            case 15:
                if (c0575ak != null) {
                    m960a("Library", "Comic List", "Delete", 0);
                    C0575ak c0575akMo1210e = c0575ak.mo1210e();
                    if (c0575akMo1210e != null && c0575akMo1210e.f1751q) {
                        c0575akMo1210e.m1982c(c0575ak);
                        m1477m();
                        break;
                    }
                }
                break;
        }
        return super.mo1480a(c0756dz);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.cyo.comicrack.viewer.ActivityC0881ip, android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f1995w) {
            ComicRackApplication.m1416k();
        }
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: e */
    public final boolean mo1401e() {
        m1477m();
        LibraryInterface.updateResumeCard(this);
        LibraryInterface.updateCollectionTitle(this);
        return true;
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case OPEN_COMIC:
                startActivityForResult(new Intent(Intent.ACTION_OPEN_DOCUMENT)
                        .addCategory(Intent.CATEGORY_OPENABLE).setType("*/*"), OPEN_COMIC);
                return true;
            case CHOOSE_LIBRARY_FOLDER:
                chooseLibraryFolder();
                return true;
            case REFRESH_LIBRARY:
                ComicRackApplication.f1954i.m1429a(this);
                return true;
        }
        if (C0951ag.m2004d() && (menuItem.getItemId() == 16908332 || menuItem.getItemId() == 100)) {
            m1471a(!m1478n(), true);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    C0575ak getDisplayedLibraryCollection() {
        return f1991p == null ? null : f1991p.mo1807e();
    }

    @Override
    void showUnfilteredLibrary(C0575ak allComics) {
        m1481b(allComics.mo1210e(), true);
        m1479a(allComics, true, true, false);
    }

    void toggleLibrarySidebar() {
        m1471a(!m1478n(), true);
    }

    void chooseLibraryFolder() {
        startActivityForResult(new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE), CHOOSE_LIBRARY_FOLDER);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent result) {
        super.onActivityResult(requestCode, resultCode, result);
        if (resultCode != RESULT_OK || result == null || result.getData() == null) {
            return;
        }
        if (requestCode == CHOOSE_LIBRARY_FOLDER) {
            Uri folder = ComicDocuments.persistReadGrant(result);
            if (folder != null) {
                ComicRackApplication.f1954i.setLibraryFolder("general_library_path", folder);
                ComicRackApplication.f1954i.m1429a(this);
            }
        } else if (requestCode == OPEN_COMIC) {
            ComicDocuments.persistReadGrant(result);
            startActivity(new Intent(this, ReaderActivity.class).setData(result.getData())
                    .addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION));
        }
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0786fb
    public void onCaptionClick(View view) {
        if (view.getId() == C0803fs.libraryListCaption) {
            int iV = ((C0776es) this.f1990o.mo1803b()).m1829V();
            ArrayList arrayList = new ArrayList();
            for (Object entry : ComicRackApplication.f1954i.m1438c().m1986x()) {
                InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) entry;
                arrayList.add(new C1006bq(interfaceC0571ag.mo1213h(), interfaceC0571ag.mo1211f(), interfaceC0571ag.mo1212g(), interfaceC0571ag));
            }
            C0999bj c0999bj = new C0999bj(arrayList, C0804ft.super_menu_item);
            c0999bj.f2946d = new C0759eb(this);
            c0999bj.m2096a(view, iV);
        }
    }

    @Override // com.cyo.comicrack.viewer.AbstractActivityC0773ep
    /* renamed from: a */
    protected final void mo1400a(C0575ak c0575ak, boolean z) {
        if (c0575ak != null && c0575ak.mo1210e() != null) {
            if (this.f1991p != null && this.f1993u != null && this.f1990o != null && this.f1990o.mo1807e() != null && this.f1991p != null && this.f1991p.mo1807e() != null) {
                if (this.f1993u.f2414b == null) {
                    this.f1993u.f2414b = new Stack();
                }
                this.f1993u.f2414b.push(new C0771en(this.f1990o.mo1807e(), this.f1991p.mo1807e()));
            }
            new Handler().post(new RunnableC0766ei(this, c0575ak));
        }
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: k */
    public final void mo1486k() {
        boolean z;
        if (this.f1991p == null || !((C0681be) this.f1991p.mo1803b()).m1732b()) {
            if (this.f1993u != null && this.f1993u.f2414b != null) {
                C0635m c0635mM1438c = ComicRackApplication.f1954i.m1438c();
                while (true) {
                    if (!this.f1993u.f2414b.isEmpty()) {
                        C0771en c0771en = (C0771en) this.f1993u.f2414b.pop();
                        C0575ak c0575ak = (C0575ak) c0635mM1438c.m1242b(c0771en.f2411a, false);
                        C0575ak c0575ak2 = (C0575ak) c0635mM1438c.m1242b(c0771en.f2412b, false);
                        if (c0575ak != null && c0575ak2 != null) {
                            m1481b(c0575ak, false);
                            m1479a(c0575ak2, true, true, false);
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            if (Math.abs(System.currentTimeMillis() - this.f1996x) < 3000) {
                super.mo1486k();
            } else {
                Toast.makeText(this, C0806fv.press_back_again_to_exit, 0).show();
                this.f1996x = System.currentTimeMillis();
            }
        }
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip, android.support.v4.app.ActivityC0076l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        RelativeLayout.LayoutParams layoutParams;
        super.onConfigurationChanged(configuration);
        View viewFindViewById = findViewById(C0803fs.libraryListFragmentContainer);
        if (viewFindViewById != null && (layoutParams = (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams()) != null) {
            int i = layoutParams.width;
            layoutParams.width = (int) getResources().getDimension(C0801fq.library_list_width);
            if (layoutParams.leftMargin < 0) {
                layoutParams.leftMargin = (i - layoutParams.width) + layoutParams.leftMargin;
            }
        }
    }

    static void showEmptyLibraryPrompt(LibraryActivity activity) {
        new com.google.android.material.dialog.MaterialAlertDialogBuilder(LibraryInterface.theme(activity))
                .setTitle(R.string.library_empty_title)
                .setMessage(R.string.library_empty_message)
                .setPositiveButton(R.string.select_folder,
                        (dialog, button) -> activity.chooseLibraryFolder())
                .setNeutralButton(R.string.do_not_show_again, (dialog, button) ->
                        activity.m1878r().edit().putBoolean("show_empty_folder_help", false).apply())
                .setNegativeButton(R.string.library_not_now, null)
                .show();
    }

    /* renamed from: m */
    private void m1477m() {
        m1475d(this.f1990o.mo1808f());
        if (this.f1991p != null) {
            m1476e(this.f1991p.mo1808f());
        }
    }

    /* renamed from: b */
    public final void m1481b(C0575ak c0575ak, boolean z) {
        this.f1990o.mo1800a(ComicRackApplication.f1954i.m1438c(), ComicRackApplication.f1954i.m1438c().f1750p, z);
        this.f1990o.mo1801a(c0575ak.f1750p, false);
        if (this.f1991p != null) {
            this.f1991p.mo1800a(ComicRackApplication.f1954i.m1438c(), c0575ak.f1750p, z);
        }
    }

    /* renamed from: d */
    private void m1475d(String str) {
        C0635m c0635mM1438c = ComicRackApplication.f1954i.m1438c();
        if (c0635mM1438c != null) {
            C0575ak c0575ak = (C0575ak) c0635mM1438c.m1242b(str, false);
            if (c0575ak == null) {
                c0575ak = (C0575ak) c0635mM1438c.m1986x().get(0);
            }
            m1481b(c0575ak, true);
        }
    }

    /* renamed from: a */
    public static C0575ak m1469a(C0575ak c0575ak) {
        return (C0575ak) (c0575ak.m1987y() > 0 ? (InterfaceC0571ag) c0575ak.m1986x().get(0) : null);
    }

    /* renamed from: a */
    public final void m1479a(C0575ak c0575ak, boolean z, boolean z2, boolean z3) {
        if (this.f1991p == null) {
            if (!z) {
                SharedPreferences.Editor editorEdit = m1878r().edit();
                editorEdit.putString("current_comic_list", c0575ak.f1750p);
                editorEdit.commit();
                m1822b(c0575ak);
                return;
            }
            return;
        }
        this.f1991p.mo1801a(c0575ak == null ? null : c0575ak.f1750p, z3);
        if (LibraryInterface.isMaterial(this) && c0575ak != null) {
            LibraryInterface.setCollectionTitle(this, c0575ak);
        }
        ((C0776es) this.f1990o.mo1803b()).m1840e(c0575ak);
        if (z2) {
            ((C0776es) this.f1990o.mo1803b()).m1830W();
        }
    }

    /* renamed from: e */
    private void m1476e(String str) {
        C0575ak c0575akMo1807e;
        C0635m c0635mM1438c = ComicRackApplication.f1954i.m1438c();
        if (c0635mM1438c != null) {
            C0575ak c0575ak = (C0575ak) c0635mM1438c.m1242b(str, false);
            if (c0575ak == null && (c0575akMo1807e = this.f1990o.mo1807e()) != null && c0575akMo1807e.m1987y() > 0) {
                c0575ak = (C0575ak) c0575akMo1807e.m1983d(0);
            }
            if (c0575ak != null) {
                m1479a(c0575ak, true, true, false);
            }
        }
    }

    /* renamed from: a */
    private void m1471a(boolean z, boolean z2) {
        if (this.f1992t != null) {
            this.f1992t.m2391a(z, z2);
        }
    }

    /* renamed from: n */
    private boolean m1478n() {
        return this.f1992t != null && this.f1992t.m2392a();
    }

    /* renamed from: b */
    public final void m1482b(boolean z) {
        View viewFindViewById;
        if (z != m1487l() && (viewFindViewById = findViewById(C0803fs.comicListPager)) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams();
            layoutParams.addRule(1, z ? C0803fs.libraryListFragmentContainer : 0);
            viewFindViewById.setLayoutParams(layoutParams);
            ((C0776es) this.f1990o.mo1803b()).m1826c(z);
        }
    }

    public boolean supportsSidebarPinning() {
        return !LibraryInterface.isMaterial(this)
                && findViewById(C0803fs.libraryListFragmentContainer) instanceof Sidebar
                && findViewById(C0803fs.comicListPager) != null;
    }

    /* renamed from: l */
    public final boolean m1487l() {
        View viewFindViewById = findViewById(C0803fs.comicListPager);
        if (viewFindViewById != null && ((RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams()).getRules()[1] != 0) {
            return true;
        }
        return false;
    }

    @Override // com.cyo.comicrack.viewer.AbstractActivityC0773ep
    /* renamed from: f */
    protected final C0681be mo1402f() {
        if (this.f1991p == null) {
            return null;
        }
        return (C0681be) this.f1991p.mo1803b();
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: g */
    public final void mo1403g() {
        super.mo1403g();
        if (this.f1991p != null) {
            this.f1991p.mo1799a();
        }
    }
}
