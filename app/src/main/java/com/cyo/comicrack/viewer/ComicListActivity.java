package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.common.C0951ag;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class ComicListActivity extends AbstractActivityC0773ep {

    /* renamed from: o */
    private InterfaceC0753dw f1947o;

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: a */
    public final void mo1399a(Bundle bundle) {
        super.mo1399a(bundle);
        setContentView(C0804ft.comic_list);
        if (initializeLibraryInterface()) {
            LibraryInterface.installHeader(this, C0803fs.comicListContainer);
            SystemBarInsets.applyToContent(this);
        }
        this.f2676s.m2395a(C0803fs.comicListContainer, C0800fp.comic_list_background_dark, -1);
        this.f1947o = new C0874ii(this, C0681be.class, C0803fs.comicListPager, C0803fs.comicListPagerTitle, null);
        this.f1947o.mo1810h();
        this.f1947o.mo1805c().setPageMargin(getResources().getDimensionPixelSize(C0801fq.list_page_margin));
        this.f1947o.mo1805c().setPageMarginDrawable(C0800fp.comic_list_background_dark);
        Intent intent = getIntent();
        this.f1947o.mo1800a(ComicRackApplication.f1954i.m1438c(), intent == null ? null : intent.getStringExtra("list_folder_id"), true);
        this.f1947o.mo1801a(intent != null ? intent.getStringExtra("comic_folder_id") : null, false);
        C0951ag.m1995a().mo2018a((Activity) this);
        m1821a(intent);
    }

    @Override
    C0575ak getDisplayedLibraryCollection() {
        return f1947o == null ? null : f1947o.mo1807e();
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip, android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onBackPressed() {
        if (LibraryInterface.closeToolbarSearch(this)) {
            return;
        }
        C0681be c0681be = (C0681be) this.f1947o.mo1803b();
        if (c0681be == null || !c0681be.m1732b()) {
            super.onBackPressed();
        }
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: e */
    public final boolean mo1401e() {
        C0575ak c0575ak = (C0575ak) ComicRackApplication.f1954i.m1438c().m1242b(this.f1947o.mo1806d().f1750p, false);
        C0681be c0681be = (C0681be) this.f1947o.mo1803b();
        if (c0575ak == null || c0681be == null) {
            finish();
        } else {
            this.f1947o.mo1800a(ComicRackApplication.f1954i.m1438c(), null, true);
        }
        return super.mo1401e();
    }

    @Override // com.cyo.comicrack.viewer.AbstractActivityC0773ep
    /* renamed from: a */
    protected final void mo1400a(C0575ak c0575ak, boolean z) {
        if (c0575ak == null || c0575ak.mo1210e() == null) {
            finish();
        } else if (z) {
            m1822b(c0575ak);
        } else {
            this.f1947o.mo1800a(ComicRackApplication.f1954i.m1438c(), c0575ak.mo1210e().f1750p, false);
            this.f1947o.mo1801a(c0575ak.f1750p, false);
        }
    }

    @Override // com.cyo.comicrack.viewer.AbstractActivityC0773ep
    /* renamed from: f */
    protected final C0681be mo1402f() {
        return (C0681be) this.f1947o.mo1803b();
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: g */
    public final void mo1403g() {
        super.mo1403g();
        if (this.f1947o != null) {
            this.f1947o.mo1799a();
        }
    }
}
