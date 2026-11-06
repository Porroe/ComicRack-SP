package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p021b.C0586a;
import com.cyo.comicrack.p019a.p021b.EnumC0590ad;
import com.cyo.comicrack.p019a.p021b.InterfaceC0606h;
import com.cyo.common.C0951ag;
import com.cyo.common.C0965au;
import com.cyo.common.C0998bi;
import com.cyo.common.C0999bj;
import com.cyo.common.C1006bq;
import com.cyo.common.InterfaceC0952ah;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.cyo.common.InterfaceC0966av;
import com.cyo.common.InterfaceC0992bc;
import com.cyo.common.InterfaceC0994be;
import com.cyo.common.InterfaceC1096m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.be */
/* loaded from: classes.dex */
public class C0681be extends AbstractC0782ey implements InterfaceC0892j, InterfaceC0992bc {

    /* renamed from: a */
    private boolean f2190a;

    /* renamed from: aj */
    private InterfaceC0952ah f2191aj;

    /* renamed from: g */
    private TextView f2192g;

    /* renamed from: h */
    private TextView f2193h;

    /* renamed from: i */
    private TextView f2194i;

    private MaterialButtonToggleGroup viewModeSelector;
    private final int[] viewModeButtonIds = new int[3];
    private boolean updatingViewModeSelector;

    public C0681be() {
        super(C0804ft.comic_list_fragment, C0803fs.comicListGrid, C0803fs.comicListCaption, C0803fs.comicListClickCaption, C0803fs.comicListCaptionText, C0803fs.comicListCaptionTextSmall, C0803fs.comicListCaptionDescription);
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey, android.support.v4.app.Fragment
    /* renamed from: a */
    public final View mo25a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewMo25a = super.mo25a(layoutInflater, viewGroup, bundle);
        this.f2192g = (TextView) viewMo25a.findViewById(C0803fs.closeButton);
        this.f2193h = (TextView) viewMo25a.findViewById(C0803fs.filterButton);
        this.f2194i = (TextView) viewMo25a.findViewById(C0803fs.styleButton);
        this.f2192g.setVisibility(8);
        this.f2193h.setOnClickListener(new ViewOnClickListenerC0682bf(this));
        this.f2194i.setOnClickListener(new ViewOnClickListenerC0693bq(this));
        this.f2194i.setOnLongClickListener(new ViewOnLongClickListenerC0700bx(this));
        this.f2192g.setOnClickListener(new ViewOnClickListenerC0701by(this));
        if (LibraryInterface.isMaterial(viewMo25a.getContext())) {
            configureMaterialViewMode((LinearLayout) viewMo25a);
        }
        InterfaceC0994be interfaceC0994beM1995a = C0951ag.m1995a();
        m55i();
        this.f2191aj = interfaceC0994beM1995a.mo2014a(m1837ad(), this);
        return viewMo25a;
    }

    private void configureMaterialViewMode(LinearLayout root) {
        LibraryInterface.styleComicList(root);
        Context theme = LibraryInterface.theme(root.getContext());
        viewModeSelector = new MaterialButtonToggleGroup(theme);
        viewModeSelector.setSingleSelection(true);
        viewModeSelector.setSelectionRequired(true);
        int[] labels = {R.string.cover, R.string.detail, R.string.stack};
        for (int mode = 0; mode < labels.length; mode++) {
            MaterialButton button = new MaterialButton(theme, null,
                    com.google.android.material.R.attr.materialButtonOutlinedStyle);
            button.setId(View.generateViewId());
            viewModeButtonIds[mode] = button.getId();
            button.setText(labels[mode]);
            button.setSingleLine(true);
            button.setMinWidth(0);
            button.setPaddingRelative(0, button.getPaddingTop(), 0, button.getPaddingBottom());
            button.setOnLongClickListener(new ViewOnLongClickListenerC0700bx(this));
            viewModeSelector.addView(button, new LinearLayout.LayoutParams(0, -2, 1));
        }
        viewModeSelector.addOnButtonCheckedListener((group, checkedId, checked) -> {
            if (!checked || updatingViewModeSelector) {
                return;
            }
            for (int mode = 0; mode < viewModeButtonIds.length; mode++) {
                if (viewModeButtonIds[mode] == checkedId) {
                    m1723a(m1714Q() + mode, true);
                    return;
                }
            }
        });
        LinearLayout.LayoutParams selectorLayout = new LinearLayout.LayoutParams(-1, -2);
        selectorLayout.setMarginStart(LibraryInterface.dp(theme, 12));
        selectorLayout.setMarginEnd(LibraryInterface.dp(theme, 12));
        root.addView(viewModeSelector, 1, selectorLayout);
        f2194i.setVisibility(View.GONE);
    }

