package com.cyo.common;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.ao */
/* loaded from: classes.dex */
final class C0959ao implements AbsListView.MultiChoiceModeListener {

    /* renamed from: a */
    final /* synthetic */ C0958an f2852a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC0992bc f2853b;

    C0959ao(C0958an c0958an, InterfaceC0992bc interfaceC0992bc) {
        this.f2852a = c0958an;
        this.f2853b = interfaceC0992bc;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f2853b.mo1727a(menu, C0958an.m2043a(this.f2852a));
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f2853b.mo1734c(menu);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        boolean zMo1728a = this.f2853b.mo1728a(menuItem, C0958an.m2043a(this.f2852a));
        if (zMo1728a) {
            actionMode.finish();
        }
        return zMo1728a;
    }

    @Override // android.widget.AbsListView.MultiChoiceModeListener
    public final void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        this.f2852a.f2851b = actionMode;
        actionMode.invalidate();
    }
}
