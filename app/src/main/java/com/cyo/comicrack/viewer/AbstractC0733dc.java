package com.cyo.comicrack.viewer;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.RemoteViews;
import com.cyo.comicrack.p019a.C0628f;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.dc */
/* loaded from: classes.dex */
public abstract class AbstractC0733dc extends AppWidgetProvider {

    /* renamed from: a */
    String f2287a;

    /* renamed from: b */
    private int f2288b;

    /* renamed from: c */
    private Class f2289c;

    /* renamed from: d */
    private Class f2290d;

    /* renamed from: e */
    private int f2291e;

    /* renamed from: a */
    protected abstract boolean mo1463a(Context context, AppWidgetManager appWidgetManager, RemoteViews remoteViews, int i, C0736df c0736df, int i2);

    public AbstractC0733dc(Class cls, Class cls2, int i) {
        this.f2289c = cls;
        this.f2290d = cls2;
        this.f2291e = i;
        this.f2287a = cls.getName();
    }

    /* renamed from: a */
    protected void mo1465a(AppWidgetManager appWidgetManager, RemoteViews remoteViews, int i) {
        appWidgetManager.updateAppWidget(i, remoteViews);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f2288b = intent != null ? intent.getIntExtra("RefreshComic", 0) : 0;
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        int i = this.f2288b;
        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < iArr.length) {
                int i4 = iArr[i3];
                C0736df c0736df = new C0736df(context, this.f2287a, i4);
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                PendingIntent pendingIntentMo1464a = mo1464a(context, i4);
                alarmManager.cancel(pendingIntentMo1464a);
                if (c0736df.f2306h > 0) {
                    alarmManager.set(1, System.currentTimeMillis() + c0736df.f2306h, pendingIntentMo1464a);
                }
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), this.f2291e);
                Intent intent = new Intent(context, (Class<?>) this.f2290d);
                intent.putExtra("appWidgetId", i4);
                intent.setData(Uri.parse(intent.toUri(1)));
                remoteViews.setOnClickPendingIntent(C0803fs.widgetConfigure, PendingIntent.getActivity(context, 0, intent, 134217728));
                remoteViews.setOnClickPendingIntent(C0803fs.widgetWifi, PendingIntent.getBroadcast(context, 0, new Intent("com.cyo.comicracksp.WIFI_REQUEST_SYNC"), 134217728));
                remoteViews.setOnClickPendingIntent(C0803fs.widgetRefresh, m1756a(context, i4, 1));
                remoteViews.setViewVisibility(C0803fs.widgetRefresh, c0736df.f2308j ? 0 : 8);
                remoteViews.setViewVisibility(C0803fs.widgetWifi, (!C0628f.f1889k && c0736df.f2309k && ComicRackApplication.f1954i.m1433a()) ? 0 : 8);
                if (mo1463a(context, appWidgetManager2, remoteViews, i4, c0736df, i)) {
                    mo1465a(appWidgetManager2, remoteViews, i4);
                }
                i2 = i3 + 1;
            } else {
                super.onUpdate(context, appWidgetManager, iArr);
                return;
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                SharedPreferences sharedPreferencesM1758a = C0736df.m1758a(context, this.f2287a, i3);
                if (sharedPreferencesM1758a != null) {
                    sharedPreferencesM1758a.edit().clear().commit();
                }
                ((AlarmManager) context.getSystemService("alarm")).cancel(m1756a(context, i3, 1));
                i = i2 + 1;
            } else {
                super.onDeleted(context, iArr);
                return;
            }
        }
    }

    /* renamed from: a */
    protected PendingIntent mo1464a(Context context, int i) {
        return m1756a(context, i, 1);
    }

    /* renamed from: a */
    protected final PendingIntent m1756a(Context context, int i, int i2) {
        Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
        if (i >= 0) {
            intent.putExtra("appWidgetId", i);
            intent.putExtra("appWidgetIds", new int[]{i});
        }
        intent.setClass(context, this.f2289c);
        intent.putExtra("RefreshComic", i2);
        intent.setData(Uri.parse(intent.toUri(1)));
        return PendingIntent.getBroadcast(context, 0, intent, 134217728);
    }

    /* renamed from: a */
    public static void m1755a(Context context, Class cls, int[] iArr, boolean z) {
        if (iArr == null || iArr.length == 0 || iArr[0] == 0) {
            iArr = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
        }
        Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
        intent.setClass(context, cls);
        intent.putExtra("appWidgetIds", iArr);
        intent.putExtra("RefreshComic", z ? 1 : 0);
        context.sendBroadcast(intent);
    }
}
