package com.cyo.common;

import android.content.Context;
import android.widget.BaseAdapter;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.ae */
/* loaded from: classes.dex */
public abstract class AbstractC0949ae extends BaseAdapter {

    /* renamed from: a */
    protected Context f2839a;

    /* renamed from: b */
    protected C0945aa f2840b;

    public AbstractC0949ae(Context context, C0945aa c0945aa) {
        this.f2839a = context;
        this.f2840b = c0945aa;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f2840b == null) {
            return 0;
        }
        return this.f2840b.m1987y();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f2840b.m1983d(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }
}
