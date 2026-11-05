package com.cyo.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import com.cyo.common.p022a.C0944o;
import java.io.File;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
@TargetApi(8)
/* renamed from: com.cyo.common.ai */
/* loaded from: classes.dex */
class C0953ai implements InterfaceC0994be {

    /* renamed from: a */
    private static /* synthetic */ int[] f2842a;

    private C0953ai() {
    }

    /* synthetic */ C0953ai(byte b) {
        this();
    }

    /* synthetic */ C0953ai(char c) {
        this();
    }

    /* renamed from: b */
    private static /* synthetic */ int[] m2010b() {
        int[] iArr = f2842a;
        if (iArr == null) {
            iArr = new int[EnumC0993bd.valuesCustom().length];
            try {
                iArr[EnumC0993bd.Large.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0993bd.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0993bd.Small.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC0993bd.XLarge.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            f2842a = iArr;
        }
        return iArr;
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2019a(Activity activity, MenuItem menuItem) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2024a(MenuItem menuItem) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public boolean mo2034a(Canvas canvas) {
        return false;
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2029a(GridView gridView, int i, int i2, int i3) {
        gridView.setSelection(i);
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2027a(View view, boolean z) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2023a(BitmapFactory.Options options) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2032a(TextView textView) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public InterfaceC0952ah mo2014a(InterfaceC0966av interfaceC0966av, InterfaceC0992bc interfaceC0992bc) {
        return null;
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2021a(ProgressDialog progressDialog) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2025a(MenuItem menuItem, Context context, Intent intent) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public Bundle mo2012a(View view, Bitmap bitmap) {
        return null;
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2022a(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent);
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2018a(Activity activity) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public InterfaceC0991bb mo2015a(View view) {
        return new C0954aj(this, (TextView) view);
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public C0944o mo2013a(Context context, int i) {
        return null;
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public boolean mo2033a(Context context, EnumC0993bd enumC0993bd) {
        int i = context.getResources().getConfiguration().screenLayout & 15;
        switch (m2010b()[enumC0993bd.ordinal()]) {
            case TwitterResponse.READ /* 1 */:
                return true;
            case TwitterResponse.READ_WRITE /* 2 */:
                return i >= 2;
            case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                return i >= 3;
            default:
                return false;
        }
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2020a(Activity activity, CharSequence charSequence) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2028a(GridView gridView) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2030a(GridView gridView, int i, boolean z) {
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public long mo2011a(String str) {
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2026a(View view, C0944o c0944o) {
        DisplayMetrics displayMetricsM1999b = C0951ag.m1999b(view.getContext());
        c0944o.f2832a = displayMetricsM1999b.widthPixels;
        c0944o.f2833b = displayMetricsM1999b.heightPixels;
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final File mo2017a(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: b */
    public File[] mo2035b(Context context) {
        return new File[]{context.getExternalFilesDir(null)};
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: c */
    public int mo2036c(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getMemoryClass();
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final File mo2016a() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2031a(ListView listView, int i) {
        listView.smoothScrollToPosition(i);
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: d */
    public boolean mo2037d(Context context) {
        return true;
    }

    @Override // com.cyo.common.InterfaceC0994be
    /* renamed from: e */
    public final AlertDialog.Builder mo2038e(Context context) {
        return new AlertDialog.Builder(context);
    }
}
