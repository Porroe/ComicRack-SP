package com.cyo.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.NumberPicker;
import android.widget.SearchView;
import android.widget.TextView;
import com.cyo.comicrack.viewer.C0802fr;

/* compiled from: DontLook */
@TargetApi(11)
/* renamed from: com.cyo.common.al */
/* loaded from: classes.dex */
class C0956al extends C0955ak {
    private C0956al() {
        super((byte) 0);
    }

    /* synthetic */ C0956al(byte b) {
        this();
    }

    /* synthetic */ C0956al(char c) {
        this();
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2024a(MenuItem menuItem) {
        menuItem.setShowAsAction(1);
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2019a(Activity activity, MenuItem menuItem) {
        SearchManager searchManager = (SearchManager) activity.getSystemService("search");
        SearchView searchView = new SearchView(activity);
        searchView.setId(menuItem.getItemId());
        searchView.setSearchableInfo(searchManager.getSearchableInfo(activity.getComponentName()));
        searchView.setSubmitButtonEnabled(true);
        searchView.setQueryRefinementEnabled(true);
        menuItem.setActionView(searchView);
        menuItem.setIcon(C0802fr.btn_search);
        menuItem.setShowAsAction(1);
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final boolean mo2034a(Canvas canvas) {
        return canvas.isHardwareAccelerated();
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2029a(GridView gridView, int i, int i2, int i3) {
        gridView.smoothScrollToPositionFromTop(i, i2, i3);
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2023a(BitmapFactory.Options options) {
        options.inPreferQualityOverSpeed = true;
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2032a(TextView textView) {
        textView.setTextIsSelectable(true);
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final InterfaceC0952ah mo2014a(InterfaceC0966av interfaceC0966av, InterfaceC0992bc interfaceC0992bc) {
        return new C0958an(interfaceC0966av, interfaceC0992bc);
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2021a(ProgressDialog progressDialog) {
        progressDialog.setProgressNumberFormat(null);
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: c */
    public final int mo2036c(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass();
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2018a(Activity activity) {
        activity.getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final InterfaceC0991bb mo2015a(View view) {
        return new C0957am(this, (NumberPicker) view);
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2020a(Activity activity, CharSequence charSequence) {
        activity.getActionBar().setSubtitle(charSequence);
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2028a(GridView gridView) {
        gridView.setChoiceMode(1);
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2030a(GridView gridView, int i, boolean z) {
        gridView.setItemChecked(i, z);
    }
}
