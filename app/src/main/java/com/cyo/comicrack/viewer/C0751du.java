package com.cyo.comicrack.viewer;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import com.cyo.common.p022a.p023a.C0916c;
import com.cyo.common.p022a.p023a.C0917d;
import com.cyo.common.p022a.p023a.C0918e;
import com.cyo.common.p022a.p023a.C0925l;
import com.cyo.common.p022a.p023a.C0928o;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.du */
/* loaded from: classes.dex */
final class C0751du extends C0928o implements InterfaceC0752dv {

    /* renamed from: a */
    public SharedPreferencesOnSharedPreferenceChangeListenerC0744dn f2384a;

    /* renamed from: b */
    final /* synthetic */ CoverWallpaperService f2385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C0751du(CoverWallpaperService coverWallpaperService) {
        super(coverWallpaperService);
        this.f2385b = coverWallpaperService;
    }

    /* synthetic */ C0751du(CoverWallpaperService coverWallpaperService, byte b) {
        this(coverWallpaperService);
    }

    @Override // com.cyo.common.p022a.p023a.C0928o, android.service.wallpaper.WallpaperService.Engine
    public final void onCreate(SurfaceHolder surfaceHolder) {
        super.onCreate(surfaceHolder);
        setTouchEventsEnabled(true);
        this.f2384a.m1784a();
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final Bundle onCommand(String str, int i, int i2, int i3, Bundle bundle, boolean z) {
        this.f2384a.m1787a(str);
        return null;
    }

    @Override // com.cyo.common.p022a.p023a.C0928o, android.service.wallpaper.WallpaperService.Engine
    public final void onDestroy() {
        this.f2384a.m1788b();
        super.onDestroy();
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onOffsetsChanged(float f, float f2, float f3, float f4, int i, int i2) {
        super.onOffsetsChanged(f, f2, f3, f4, i, i2);
        this.f2384a.m1785a(i, i2);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        this.f2384a.m1786a(motionEvent);
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0752dv
    /* renamed from: a */
    public final void mo1795a() {
        m1957a(1);
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0752dv
    /* renamed from: b */
    public final void mo1797b() {
        m1957a(0);
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0752dv
    /* renamed from: a */
    public final void mo1796a(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        if (this.f2805c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
        if (this.f2806d == null) {
            this.f2806d = new C0916c();
        }
        if (this.f2807e == null) {
            this.f2807e = new C0917d();
        }
        if (this.f2808f == null) {
            this.f2808f = new C0918e();
        }
        this.f2805c = new C0925l(sharedPreferencesOnSharedPreferenceChangeListenerC0744dn, this.f2806d, this.f2807e, this.f2808f, this.f2809g);
        this.f2805c.start();
        this.f2384a = sharedPreferencesOnSharedPreferenceChangeListenerC0744dn;
    }
}
