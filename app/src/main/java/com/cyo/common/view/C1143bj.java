package com.cyo.common.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bj */
/* loaded from: classes.dex */
public class C1143bj extends BaseAdapter {

    /* renamed from: a */
    private int f3623a;

    /* renamed from: b */
    Context f3624b;

    /* renamed from: c */
    private List f3625c;

    public C1143bj(Context context, int i, List list) {
        this.f3624b = context;
        this.f3623a = i;
        this.f3625c = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f3625c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f3625c.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return view != null ? view : LayoutInflater.from(this.f3624b).inflate(this.f3623a, (ViewGroup) null);
    }
}
