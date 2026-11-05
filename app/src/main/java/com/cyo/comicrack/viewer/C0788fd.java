package com.cyo.comicrack.viewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p020a.C0537ce;
import com.cyo.comicrack.p019a.p021b.C0586a;
import com.cyo.comicrack.p019a.p021b.C0620v;
import com.cyo.comicrack.p019a.p021b.EnumC0607i;
import com.cyo.common.view.FastThumbView;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.fd */
/* loaded from: classes.dex */
public final class C0788fd extends BaseAdapter {

    /* renamed from: a */
    private Context f2456a;

    /* renamed from: b */
    private C0620v f2457b;

    public C0788fd(Context context, C0620v c0620v) {
        this.f2456a = context;
        this.f2457b = c0620v;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2457b.m1342l();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f2457b.mo1299a(m1841a(i));
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return m1841a(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int iM1841a = m1841a(i);
        if (view == null) {
            view = LayoutInflater.from(this.f2456a).inflate(C0804ft.page_thumbnail, (ViewGroup) null);
        }
        FastThumbView fastThumbView = (FastThumbView) view.findViewById(C0803fs.pageThumbnailImage);
        TextView textView = (TextView) view.findViewById(C0803fs.pageThumbnailNumber);
        view.setLayoutParams(new Gallery.LayoutParams(0, 0));
        int dimension = (int) this.f2456a.getResources().getDimension(C0801fq.reader_thumbnail_height);
        C0537ce c0537ceMo1299a = this.f2457b.mo1299a(iM1841a);
        if (C0586a.m1267a(view, c0537ceMo1299a.f1669g, c0537ceMo1299a.f1670h, dimension)) {
            dimension = 0;
        }
        textView.setText(String.format("%d", Integer.valueOf(this.f2457b.m1335a(iM1841a, EnumC0607i.fromProvider) + 1)));
        C0586a.m1265a(fastThumbView, this.f2457b, iM1841a, dimension, C0628f.m1366c().m1914a(C0802fr.page_thumbnail_image_page_error));
        return view;
    }

    /* renamed from: a */
    private int m1841a(int i) {
        return !this.f2457b.m1341k() ? i : (this.f2457b.m1342l() - 1) - i;
    }
}
