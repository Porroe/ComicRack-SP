package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.comicrack.p019a.InterfaceC0584at;
import com.cyo.common.C0965au;
import com.cyo.common.C0967aw;
import com.cyo.common.C0970az;
import com.cyo.common.InterfaceC0966av;
import com.p004a.p012b.p013a.p014a.p015a.ActivityC0424m;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ey */
/* loaded from: classes.dex */
public abstract class AbstractC0782ey extends Fragment implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static Map f2429a = new HashMap();

    /* renamed from: aj */
    private View f2430aj;

    /* renamed from: ak */
    private TextView f2431ak;

    /* renamed from: al */
    private TextView f2432al;

    /* renamed from: am */
    private InterfaceC0787fc f2433am;

    /* renamed from: an */
    private InterfaceC0786fb f2434an;

    /* renamed from: ao */
    private int f2435ao;

    /* renamed from: ap */
    private int f2436ap;

    /* renamed from: aq */
    private int f2437aq;

    /* renamed from: ar */
    private int f2438ar;

    /* renamed from: as */
    private int f2439as;

    /* renamed from: at */
    private int f2440at;

    /* renamed from: au */
    private int f2441au;

    /* renamed from: b */
    C0575ak f2446b;

    /* renamed from: c */
    C0575ak f2447c;

    /* renamed from: d */
    C0575ak f2448d;

    /* renamed from: e */
    TextView f2449e;

    /* renamed from: f */
    public boolean f2450f;

    /* renamed from: g */
    private int f2451g;

    /* renamed from: h */
    private AbsListView f2452h;

    /* renamed from: i */
    private View f2453i;

    /* renamed from: aw */
    private boolean f2443aw = true;

    /* renamed from: ax */
    private int f2444ax = -1;

    /* renamed from: ay */
    private String f2445ay = null;

    /* renamed from: av */
    private int f2442av = 2;

    /* renamed from: a */
    protected abstract ListAdapter mo1720a(C0575ak c0575ak);

    /* renamed from: a */
    static /* synthetic */ View m1827a(AbstractC0782ey abstractC0782ey) {
        return abstractC0782ey.f2453i;
    }

    public AbstractC0782ey(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f2435ao = i;
        this.f2436ap = i2;
        this.f2437aq = i4;
        this.f2438ar = i3;
        this.f2439as = i5;
        this.f2440at = i6;
        this.f2441au = i7;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: a */
    public final void mo30a(Bundle bundle) {
        super.mo30a(bundle);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: a */
    public View mo25a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f2435ao, viewGroup, false);
        this.f2453i = viewInflate.findViewById(this.f2438ar);
        this.f2430aj = viewInflate.findViewById(this.f2437aq);
        this.f2431ak = (TextView) viewInflate.findViewById(this.f2439as);
        this.f2432al = (TextView) viewInflate.findViewById(this.f2440at);
        this.f2449e = (TextView) viewInflate.findViewById(this.f2441au);
        this.f2452h = (AbsListView) viewInflate.findViewById(this.f2436ap);
        this.f2452h.setOnItemClickListener(this);
        this.f2430aj.setOnClickListener(new ViewOnClickListenerC0783ez(this));
        this.f2452h.setOnCreateContextMenuListener(new ViewOnCreateContextMenuListenerC0785fa(this));
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: d */
    public void mo44d() {
        super.mo44d();
        m1837ad().mo2051c(this.f2450f ? 1 : 0);
        if (!this.f2443aw) {
            m1835aa();
            return;
        }
        mo1719a(this.f2447c, true);
        if (this.f2444ax >= 0) {
            m1837ad().mo2053d(this.f2444ax);
            this.f2444ax = -1;
        }
        this.f2443aw = false;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: e */
    public final void mo47e() {
        InterfaceC0966av interfaceC0966avM1837ad = m1837ad();
        if (interfaceC0966avM1837ad != null && this.f2445ay != null) {
            f2429a.put(this.f2445ay, interfaceC0966avM1837ad.mo2050c());
        }
        super.mo47e();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: c */
    public final void mo42c() {
        this.f2433am = null;
        this.f2434an = null;
        super.mo42c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.app.Fragment
    /* renamed from: a */
    public final void mo28a(Activity activity) {
        super.mo28a(activity);
        if (activity instanceof InterfaceC0787fc) {
            this.f2433am = (InterfaceC0787fc) activity;
        }
        if (activity instanceof InterfaceC0786fb) {
            this.f2434an = (InterfaceC0786fb) activity;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) adapterView.getItemAtPosition(i);
        C0756dz c0756dz = new C0756dz(this.f2442av, interfaceC0571ag);
        c0756dz.f2394d = view;
        if (interfaceC0571ag instanceof C0572ah) {
            c0756dz.f2395e = ((C0572ah) interfaceC0571ag).m1220b();
        }
        mo1730a(c0756dz);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: b */
    public final boolean mo41b(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (adapterContextMenuInfo.targetView.getParent() != this.f2452h) {
            return false;
        }
        return mo1730a(new C0756dz(menuItem.getItemId(), (InterfaceC0571ag) this.f2452h.getItemAtPosition(adapterContextMenuInfo.position)));
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: a */
    public final boolean mo36a(MenuItem menuItem) {
        if (super.mo36a(menuItem)) {
            return true;
        }
        return mo1730a(new C0756dz(menuItem.getItemId()));
    }

    /* renamed from: T */
    public void mo1717T() {
    }

    /* renamed from: a */
    public void mo1726a(String str) {
        String[] strArrSplit = str.split("\n");
        if (strArrSplit.length > 1) {
            if (this.f2431ak != null) {
                this.f2431ak.setText(strArrSplit[strArrSplit.length - 1]);
            }
            if (this.f2432al != null) {
                this.f2432al.setVisibility(0);
                this.f2432al.setText(strArrSplit[0]);
                return;
            }
            return;
        }
        if (this.f2431ak != null) {
            this.f2431ak.setText(str);
        }
        if (this.f2432al != null) {
            this.f2432al.setVisibility(8);
        }
    }

    /* renamed from: V */
    public final int m1829V() {
        return m62t().findViewById(this.f2438ar).getHeight();
    }

    /* renamed from: d */
    public final int m1839d(C0575ak c0575ak) {
        this.f2446b = c0575ak;
        return mo1719a(c0575ak, false);
    }

    /* renamed from: e */
    public final void m1840e(C0575ak c0575ak) {
        int iIndexOf;
        if (this.f2450f && this.f2448d != null && (iIndexOf = this.f2448d.m1986x().indexOf(c0575ak)) != -1) {
            if (m1837ad() == null) {
                this.f2444ax = iIndexOf;
            } else {
                m1837ad().mo2053d(iIndexOf);
            }
        }
    }

    /* renamed from: W */
    public final void m1830W() {
        int iMo2048b;
        if (m1837ad() != null && (iMo2048b = m1837ad().mo2048b()) != -1) {
            m1837ad().mo2049b(iMo2048b);
        }
    }

    /* renamed from: X */
    public final C0575ak m1831X() {
        return this.f2446b;
    }

    /* renamed from: Y */
    public final void m1832Y() {
        if (this.f2447c instanceof InterfaceC0584at) {
            InterfaceC0584at interfaceC0584at = (InterfaceC0584at) this.f2446b;
            interfaceC0584at.mo1252j();
            if (interfaceC0584at.mo1253l() != this.f2451g) {
                Log.d("Refresh", this.f2447c.mo1211f());
                m1833Z();
            }
        }
    }

    /* renamed from: U */
    protected String mo1718U() {
        if (this.f2446b != null) {
            return this.f2446b.f1750p;
        }
        return null;
    }

    /* renamed from: a */
    protected int mo1719a(C0575ak c0575ak, boolean z) {
        if (!z && this.f2447c == c0575ak) {
            if (this.f2447c != null) {
                return this.f2447c.m1987y();
            }
            return 0;
        }
        InterfaceC0966av interfaceC0966avM1837ad = m1837ad();
        String strMo1718U = mo1718U();
        if (interfaceC0966avM1837ad != null && this.f2445ay != null && !this.f2445ay.equals(strMo1718U)) {
            f2429a.put(this.f2445ay, interfaceC0966avM1837ad.mo2050c());
        }
        this.f2447c = c0575ak;
        this.f2448d = null;
        this.f2445ay = mo1718U();
        if (this.f2447c == null) {
            mo1726a(m1838b(C0806fv.empty_list, new Object[0]));
            if (interfaceC0966avM1837ad != null) {
                interfaceC0966avM1837ad.mo2046a((ListAdapter) null);
            }
            return 0;
        }
        mo1726a(this.f2447c.mo1211f());
        if (this.f2447c instanceof InterfaceC0584at) {
            InterfaceC0584at interfaceC0584at = (InterfaceC0584at) this.f2447c;
            interfaceC0584at.mo1252j();
            this.f2451g = interfaceC0584at.mo1253l();
        }
        this.f2448d = mo1733c(mo1731b(this.f2447c));
        if (this.f2448d == null) {
            if (interfaceC0966avM1837ad != null) {
                interfaceC0966avM1837ad.mo2046a((ListAdapter) null);
            }
            return 0;
        }
        if (interfaceC0966avM1837ad != null) {
            interfaceC0966avM1837ad.mo2046a(mo1720a(this.f2448d));
            interfaceC0966avM1837ad.mo2047a((C0965au) f2429a.get(this.f2445ay));
        }
        return this.f2448d.m1987y();
    }

    /* renamed from: Z */
    protected final void m1833Z() {
        mo1719a(this.f2447c, true);
    }

    /* renamed from: aa */
    protected final void m1835aa() {
        InterfaceC0966av interfaceC0966avM1837ad = m1837ad();
        if (interfaceC0966avM1837ad != null) {
            if (interfaceC0966avM1837ad.mo2052d() != null) {
                ((BaseAdapter) interfaceC0966avM1837ad.mo2052d()).notifyDataSetChanged();
            } else {
                m1833Z();
            }
        }
    }

    /* renamed from: ab */
    protected final C0575ak m1836ab() {
        return this.f2448d;
    }

    /* renamed from: ac */
    protected static ComicRackApplication m1828ac() {
        return ComicRackApplication.f1954i;
    }

    /* renamed from: b */
    protected C0575ak mo1731b(C0575ak c0575ak) {
        return c0575ak;
    }

    /* renamed from: c */
    protected C0575ak mo1733c(C0575ak c0575ak) {
        return c0575ak;
    }

    /* renamed from: a */
    protected boolean mo1730a(C0756dz c0756dz) {
        return this.f2433am != null && this.f2433am.mo1480a(new C0756dz(c0756dz, this.f2448d));
    }

    /* renamed from: a */
    protected void mo1725a(View view) {
        if (this.f2434an != null) {
            this.f2434an.onCaptionClick(view);
        }
    }

    /* renamed from: a */
    protected void mo1724a(ContextMenu contextMenu, ContextMenu.ContextMenuInfo contextMenuInfo) {
    }

    /* renamed from: ad */
    protected final InterfaceC0966av m1837ad() {
        AbsListView absListView = this.f2452h;
        if (absListView instanceof ListView) {
            return new C0970az((ListView) absListView, (byte) 0);
        }
        if (absListView instanceof GridView) {
            return new C0967aw((GridView) absListView, (byte) 0);
        }
        return null;
    }

    /* renamed from: b */
    protected final String m1838b(int i, Object... objArr) {
        return m55i() == null ? "" : m55i().getString(i, objArr);
    }

    /* renamed from: a */
    public final void m1834a(String str, String str2, String str3) {
        if (m55i() instanceof ActivityC0424m) {
            m55i();
            ActivityC0424m.m960a(str, str2, str3, 0);
        }
    }
}
