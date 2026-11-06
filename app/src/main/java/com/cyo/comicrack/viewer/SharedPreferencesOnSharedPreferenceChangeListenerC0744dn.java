package com.cyo.comicrack.viewer;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p021b.AbstractC0587aa;
import com.cyo.comicrack.p019a.p021b.C0618t;
import com.cyo.common.AbstractC1010bu;
import com.cyo.common.C0951ag;
import com.cyo.common.p022a.AbstractC0934e;
import com.cyo.common.p022a.p023a.C0923j;
import com.cyo.common.p022a.p023a.InterfaceC0929p;
import com.cyo.common.view.ContentAnimation;
import com.cyo.common.view.ContentAnimationQueue;
import com.cyo.common.view.C1165t;
import com.cyo.common.view.EnumC1164s;
import java.util.Timer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.dn */
/* loaded from: classes.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC0744dn implements SharedPreferences.OnSharedPreferenceChangeListener, InterfaceC0929p {

    /* renamed from: a */
    final /* synthetic */ CoverWallpaperService f2345a;

    /* renamed from: b */
    private C0740dj f2346b = new C0740dj();

    /* renamed from: c */
    private long f2347c;

    /* renamed from: d */
    private AbstractC0587aa f2348d;

    /* renamed from: e */
    private C0505b f2349e;

    /* renamed from: f */
    private int f2350f;

    /* renamed from: g */
    private int f2351g;

    /* renamed from: h */
    private boolean f2352h;

    /* renamed from: i */
    private boolean f2353i;

    /* renamed from: j */
    private Timer f2354j;

    /* renamed from: k */
    private Thread f2355k;

    /* renamed from: l */
    private GestureDetector f2356l;

    /* renamed from: m */
    private ContentAnimationQueue f2357m;

    /* renamed from: n */
    private BroadcastReceiver f2358n;

    /* renamed from: o */
    private Bitmap f2359o;

    /* renamed from: p */
    private InterfaceC0752dv f2360p;

    /* renamed from: q */
    private int f2361q;

    /* renamed from: r */
    private int f2362r;

    /* renamed from: s */
    private int f2363s;

    /* renamed from: t */
    private C0923j f2364t;

    /* renamed from: m */
    static /* synthetic */ CoverWallpaperService m1783m(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        return sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2345a;
    }

    /* renamed from: d */
    static /* synthetic */ C0740dj m1772d(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        return sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2346b;
    }

    /* renamed from: a */
    static /* synthetic */ AbstractC0587aa m1763a(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        return sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2348d;
    }

    /* renamed from: a */
    static /* synthetic */ void m1765a(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn, AbstractC0587aa abstractC0587aa) {
        sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2348d = abstractC0587aa;
    }

    /* renamed from: f */
    static /* synthetic */ C0505b m1774f(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        return sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2349e;
    }

    /* renamed from: k */
    static /* synthetic */ void m1781k(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2352h = false;
    }

    /* renamed from: e */
    static /* synthetic */ void m1773e(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2353i = false;
    }

    /* renamed from: g */
    static /* synthetic */ boolean m1777g(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        return sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2353i;
    }

    /* renamed from: j */
    static /* synthetic */ void m1780j(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2355k = null;
    }

    /* renamed from: c */
    static /* synthetic */ ContentAnimationQueue m1771c(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        return sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2357m;
    }

    /* renamed from: l */
    static /* synthetic */ InterfaceC0752dv m1782l(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        return sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2360p;
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC0744dn(CoverWallpaperService coverWallpaperService, InterfaceC0752dv interfaceC0752dv) {
        this.f2345a = coverWallpaperService;
        this.f2360p = interfaceC0752dv;
    }

    /* renamed from: a */
    public final void m1784a() {
        this.f2347c = System.currentTimeMillis();
        this.f2357m = new ContentAnimationQueue();
        this.f2357m.f3668d = false;
        this.f2357m.f3667c = false;
        this.f2356l = new GestureDetector(this.f2345a, new C0745do(this));
        SharedPreferences sharedPreferencesM1441e = ComicRackApplication.f1954i.m1441e();
        sharedPreferencesM1441e.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferencesM1441e, null);
        this.f2358n = new C0746dp(this);
        this.f2345a.registerReceiver(this.f2358n, new IntentFilter("ComicRackWallPaperPropertiesChanges"));
        m1775f();
    }

    /* renamed from: b */
    public final void m1788b() {
        m1776g();
        if (this.f2354j != null) {
            this.f2354j.cancel();
            this.f2354j = null;
        }
        ComicRackApplication.f1954i.m1441e().unregisterOnSharedPreferenceChangeListener(this);
        this.f2345a.unregisterReceiver(this.f2358n);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C0740dj c0740dj = this.f2346b;
        this.f2346b = new C0740dj(AbstractC1010bu.m2099a(sharedPreferences));
        if (c0740dj.m1760a().m1762a() != this.f2346b.m1760a().m1762a() && c0740dj.m1760a().m1762a()) {
            m1764a(this.f2348d);
        }
        if (c0740dj.f2334g != this.f2346b.f2334g) {
            if (this.f2354j != null) {
                this.f2354j.cancel();
                this.f2354j = null;
            }
            if (this.f2346b.f2334g > 0) {
                int i = this.f2346b.f2334g * 1000;
                this.f2354j = new Timer("New Image Loader");
                this.f2354j.schedule(new C0747dq(this), i, i);
            }
        }
        this.f2360p.mo1795a();
    }

    /* renamed from: a */
    public final void m1787a(String str) {
        if (str.equals("android.wallpaper.tap")) {
            this.f2353i = true;
        }
    }

    /* renamed from: i */
    static /* synthetic */ void m1779i(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        int iM1361b = C0628f.m1361b(sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2346b.f2332e);
        try {
            C0505b c0505bM1350a = C0628f.m1350a(iM1361b, sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2346b.f2333f);
            if (c0505bM1350a == null) {
                c0505bM1350a = C0628f.m1350a(iM1361b, (String) null);
            }
            C0505b c0505bM1350a2 = c0505bM1350a == null ? C0628f.m1350a(0, (String) null) : c0505bM1350a;
            AbstractC0587aa abstractC0587aaM1353a = C0628f.m1353a(c0505bM1350a2, 1024, 2048);
            abstractC0587aaM1353a.f1770c = false;
            sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1764a(sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2361q != 0 ? new C0618t(abstractC0587aaM1353a.mo1275d(), sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2361q) : new C0618t(abstractC0587aaM1353a.mo1275d()));
            sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.f2349e = c0505bM1350a2;
        } catch (Exception e) {
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m1778h(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1775f();
    }

    /* renamed from: f */
    private void m1775f() {
        if (!this.f2352h) {
            this.f2352h = true;
            this.f2360p.mo1795a();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m1770b(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn, AbstractC0587aa abstractC0587aa) {
        sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1764a(abstractC0587aa);
    }

    /* renamed from: a */
    private void m1764a(AbstractC0587aa abstractC0587aa) {
        int iNextInt;
        C0742dl c0742dlM1760a = this.f2346b.m1760a();
        C0750dt c0750dt = new C0750dt(this, m1768b(abstractC0587aa), m1768b(abstractC0587aa), abstractC0587aa, c0742dlM1760a.f2336a);
        ContentAnimationQueue c1161p = this.f2357m;
        if (c0742dlM1760a.m1762a()) {
            iNextInt = (c0742dlM1760a.f2337b <= c0742dlM1760a.f2338c ? 0 : CoverWallpaperService.m1466a().nextInt(c0742dlM1760a.f2337b - c0742dlM1760a.f2338c)) + c0742dlM1760a.f2338c;
        } else {
            iNextInt = c0742dlM1760a.f2337b;
        }
        c1161p.m2440a(c0750dt, iNextInt);
        c0750dt.m2431f();
    }

    /* renamed from: b */
    private C0749ds m1768b(AbstractC0587aa abstractC0587aa) {
        C0749ds c0749ds = new C0749ds(this);
        if (abstractC0587aa == null) {
            return c0749ds;
        }
        int iMo1274c = abstractC0587aa.mo1274c();
        int iMo1273b = abstractC0587aa.mo1273b();
        if (!this.f2346b.m1760a().m1762a()) {
            c0749ds.f2371c = iMo1274c / 5;
        } else {
            C1165t c1165t = new C1165t(EnumC1164s.FitInside);
            m1767a(c1165t, (AbstractC0934e) null);
            c1165t.m2465a(iMo1273b, iMo1274c);
            c1165t.f3690f = ((this.f2346b.f2328a ? 1.0f : 2.0f) * CoverWallpaperService.m1466a().nextFloat()) + 1.0f;
            int iM2477k = (int) (iMo1273b - c1165t.m2477k());
            int iM2478l = (int) (iMo1274c - c1165t.m2478l());
            c0749ds.f2369a = c1165t.f3690f;
            c0749ds.f2370b = CoverWallpaperService.m1466a().nextInt(Math.max(1, iM2477k));
            c0749ds.f2371c = CoverWallpaperService.m1466a().nextInt(Math.max(1, iM2478l));
        }
        return c0749ds;
    }

    /* renamed from: b */
    static /* synthetic */ void m1769b(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn) {
        sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1776g();
    }

    /* renamed from: g */
    private void m1776g() {
        if (this.f2348d != null) {
            this.f2348d.m1279h();
            this.f2348d = null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m1766a(SharedPreferencesOnSharedPreferenceChangeListenerC0744dn sharedPreferencesOnSharedPreferenceChangeListenerC0744dn, C1165t c1165t, AbstractC0934e abstractC0934e) {
        sharedPreferencesOnSharedPreferenceChangeListenerC0744dn.m1767a(c1165t, abstractC0934e);
    }

    /* renamed from: a */
    private void m1767a(C1165t c1165t, AbstractC0934e abstractC0934e) {
        int iMo1937f;
        int iMo1938g;
        if (this.f2346b.f2328a) {
            c1165t.f3686b = this.f2360p.getDesiredMinimumWidth();
            c1165t.f3687c = this.f2360p.getDesiredMinimumHeight();
        }
        if (abstractC0934e == null) {
            DisplayMetrics displayMetricsM1999b = C0951ag.m1999b(this.f2345a.getApplicationContext());
            iMo1937f = displayMetricsM1999b.widthPixels;
            iMo1938g = displayMetricsM1999b.heightPixels;
        } else {
            iMo1937f = abstractC0934e.mo1937f();
            iMo1938g = abstractC0934e.mo1938g();
        }
        if (c1165t.f3686b <= 0) {
            c1165t.f3686b = iMo1937f;
        }
        if (c1165t.f3687c <= 0) {
            c1165t.f3687c = iMo1938g;
        }
    }

    /* renamed from: a */
    public final void m1786a(MotionEvent motionEvent) {
        this.f2356l.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void m1785a(int i, int i2) {
        this.f2350f = i;
        this.f2351g = i2;
        if (this.f2346b.f2328a) {
            this.f2360p.mo1795a();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        boolean z;
        if (this.f2364t == null) {
            this.f2364t = new C0923j(gl10, this.f2363s, this.f2362r);
            this.f2361q = 256;
        }
        C0923j c0923j = this.f2364t;
        if (this.f2352h && this.f2355k == null) {
            ContentAnimation[] abstractC1159nArrM2444a = this.f2357m.m2444a();
            int i = 0;
            while (true) {
                if (i >= abstractC1159nArrM2444a.length) {
                    z = false;
                    break;
                } else {
                    if (((C0750dt) abstractC1159nArrM2444a[i]).f2374b != this.f2348d) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                this.f2355k = new Thread(new RunnableC0748dr(this), "Load Cover");
                this.f2355k.setPriority(1);
                this.f2355k.start();
            }
        }
        c0923j.mo1926a();
        c0923j.mo1936e();
        c0923j.mo1934c();
        if (this.f2346b.f2328a) {
            c0923j.mo1927a(this.f2350f, this.f2351g);
        }
        if (!this.f2357m.m2443a((Canvas) null, c0923j) && this.f2348d != null) {
            m1764a(this.f2348d);
        }
        c0923j.mo1935d();
        if (this.f2346b.f2335h > 5) {
            Paint paint = new Paint();
            paint.setColor(-16777216);
            paint.setAlpha((this.f2346b.f2335h * 255) / 100);
            c0923j.mo1931a(new Rect(0, 0, 10000, 10000), paint);
        }
        if (C0628f.f1889k && this.f2347c + 300000 <= System.currentTimeMillis()) {
            if (this.f2359o == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                this.f2359o = BitmapFactory.decodeResource(this.f2345a.getResources(), C0802fr.ad_replacement_banner, options);
            }
            if (this.f2359o != null) {
                int width = this.f2359o.getWidth();
                int height = this.f2359o.getHeight();
                int iMin = Math.min(width, (int) (c0923j.mo1937f() * 0.9f));
                int iMo1937f = (c0923j.mo1937f() - iMin) / 2;
                int iMo1938g = c0923j.mo1938g() / 10;
                Paint paint2 = new Paint();
                paint2.setFilterBitmap(false);
                paint2.setDither(false);
                c0923j.mo1928a(this.f2359o, new Rect(0, 0, width, height), new Rect(iMo1937f, iMo1938g, iMo1937f + iMin, iMo1938g + ((int) ((iMin / width) * height))), paint2);
            }
        }
        c0923j.mo1932b();
        if (!this.f2357m.m2446b()) {
            this.f2360p.mo1797b();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f2363s = i;
        this.f2362r = i2;
        this.f2364t = null;
    }

    @Override // com.cyo.common.p022a.p023a.InterfaceC0929p
    /* renamed from: c */
    public final void mo1789c() {
        if (this.f2364t != null) {
            this.f2364t.mo1940i();
        }
        this.f2364t = null;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }

    @Override // com.cyo.common.p022a.p023a.InterfaceC0929p
    /* renamed from: d */
    public final void mo1790d() {
        if (this.f2357m != null) {
            ContentAnimationQueue c1161p = this.f2357m;
            synchronized (c1161p.f3665a) {
                for (ContentAnimation abstractC1159n : c1161p.f3665a) {
                    if (abstractC1159n.m2430e() && abstractC1159n.frameTimeOverrideMillis == 0) {
                        abstractC1159n.frameTimeOverrideMillis = AnimationUtils.currentAnimationTimeMillis();
                    }
                }
            }
        }
    }

    @Override // com.cyo.common.p022a.p023a.InterfaceC0929p
    /* renamed from: e */
    public final void mo1791e() {
        if (this.f2357m != null) {
            ContentAnimationQueue c1161p = this.f2357m;
            synchronized (c1161p.f3665a) {
                for (ContentAnimation abstractC1159n : c1161p.f3665a) {
                    if (abstractC1159n.frameTimeOverrideMillis != 0) {
                        abstractC1159n.startTimeMillis += AnimationUtils.currentAnimationTimeMillis() - abstractC1159n.frameTimeOverrideMillis;
                        abstractC1159n.frameTimeOverrideMillis = 0L;
                        abstractC1159n.m2427b();
                    }
                }
            }
        }
    }
}
