package com.cyo.comicrack.viewer;

import android.content.Context;
import android.content.SharedPreferences;
import com.cyo.comicrack.p019a.C0628f;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.df */
/* loaded from: classes.dex */
public final class C0736df {

    /* renamed from: a */
    SharedPreferences f2299a;

    /* renamed from: b */
    public boolean f2300b;

    /* renamed from: c */
    public EnumC0738dh f2301c;

    /* renamed from: d */
    public EnumC0737dg f2302d;

    /* renamed from: e */
    public EnumC0732db f2303e;

    /* renamed from: f */
    public EnumC0732db f2304f;

    /* renamed from: g */
    public EnumC0732db f2305g;

    /* renamed from: h */
    public int f2306h;

    /* renamed from: i */
    public int f2307i;

    /* renamed from: j */
    public boolean f2308j;

    /* renamed from: k */
    public boolean f2309k;

    /* renamed from: l */
    public String f2310l;

    /* renamed from: m */
    public String f2311m;

    /* renamed from: n */
    public boolean f2312n;

    public C0736df(Context context, String str, int i) {
        this.f2299a = m1758a(context, str, i);
        this.f2302d = EnumC0737dg.valueOf(this.f2299a.getString("widget_show_caption", EnumC0737dg.White.toString()));
        this.f2301c = EnumC0738dh.valueOf(this.f2299a.getString("widget_show_cover", EnumC0738dh.Medium.toString()));
        this.f2303e = EnumC0732db.m1750a(this.f2299a, "widget_tap_background", EnumC0732db.Read);
        this.f2304f = EnumC0732db.m1750a(this.f2299a, "widget_tap_cover", EnumC0732db.Read);
        this.f2305g = EnumC0732db.m1750a(this.f2299a, "widget_tap_caption", EnumC0732db.OpenSeries);
        this.f2300b = this.f2299a.getBoolean("widget_show_rating", true);
        this.f2308j = this.f2299a.getBoolean("widget_show_refresh", true);
        this.f2309k = this.f2299a.getBoolean("widget_show_wifi", false);
        this.f2312n = this.f2299a.getBoolean("widget_comic_only_first", false);
        this.f2306h = Integer.parseInt(this.f2299a.getString("widget_auto_change", "60")) * 1000;
        this.f2307i = C0628f.m1361b(this.f2299a.getString("widget_comic_selection", ""));
        this.f2310l = this.f2299a.getString("current_comic_id", "");
        this.f2311m = this.f2299a.getString("widget_comic_keywords", "");
    }

    /* renamed from: a */
    public static SharedPreferences m1758a(Context context, String str, int i) {
        return context.getSharedPreferences(String.valueOf(str) + i, 0);
    }
}
