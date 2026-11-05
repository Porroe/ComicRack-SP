package com.cyo.common.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.cyo.comicrack.viewer.C0802fr;
import com.cyo.comicrack.viewer.C0806fv;
import com.cyo.common.C0951ag;
import com.cyo.common.C0998bi;
import com.p004a.p005a.C0357e;
import com.p004a.p005a.C0392h;
import com.p004a.p005a.C0393i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.a */
/* loaded from: classes.dex */
public final class C1106a {

    /* renamed from: a */
    public Activity f3557a;

    /* renamed from: b */
    public List f3558b;

    /* renamed from: c */
    public boolean f3559c;

    public C1106a(Activity activity, boolean z) {
        this.f3557a = activity;
        this.f3559c = z;
    }

    /* renamed from: a */
    public final int m2396a(int i, int i2, int i3, boolean z, boolean z2) {
        if (this.f3558b == null) {
            this.f3558b = new ArrayList();
        }
        if (this.f3558b.add(new C1151f(i, i2, i3, z, z2))) {
            return this.f3558b.size() - 1;
        }
        return -1;
    }

    /* renamed from: a */
    public final int m2395a(int i, int i2, int i3) {
        return m2396a(i, i2, i3, true, false);
    }

    /* renamed from: a */
    public final void m2398a() {
        if (this.f3558b != null) {
            for (Object entry : this.f3558b) {
                C1151f c1151f = (C1151f) entry;
                ViewGroup viewGroup = (ViewGroup) this.f3557a.findViewById(c1151f.f3640a);
                if (viewGroup != null) {
                    C0392h c0392h = C0392h.f1092a;
                    if (c1151f.f3647h != null) {
                        if (c0392h.equals(C0392h.f1092a) || !c0392h.equals(c1151f.f3648i.getTag())) {
                            viewGroup.removeView(c1151f.f3647h);
                            c1151f.f3647h = null;
                        } else {
                            c1151f.f3648i.setVisibility(this.f3559c ? 0 : 8);
                        }
                    }
                    if (this.f3559c) {
                        c1151f.f3647h = new LinearLayout(this.f3557a);
                        c1151f.f3647h.setOrientation(1);
                        if (viewGroup instanceof RelativeLayout) {
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(c1151f.f3642c == 0 ? 10 : 12, -1);
                            c1151f.f3647h.setLayoutParams(layoutParams);
                        } else {
                            c1151f.f3647h.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        }
                        c1151f.f3647h.setVisibility(c1151f.f3644e ? 0 : 8);
                        if (c1151f.f3641b != 0) {
                            c1151f.f3647h.setBackgroundResource(c1151f.f3641b);
                        }
                        viewGroup.addView(c1151f.f3647h, (c1151f.f3642c < 0 || c1151f.f3642c >= viewGroup.getChildCount()) ? viewGroup.getChildCount() : c1151f.f3642c);
                        c1151f.f3648i = new LinearLayout(viewGroup.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 1;
                        c1151f.f3648i.setLayoutParams(layoutParams2);
                        c1151f.f3648i.setGravity(17);
                        if (c1151f.f3645f > 0) {
                            c1151f.f3648i.setPadding(0, c1151f.f3645f, 0, c1151f.f3645f);
                        }
                        c1151f.f3647h.addView(c1151f.f3648i);
                        ConnectivityManager connectivityManager = (ConnectivityManager) this.f3557a.getSystemService("connectivity");
                        if (connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting()) {
                            m2401b(c1151f);
                        } else {
                            C0393i c0393i = new C0393i(this.f3557a, c0392h, "a14e6a2bbd7e129");
                            c1151f.f3648i.addView(c0393i);
                            c1151f.f3646g = new C1152g(c0393i);
                            c0393i.m936a(new C0357e());
                            c0393i.setAdListener(new C1150e(this, c1151f));
                            c1151f.f3648i.setTag(c0392h);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void m2400b() {
        if (this.f3558b != null) {
            for (Object entry : this.f3558b) {
                C1151f c1151f = (C1151f) entry;
                if (c1151f.f3646g != null) {
                    AbstractC1153h abstractC1153h = c1151f.f3646g;
                }
            }
        }
    }

    /* renamed from: c */
    public final void m2402c() {
        if (this.f3558b != null) {
            for (Object entry : this.f3558b) {
                C1151f c1151f = (C1151f) entry;
                if (c1151f.f3646g != null) {
                    AbstractC1153h abstractC1153h = c1151f.f3646g;
                }
            }
        }
    }

    /* renamed from: a */
    public final C1151f m2397a(int i) {
        if (this.f3558b == null || i < 0 || i >= this.f3558b.size()) {
            return null;
        }
        return (C1151f) this.f3558b.get(i);
    }

    /* renamed from: a */
    final void m2399a(C1151f c1151f) {
        if (c1151f.f3643d) {
            View viewFindViewWithTag = c1151f.f3647h.findViewWithTag("close_button");
            View view = viewFindViewWithTag;
            if (viewFindViewWithTag == null) {
                Context context = c1151f.f3647h.getContext();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(8, 8, 4, 8);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(5);
                c1151f.f3647h.addView(linearLayout, 0);
                if (!C0998bi.m2081a(c1151f.f3649j) && c1151f.f3650k != null) {
                    Button button = new Button(context);
                    button.setTextColor(-1);
                    button.setText(c1151f.f3649j);
                    button.setBackgroundResource(C0802fr.toolbar_button_background);
                    button.setLayoutParams(layoutParams);
                    button.setPadding(16, 0, 16, 0);
                    linearLayout.addView(button);
                    button.setOnClickListener(new ViewOnClickListenerC1133b(this, c1151f));
                }
                Button button2 = new Button(context);
                button2.setTextColor(-1);
                button2.setText(C0806fv.close_advertisment);
                button2.setBackgroundResource(C0802fr.toolbar_button_background);
                button2.setPadding(16, 0, 16, 0);
                button2.setLayoutParams(layoutParams);
                linearLayout.addView(button2);
                button2.setTag("close_button");
                view = button2;
            }
            view.setOnClickListener(new ViewOnClickListenerC1148c(this, c1151f));
        }
    }

    /* renamed from: b */
    final void m2401b(C1151f c1151f) {
        C0392h c0392h;
        if (c1151f.f3648i != null) {
            if (c1151f.f3648i != null) {
                c1151f.f3648i.removeAllViews();
                c1151f.f3648i.setTag(null);
            }
            int i = (int) (C0951ag.m1999b(this.f3557a).widthPixels / C0951ag.m1999b(this.f3557a).density);
            if (i >= 750) {
                c0392h = C0392h.f1096e;
            } else {
                c0392h = i >= 500 ? C0392h.f1095d : C0392h.f1093b;
            }
            Rect rect = C0392h.f1096e.equals(c0392h) ? new Rect(0, 0, 728, 90) : C0392h.f1095d.equals(c0392h) ? new Rect(0, 0, 468, 60) : new Rect(0, 0, 320, 50);
            DisplayMetrics displayMetrics = this.f3557a.getResources().getDisplayMetrics();
            rect.right = (int) TypedValue.applyDimension(1, rect.right, displayMetrics);
            rect.bottom = (int) TypedValue.applyDimension(1, rect.bottom, displayMetrics);
            ImageView imageView = new ImageView(c1151f.f3648i.getContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(rect.width(), rect.height()));
            imageView.setImageResource(C0802fr.ad_replacement_banner);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setOnClickListener(new ViewOnClickListenerC1149d(this));
            c1151f.f3648i.addView(imageView);
            m2399a(c1151f);
        }
    }
}
