package com.p004a.p005a;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.p004a.p005a.p007b.C0279ad;
import com.p004a.p005a.p007b.C0288c;
import com.p004a.p005a.p007b.C0290e;
import com.p004a.p005a.p007b.C0293h;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p007b.C0309x;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DontLook */
/* renamed from: com.a.a.b */
/* loaded from: classes.dex */
public class ActivityC0274b extends Activity implements View.OnClickListener {

    /* renamed from: a */
    private static final C0293h f699a = (C0293h) C0293h.f782a.mo727a();

    /* renamed from: b */
    private static final Object f700b = new Object();

    /* renamed from: c */
    private static ActivityC0274b f701c = null;

    /* renamed from: d */
    private static C0308w f702d = null;

    /* renamed from: e */
    private static ActivityC0274b f703e = null;

    /* renamed from: f */
    private static ActivityC0274b f704f = null;

    /* renamed from: g */
    private static final C0338c f705g = new C0338c();

    /* renamed from: h */
    private C0290e f706h;

    /* renamed from: i */
    private FrameLayout f707i;

    /* renamed from: j */
    private int f708j;

    /* renamed from: l */
    private boolean f710l;

    /* renamed from: m */
    private long f711m;

    /* renamed from: n */
    private RelativeLayout f712n;

    /* renamed from: p */
    private boolean f714p;

    /* renamed from: q */
    private boolean f715q;

    /* renamed from: r */
    private boolean f716r;

    /* renamed from: s */
    private boolean f717s;

    /* renamed from: t */
    private C0288c f718t;

    /* renamed from: k */
    private ViewGroup f709k = null;

    /* renamed from: o */
    private ActivityC0274b f713o = null;

    /* renamed from: a */
    static /* synthetic */ C0308w m631a(C0308w c0308w) {
        f702d = c0308w;
        return c0308w;
    }

    /* renamed from: d */
    static /* synthetic */ Object m638d() {
        return f700b;
    }

    /* renamed from: e */
    static /* synthetic */ ActivityC0274b m639e() {
        return f703e;
    }

    /* renamed from: f */
    static /* synthetic */ ActivityC0274b m640f() {
        return f701c;
    }

    /* renamed from: g */
    static /* synthetic */ C0308w m641g() {
        return f702d;
    }

    /* renamed from: a */
    private void m634a(String str) {
        C0372i.m914b(str);
        finish();
    }

    /* renamed from: a */
    public final C0288c m643a() {
        return this.f718t;
    }

    /* renamed from: b */
    public static boolean m635b() {
        C0338c c0338c = f705g;
        return C0338c.m842a();
    }

    /* renamed from: c */
    public static boolean m637c() {
        C0338c c0338c = f705g;
        return C0338c.m843b();
    }

    /* renamed from: a */
    public static void m633a(C0308w c0308w, C0309x c0309x) {
        C0338c c0338c = f705g;
        C0338c.m841a(c0308w, c0309x);
    }

    /* renamed from: a */
    public final void m644a(int i, int i2, int i3, int i4) {
        if (this.f718t != null) {
            this.f718t.setLayoutParams(m636c(i, i2, i3, i4));
            this.f718t.requestLayout();
        }
    }

    /* renamed from: b */
    public final void m646b(int i, int i2, int i3, int i4) {
        if (this.f718t == null) {
            this.f718t = new C0288c(this, this.f706h);
            this.f712n.addView(this.f718t, 0, m636c(i, i2, i3, i4));
            synchronized (f700b) {
                if (f702d == null) {
                    C0372i.m920e("currentAdManager was null while trying to get the opening AdWebView.");
                } else {
                    f702d.m787l().m694b();
                }
            }
        }
    }

