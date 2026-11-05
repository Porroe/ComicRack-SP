package com.cyo.comicrack.viewer;

import com.cyo.common.AbstractC1010bu;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.dj */
/* loaded from: classes.dex */
public final class C0740dj {

    /* renamed from: i */
    private static Map f2327i = new C0741dk();

    /* renamed from: a */
    public boolean f2328a;

    /* renamed from: b */
    public EnumC0732db f2329b;

    /* renamed from: c */
    public boolean f2330c;

    /* renamed from: d */
    public EnumC0743dm f2331d;

    /* renamed from: e */
    public String f2332e;

    /* renamed from: f */
    public String f2333f;

    /* renamed from: g */
    public int f2334g;

    /* renamed from: h */
    public int f2335h;

    public C0740dj() {
        this.f2331d = EnumC0743dm.Off;
    }

    public C0740dj(AbstractC1010bu abstractC1010bu) {
        this.f2331d = EnumC0743dm.Off;
        this.f2330c = abstractC1010bu.mo2104a("wallpaper_tap_change");
        this.f2329b = EnumC0732db.m1751a(abstractC1010bu, "wallpaper_doubletap", EnumC0732db.Read);
        this.f2328a = abstractC1010bu.mo2104a("wallpaper_parallax");
        this.f2332e = abstractC1010bu.mo2106b("wallpaper_comic_selection", null);
        this.f2333f = abstractC1010bu.mo2106b("wallpaper_comic_keywords", null);
        this.f2334g = Integer.parseInt(abstractC1010bu.mo2106b("wallpaper_auto_change", "300"));
        this.f2331d = EnumC0743dm.valueOf(abstractC1010bu.mo2106b("wallpaper_animation", "Off"));
        this.f2335h = abstractC1010bu.mo2105b("wallpaper_dim");
    }

    /* renamed from: a */
    public final void m1761a(AbstractC1010bu abstractC1010bu) {
        abstractC1010bu.mo2103a("wallpaper_tap_change", this.f2330c);
        abstractC1010bu.mo2102a("wallpaper_doubletap", this.f2329b.toString());
        abstractC1010bu.mo2103a("wallpaper_parallax", this.f2328a);
        abstractC1010bu.mo2102a("wallpaper_comic_selection", this.f2332e);
        abstractC1010bu.mo2102a("wallpaper_comic_keywords", this.f2333f);
        abstractC1010bu.mo2102a("wallpaper_auto_change", new StringBuilder().append(this.f2334g).toString());
        abstractC1010bu.mo2102a("wallpaper_animation", this.f2331d.toString());
        abstractC1010bu.mo2101a("wallpaper_dim", this.f2335h);
        abstractC1010bu.mo2100a();
    }

    /* renamed from: a */
    public final C0742dl m1760a() {
        return (C0742dl) f2327i.get(this.f2331d);
    }
}
