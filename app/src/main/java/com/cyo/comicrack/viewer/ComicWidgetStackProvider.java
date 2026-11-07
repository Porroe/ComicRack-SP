package com.cyo.comicrack.viewer;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;

/* compiled from: DontLook */
@TargetApi(11)
/* loaded from: classes.dex */
public class ComicWidgetStackProvider extends AbstractC0733dc {

    /* renamed from: b */
    public static final Class f1987b = ComicWidgetStackProvider.class;

    /* renamed from: c */
    public static final int f1988c = C0804ft.comic_widget_stack;

    /* compiled from: DontLook */
    public static class ConfigureActivity extends AbstractC0734dd {
        public ConfigureActivity() {
            super(ComicWidgetStackProvider.f1987b, C0809fy.preferences_widget_stack);
        }
    }

    public ComicWidgetStackProvider() {
        super(f1987b, ConfigureActivity.class, f1988c);
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0733dc
    /* renamed from: a */
    protected final boolean mo1463a(Context context, AppWidgetManager appWidgetManager, RemoteViews remoteViews, int i, C0736df c0736df, int i2) {
        if (i2 == 2) {
            remoteViews.showNext(C0803fs.comicStackView);
            appWidgetManager.partiallyUpdateAppWidget(i, remoteViews);
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) StackWidgetService.class);
        intent.putExtra("appWidgetId", i);
        intent.putExtra("ConfigName", this.f2287a);
        intent.putExtra("Keywords", c0736df.f2311m);
        intent.putExtra("Selection", c0736df.f2307i);
        intent.putExtra("ShowRating", c0736df.f2300b);
        intent.setData(Uri.parse(intent.toUri(1)));
        remoteViews.setRemoteAdapter(i, C0803fs.comicStackView, intent);
        remoteViews.setEmptyView(C0803fs.comicStackView, C0803fs.comicStackEmptyView);
        Intent intent2 = new Intent(context, (Class<?>) LibraryActivity.class);
        intent2.setAction("android.intent.action.VIEW");
        intent2.putExtra("appWidgetId", i);
        intent2.addFlags(603979776);
        intent2.setData(Uri.parse(intent.toUri(1)));
        // Collection items supply their comic ID through fill-in intents.
        int templateFlags = PendingIntent.FLAG_UPDATE_CURRENT;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
            templateFlags |= PendingIntent.FLAG_MUTABLE;
        }
        remoteViews.setPendingIntentTemplate(C0803fs.comicStackView,
                PendingIntent.getActivity(context, 0, intent2, templateFlags));
        return true;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0733dc
    /* renamed from: a */
    protected final void mo1465a(AppWidgetManager appWidgetManager, RemoteViews remoteViews, int i) {
        appWidgetManager.updateAppWidget(i, remoteViews);
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0733dc
    /* renamed from: a */
    protected final PendingIntent mo1464a(Context context, int i) {
        return m1756a(context, i, 2);
    }

    /* compiled from: DontLook */
    public static class StackWidgetService extends RemoteViewsService {
        @Override // android.widget.RemoteViewsService
        public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
            return new C0739di(getApplicationContext(), intent);
        }
    }
}