    /* renamed from: c */
    private static RelativeLayout.LayoutParams m636c(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean zM715i;
        int iM789n;
        int i;
        boolean z = false;
        z = false;
        super.onCreate(bundle);
        this.f710l = false;
        synchronized (f700b) {
            if (f702d != null) {
                C0308w c0308w = f702d;
                if (f703e == null) {
                    f703e = this;
                    c0308w.m795t();
                }
                if (this.f713o == null && f704f != null) {
                    this.f713o = f704f;
                }
                f704f = this;
                if ((c0308w.m783h().m838a() && f703e == this) || (c0308w.m783h().m839b() && this.f713o == f703e)) {
                    c0308w.m798w();
                }
                boolean zM791p = c0308w.m791p();
                C0331bt c0331bt = (C0331bt) ((C0330bs) c0308w.m783h().f965d.m898a()).f945b.m898a();
                this.f717s = C0358a.f1021a >= ((Integer) c0331bt.f948b.m899a()).intValue();
                this.f716r = C0358a.f1021a >= ((Integer) c0331bt.f950d.m899a()).intValue();
                this.f712n = null;
                this.f714p = false;
                this.f715q = true;
                this.f718t = null;
                Bundle bundleExtra = getIntent().getBundleExtra("com.google.ads.AdOpener");
                if (bundleExtra == null) {
                    m634a("Could not get the Bundle used to create AdActivity.");
                    return;
                }
                C0309x c0309x = new C0309x(bundleExtra);
                String str = c0309x.f868a;
                HashMap map = c0309x.f869b;
                if (str.equals("intent")) {
                    if (map == null) {
                        m634a("Could not get the paramMap in launchIntent()");
                        return;
                    }
                    Intent intent = new Intent();
                    String str2 = (String) map.get("u");
                    String str3 = (String) map.get("m");
                    String str4 = (String) map.get("i");
                    String str5 = (String) map.get("p");
                    String str6 = (String) map.get("c");
                    String str7 = (String) map.get("f");
                    String str8 = (String) map.get("e");
                    boolean hasTitle = !TextUtils.isEmpty(str2);
                    boolean hasBody = !TextUtils.isEmpty(str3);
                    if (hasTitle && hasBody) {
                        intent.setDataAndType(Uri.parse(str2), str3);
                    } else if (hasTitle) {
                        intent.setData(Uri.parse(str2));
                    } else if (hasBody) {
                        intent.setType(str3);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        intent.setAction(str4);
                    } else if (hasTitle) {
                        intent.setAction("android.intent.action.VIEW");
                    }
                    if (!TextUtils.isEmpty(str5) && C0358a.f1021a >= 4) {
                        intent.setPackage(str5);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        String[] strArrSplit = str6.split("/");
                        if (strArrSplit.length < 2) {
                            C0372i.m920e("Warning: Could not parse component name from open GMSG: " + str6);
                        }
                        intent.setClassName(strArrSplit[0], strArrSplit[1]);
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        try {
                            i = Integer.parseInt(str7);
                        } catch (NumberFormatException e) {
                            C0372i.m920e("Warning: Could not parse flags from open GMSG: " + str7);
                            i = 0;
                        }
                        intent.addFlags(i);
                    }
                    if (!TextUtils.isEmpty(str8)) {
                        try {
                            JSONObject jSONObject = new JSONObject(str8);
                            JSONArray jSONArrayNames = jSONObject.names();
                            for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                                String string = jSONArrayNames.getString(i2);
                                JSONObject jSONObject2 = jSONObject.getJSONObject(string);
                                int i3 = jSONObject2.getInt("t");
                                switch (i3) {
                                    case 1:
                                        intent.putExtra(string, jSONObject2.getBoolean("v"));
                                        break;
                                    case 2:
                                        intent.putExtra(string, jSONObject2.getDouble("v"));
                                        break;
                                    case 3:
                                        intent.putExtra(string, jSONObject2.getInt("v"));
                                        break;
                                    case 4:
                                        intent.putExtra(string, jSONObject2.getLong("v"));
                                        break;
                                    case 5:
                                        intent.putExtra(string, jSONObject2.getString("v"));
                                        break;
                                    default:
                                        C0372i.m920e("Warning: Unknown type in extras from open GMSG: " + string + " (type: " + i3 + ")");
                                        break;
                                }
                            }
                        } catch (JSONException e2) {
                            C0372i.m920e("Warning: Could not parse extras from open GMSG: " + str8);
                        }
                    }
                    if (intent.filterEquals(new Intent())) {
                        m634a("Tried to launch empty intent.");
                        return;
                    }
                    try {
                        C0372i.m911a("Launching an intent from AdActivity: " + intent);
                        startActivity(intent);
                        this.f706h = null;
                        this.f711m = SystemClock.elapsedRealtime();
                        this.f714p = true;
                        synchronized (f700b) {
                            if (f701c == null) {
                                f701c = this;
                                c0308w.m796u();
                            }
                        }
                        return;
                    } catch (ActivityNotFoundException e3) {
                        C0372i.m915b(e3.getMessage(), e3);
                        finish();
                        return;
                    }
                }
                this.f712n = new RelativeLayout(getApplicationContext());
                if (str.equals("webapp")) {
                    this.f706h = new C0290e(c0308w.m783h(), null);
                    C0279ad c0279adM692a = C0279ad.m692a(c0308w, C0293h.f785d, true, !zM791p);
                    c0279adM692a.m696d();
                    if (zM791p) {
                        c0279adM692a.m693a();
                    }
                    this.f706h.setWebViewClient(c0279adM692a);
                    String str9 = (String) map.get("u");
                    String str10 = (String) map.get("baseurl");
                    String str11 = (String) map.get("html");
                    if (str9 != null) {
                        this.f706h.loadUrl(str9);
                    } else if (str11 != null) {
                        this.f706h.loadDataWithBaseURL(str10, str11, "text/html", "utf-8", null);
                    } else {
                        m634a("Could not get the URL or HTML parameter to show a web app.");
                        return;
                    }
                    String str12 = (String) map.get("o");
                    if ("p".equals(str12)) {
                        iM789n = C0358a.m881b();
                    } else if ("l".equals(str12)) {
                        iM789n = C0358a.m864a();
                    } else if (this == f703e) {
                        iM789n = c0308w.m789n();
                    } else {
                        iM789n = -1;
                    }
                    m632a(this.f706h, false, iM789n, zM791p, map != null && "1".equals(map.get("custom_close")));
                    return;
                }
                if (str.equals("interstitial") || str.equals("expand")) {
                    this.f706h = c0308w.m786k();
                    int iM789n2 = c0308w.m789n();
                    if (str.equals("expand")) {
                        this.f706h.setIsExpandedMraid(true);
                        this.f715q = false;
                        if (map != null && "1".equals(map.get("custom_close"))) {
                            z = true;
                        }
                        if (!this.f716r || this.f717s) {
                            zM715i = z;
                        } else {
                            C0372i.m911a("Re-enabling hardware acceleration on expanding MRAID WebView.");
                            this.f706h.m713g();
                            zM715i = z;
                        }
                    } else {
                        zM715i = this.f706h.m715i();
                    }
                    m632a(this.f706h, true, iM789n2, zM791p, zM715i);
                    return;
                }
                m634a("Unknown AdOpener, <action: " + str + ">");
                return;
            }
            m634a("Could not get currentAdManager.");
        }
    }

    /* renamed from: a */
    private void m632a(C0290e c0290e, boolean z, int i, boolean z2, boolean z3) {
        requestWindowFeature(1);
        Window window = getWindow();
        window.setFlags(1024, 1024);
        if (C0358a.f1021a >= 11) {
            if (this.f716r) {
                C0372i.m911a("Enabling hardware acceleration on the AdActivity window.");
                window.setFlags(16777216, 16777216);
            } else {
                C0372i.m911a("Disabling hardware acceleration on the AdActivity WebView.");
                c0290e.m712f();
            }
        }
        ViewParent parent = c0290e.getParent();
        if (parent != null) {
            if (z2) {
                if (parent instanceof ViewGroup) {
                    this.f709k = (ViewGroup) parent;
                    this.f709k.removeView(c0290e);
                } else {
                    m634a("MRAID banner was not a child of a ViewGroup.");
                    return;
                }
            } else {
                m634a("Interstitial created with an AdWebView that has a parent.");
                return;
            }
        }
        if (c0290e.m714h() != null) {
            m634a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
            return;
        }
        setRequestedOrientation(i);
        c0290e.setAdActivity(this);
        this.f708j = (int) TypedValue.applyDimension(1, z2 ? 50 : 32, getResources().getDisplayMetrics());
        this.f707i = new FrameLayout(getApplicationContext());
        this.f707i.setMinimumWidth(this.f708j);
        this.f707i.setMinimumHeight(this.f708j);
        this.f707i.setOnClickListener(this);
        m645a(z3);
        FrameLayout frameLayout = this.f707i;
        this.f712n.addView(c0290e, -1, -1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (z2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        }
        this.f712n.addView(frameLayout, layoutParams);
        this.f712n.setKeepScreenOn(true);
        setContentView(this.f712n);
        this.f712n.getRootView().setBackgroundColor(-16777216);
        if (z) {
            C0293h c0293h = f699a;
            C0293h.m718a(c0290e);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.f712n != null) {
            this.f712n.removeAllViews();
        }
        if (isFinishing()) {
            m642h();
            if (this.f715q && this.f706h != null) {
                this.f706h.stopLoading();
                this.f706h.destroy();
                this.f706h = null;
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        if (isFinishing()) {
            m642h();
        }
        super.onPause();
    }

    /* renamed from: h */
    private void m642h() {
        if (!this.f710l) {
            if (this.f706h != null) {
                C0293h c0293h = f699a;
                C0293h.m724b(this.f706h);
                this.f706h.setAdActivity(null);
                this.f706h.setIsExpandedMraid(false);
                if (!this.f715q && this.f712n != null && this.f709k != null) {
                    if (this.f716r && !this.f717s) {
                        C0372i.m911a("Disabling hardware acceleration on collapsing MRAID WebView.");
                        this.f706h.m712f();
                    } else if (!this.f716r && this.f717s) {
                        C0372i.m911a("Re-enabling hardware acceleration on collapsing MRAID WebView.");
                        this.f706h.m713g();
                    }
                    this.f712n.removeView(this.f706h);
                    this.f709k.addView(this.f706h);
                }
            }
            if (this.f718t != null) {
                this.f718t.m707d();
                this.f718t = null;
            }
            if (this == f701c) {
                f701c = null;
            }
            f704f = this.f713o;
            synchronized (f700b) {
                if (f702d != null && this.f715q && this.f706h != null) {
                    if (this.f706h == f702d.m786k()) {
                        f702d.m759a();
                    }
                    this.f706h.stopLoading();
                }
                if (this == f703e) {
                    f703e = null;
                    if (f702d != null) {
                        f702d.m794s();
                        f702d = null;
                    } else {
                        C0372i.m920e("currentAdManager is null while trying to destroy AdActivity.");
                    }
                }
            }
            this.f710l = true;
            C0372i.m911a("AdActivity is closing.");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.f714p && z && SystemClock.elapsedRealtime() - this.f711m > 250) {
            C0372i.m918d("Launcher AdActivity got focus and is closing.");
            finish();
        }
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void m645a(boolean z) {
        if (this.f707i != null) {
            this.f707i.removeAllViews();
            if (!z) {
                ImageButton imageButton = new ImageButton(this);
                imageButton.setImageResource(R.drawable.btn_dialog);
                imageButton.setBackgroundColor(0);
                imageButton.setOnClickListener(this);
                imageButton.setPadding(0, 0, 0, 0);
                this.f707i.addView(imageButton, new FrameLayout.LayoutParams(this.f708j, this.f708j, 17));
            }
        }
    }
}
