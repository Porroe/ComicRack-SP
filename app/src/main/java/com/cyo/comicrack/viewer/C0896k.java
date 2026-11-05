package com.cyo.comicrack.viewer;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.cyo.comicrack.p019a.p020a.C0478a;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.common.C0950af;
import com.cyo.common.C0951ag;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.k */
/* loaded from: classes.dex */
public final class C0896k {

    /* renamed from: a */
    private static String f2703a = "Bookmarks";

    /* renamed from: b */
    private static String f2704b = "Added";

    /* renamed from: c */
    private static String f2705c = "Removed";

    /* renamed from: d */
    private static String f2706d = "Selected";

    /* renamed from: e */
    private C0505b f2707e;

    /* renamed from: f */
    private Dialog f2708f;

    /* renamed from: g */
    private GridView f2709g;

    /* renamed from: h */
    private C0904s f2710h;

    /* renamed from: i */
    private EditText f2711i;

    /* renamed from: j */
    private Button f2712j;

    /* renamed from: k */
    private List f2713k;

    /* renamed from: l */
    private int f2714l;

    /* renamed from: a */
    static /* synthetic */ String m1882a() {
        return f2703a;
    }

    /* renamed from: c */
    static /* synthetic */ String m1889c() {
        return f2704b;
    }

    /* renamed from: b */
    static /* synthetic */ String m1887b() {
        return f2705c;
    }

    /* renamed from: d */
    static /* synthetic */ String m1892d() {
        return f2706d;
    }

    /* renamed from: b */
    static /* synthetic */ C0505b m1886b(C0896k c0896k) {
        return c0896k.f2707e;
    }

    /* renamed from: a */
    static /* synthetic */ List m1883a(C0896k c0896k) {
        return c0896k.f2713k;
    }

    /* renamed from: d */
    static /* synthetic */ int m1891d(C0896k c0896k) {
        return c0896k.f2714l;
    }

    /* renamed from: a */
    public final void m1894a(ActivityC0881ip activityC0881ip, C0505b c0505b, InterfaceC0905t interfaceC0905t) {
        if (c0505b != null) {
            this.f2707e = c0505b;
            this.f2714l = c0505b.m1140f();
            this.f2713k = c0505b.m1163B();
            View viewInflate = activityC0881ip.getLayoutInflater().inflate(C0804ft.comic_bookmarks_dialog, (ViewGroup) null, false);
            this.f2709g = (GridView) viewInflate.findViewById(C0803fs.bookmarkList);
            this.f2711i = (EditText) viewInflate.findViewById(C0803fs.bookmarkPageNumber);
            this.f2712j = (Button) viewInflate.findViewById(C0803fs.bookmarkEditButton);
            this.f2710h = new C0904s(this, activityC0881ip, C0804ft.comic_bookmarks_thumbnail);
            this.f2709g.setAdapter((ListAdapter) this.f2710h);
            C0951ag.m1995a().mo2028a(this.f2709g);
            m1884a(this.f2714l);
            this.f2711i.addTextChangedListener(new C0897l(this));
            this.f2712j.setOnClickListener(new ViewOnClickListenerC0898m(this, activityC0881ip));
            this.f2709g.setOnItemClickListener(new C0900o(this));
            this.f2709g.setOnItemLongClickListener(new C0901p(this));
            AlertDialog.Builder title = new AlertDialog.Builder(activityC0881ip).setTitle(C0806fv.bookmarks);
            title.setView(viewInflate);
            title.setPositiveButton(C0806fv.goto_page, new DialogInterfaceOnClickListenerC0902q(this, interfaceC0905t, activityC0881ip));
            title.setNegativeButton(C0806fv.close, (DialogInterface.OnClickListener) null);
            this.f2708f = title.create();
            this.f2708f.setCanceledOnTouchOutside(true);
            this.f2708f.setOnDismissListener(new DialogInterfaceOnDismissListenerC0903r(this, activityC0881ip));
            viewInflate.clearFocus();
            this.f2708f.show();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m1890c(C0896k c0896k) {
        c0896k.m1884a(-1);
    }

    /* renamed from: b */
    static /* synthetic */ void m1888b(C0896k c0896k, int i) {
        c0896k.m1884a(i);
    }

    /* renamed from: a */
    private void m1884a(int i) {
        if (i >= 0) {
            this.f2711i.setText(new StringBuilder().append(i + 1).toString());
        }
        int iM1991a = C0950af.m1991a(this.f2711i.getText().toString(), 0) - 1;
        this.f2714l = iM1991a;
        boolean z = false;
        for (int i2 = 0; i2 < this.f2710h.getCount(); i2++) {
            if (((C0478a) this.f2710h.getItem(i2)).f1535a == iM1991a) {
                this.f2709g.setSelection(i2);
                C0951ag.m1995a().mo2030a(this.f2709g, i2, true);
                z = true;
            } else {
                C0951ag.m1995a().mo2030a(this.f2709g, i2, false);
            }
        }
        this.f2712j.setEnabled(iM1991a >= 0 && iM1991a < this.f2707e.m1139e());
        this.f2712j.setText(z ? C0806fv.remove : C0806fv.add);
    }

    /* renamed from: e */
    static /* synthetic */ void m1893e(C0896k c0896k) {
        c0896k.f2713k.clear();
        c0896k.f2713k.addAll(c0896k.f2707e.m1163B());
        c0896k.f2710h.notifyDataSetChanged();
        c0896k.m1884a(-1);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m1885a(C0896k c0896k, int i) {
        Iterator it = c0896k.f2713k.iterator();
        while (it.hasNext()) {
            if (((C0478a) it.next()).f1535a == i) {
                return true;
            }
        }
        return false;
    }
}
