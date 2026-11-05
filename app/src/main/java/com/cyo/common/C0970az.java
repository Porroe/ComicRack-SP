package com.cyo.common;

import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.az */
/* loaded from: classes.dex */
public final class C0970az implements InterfaceC0966av {

    /* renamed from: a */
    final ListView f2863a;

    private C0970az(ListView listView) {
        this.f2863a = listView;
    }

    public /* synthetic */ C0970az(ListView listView, byte b) {
        this(listView);
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: a */
    public final AbsListView mo2044a() {
        try {
            return this.f2863a;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: d */
    public final void mo2053d(int i) {
        this.f2863a.setItemChecked(i, true);
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: b */
    public final int mo2048b() {
        for (int i = 0; i < this.f2863a.getCount(); i++) {
            if (this.f2863a.isItemChecked(i)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: b */
    public final void mo2049b(int i) {
        C0951ag.m1995a().mo2031a(this.f2863a, i);
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: a */
    public final void mo2045a(int i) {
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: c */
    public final void mo2051c(int i) {
        this.f2863a.setChoiceMode(i);
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: a */
    public final void mo2046a(ListAdapter listAdapter) {
        this.f2863a.setAdapter(listAdapter);
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: d */
    public final ListAdapter mo2052d() {
        return this.f2863a.getAdapter();
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: c */
    public final C0965au mo2050c() {
        return new C0965au(this.f2863a.getFirstVisiblePosition(), this.f2863a.getChildAt(0) != null ? this.f2863a.getTop() : 0);
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: a */
    public final void mo2047a(C0965au c0965au) {
        if (c0965au != null) {
            this.f2863a.post(new RunnableC0990ba(this, c0965au));
        }
    }
}