    private void updateMaterialViewMode(int mode) {
        if (viewModeSelector == null) {
            return;
        }
        updatingViewModeSelector = true;
        try {
            viewModeSelector.findViewById(viewModeButtonIds[2])
                    .setVisibility(m1715R().f2268b < 7 ? View.VISIBLE : View.GONE);
            viewModeSelector.check(viewModeButtonIds[mode < viewModeButtonIds.length ? mode : 1]);
        } finally {
            updatingViewModeSelector = false;
        }
    }

    @Override
    public void mo49f() {
        viewModeSelector = null;
        super.mo49f();
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey, android.support.v4.app.Fragment
    /* renamed from: d */
    public final void mo44d() {
        m1723a(m1716S().f2274e, false);
        super.mo44d();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: u */
    public final void mo63u() {
        super.mo63u();
        m1835aa();
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: a */
    protected final void mo1724a(ContextMenu contextMenu, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.mo1724a(contextMenu, contextMenuInfo);
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        C0572ah c0572ah = (C0572ah) m1837ad().mo2052d().getItem(adapterContextMenuInfo.position);
        String strMo1211f = c0572ah.mo1211f();
        String strMo1212g = c0572ah.mo1212g();
        if (!C0998bi.m2081a(strMo1212g)) {
            strMo1211f = String.valueOf(strMo1211f) + " - " + strMo1212g;
        }
        contextMenu.setHeaderTitle(strMo1211f);
        contextMenu.setHeaderIcon(new BitmapDrawable(m62t().getResources(), C0586a.m1260a(c0572ah.m1221j(), (int) TypedValue.applyDimension(2, 32.0f, m56j().getDisplayMetrics()), -15, EnumC0590ad.Disk)));
        mo1734c(contextMenu);
        mo1727a(contextMenu, Arrays.asList(Integer.valueOf(adapterContextMenuInfo.position)));
    }

    @Override // com.cyo.common.InterfaceC0992bc
    /* renamed from: c */
    public final boolean mo1734c(Menu menu) {
        menu.add(0, 2, 0, C0806fv.open);
        menu.add(0, 0, 0, C0806fv.menu_comiclist_info);
        menu.add(0, 18, 0, C0806fv.rate);
        menu.add(0, 9, 0, C0806fv.menu_comiclist_show_series);
        menu.add(0, 10, 0, C0806fv.menu_comiclist_show_story_line);
        menu.add(0, 4, 0, C0806fv.menu_comiclist_mark_read);
        menu.add(0, 5, 0, C0806fv.menu_comiclist_mark_unread);
        menu.add(0, 19, 0, C0806fv.menu_comiclist_set_checked);
        menu.add(0, 20, 0, C0806fv.menu_comiclist_set_unchecked);
        C0951ag.m1995a().mo2025a(menu.add(0, 16, 0, C0806fv.menu_comiclist_share), m55i(), (Intent) null);
        menu.add(0, 17, 0, C0806fv.menu_comiclist_rename);
        menu.add(0, 3, 0, C0806fv.menu_comiclist_delete);
        return true;
    }

    @Override // com.cyo.common.InterfaceC0992bc
    /* renamed from: a */
    public final boolean mo1727a(Menu menu, List list) {
        boolean z = false;
        if (list.size() == 0 || m1837ad() == null || m1837ad().mo2052d() == null) {
            return false;
        }
        C0505b c0505bM1221j = ((C0572ah) m1837ad().mo2052d().getItem(((Integer) list.get(0)).intValue())).m1221j();
        InterfaceC0606h interfaceC0606hM1354a = C0628f.m1354a(c0505bM1221j, false);
        boolean z2 = list.size() == 1;
        boolean z3 = interfaceC0606hM1354a != null && interfaceC0606hM1354a.mo1312g();
        boolean zM1227p = false;
        boolean zM1232u = false;
        boolean zM1223l = false;
        for (int i = 0; i < list.size(); i++) {
            C0572ah c0572ah = (C0572ah) m1837ad().mo2052d().getItem(((Integer) list.get(i)).intValue());
            zM1223l |= c0572ah.m1223l();
            zM1232u |= c0572ah.m1232u();
            zM1227p |= c0572ah.m1227p();
        }
        menu.findItem(2).setVisible(z2);
        menu.findItem(0).setVisible(z2);
        menu.findItem(9).setVisible(z2 && ComicRackApplication.f1954i.m1424a("3D8E0FCA-079F-4E69-B2C5-56BE06153769") != null);
        menu.findItem(10).setVisible((!z2 || ComicRackApplication.f1954i.m1424a("3D8E0FCA-079F-4E69-B2C6-56BE06153769") == null || C0998bi.m2081a(c0505bM1221j.f1617B)) ? false : true);
        menu.findItem(19).setVisible(!zM1232u);
        menu.findItem(20).setVisible(zM1232u);
        menu.findItem(4).setVisible(!zM1227p);
        menu.findItem(5).setVisible(zM1227p);
        menu.findItem(18).setVisible(z2 && !zM1223l);
        MenuItem menuItemFindItem = menu.findItem(16);
        menuItemFindItem.setVisible(z2 && !zM1223l);
        C0951ag.m1995a().mo2025a(menuItemFindItem, m55i(), ComicRackApplication.m1404a(c0505bM1221j));
        MenuItem menuItemFindItem2 = menu.findItem(17);
        if (z2 && !zM1223l && z3) {
            z = true;
        }
        menuItemFindItem2.setVisible(z);
        return true;
    }

    @Override // com.cyo.common.InterfaceC0992bc
    /* renamed from: a */
    public final boolean mo1728a(MenuItem menuItem, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC0571ag) m1837ad().mo2052d().getItem(((Integer) it.next()).intValue()));
        }
        return mo1730a(new C0756dz(menuItem.getItemId(), arrayList));
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: a */
    protected final boolean mo1730a(C0756dz c0756dz) {
        C0572ah c0572ahM1815b;
        if (this.f2448d == null) {
            return false;
        }
        if (c0756dz.f2391a == 2 && (c0572ahM1815b = c0756dz.m1815b()) != null && m1709b(c0572ahM1815b)) {
            m1834a("ComicList", "Stack", "Open");
            return true;
        }
        boolean zMo1730a = super.mo1730a(c0756dz);
        if (zMo1730a) {
            m1835aa();
        }
        switch (c0756dz.f2391a) {
            case 3:
                m1834a("ComicList", "Delete", "");
                List listM1382a = C0635m.m1382a((Iterable) c0756dz.f2392b);
                if (listM1382a.size() > 0) {
                    new AlertDialog.Builder(m55i()).setTitle(C0806fv.delete_ecomics).setMessage(C0806fv.ask_delete_ecomics).setPositiveButton(C0806fv.yes, new DialogInterfaceOnClickListenerC0706cc(this, listM1382a)).setNegativeButton(C0806fv.f2496no, new DialogInterfaceOnClickListenerC0707cd(this)).show();
                }
                return true;
            case 17:
                m1834a("ComicList", "Rename", "");
                C0505b c0505bM1816c = c0756dz.m1816c();
                if (C0628f.m1365b(c0505bM1816c)) {
                    View viewInflate = View.inflate(m55i(), C0804ft.rename_ecomic, null);
                    EditText editText = (EditText) viewInflate.findViewById(C0803fs.renameFileEdit);
                    CheckBox checkBox = (CheckBox) viewInflate.findViewById(C0803fs.renameFileCheckRescan);
                    editText.setText(C0998bi.m2093h(c0505bM1816c.m1149o(), "."));
                    editText.setOnKeyListener(new ViewOnKeyListenerC0704ca(this));
                    new AlertDialog.Builder(m55i()).setTitle(m26a(C0806fv.rename_ecomic, c0505bM1816c.m1149o())).setView(viewInflate).setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC0705cb(this, c0505bM1816c, editText, checkBox)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
                }
                return true;
            case 18:
                m1834a("ComicList", "Rate", "");
                InterfaceC0606h interfaceC0606hM1354a = C0628f.m1354a(c0756dz.m1816c(), false);
                if (interfaceC0606hM1354a != null) {
                    ComicRackApplication.f1954i.showComicRatingDialog((Activity) m55i(), interfaceC0606hM1354a, false, (Runnable) new RunnableC0702bz(this));
                }
                return true;
            default:
                return zMo1730a;
        }
    }

    /* renamed from: a */
    public final boolean m1729a(C0572ah c0572ah) {
        boolean z;
        if (c0572ah == null) {
            return false;
        }
        do {
            C0575ak c0575ak = this.f2448d;
            int i = 0;
            while (true) {
                if (i >= c0575ak.m1987y()) {
                    z = false;
                    break;
                }
                C0572ah c0572ah2 = (C0572ah) c0575ak.m1983d(i);
                if (c0572ah2.m1223l()) {
                    if (c0572ah2.m1987y() == 0 ? false : c0572ah2.m1986x().contains(c0572ah)) {
                        m1709b(c0572ah2);
                        z = true;
                        break;
                    }
                } else if (c0572ah2 == c0572ah) {
                    m1837ad().mo2047a(new C0965au(i, 0));
                    return true;
                }
                i++;
            }
        } while (z);
        return false;
    }

    /* renamed from: b */
    private boolean m1709b(C0572ah c0572ah) {
        if (!c0572ah.m1223l()) {
            return false;
        }
        C0725cv c0725cvM1715R = m1715R();
        if (c0725cvM1715R.f2268b >= 7) {
            return false;
        }
        int i = c0725cvM1715R.f2268b;
        c0725cvM1715R.f2268b = i + 1;
        C0727cx c0727cx = c0725cvM1715R.f2269c[i];
        c0727cx.f2275a = c0572ah.f1750p;
        c0727cx.f2276b = c0572ah.mo1211f();
        m1833Z();
        return true;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: a */
    public final void mo1726a(String str) {
        C0725cv c0725cvM1715R = m1715R();
        for (int i = 0; i < c0725cvM1715R.f2268b; i++) {
            str = String.valueOf(str) + "\n" + c0725cvM1715R.f2269c[i].f2276b;
        }
        super.mo1726a(str);
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: a */
    protected final ListAdapter mo1720a(C0575ak c0575ak) {
        int i;
        InterfaceC1096m c0692bp = null;
        Context applicationContext = m55i().getApplicationContext();
        boolean z = m1714Q() == 256;
        switch (m1716S().m1749a()) {
            case 0:
                if (!z) {
                    i = C0804ft.comic_list_thumbnail;
                    break;
                } else {
                    i = C0804ft.comic_list_thumbnail_compact;
                    break;
                }
            case 1:
                i = C0804ft.comic_list_thumbnail_tile;
                break;
            case 2:
                if (!z) {
                    i = C0804ft.comic_list_thumbnail;
                    break;
                } else {
                    i = C0804ft.comic_list_thumbnail_compact;
                    break;
                }
            default:
                i = 0;
                break;
        }
        if (C0951ag.m2004d()) {
            C0635m c0635mM1438c = ComicRackApplication.f1954i.m1438c();
            if (m1716S().m1749a() != 2) {
                switch (m1716S().f2272c) {
                    case 1:
                        c0692bp = new C0691bo(this, c0635mM1438c);
                        break;
                    case 2:
                        c0692bp = new C0692bp(this);
                        break;
                    case 3:
                        c0692bp = new C0689bm(this);
                        break;
                    case 4:
                        c0692bp = new C0688bl(this);
                        break;
                    case 5:
                        c0692bp = new C0687bk(this);
                        break;
                    case 6:
                        c0692bp = new C0690bn(this);
                        break;
                }
            } else {
                switch (m1716S().f2273d) {
                    case 0:
                        c0692bp = new C0683bg(this, c0635mM1438c);
                        break;
                    case 1:
                        c0692bp = new C0684bh(this);
                        break;
                    case 2:
                        c0692bp = new C0686bj(this);
                        break;
                    case 3:
                        c0692bp = new C0685bi(this);
                        break;
                }
            }
        }
        if (c0692bp == null) {
            return new C0678bb(applicationContext, c0575ak, i);
        }
        return new C0679bc(applicationContext, c0575ak, i, c0692bp);
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: a */
    protected final void mo1725a(View view) {
        super.mo1725a(view);
        if (this.f2447c != null) {
            ArrayList arrayList = new ArrayList();
            Context context = view.getContext();
            if (m1716S().m1749a() != 2) {
                arrayList.add(new C1006bq(m1708b(0), context.getString(C0806fv.not_sorted), context.getString(C0806fv.ecomics_are_in_the_original_order), 0));
                arrayList.add(new C1006bq(m1708b(1), context.getString(C0806fv.sort_by_series), context.getString(C0806fv.sorts_all_ecomics_in_the_list_by_series), 1));
                int iM1708b = m1708b(2);
                if (iM1708b != 0 || ComicRackApplication.f1954i.m1438c().m1244c("3D8E0FCA-079F-4E69-B2C6-56BE06153769") != null) {
                    arrayList.add(new C1006bq(iM1708b, context.getString(C0806fv.sort_by_story), context.getString(C0806fv.sorts_all_ecomics_in_the_list_by_story), 2));
                }
                int iM1708b2 = m1708b(3);
                if (iM1708b2 != 0 || ComicRackApplication.f1954i.m1438c().f1933m) {
                    arrayList.add(new C1006bq(iM1708b2, context.getString(C0806fv.sort_by_published), context.getString(C0806fv.sorts_all_ecomics_in_the_list_by_publishing_date), 3));
                }
                arrayList.add(new C1006bq(m1708b(4), context.getString(C0806fv.sort_by_filename), context.getString(C0806fv.sorts_all_ecomics_in_the_list_by_filename), 4));
            } else {
                arrayList.add(new C1006bq(m1710c(0), context.getString(C0806fv.stack_by_series), context.getString(C0806fv.stack_by_series_description), 1000));
                int iM1710c = m1710c(1);
                if (iM1710c != 0 || ComicRackApplication.f1954i.m1438c().m1244c("3D8E0FCA-079F-4E69-B2C6-56BE06153769") != null) {
                    arrayList.add(new C1006bq(iM1710c, context.getString(C0806fv.stack_by_stories), context.getString(C0806fv.stack_by_stories_description), 1001));
                }
                int iM1710c2 = m1710c(2);
                if (iM1710c2 != 0 || ComicRackApplication.f1954i.m1438c().m1244c("3D8E0FCA-079F-4E69-B2CB-56BE06153769") != null) {
                    arrayList.add(new C1006bq(iM1710c2, context.getString(C0806fv.stack_by_folders), context.getString(C0806fv.stack_by_folders_description), 1002));
                }
                int iM1710c3 = m1710c(3);
                if (iM1710c3 != 0 || ComicRackApplication.f1954i.m1438c().m1244c("3D8E0FCA-079F-4E69-B2CC-56BE06153769") != null) {
                    arrayList.add(new C1006bq(iM1710c3, context.getString(C0806fv.stack_by_publishers), context.getString(C0806fv.stack_by_publishers_description), 1003));
                }
            }
            boolean z = m1714Q() == 256;
            int i = z ? 0 : 256;
            arrayList.add(new C1006bq(z ? C0802fr.round_marker : 0, context.getString(C0806fv.compact_view), context.getString(C0806fv.compact_view_desciption), 10001));
            C0999bj c0999bj = new C0999bj(arrayList, C0804ft.super_menu_item);
            c0999bj.f2946d = new C0694br(this, i);
            c0999bj.m2096a(view, view.getHeight());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m1707a(C0681be c0681be, int i) {
        C0725cv c0725cvM1715R = c0681be.m1715R();
        if (c0725cvM1715R != null) {
            for (int i2 = c0681be.m1715R().f2268b; i2 < 7; i2++) {
                C0726cw c0726cwM1748a = c0725cvM1715R.m1748a(i2);
                c0726cwM1748a.f2273d = i;
                c0726cwM1748a.f2274e = 2;
            }
        }
    }

    /* renamed from: b */
    private int m1708b(int i) {
        C0726cw c0726cwM1716S = m1716S();
        if (c0726cwM1716S.f2272c != i) {
            return 0;
        }
        return c0726cwM1716S.f2270a ? C0802fr.arrow_up : C0802fr.arrow_down;
    }

    /* renamed from: c */
    private int m1710c(int i) {
        if (m1716S().f2273d == i) {
            return C0802fr.round_marker;
        }
        return 0;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: a */
    protected final int mo1719a(C0575ak c0575ak, boolean z) throws Resources.NotFoundException {
        String strM1387b;
        int i;
        int iMo1719a = super.mo1719a(c0575ak, z);
        InterfaceC0966av interfaceC0966avAd = m1837ad();
        if (interfaceC0966avAd != null) {
            int dimensionPixelSize = m56j().getDimensionPixelSize(C0801fq.comic_list_column_width);
            if (m1716S().m1749a() == 1) {
                dimensionPixelSize = (int) (dimensionPixelSize * 2.1f);
            }
            interfaceC0966avAd.mo2045a(dimensionPixelSize);
        }
        if (this.f2192g != null && !this.f2190a) {
            this.f2192g.setVisibility(m1715R().f2268b == 0 ? 8 : 0);
        }
        if (this.f2193h != null) {
            this.f2193h.setText(m1711d(m1716S().f2271b));
        }
        if (m1716S().m1749a() == 2) {
            strM1387b = iMo1719a == 1 ? m1838b(C0806fv.one_stack, new Object[0]) : m1838b(C0806fv.d_stacks, Integer.valueOf(iMo1719a));
            switch (m1716S().f2273d) {
                case 0:
                    i = C0806fv.series;
                    break;
                case 1:
                    i = C0806fv.story;
                    break;
                case 2:
                    i = C0806fv.folder;
                    break;
                case 3:
                    i = C0806fv.publisher;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0) {
                strM1387b = String.valueOf(strM1387b) + String.format(" - %s", m1838b(i, new Object[0]));
            }
        } else {
            strM1387b = C0635m.m1387b(iMo1719a);
        }
        if (this.f2449e != null) {
            this.f2449e.setText(strM1387b);
        }
        mo1721a();
        return iMo1719a;
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0892j
    /* renamed from: a */
    public final void mo1721a() {
        if (this.f2191aj != null) {
            this.f2191aj.mo2009a();
        }
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: b */
    protected final C0575ak mo1731b(C0575ak c0575ak) {
        boolean keepNamedSingleComicStacks;
        AbstractC0708ce c0699bw;
        C0575ak c0575ak2;
        C0575ak c0575akMo1731b = super.mo1731b(c0575ak);
        C0725cv c0725cvM1715R = m1715R();
        C0575ak c0575ak3 = c0575akMo1731b;
        int i = 0;
        while (i <= c0725cvM1715R.f2268b && c0575ak3 != null) {
            if (i != 0) {
                c0575ak3 = (C0575ak) c0575ak3.m1242b(c0725cvM1715R.f2269c[i - 1].f2275a, false);
            }
            C0726cw c0726cwM1748a = c0725cvM1715R.m1748a(i);
            boolean openingStack = i < c0725cvM1715R.f2268b;
            if (c0575ak3 == null) {
                c0575ak2 = c0575ak3;
            } else {
                C0575ak c0575ak4 = new C0575ak(c0575ak3.f1750p);
                c0575ak4.m1986x().addAll(c0575ak3.m1986x());
                if (c0726cwM1748a.m1749a() != 2) {
                    C0575ak.m1235a(c0575ak4, c0726cwM1748a.f2272c, c0726cwM1748a.f2270a);
                    c0575ak2 = c0575ak4;
                } else {
                    C0635m c0635mM1438c = ComicRackApplication.f1954i.m1438c();
                    switch (c0726cwM1748a.f2273d) {
                        case 0:
                            keepNamedSingleComicStacks = false;
                            c0699bw = new C0696bt(this, c0635mM1438c);
                            break;
                        case 1:
                            keepNamedSingleComicStacks = true;
                            c0699bw = new C0697bu(this);
                            break;
                        case 2:
                            keepNamedSingleComicStacks = true;
                            c0699bw = new C0699bw(this);
                            break;
                        case 3:
                            keepNamedSingleComicStacks = true;
                            c0699bw = new C0698bv(this);
                            break;
                        default:
                            keepNamedSingleComicStacks = true;
                            c0699bw = null;
                            break;
                    }
                    if (c0699bw == null) {
                        c0575ak2 = c0575ak4;
                    } else {
                        c0699bw.mo1740a(c0575ak4);
                        C0575ak stackedComics = new C0575ak(c0575ak4.f1750p);
                        Iterator it = c0575ak4.m1986x().iterator();
                        String str = null;
                        C0572ah c0572ah = null;
                        while (it.hasNext()) {
                            C0572ah c0572ah2 = (C0572ah) ((InterfaceC0571ag) it.next());
                            C0505b c0505bM1221j = c0572ah2.m1221j();
                            String strMo1739a = c0699bw.mo1739a(c0505bM1221j);
                            boolean zMo1741b = c0699bw.mo1741b(c0505bM1221j);
                            if (zMo1741b && C0998bi.m2081a(strMo1739a)) {
                                strMo1739a = C0628f.f1891m;
                            }
                            if (str == null || !zMo1741b || C0998bi.m2083b(strMo1739a, str) != 0) {
                                c0572ah = new C0572ah(c0505bM1221j, strMo1739a);
                                stackedComics.m1237a((InterfaceC0571ag) c0572ah);
                            }
                            c0572ah.m1237a((InterfaceC0571ag) c0572ah2);
                            str = strMo1739a;
                        }
                        if (!openingStack) {
                            for (int stackIndex = 0; stackIndex < stackedComics.m1987y(); stackIndex++) {
                                C0572ah stack = (C0572ah) stackedComics.m1983d(stackIndex);
                                if (stack.m1987y() == 1 && (!keepNamedSingleComicStacks || stack.f1739a == null)) {
                                    stack.m1217a();
                                    stack.m1988z();
                                }
                            }
                        }
                        c0575ak2 = stackedComics;
                    }
                }
            }
            i++;
            c0575ak3 = c0575ak2;
        }
        m1723a(m1716S().f2274e, false);
        return c0575ak3;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: c */
    protected final C0575ak mo1733c(C0575ak c0575ak) {
        if (c0575ak != null) {
            int i = m1716S().f2271b;
            if (i == 0) {
                return super.mo1733c(c0575ak);
            }
            C0575ak c0575ak2 = new C0575ak(c0575ak.f1750p);
            for (Object entry : c0575ak.m1986x()) {
                InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) entry;
                C0572ah c0572ah = (C0572ah) interfaceC0571ag;
                switch (i) {
                    case 1:
                        if (c0572ah.m1227p()) {
                            break;
                        } else {
                            c0575ak2.m1237a(interfaceC0571ag);
                            break;
                        }
                    case 2:
                        if (!c0572ah.m1227p() && !c0572ah.m1226o()) {
                            c0575ak2.m1237a(interfaceC0571ag);
                        }
                        break;
                    case 3:
                        if (c0572ah.m1227p()) {
                            c0575ak2.m1237a(interfaceC0571ag);
                            break;
                        } else {
                            break;
                        }
                    default:
                        c0575ak2.m1237a(interfaceC0571ag);
                        break;
                }
            }
            return c0575ak2;
        }
        return c0575ak;
    }

    /* renamed from: b */
    public final boolean m1732b() throws Resources.NotFoundException {
        if (m1715R().f2268b == 0) {
            return false;
        }
        C0725cv c0725cvM1715R = m1715R();
        c0725cvM1715R.f2268b--;
        mo1719a(this.f2446b, true);
        return true;
    }

    /* renamed from: a */
    public final void m1722a(int i) {
        if (this.f2193h != null) {
            this.f2193h.setText(m1711d(i));
        }
        m1716S().f2271b = i;
        m1833Z();
    }

    /* renamed from: O */
    public final int m1712O() {
        return m1716S().f2271b;
    }

    /* renamed from: d */
    private static int m1711d(int i) {
        switch (i) {
            case 1:
                return C0806fv.unread;
            case 2:
                return C0806fv.reading;
            case 3:
                return C0806fv.read;
            default:
                return C0806fv.all;
        }
    }

    /* renamed from: a */
    public final void m1723a(int i, boolean z) {
        int i2;
        m1716S().f2274e = i;
        if (this.f2194i != null) {
            TextView textView = this.f2194i;
            switch (i & 255) {
                case 0:
                    i2 = C0806fv.cover;
                    break;
                case 1:
                default:
                    i2 = C0806fv.detail;
                    break;
                case 2:
                    i2 = C0806fv.stack;
                    break;
            }
            textView.setText(i2);
        }
        updateMaterialViewMode(i & 255);
        if (z) {
            m1833Z();
        }
    }

    /* renamed from: P */
    final int m1713P() {
        return m1716S().m1749a();
    }

    /* renamed from: Q */
    final int m1714Q() {
        return m1716S().f2274e & 3840;
    }

    /* renamed from: R */
    public final C0725cv m1715R() {
        C0725cv c0725cv;
        if (this.f2446b == null || this.f2446b.f1750p == null) {
            return new C0725cv();
        }
        C0724cu c0724cuM1442f = ComicRackApplication.f1954i.m1442f();
        String str = this.f2446b.f1750p;
        C0695bs c0695bs = new C0695bs(this);
        Iterator it = c0724cuM1442f.f2265a.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0725cv = null;
                break;
            }
            c0725cv = (C0725cv) it.next();
            if (str.equalsIgnoreCase(c0725cv.f2267a)) {
                break;
            }
        }
        if (c0725cv != null) {
            c0724cuM1442f.f2265a.remove(c0725cv);
        } else {
            c0725cv = new C0725cv(str);
            c0695bs.mo1737a(c0725cv);
        }
        c0724cuM1442f.f2265a.add(0, c0725cv);
        while (c0724cuM1442f.f2265a.size() > 256) {
            c0724cuM1442f.f2265a.remove(c0724cuM1442f.f2265a.size() - 1);
        }
        return c0725cv;
    }

    /* renamed from: S */
    public final C0726cw m1716S() {
        return m1715R().m1748a(m1715R().f2268b);
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: T */
    public final void mo1717T() {
        this.f2190a = true;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: U */
    protected final String mo1718U() {
        String strMo1718U = super.mo1718U();
        if (strMo1718U != null) {
            return String.valueOf(strMo1718U) + ":" + m1715R().f2268b + ":" + m1716S().f2274e;
        }
        return strMo1718U;
    }
}
