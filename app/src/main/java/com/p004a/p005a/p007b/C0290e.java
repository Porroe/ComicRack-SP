package com.p004a.p005a.p007b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p004a.p005a.ActivityC0274b;
import com.p004a.p005a.C0257aj;
import com.p004a.p005a.C0332bu;
import com.p004a.p005a.C0392h;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0369f;
import com.p004a.p005a.p011e.C0372i;
import com.p004a.p005a.p011e.C0381r;
import com.p004a.p005a.p011e.C0383t;
import java.lang.ref.WeakReference;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.e */
/* loaded from: classes.dex */
public class C0290e extends WebView {

    /* renamed from: a */
    private WeakReference f774a;

    /* renamed from: b */
    protected final C0332bu f775b;

    /* renamed from: c */
    private C0392h f776c;

    /* renamed from: d */
    private boolean f777d;

    /* renamed from: e */
    private boolean f778e;

    /* renamed from: f */
    private boolean f779f;

    public C0290e(C0332bu c0332bu, C0392h c0392h) {
        super((Context) c0332bu.f967f.m898a());
        this.f775b = c0332bu;
        this.f776c = c0392h;
        this.f774a = null;
        this.f777d = false;
        this.f778e = false;
        this.f779f = false;
        setBackgroundColor(0);
        C0358a.m874a(this);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        setDownloadListener(new C0291f(this));
        if (C0358a.f1021a >= 17) {
            C0381r.m925a(settings, c0332bu);
            settings.setMediaPlaybackRequiresUserGesture(false);
        } else if (C0358a.f1021a >= 11) {
            C0381r.m925a(settings, c0332bu);
        }
        setScrollBarStyle(33554432);
        if (C0358a.f1021a >= 14) {
            setWebChromeClient(new C0369f(c0332bu));
        } else if (C0358a.f1021a >= 11) {
            setWebChromeClient(new C0383t(c0332bu));
        }
    }

    /* renamed from: e */
    public final void m711e() {
        ActivityC0274b activityC0274bM714h = m714h();
        if (activityC0274bM714h != null) {
            activityC0274bM714h.finish();
        }
    }

    /* renamed from: f */
    public final void m712f() {
        if (C0358a.f1021a >= 11) {
            setLayerType(1, null);
        }
        this.f778e = true;
    }

    /* renamed from: g */
    public final void m713g() {
        if (this.f778e && C0358a.f1021a >= 11) {
            setLayerType(0, null);
        }
        this.f778e = false;
    }

    /* renamed from: h */
    public final ActivityC0274b m714h() {
        if (this.f774a != null) {
            return (ActivityC0274b) this.f774a.get();
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m715i() {
        return this.f779f;
    }

    /* renamed from: j */
    public final boolean m716j() {
        return this.f778e;
    }

    public void setAdActivity(ActivityC0274b activityC0274b) {
        this.f774a = new WeakReference(activityC0274b);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            C0372i.m919d("An error occurred while loading data in AdWebView:", th);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            C0372i.m919d("An error occurred while loading a URL in AdWebView:", th);
        }
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Throwable th) {
            C0372i.m919d("An error occurred while stopping loading in AdWebView:", th);
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable th) {
            C0372i.m919d("An error occurred while destroying an AdWebView:", th);
        }
        try {
            setWebViewClient(new WebViewClient());
        } catch (Throwable th2) {
        }
    }

    public synchronized void setAdSize(C0392h c0392h) {
        this.f776c = c0392h;
        requestLayout();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        synchronized (this) {
            if (isInEditMode() || this.f776c == null || this.f777d) {
                super.onMeasure(i, i2);
            } else {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = getContext().getResources().getDisplayMetrics().density;
                int iM929a = (int) (this.f776c.m929a() * f);
                int iM930b = (int) (this.f776c.m930b() * f);
                int i3 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
                int i4 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size2 : Integer.MAX_VALUE;
                if (iM929a - (f * 6.0f) > i3 || iM930b > i4) {
                    C0372i.m914b("Not enough space to show ad! Wants: <" + iM929a + ", " + iM930b + ">, Has: <" + size + ", " + size2 + ">");
                    setVisibility(8);
                    setMeasuredDimension(size, size2);
                } else {
                    setMeasuredDimension(iM929a, iM930b);
                }
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0257aj c0257aj = (C0257aj) this.f775b.f979r.m899a();
        if (c0257aj != null) {
            c0257aj.m601a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCustomClose(boolean z) {
        ActivityC0274b activityC0274b;
        this.f779f = z;
        if (this.f774a != null && (activityC0274b = (ActivityC0274b) this.f774a.get()) != null) {
            activityC0274b.m645a(z);
        }
    }

    public void setIsExpandedMraid(boolean z) {
        this.f777d = z;
    }

    /* renamed from: a */
    public final void m710a(boolean z) {
        if (z) {
            setOnTouchListener(new ViewOnTouchListenerC0292g(this));
        } else {
            setOnTouchListener(null);
        }
    }
}
