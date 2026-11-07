package com.cyo.comicrack.viewer;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p020a.C0535cc;
import com.cyo.common.C0951ag;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ep */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0773ep extends ActivityC0881ip implements InterfaceC0787fc {

    private Boolean materialLibrary;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        if (LibraryInterface.isMaterial(this)) {
            boolean dark = (getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK)
                    == Configuration.UI_MODE_NIGHT_YES;
            setTheme(dark ? android.R.style.Theme_Material : android.R.style.Theme_Material_Light);
        }
        super.onCreate(savedInstanceState);
    }

    final boolean initializeLibraryInterface() {
        materialLibrary = LibraryInterface.isMaterial(this);
        return materialLibrary;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (materialLibrary != null && materialLibrary != LibraryInterface.isMaterial(this)) {
            recreate();
            return;
        }
        LibraryInterface.updateCollectionTitle(this);
    }

    @Override
    public void onBackPressed() {
        if (!LibraryInterface.closeCollectionSheet(this)) {
            super.onBackPressed();
        }
    }

    abstract C0575ak getDisplayedLibraryCollection();

    private LibraryCollectionSheet collectionSheet;

    void openCollectionSheet() {
        if (collectionSheet == null) {
            collectionSheet = new LibraryCollectionSheet(this);
        }
        collectionSheet.show();
    }

    boolean closeCollectionSheet() {
        if (collectionSheet == null || !collectionSheet.isShowing()) {
            return false;
        }
        collectionSheet.dismiss();
        return true;
    }

    void selectLibraryCollection(C0575ak collection) {
        LibraryInterface.setCollectionTitle(this, collection);
        if (this instanceof LibraryActivity) {
            ((LibraryActivity) this).m1481b(collection.mo1210e(), true);
            ((LibraryActivity) this).m1479a(collection, false, true, false);
        } else {
            mo1400a(collection, false);
        }
    }

    void submitLibrarySearch(String query) {
        C0575ak results = ComicRackApplication.f1954i.m1438c().m1393a(query, true);
        selectLibraryCollection(results);
        ComicRackApplication application = ComicRackApplication.f1954i;
        C0724cu settings = application.m1442f();
        settings.f2266b = application.m1438c().m1394a();
        application.m1441e().edit().putString("config", settings.toString()).apply();
    }

    @Override
    public void onDestroy() {
        if (collectionSheet != null) {
            collectionSheet.dismiss();
        }
        super.onDestroy();
    }

    void clearMaterialSearch() {
        if (C0635m.isSearchResult(getDisplayedLibraryCollection())) {
            C0575ak allComics = ComicRackApplication.f1954i.m1438c().getAllComics();
            if (allComics != null) {
                showUnfilteredLibrary(allComics);
            }
        }
    }

    void showUnfilteredLibrary(C0575ak allComics) {
        mo1400a(allComics, false);
    }

    /* renamed from: n */
    public boolean f2415n;

    /* renamed from: a */
    protected abstract void mo1400a(C0575ak c0575ak, boolean z);

    /* renamed from: f */
    protected abstract C0681be mo1402f();

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (LibraryInterface.isMaterial(this)) {
            return false;
        }
        MenuItem menuItemAdd = menu.add(0, 8, 0, C0806fv.search);
        menuItemAdd.setIcon(android.R.drawable.ic_menu_search);
        C0951ag.m1995a().mo2019a(this, menuItemAdd);
        MenuItem menuItemAdd2 = menu.add(0, 7, 0, C0806fv.continue_reading);
        if (!C0951ag.m2004d()) {
            menuItemAdd2.setIcon(C0802fr.ic_menu_read);
        } else {
            menuItemAdd2.setIcon(C0802fr.ab_continue);
            C0951ag.m1995a().mo2024a(menuItemAdd2);
        }
        menu.add(0, 14, 0, C0806fv.request_wifi_sync).setIcon(C0802fr.ic_menu_wifi);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean z = !getResources().getBoolean(C0799fo.showLibraryButtons);
        MenuItem menuItemFindItem = menu.findItem(14);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(z && ComicRackApplication.f1954i.m1433a());
        }
        MenuItem menuItemFindItem2 = menu.findItem(1);
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(z);
        }
        MenuItem menuItemFindItem3 = menu.findItem(7);
        if (menuItemFindItem3 != null) {
            menuItemFindItem3.setVisible(mo1402f() != null);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        if (m1881u()) {
            m1821a(intent);
        }
    }

    /* renamed from: a */
    protected final boolean m1821a(Intent intent) {
        C0575ak c0575ak;
        InterfaceC0571ag interfaceC0571agM1244c;
        C0575ak c0575ak2;
        String string;
        String str = null;
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if ("android.intent.action.SEARCH".equals(action)) {
            mo1400a(ComicRackApplication.f1954i.m1438c().m1393a(intent.getStringExtra("query"), true), false);
            return true;
        }
        if ("android.intent.action.VIEW".equals(action)) {
            String lastPathSegment = intent.getData().getLastPathSegment();
            if (lastPathSegment == null && (string = intent.getExtras().getString("ReadBookId")) != null) {
                lastPathSegment = "Book=" + string;
            }
            if (lastPathSegment == null) {
                return false;
            }
            String[] strArrSplit = lastPathSegment.split("=", 2);
            if (strArrSplit.length != 2) {
                C0505b c0505bM1390a = ComicRackApplication.f1954i.m1438c().m1390a(intent.getData());
                if (c0505bM1390a == null) {
                    return false;
                }
                ComicRackApplication.f1954i.m1438c();
                startActivity(C0635m.m1380a(this, ReaderActivity.class, c0505bM1390a, null, false));
                return true;
            }
            String str2 = strArrSplit[0];
            String strDecode = Uri.decode(strArrSplit[1]);
            if (str2.equals("Book")) {
                C0505b c0505bM1391a = ComicRackApplication.f1954i.m1438c().m1391a(strDecode);
                if (c0505bM1391a == null) {
                    return false;
                }
                ComicRackApplication.f1954i.m1438c();
                startActivity(C0635m.m1380a(this, ReaderActivity.class, c0505bM1391a, null, false));
                if (!this.f2415n) {
                    finish();
                }
                return true;
            }
            if (str2.equals("Caption")) {
                str = "3D8E0FCA-079F-4E69-B2C5-56BE06153769";
                strDecode = C0535cc.m1161d(strDecode).m1173d(ComicRackApplication.f1954i.m1438c().f1935o);
            } else {
                if (str2.equals("FindBookInList")) {
                    String[] strArrSplit2 = strDecode.split(",");
                    if (strArrSplit2.length == 2 && (c0575ak = (C0575ak) ComicRackApplication.f1954i.m1438c().m1244c(strArrSplit2[0])) != null && (interfaceC0571agM1244c = c0575ak.m1244c(strArrSplit2[1])) != null) {
                        str = strArrSplit2[0];
                        strDecode = interfaceC0571agM1244c.mo1210e().mo1209d();
                    }
                    return false;
                }
                if (str2.equals("AlternateSeries")) {
                    str = "3D8E0FCA-079F-4E69-B2C6-56BE06153769";
                } else if (str2.equals("Writer")) {
                    str = "3D8E0FCA-079F-4E69-B2C8-56BE06153769";
                } else if (str2.equals("Artists")) {
                    str = "3D8E0FCA-079F-4E69-B2C9-56BE06153769";
                } else if (str2.equals("Genre")) {
                    str = "3D8E0FCA-079F-4E69-B2CA-56BE06153769";
                } else if (str2.equals("Publisher")) {
                    str = "3D8E0FCA-079F-4E69-B2CC-56BE06153769";
                }
            }
            if (str != null && (c0575ak2 = (C0575ak) ComicRackApplication.f1954i.m1438c().m1244c(str)) != null) {
                mo1400a((C0575ak) c0575ak2.m1245c(strDecode, false), false);
                return true;
            }
        }
        return false;
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip, com.cyo.comicrack.viewer.InterfaceC0787fc
    /* renamed from: a */
    public boolean mo1480a(C0756dz c0756dz) {
        InterfaceC0571ag interfaceC0571agM1242b;
        InterfaceC0571ag interfaceC0571agM1242b2;
        switch (c0756dz.f2391a) {
            case 7:
                m960a("ComicList", "Continue", "", 0);
                C0681be c0681beMo1402f = mo1402f();
                if (c0681beMo1402f == null) {
                    return true;
                }
                c0681beMo1402f.m1729a(ComicRackApplication.f1954i.m1423a(this, c0681beMo1402f.m1836ab()));
                return true;
            case 8:
                onSearchRequested();
                return true;
            case 9:
                C0575ak c0575akM1424a = ComicRackApplication.f1954i.m1424a("3D8E0FCA-079F-4E69-B2C5-56BE06153769");
                if (c0575akM1424a == null || !c0756dz.m1817d() || (interfaceC0571agM1242b2 = c0575akM1424a.m1242b(c0756dz.m1815b().f1750p, false)) == null) {
                    return true;
                }
                mo1400a(interfaceC0571agM1242b2.mo1210e(), true);
                return true;
            case 10:
                C0575ak c0575akM1424a2 = ComicRackApplication.f1954i.m1424a("3D8E0FCA-079F-4E69-B2C6-56BE06153769");
                if (c0575akM1424a2 == null || !c0756dz.m1817d() || (interfaceC0571agM1242b = c0575akM1424a2.m1242b(c0756dz.m1815b().f1750p, false)) == null) {
                    return true;
                }
                mo1400a(interfaceC0571agM1242b.mo1210e(), true);
                return true;
            default:
                return super.mo1480a(c0756dz);
        }
    }

    /* renamed from: b */
    protected final void m1822b(C0575ak c0575ak) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) ComicListActivity.class);
        intent.putExtra("comic_folder_id", c0575ak.f1750p);
        intent.putExtra("list_folder_id", c0575ak.mo1210e().f1750p);
        startActivity(intent);
    }
}
