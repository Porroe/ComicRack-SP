package com.cyo.comicrack.viewer;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.C0632j;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p021b.AbstractC0587aa;
import com.cyo.common.C0951ag;
import com.cyo.common.view.SimpleRatingBar;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.di */
/* loaded from: classes.dex */
final class C0739di implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a */
    private Context f2323a;

    /* renamed from: b */
    private int f2324b;

    /* renamed from: c */
    private String f2325c;

    /* renamed from: d */
    private ArrayList f2326d = new ArrayList();

    public C0739di(Context context, Intent intent) {
        this.f2323a = context;
        this.f2324b = intent.getIntExtra("appWidgetId", 0);
        this.f2325c = intent.getStringExtra("ConfigName");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        m1759a();
    }

    /* renamed from: a */
    private void m1759a() {
        C0736df c0736df = new C0736df(this.f2323a, this.f2325c, this.f2324b);
        ArrayList arrayList = new ArrayList();
        Iterator it = C0628f.m1356a(new C0632j(c0736df.f2307i, c0736df.f2311m)).iterator();
        while (it.hasNext()) {
            arrayList.add(((C0505b) it.next()).f1570b);
        }
        this.f2326d = arrayList;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return this.f2326d.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) throws Resources.NotFoundException {
        C0736df c0736df = new C0736df(this.f2323a, this.f2325c, this.f2324b);
        if (i < 0 || i >= this.f2326d.size()) {
            return null;
        }
        try {
            C0505b c0505bM1351a = C0628f.m1351a((String) this.f2326d.get(i));
            RemoteViews remoteViews = new RemoteViews(this.f2323a.getPackageName(), C0804ft.comic_widget_stack_item);
            AbstractC0587aa abstractC0587aaM1353a = c0505bM1351a == null ? null : C0628f.m1353a(c0505bM1351a, 512, 512);
            if (abstractC0587aaM1353a != null) {
                Bitmap bitmapMo1275d = abstractC0587aaM1353a.mo1275d();
                bitmapMo1275d.setDensity(2);
                remoteViews.setImageViewBitmap(C0803fs.widgetStackCover, bitmapMo1275d);
            } else {
                remoteViews.setImageViewBitmap(C0803fs.widgetStackCover, null);
            }
            remoteViews.setViewVisibility(C0803fs.widgetComicRating, c0736df.f2300b ? 0 : 8);
            if (c0505bM1351a != null) {
                remoteViews.setOnClickFillInIntent(C0803fs.widgetStackItem, EnumC0732db.Read.m1753a(this.f2323a, c0505bM1351a));
                if (c0736df.f2300b) {
                    Resources resources = this.f2323a.getResources();
                    Drawable drawable = resources.getDrawable(C0802fr.rating_star_full);
                    Drawable drawable2 = resources.getDrawable(C0802fr.rating_star_full);
                    float f = c0505bM1351a.f1576h > 0.0f ? c0505bM1351a.f1576h : c0505bM1351a.f1651ai;
                    int iM1993a = C0951ag.m1993a(this.f2323a, 18.0f);
                    remoteViews.setImageViewBitmap(C0803fs.widgetComicRating, SimpleRatingBar.m2393a(iM1993a * 5, iM1993a, drawable, drawable2, f));
                    return remoteViews;
                }
                return remoteViews;
            }
            return remoteViews;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        m1759a();
    }
}
