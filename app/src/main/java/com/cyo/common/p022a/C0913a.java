package com.cyo.common.p022a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.a */
/* loaded from: classes.dex */
public final class C0913a {

    /* renamed from: a */
    public Context f2753a;

    /* renamed from: b */
    private SparseArray f2754b = new SparseArray();

    /* renamed from: c */
    private SparseArray f2755c = new SparseArray();

    public C0913a(Context context) {
        this.f2753a = context;
    }

    /* renamed from: a */
    public final Drawable m1914a(int i) {
        Drawable drawable;
        synchronized (this.f2755c) {
            drawable = (Drawable) this.f2755c.get(i);
            if (drawable == null) {
                drawable = this.f2753a.getResources().getDrawable(i);
                this.f2755c.put(i, drawable);
            }
        }
        return drawable;
    }
}
