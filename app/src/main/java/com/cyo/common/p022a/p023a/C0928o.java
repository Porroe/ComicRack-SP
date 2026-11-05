package com.cyo.common.p022a.p023a;

import android.service.wallpaper.WallpaperService;
import android.util.Log;
import android.view.SurfaceHolder;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.a.o */
/* loaded from: classes.dex */
public class C0928o extends WallpaperService.Engine {

    /* renamed from: c */
    public C0925l f2805c;

    /* renamed from: d */
    public InterfaceC0919f f2806d;

    /* renamed from: e */
    public InterfaceC0920g f2807e;

    /* renamed from: f */
    public InterfaceC0921h f2808f;

    /* renamed from: g */
    public InterfaceC0930q f2809g;

    /* renamed from: h */
    final /* synthetic */ C0927n f2810h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0928o(C0927n c0927n) {
        c0927n.super();
        this.f2810h = c0927n;
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public void onVisibilityChanged(boolean z) {
        if (z) {
            this.f2805c.m1952c();
        } else {
            this.f2805c.m1951b();
        }
        super.onVisibilityChanged(z);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public void onCreate(SurfaceHolder surfaceHolder) {
        super.onCreate(surfaceHolder);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public void onDestroy() {
        super.onDestroy();
        this.f2805c.m1953d();
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public void onSurfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f2805c.m1949a(i2, i3);
        super.onSurfaceChanged(surfaceHolder, i, i2, i3);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public void onSurfaceCreated(SurfaceHolder surfaceHolder) {
        Log.d("GLWallpaperService", "onSurfaceCreated()");
        this.f2805c.m1950a(surfaceHolder);
        super.onSurfaceCreated(surfaceHolder);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.d("GLWallpaperService", "onSurfaceDestroyed()");
        this.f2805c.m1947a();
        super.onSurfaceDestroyed(surfaceHolder);
    }

    /* renamed from: a */
    public final void m1957a(int i) {
        this.f2805c.m1948a(i);
    }
}
