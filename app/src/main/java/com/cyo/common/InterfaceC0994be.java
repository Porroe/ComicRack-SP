package com.cyo.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import com.cyo.common.p022a.C0944o;
import java.io.File;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.be */
/* loaded from: classes.dex */
public interface InterfaceC0994be {
    /* renamed from: a */
    long mo2011a(String str);

    /* renamed from: a */
    Bundle mo2012a(View view, Bitmap bitmap);

    /* renamed from: a */
    C0944o mo2013a(Context context, int i);

    /* renamed from: a */
    InterfaceC0952ah mo2014a(InterfaceC0966av interfaceC0966av, InterfaceC0992bc interfaceC0992bc);

    /* renamed from: a */
    InterfaceC0991bb mo2015a(View view);

    /* renamed from: a */
    File mo2016a();

    /* renamed from: a */
    File mo2017a(Context context);

    /* renamed from: a */
    void mo2018a(Activity activity);

    /* renamed from: a */
    void mo2019a(Activity activity, MenuItem menuItem);

    /* renamed from: a */
    void mo2020a(Activity activity, CharSequence charSequence);

    /* renamed from: a */
    void mo2021a(ProgressDialog progressDialog);

    /* renamed from: a */
    void mo2022a(Context context, Intent intent, Bundle bundle);

    /* renamed from: a */
    void mo2023a(BitmapFactory.Options options);

    /* renamed from: a */
    void mo2024a(MenuItem menuItem);

    /* renamed from: a */
    void mo2025a(MenuItem menuItem, Context context, Intent intent);

    /* renamed from: a */
    void mo2026a(View view, C0944o c0944o);

    /* renamed from: a */
    void mo2027a(View view, boolean z);

    /* renamed from: a */
    void mo2028a(GridView gridView);

    /* renamed from: a */
    void mo2029a(GridView gridView, int i, int i2, int i3);

    /* renamed from: a */
    void mo2030a(GridView gridView, int i, boolean z);

    /* renamed from: a */
    void mo2031a(ListView listView, int i);

    /* renamed from: a */
    void mo2032a(TextView textView);

    /* renamed from: a */
    boolean mo2033a(Context context, EnumC0993bd enumC0993bd);

    /* renamed from: a */
    boolean mo2034a(Canvas canvas);

    /* renamed from: b */
    File[] mo2035b(Context context);

    /* renamed from: c */
    int mo2036c(Context context);

    /* renamed from: d */
    boolean mo2037d(Context context);

    /* renamed from: e */
    AlertDialog.Builder mo2038e(Context context);
}
