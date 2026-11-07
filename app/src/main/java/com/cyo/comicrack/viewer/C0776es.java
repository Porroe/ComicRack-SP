package com.cyo.comicrack.viewer;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.common.C0951ag;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.es */
/* loaded from: classes.dex */
public class C0776es extends AbstractC0782ey {

    /* renamed from: a */
    public boolean f2419a;

    /* renamed from: aj */
    private View.OnClickListener f2420aj;

    /* renamed from: g */
    private ImageView f2421g;

    /* renamed from: h */
    private ImageView f2422h;

    /* renamed from: i */
    private ImageView f2423i;

    /* renamed from: a */
    static /* synthetic */ View.OnClickListener m1823a(C0776es c0776es) {
        return c0776es.f2420aj;
    }

    public C0776es() {
        super(C0804ft.library_list_fragment, C0803fs.libraryListGrid, C0803fs.libraryListCaption, C0803fs.libraryListClickCaption, C0803fs.libraryListCaptionText, 0, 0);
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: a */
    protected final ListAdapter mo1720a(C0575ak c0575ak) {
        return new C0774eq(m55i().getApplicationContext(), c0575ak);
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey, android.support.v4.app.Fragment
    /* renamed from: a */
    public final View mo25a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewMo25a = super.mo25a(layoutInflater, viewGroup, bundle);
        if (viewMo25a.getBackground() != null) {
            viewMo25a.getBackground().setAlpha(32);
        }
        this.f2421g = (ImageView) viewMo25a.findViewById(C0803fs.wifiButton);
        this.f2422h = (ImageView) viewMo25a.findViewById(C0803fs.refreshButton);
        this.f2423i = (ImageView) viewMo25a.findViewById(C0803fs.pinButton);
        this.f2419a = m56j().getBoolean(C0799fo.showLibraryButtons) || m55i() instanceof LibraryActivity;
        if (!this.f2419a) {
            if (this.f2421g != null) {
                this.f2421g.setVisibility(8);
            }
            if (this.f2422h != null) {
                this.f2422h.setVisibility(8);
            }
            if (this.f2423i != null) {
                this.f2423i.setVisibility(8);
            }
            this.f2422h = null;
            this.f2421g = null;
            this.f2423i = null;
        } else {
            if (this.f2421g != null) {
                this.f2421g.setOnClickListener(new ViewOnClickListenerC0777et(this));
            }
            if (this.f2422h != null) {
                this.f2422h.setOnClickListener(new ViewOnClickListenerC0778eu(this));
            }
            if (this.f2423i != null) {
                this.f2423i.setContentDescription(m55i().getText(R.string.library_pin_lists));
                this.f2423i.setOnClickListener(new ViewOnClickListenerC0779ev(this));
                if (!(m55i() instanceof LibraryActivity)
                        || !((LibraryActivity) m55i()).supportsSidebarPinning()) {
                    this.f2423i.setVisibility(8);
                    this.f2423i = null;
                }
            }
        }
        if (LibraryInterface.isMaterial(viewMo25a.getContext())) {
            LibraryInterface.styleSidebar(viewMo25a);
        }
        return viewMo25a;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey, android.support.v4.app.Fragment
    /* renamed from: d */
    public final void mo44d() {
        super.mo44d();
        m1824a();
        ComicRackApplication.f1954i.m1428a(new C0780ew(this));
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: v */
    public final void mo64v() {
        ComicRackApplication.f1954i.m1428a((InterfaceC0723ct) null);
        super.mo64v();
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: a */
    protected final void mo1724a(ContextMenu contextMenu, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.mo1724a(contextMenu, contextMenuInfo);
        if (this.f2446b.f1751q) {
            contextMenu.setHeaderTitle(((InterfaceC0571ag) m1837ad().mo2052d().getItem(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position)).mo1211f());
            contextMenu.add(0, 15, 0, C0806fv.delete_list);
        }
    }

    /* renamed from: a */
    public final void m1824a() {
        if (this.f2421g != null) {
            this.f2421g.setVisibility(ComicRackApplication.f1954i.m1433a() ? 0 : 8);
        }
    }

    /* renamed from: c */
    public final void m1826c(boolean z) {
        if (this.f2423i != null) {
            if (LibraryInterface.isMaterial(this.f2423i.getContext())) {
                this.f2423i.setAlpha(z ? 1f : 0.6f);
                this.f2423i.setSelected(z);
            } else {
                this.f2423i.setImageResource(z ? C0802fr.btn_pin_on : C0802fr.btn_pin_off);
            }
        }
    }

    /* renamed from: a */
    public final void m1825a(View.OnClickListener onClickListener) {
        this.f2420aj = onClickListener;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0782ey
    /* renamed from: a */
    public final void mo1726a(String str) {
        super.mo1726a(str);
        C0951ag.m1995a().mo2020a(m55i(), str);
    }
}
