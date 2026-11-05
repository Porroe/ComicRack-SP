package com.cyo.comicrack.viewer;

import android.content.Context;
import android.widget.SectionIndexer;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.common.C0950af;
import com.cyo.common.C0998bi;
import com.cyo.common.InterfaceC1096m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.bc */
/* loaded from: classes.dex */
public final class C0679bc extends C0678bb implements SectionIndexer {

    /* renamed from: c */
    private final InterfaceC1096m f2186c;

    /* renamed from: d */
    private List f2187d;

    public C0679bc(Context context, C0575ak c0575ak, int i, InterfaceC1096m interfaceC1096m) {
        super(context, c0575ak, i);
        this.f2186c = interfaceC1096m;
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i) {
        if (this.f2187d == null || this.f2187d.size() == 0) {
            return 0;
        }
        return ((C0680bd) this.f2187d.get(C0950af.m1990a(i, 0, this.f2187d.size() - 1))).f2189b;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i) {
        if (this.f2187d != null) {
            for (int size = this.f2187d.size() - 1; size >= 0; size--) {
                if (i >= ((C0680bd) this.f2187d.get(size)).f2189b) {
                    return size;
                }
            }
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.f2187d = null;
        super.notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        this.f2187d = null;
        super.notifyDataSetInvalidated();
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        String str;
        int i;
        if (this.f2187d == null) {
            this.f2187d = new ArrayList();
            String str2 = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < getCount()) {
                String strM2084b = C0998bi.m2084b(this.f2186c.mo1735a(((C0572ah) getItem(i2)).m1221j()));
                if (!C0998bi.m2081a(strM2084b)) {
                    int length = strM2084b.length();
                    int iMin = Math.min(length, 2);
                    if (Character.isDigit(strM2084b.charAt(0))) {
                        strM2084b = strM2084b.substring(length - iMin);
                    } else {
                        strM2084b = strM2084b.substring(0, iMin);
                    }
                }
                if (str2 == null || !str2.equals(strM2084b)) {
                    if (str2 != null) {
                        this.f2187d.add(new C0680bd(str2, i3));
                    }
                    str = strM2084b;
                    i = i2;
                } else {
                    i = i3;
                    str = str2;
                }
                i2++;
                str2 = str;
                i3 = i;
            }
            if (str2 != null) {
                this.f2187d.add(new C0680bd(str2, i3));
            }
        }
        return this.f2187d.toArray();
    }
}
