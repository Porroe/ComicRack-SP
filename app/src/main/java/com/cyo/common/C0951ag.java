package com.cyo.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.ag */
/* loaded from: classes.dex */
public final class C0951ag {

    /* renamed from: a */
    private static String f2841a;

    /* renamed from: a */
    public static boolean m1996a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: a */
    public static InterfaceC0994be m1995a() {
        if (m2000b()) {
            return new C0964at((byte) 0);
        }
        if (Build.VERSION.SDK_INT >= 18) {
            return new C0963as((char) 0);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return new C0962ar((char) 0);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return new C0961aq((char) 0);
        }
        if (m2001c()) {
            return new C0960ap((char) 0);
        }
        if (m2004d()) {
            return new C0956al((char) 0);
        }
        if (m2006e()) {
            return new C0955ak((char) 0);
        }
        return new C0953ai((char) 0);
    }

    /* renamed from: b */
    public static boolean m2000b() {
        return Build.VERSION.SDK_INT >= 19;
    }

    /* renamed from: c */
    public static boolean m2001c() {
        return Build.VERSION.SDK_INT >= 14;
    }

    /* renamed from: d */
    public static boolean m2004d() {
        return Build.VERSION.SDK_INT >= 11;
    }

    /* renamed from: e */
    public static boolean m2006e() {
        return Build.VERSION.SDK_INT >= 9;
    }

    /* renamed from: b */
    public static DisplayMetrics m1999b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: c */
    public static boolean m2002c(Context context) {
        DisplayMetrics displayMetricsM1999b = m1999b(context);
        return displayMetricsM1999b.widthPixels < displayMetricsM1999b.heightPixels;
    }

    /* renamed from: a */
    public static boolean m1997a(Context context, EnumC0993bd enumC0993bd) {
        return m1995a().mo2033a(context, enumC0993bd);
    }

    /* renamed from: a */
    public static boolean m1998a(Canvas canvas) {
        return m1995a().mo2034a(canvas);
    }

    /* renamed from: a */
    public static long m1994a(String str) {
        return m1995a().mo2011a(str);
    }

    /* renamed from: d */
    public static String m2003d(Context context) {
        if (f2841a == null) {
            try {
                f2841a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                f2841a = "";
            }
        }
        return f2841a;
    }

    /* renamed from: e */
    public static int m2005e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    public static String m2007f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toCharsString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: g */
    public static byte[] m2008g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static int m1993a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
