package com.cyo.comicrack.viewer;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.RemoteViews;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.common.AbstractC1010bu;
import com.cyo.common.C0998bi;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.db */
/* loaded from: classes.dex */
public enum EnumC0732db {
    None,
    Read,
    OpenSeries,
    OpenStory,
    OpenWriter,
    OpenComicRack;


    /* renamed from: g */
    private static /* synthetic */ int[] f2285g;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0732db[] valuesCustom() {
        EnumC0732db[] enumC0732dbArrValuesCustom = values();
        int length = enumC0732dbArrValuesCustom.length;
        EnumC0732db[] enumC0732dbArr = new EnumC0732db[length];
        System.arraycopy(enumC0732dbArrValuesCustom, 0, enumC0732dbArr, 0, length);
        return enumC0732dbArr;
    }

    /* renamed from: a */
    private static /* synthetic */ int[] m1752a() {
        int[] iArr = f2285g;
        if (iArr == null) {
            iArr = new int[valuesCustom().length];
            try {
                iArr[None.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[OpenComicRack.ordinal()] = 6;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[OpenSeries.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[OpenStory.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[OpenWriter.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[Read.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            f2285g = iArr;
        }
        return iArr;
    }

    /* renamed from: a */
    public final Intent m1753a(Context context, C0505b c0505b) {
        switch (m1752a()[ordinal()]) {
            case 2:
                if (c0505b == null) {
                    return null;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("Book=" + c0505b.f1570b), context, LibraryActivity.class);
                intent.putExtra("ReadBookId", c0505b.f1570b);
                intent.addFlags(603979776);
                return intent;
            case 3:
                if (c0505b == null) {
                    return null;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("FindBookInList=3D8E0FCA-079F-4E69-B2C5-56BE06153769," + c0505b.f1570b), context, LibraryActivity.class);
                intent2.addFlags(603979776);
                return intent2;
            case 4:
                if (c0505b == null || C0998bi.m2081a(c0505b.f1617B)) {
                    return null;
                }
                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("FindBookInList=3D8E0FCA-079F-4E69-B2C6-56BE06153769," + c0505b.f1570b), context, LibraryActivity.class);
                intent3.addFlags(603979776);
                return intent3;
            case 5:
                if (c0505b == null || C0998bi.m2081a(c0505b.f1628M)) {
                    return null;
                }
                Intent intent4 = new Intent("android.intent.action.VIEW", Uri.parse("FindBookInList=3D8E0FCA-079F-4E69-B2C8-56BE06153769," + c0505b.f1570b), context, LibraryActivity.class);
                intent4.addFlags(603979776);
                return intent4;
            case 6:
                return new Intent(context, (Class<?>) LibraryActivity.class);
            default:
                return null;
        }
    }

    public final void bindWidgetClickAction(Context context, RemoteViews widgetViews,
            int viewId, C0505b comic) {
        Intent clickIntent = m1753a(context, comic);
        PendingIntent clickAction;
        if (clickIntent != null) {
            clickAction = PendingIntent.getActivity(context, 0, clickIntent,
                    PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        } else {
            Intent noAction = new Intent(context.getPackageName() + ".WIDGET_NO_ACTION")
                    .setPackage(context.getPackageName());
            clickAction = PendingIntent.getBroadcast(context, 0, noAction,
                    PendingIntent.FLAG_IMMUTABLE);
        }
        widgetViews.setOnClickPendingIntent(viewId, clickAction);
    }

    /* renamed from: a */
    public static EnumC0732db m1750a(SharedPreferences sharedPreferences, String str, EnumC0732db enumC0732db) {
        return valueOf(sharedPreferences.getString(str, enumC0732db.toString()));
    }

    /* renamed from: a */
    public static EnumC0732db m1751a(AbstractC1010bu abstractC1010bu, String str, EnumC0732db enumC0732db) {
        return valueOf(abstractC1010bu.mo2106b(str, enumC0732db.toString()));
    }
}
