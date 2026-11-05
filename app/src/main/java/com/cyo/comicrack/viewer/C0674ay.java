package com.cyo.comicrack.viewer;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.common.C0998bi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ay */
/* loaded from: classes.dex */
final class C0674ay implements Filterable, ListAdapter {

    /* renamed from: a */
    private Context f2175a;

    /* renamed from: b */
    private C0635m f2176b;

    /* renamed from: c */
    private InterfaceC0677ba f2177c;

    /* renamed from: d */
    private boolean f2178d;

    /* renamed from: e */
    private String[] f2179e;

    /* renamed from: f */
    private String[] f2180f;

    /* renamed from: g */
    private List f2181g = new ArrayList();

    /* renamed from: a */
    static /* synthetic */ void m1702a(C0674ay c0674ay, String[] strArr) {
        c0674ay.f2179e = strArr;
    }

    public C0674ay(Context context, C0635m c0635m, InterfaceC0677ba interfaceC0677ba, boolean z) {
        this.f2175a = context;
        this.f2176b = c0635m;
        this.f2177c = interfaceC0677ba;
        this.f2178d = z;
    }

    /* renamed from: a */
    static /* synthetic */ String[] m1703a(C0674ay c0674ay) {
        return c0674ay.m1704b();
    }

    /* renamed from: b */
    private String[] m1704b() {
        int i = 0;
        if (this.f2180f != null) {
            return this.f2180f;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.f2176b.f1931k.iterator();
        while (it.hasNext()) {
            String strMo1700a = this.f2177c.mo1700a((C0505b) it.next());
            if (strMo1700a != null) {
                if (this.f2178d) {
                    String[] strArrSplit = strMo1700a.split(",");
                    for (String str : strArrSplit) {
                        String strTrim = str.trim();
                        if (!C0998bi.m2081a(strTrim)) {
                            hashSet.add(strTrim);
                        }
                    }
                } else {
                    hashSet.add(strMo1700a);
                }
            }
        }
        this.f2180f = new String[hashSet.size()];
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            this.f2180f[i] = (String) it2.next();
            i++;
        }
        Arrays.sort(this.f2180f);
        return this.f2180f;
    }

    /* renamed from: c */
    private String[] m1705c() {
        return this.f2179e != null ? this.f2179e : m1704b();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return m1705c().length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return m1705c()[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return -1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = View.inflate(this.f2175a, android.R.layout.simple_dropdown_item_1line, null);
        }
        ((TextView) view.findViewById(android.R.id.text1)).setText(m1705c()[i]);
        return view;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new C0675az(this);
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f2181g.add(dataSetObserver);
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f2181g.remove(dataSetObserver);
    }

    /* renamed from: a */
    public final void m1706a() {
        Iterator it = this.f2181g.iterator();
        while (it.hasNext()) {
            ((DataSetObserver) it.next()).onChanged();
        }
    }
}
