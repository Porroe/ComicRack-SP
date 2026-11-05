package com.cyo.comicrack.viewer;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p021b.AbstractC0587aa;
import com.cyo.common.C0951ag;
import com.cyo.common.C0998bi;
import com.cyo.common.p022a.C0944o;
import com.cyo.common.view.SimpleRatingBar;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class ComicWidgetCoverProvider extends AbstractC0733dc {

    /* renamed from: b */
    public static final Class f1983b = ComicWidgetCoverProvider.class;

    /* renamed from: c */
    public static final int f1984c = C0804ft.comic_widget;

    /* renamed from: d */
    private static /* synthetic */ int[] f1985d;

    /* renamed from: e */
    private static /* synthetic */ int[] f1986e;

    /* renamed from: a */
    private static /* synthetic */ int[] m1460a() {
        int[] iArr = f1985d;
        if (iArr == null) {
            iArr = new int[EnumC0737dg.valuesCustom().length];
            try {
                iArr[EnumC0737dg.Black.ordinal()] = 4;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0737dg.None.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0737dg.Transparent.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC0737dg.White.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            f1985d = iArr;
        }
        return iArr;
    }

    /* renamed from: b */
    private static /* synthetic */ int[] m1462b() {
        int[] iArr = f1986e;
        if (iArr == null) {
            iArr = new int[EnumC0738dh.valuesCustom().length];
            try {
                iArr[EnumC0738dh.Large.ordinal()] = 4;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0738dh.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0738dh.None.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC0738dh.Small.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            f1986e = iArr;
        }
        return iArr;
    }

    /* compiled from: DontLook */
    public class ConfigureActivity extends AbstractC0734dd {
        public ConfigureActivity() {
            super(ComicWidgetCoverProvider.f1983b, C0809fy.preferences_widget_cover);
        }
    }

    public ComicWidgetCoverProvider(Class cls, Class cls2) {
        super(cls, cls2, f1984c);
    }

    public ComicWidgetCoverProvider() {
        this(f1983b, ConfigureActivity.class);
    }

    /* compiled from: DontLook */
    public class Version2x2 extends ComicWidgetCoverProvider {

        /* compiled from: DontLook */
        public class ConfigureActivity extends AbstractC0734dd {
            public ConfigureActivity() {
                super(Version2x2.class, C0809fy.preferences_widget_cover);
            }
        }

        public Version2x2() {
            super(Version2x2.class, ConfigureActivity.class);
        }
    }

    /* compiled from: DontLook */
    public class Version4x2 extends ComicWidgetCoverProvider {

        /* compiled from: DontLook */
        public class ConfigureActivity extends AbstractC0734dd {
            public ConfigureActivity() {
                super(Version4x2.class, C0809fy.preferences_widget_cover);
            }
        }

        public Version4x2() {
            super(Version4x2.class, ConfigureActivity.class);
        }
    }

    /* compiled from: DontLook */
    public class Version2x4 extends ComicWidgetCoverProvider {

        /* compiled from: DontLook */
        public class ConfigureActivity extends AbstractC0734dd {
            public ConfigureActivity() {
                super(Version2x4.class, C0809fy.preferences_widget_cover);
            }
        }

        public Version2x4() {
            super(Version2x4.class, ConfigureActivity.class);
        }
    }

    /* compiled from: DontLook */
    public class Version4x4 extends ComicWidgetCoverProvider {

        /* compiled from: DontLook */
        public class ConfigureActivity extends AbstractC0734dd {
            public ConfigureActivity() {
                super(Version4x4.class, C0809fy.preferences_widget_cover);
            }
        }

        public Version4x4() {
            super(Version4x4.class, ConfigureActivity.class);
        }
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0733dc
    /* renamed from: a */
    protected final boolean mo1463a(Context context, AppWidgetManager appWidgetManager, RemoteViews remoteViews, int i, C0736df c0736df, int i2) throws Resources.NotFoundException {
        if (m1461b(context, i)) {
            c0736df.f2301c = EnumC0738dh.None;
        }
        if (i2 > 0) {
            c0736df.f2310l = "";
        }
        C0505b c0505bM1351a = C0628f.m1351a(c0736df.f2310l);
        C0505b c0505bM1350a = c0505bM1351a == null ? C0628f.m1350a(c0736df.f2307i, c0736df.f2311m) : c0505bM1351a;
        c0736df.f2310l = c0505bM1350a == null ? "" : c0505bM1350a.f1570b;
        c0736df.f2299a.edit().putString("current_comic_id", c0736df.f2310l).commit();
        c0736df.f2303e.m1754a(context, remoteViews, C0803fs.widgetCover, c0505bM1350a);
        c0736df.f2305g.m1754a(context, remoteViews, C0803fs.widgetCaptionOverlay, c0505bM1350a);
        c0736df.f2304f.m1754a(context, remoteViews, C0803fs.widgetSmallCover, c0505bM1350a);
        if (c0505bM1350a == null) {
            remoteViews.setViewVisibility(C0803fs.widgetLoading, 0);
            remoteViews.setTextViewText(C0803fs.widgetLoading, context.getString(C0806fv.widget_no_comics));
            return true;
        }
        switch (m1460a()[c0736df.f2302d.ordinal()]) {
            case TwitterResponse.READ_WRITE /* 2 */:
                remoteViews.setImageViewResource(C0803fs.widgetCaptionOverlay, C0800fp.black_transparent_40);
                remoteViews.setTextColor(C0803fs.widgetComicCaption, -1);
                remoteViews.setTextColor(C0803fs.widgetComicSummary, -1);
                remoteViews.setTextColor(C0803fs.widgetComicTitle, -1);
                break;
            case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                remoteViews.setImageViewResource(C0803fs.widgetCaptionOverlay, android.R.color.white);
                remoteViews.setTextColor(C0803fs.widgetComicCaption, -16777216);
                remoteViews.setTextColor(C0803fs.widgetComicSummary, -16777216);
                remoteViews.setTextColor(C0803fs.widgetComicTitle, -16777216);
                break;
            case 4:
                remoteViews.setImageViewResource(C0803fs.widgetCaptionOverlay, android.R.color.black);
                remoteViews.setTextColor(C0803fs.widgetComicCaption, -1);
                remoteViews.setTextColor(C0803fs.widgetComicSummary, -1);
                remoteViews.setTextColor(C0803fs.widgetComicTitle, -1);
                break;
        }
        remoteViews.setViewVisibility(C0803fs.widgetCaptionOverlay, c0736df.f2302d != EnumC0737dg.None ? 0 : 8);
        remoteViews.setViewVisibility(C0803fs.widgetTextContainer, c0736df.f2302d != EnumC0737dg.None ? 0 : 8);
        remoteViews.setViewVisibility(C0803fs.widgetSmallCover, c0736df.f2301c != EnumC0738dh.None ? 0 : 8);
        remoteViews.setViewVisibility(C0803fs.widgetSmallCoverImageLarge, c0736df.f2301c == EnumC0738dh.Large ? 0 : 8);
        remoteViews.setViewVisibility(C0803fs.widgetSmallCoverImageMedium, c0736df.f2301c == EnumC0738dh.Medium ? 0 : 8);
        remoteViews.setViewVisibility(C0803fs.widgetSmallCoverImageSmall, c0736df.f2301c == EnumC0738dh.Small ? 0 : 8);
        remoteViews.setViewVisibility(C0803fs.widgetComicRating, c0736df.f2300b ? 0 : 8);
        DisplayMetrics displayMetricsM1999b = C0951ag.m1999b(context);
        AbstractC0587aa abstractC0587aaM1353a = C0628f.m1353a(c0505bM1350a, displayMetricsM1999b.widthPixels, displayMetricsM1999b.heightPixels);
        if (abstractC0587aaM1353a != null) {
            Bitmap bitmapMo1275d = abstractC0587aaM1353a.mo1275d();
            remoteViews.setImageViewBitmap(C0803fs.widgetCover, bitmapMo1275d);
            if (c0736df.f2301c != EnumC0738dh.None) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapMo1275d, (bitmapMo1275d.getWidth() * 256) / bitmapMo1275d.getHeight(), 256, true);
                switch (m1462b()[c0736df.f2301c.ordinal()]) {
                    case TwitterResponse.READ_WRITE /* 2 */:
                        remoteViews.setImageViewBitmap(C0803fs.widgetSmallCoverImageSmall, bitmapCreateScaledBitmap);
                        break;
                    case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                        remoteViews.setImageViewBitmap(C0803fs.widgetSmallCoverImageMedium, bitmapCreateScaledBitmap);
                        break;
                    case 4:
                        remoteViews.setImageViewBitmap(C0803fs.widgetSmallCoverImageLarge, bitmapCreateScaledBitmap);
                        break;
                }
            }
        } else {
            remoteViews.setImageViewResource(C0803fs.widgetCover, android.R.color.black);
            remoteViews.setImageViewResource(C0803fs.widgetSmallCoverImageLarge, android.R.color.black);
            remoteViews.setImageViewResource(C0803fs.widgetSmallCoverImageMedium, android.R.color.black);
            remoteViews.setImageViewResource(C0803fs.widgetSmallCoverImageSmall, android.R.color.black);
        }
        Resources resources = context.getResources();
        Drawable drawable = resources.getDrawable(C0802fr.rating_star_full);
        Drawable drawable2 = resources.getDrawable(C0802fr.rating_star_full);
        float f = c0505bM1350a.f1576h > 0.0f ? c0505bM1350a.f1576h : c0505bM1350a.f1651ai;
        int iM1993a = C0951ag.m1993a(context, 18.0f);
        remoteViews.setImageViewBitmap(C0803fs.widgetComicRating, SimpleRatingBar.m2393a(iM1993a * 5, iM1993a, drawable, drawable2, f));
        remoteViews.setTextViewText(C0803fs.widgetComicCaption, c0505bM1350a.m1171c(false));
        remoteViews.setTextViewText(C0803fs.widgetComicTitle, c0505bM1350a.f1656w);
        remoteViews.setViewVisibility(C0803fs.widgetComicTitle, C0998bi.m2081a(c0505bM1350a.f1656w) ? 8 : 0);
        if (!C0998bi.m2081a(c0505bM1350a.f1622G)) {
            remoteViews.setTextViewText(C0803fs.widgetComicSummary, c0505bM1350a.f1622G);
        } else {
            remoteViews.setTextViewText(C0803fs.widgetComicSummary, String.valueOf(context.getString(C0806fv.folder)) + ": " + c0505bM1350a.m1147m());
        }
        remoteViews.setViewVisibility(C0803fs.widgetLoading, 8);
        return true;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        if (new C0736df(context, this.f2287a, i).f2301c != EnumC0738dh.None) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C0804ft.comic_widget);
            remoteViews.setViewVisibility(C0803fs.widgetSmallCover, m1461b(context, i) ? 8 : 0);
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }

    /* renamed from: b */
    private static boolean m1461b(Context context, int i) {
        C0944o c0944oMo2013a = C0951ag.m1995a().mo2013a(context, i);
        return (c0944oMo2013a == null || c0944oMo2013a.f2832a == 0 || c0944oMo2013a.f2833b == 0 || (c0944oMo2013a.f2832a * 100) / c0944oMo2013a.f2833b >= 110) ? false : true;
    }
}
