package com.cyo.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.cyo.comicrack.viewer.C0803fs;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.br */
/* loaded from: classes.dex */
final class C1007br extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ C0999bj f2971a;

    /* renamed from: b */
    private final Context f2972b;

    public C1007br(C0999bj c0999bj, Context context) {
        this.f2971a = c0999bj;
        this.f2972b = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2971a.f2943a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f2971a.f2943a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1006bq c1006bq = (C1006bq) getItem(i);
        int i2 = c1006bq.f2970f != 0 ? c1006bq.f2970f : this.f2971a.f2944b;
        if (this.f2971a.f2945c != 0 && c1006bq.f2965a) {
            i2 = this.f2971a.f2945c;
        }
        View viewInflate = LayoutInflater.from(this.f2972b).inflate(i2, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(C0803fs.superMenuIcon);
        TextView textView = (TextView) viewInflate.findViewById(C0803fs.superMenuCaption);
        TextView textView2 = (TextView) viewInflate.findViewById(C0803fs.superMenuDescription);
        if (imageView != null) {
            imageView.setImageResource(c1006bq.f2966b);
        }
        if (textView != null) {
            textView.setText(c1006bq.f2967c);
        }
        if (textView2 != null) {
            textView2.setText(c1006bq.f2968d);
        }
        return viewInflate;
    }
}
