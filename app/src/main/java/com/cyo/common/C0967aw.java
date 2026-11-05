package com.cyo.common;

import android.view.View;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ListAdapter;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.aw */
/* loaded from: classes.dex */
public final class C0967aw implements InterfaceC0966av {

    /* renamed from: a */
    final GridView f2856a;

    private C0967aw(GridView gridView) {
        this.f2856a = gridView;
    }

    public /* synthetic */ C0967aw(GridView gridView, byte b) {
        this(gridView);
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: a */
    public final AbsListView mo2044a() {
        try {
            return this.f2856a;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: d */
    public final void mo2053d(int i) {
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: b */
    public final int mo2048b() {
        return -1;
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: a */
    public final void mo2045a(int i) {
        this.f2856a.setColumnWidth(i);
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: c */
    public final void mo2051c(int i) {
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: a */
    public final void mo2046a(ListAdapter listAdapter) {
        boolean zIsFastScrollEnabled = this.f2856a.isFastScrollEnabled();
        if (zIsFastScrollEnabled) {
            this.f2856a.setFastScrollEnabled(false);
        }
        this.f2856a.setAdapter(listAdapter);
        if (zIsFastScrollEnabled) {
            this.f2856a.setFastScrollEnabled(true);
        }
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: d */
    public final ListAdapter mo2052d() {
        return this.f2856a.getAdapter();
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: c */
    public final C0965au mo2050c() {
        View childAt = this.f2856a.getChildAt(0);
        return new C0965au(this.f2856a.getFirstVisiblePosition(), childAt != null ? childAt.getTop() : 0);
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: a */
    public final void mo2047a(C0965au c0965au) {
        if (c0965au != null) {
            this.f2856a.post(new RunnableC0968ax(this, c0965au));
        }
    }

    @Override // com.cyo.common.InterfaceC0966av
    /* renamed from: b */
    public final void mo2049b(int i) {
    }
}
