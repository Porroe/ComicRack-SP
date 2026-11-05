package com.p004a.p005a;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p004a.p005a.p007b.C0278ac;
import com.p004a.p005a.p007b.C0282ag;
import com.p004a.p005a.p007b.C0290e;
import com.p004a.p005a.p007b.C0293h;
import com.p004a.p005a.p007b.C0298m;
import com.p004a.p005a.p007b.C0308w;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;

/* compiled from: DontLook */
/* renamed from: com.a.a.i */
/* loaded from: classes.dex */
public class C0393i extends RelativeLayout implements InterfaceC0243a {

    /* renamed from: b */
    private static final C0293h f1104b = (C0293h) C0293h.f782a.mo727a();

    /* renamed from: a */
    protected C0308w f1105a;

    public C0393i(Activity activity, C0392h c0392h, String str) {
        super(activity.getApplicationContext());
        try {
            if (!C0358a.m888c(activity)) {
                m934a(activity, "You must have AdActivity declared in AndroidManifest.xml with configChanges.", c0392h);
            }
            if (!C0358a.m886b(activity)) {
                m934a(activity, "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.", c0392h);
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.setFocusable(false);
            this.f1105a = new C0308w(this, activity, c0392h, str, frameLayout);
            setGravity(17);
            try {
                ViewGroup viewGroupM699a = C0282ag.m699a(activity, this.f1105a);
                if (viewGroupM699a != null) {
                    viewGroupM699a.addView(frameLayout, -2, -2);
                    addView(viewGroupM699a, -2, -2);
                } else {
                    addView(frameLayout, -2, -2);
                }
            } catch (VerifyError e) {
                C0372i.m912a("Gestures disabled: Not supported on this version of Android.", e);
                addView(frameLayout, -2, -2);
            }
        } catch (C0298m e2) {
            m934a(activity, e2.m729b("Could not initialize AdView"), c0392h);
            e2.m728a("Could not initialize AdView");
        }
    }

    /* renamed from: a */
    public final void m935a() {
        this.f1105a.m772b();
    }

    /* renamed from: a */
    private void m934a(Context context, String str, C0392h c0392h) {
        C0372i.m914b(str);
        if (c0392h == null) {
            c0392h = C0392h.f1093b;
        }
        C0392h c0392hM927a = C0392h.m927a(c0392h, context.getApplicationContext());
        if (getChildCount() == 0) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-16777216);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setGravity(17);
            linearLayout2.setBackgroundColor(-65536);
            int iM865a = C0358a.m865a(context, c0392hM927a.m929a());
            int iM865a2 = C0358a.m865a(context, c0392hM927a.m930b());
            linearLayout.addView(textView, iM865a - 2, iM865a2 - 2);
            linearLayout2.addView(linearLayout);
            addView(linearLayout2, iM865a, iM865a2);
        }
    }

    /* renamed from: a */
    public final void m936a(C0357e c0357e) {
        if (this.f1105a != null) {
            if (this.f1105a == null ? false : this.f1105a.m793r()) {
                this.f1105a.m781f();
            }
            this.f1105a.m766a(c0357e);
        }
    }

    public void setAdListener(InterfaceC0354d interfaceC0354d) {
        this.f1105a.m783h().f976o.m900a(interfaceC0354d);
    }

    public void setAppEventListener(InterfaceC0394j interfaceC0394j) {
        this.f1105a.m783h().f977p.m900a(interfaceC0394j);
    }

    public void setSwipeableEventListener(InterfaceC0396l interfaceC0396l) {
        this.f1105a.m783h().f978q.m900a(interfaceC0396l);
    }

    public void setSupportedAdSizes(C0392h... c0392hArr) {
        if (this.f1105a.m783h().f975n.m899a() == null) {
            C0372i.m920e("Warning: Tried to set supported ad sizes on a single-size AdView. AdSizes ignored. To create a multi-sized AdView, use an AdView constructor that takes in an AdSize[] array.");
            return;
        }
        C0392h[] c0392hArr2 = new C0392h[c0392hArr.length];
        for (int i = 0; i < c0392hArr.length; i++) {
            c0392hArr2[i] = C0392h.m927a(c0392hArr[i], getContext());
        }
        this.f1105a.m783h().f975n.m900a(c0392hArr2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        C0290e c0290eM786k;
        if (!isInEditMode() && (c0290eM786k = this.f1105a.m786k()) != null) {
            c0290eM786k.setVisibility(0);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!isInEditMode() && ((C0278ac) this.f1105a.m783h().f968g.m898a()).m689b() && i != 0 && this.f1105a.m783h().f973l.m899a() != null && this.f1105a.m783h().f966e.m898a() != null) {
            if (ActivityC0274b.m635b() && !ActivityC0274b.m637c()) {
                C0293h c0293h = f1104b;
                C0293h.m720a((WebView) this.f1105a.m783h().f966e.m898a(), "onopeninapp", null);
            } else {
                C0293h c0293h2 = f1104b;
                C0293h.m720a((WebView) this.f1105a.m783h().f966e.m898a(), "onleaveapp", null);
            }
        }
    }
}
