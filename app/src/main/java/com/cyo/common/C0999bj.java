package com.cyo.common;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.cyo.comicrack.viewer.C0802fr;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bj */
/* loaded from: classes.dex */
public final class C0999bj {

    /* renamed from: a */
    final List f2943a;

    /* renamed from: b */
    int f2944b;

    /* renamed from: c */
    int f2945c;

    /* renamed from: d */
    public InterfaceC1008bs f2946d;

    /* renamed from: e */
    private final int f2947e;

    public C0999bj(List list, int i) {
        this.f2943a = list;
        this.f2947e = 0;
        this.f2944b = i;
        this.f2945c = 0;
    }

    private C0999bj(List list, int i, byte b) {
        this(list, i);
    }

    public C0999bj(List list, int i, char c) {
        this(list, i, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* renamed from: a */
    public final void m2097a(View view, int i, int i2, boolean z) {
        RelativeLayout r2;
        RelativeLayout obj = null;
        Context context = view.getContext();
        View view2 = view;
        while (true) {
            r2 = view2 instanceof RelativeLayout ? (RelativeLayout) view2 : obj;
            if (view2 == null) {
                break;
            }
            view2 = view2.getParent() instanceof View ? (View) view2.getParent() : null;
            if (view2 == null) {
                break;
            } else {
                obj = r2;
            }
        }
        if (r2 != null) {
            RelativeLayout relativeLayout = new RelativeLayout(context);
            r2.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
            ListView listView = new ListView(context);
            if (this.f2947e == 0) {
                listView.setBackgroundResource(C0802fr.super_menu_box);
            }
            listView.setDivider(new ColorDrawable(-7829368));
            listView.setDividerHeight(1);
            listView.setAdapter((ListAdapter) new C1007br(this, context));
            if (i2 < 0) {
                i2 = (int) TypedValue.applyDimension(1, -i2, context.getResources().getDisplayMetrics());
            }
            int iMin = Math.min(i2, view.getWidth() * 2);
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr);
            relativeLayout.getLocationOnScreen(iArr2);
            int i3 = iArr[0] - iArr2[0];
            int i4 = iArr[1] - iArr2[1];
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iMin, -2);
            layoutParams.leftMargin = i3 + 0;
            layoutParams.topMargin = i4 + i;
            if (!z) {
                layoutParams.addRule(11);
            }
            relativeLayout.addView(listView, layoutParams);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setAnimationListener(new AnimationAnimationListenerC1000bk(this, listView));
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setAnimationListener(new AnimationAnimationListenerC1001bl(this, r2, relativeLayout));
            alphaAnimation.setDuration(200L);
            alphaAnimation2.setDuration(200L);
            listView.startAnimation(alphaAnimation);
            listView.setOnItemClickListener(new C1003bn(this, listView, alphaAnimation2));
            listView.setOnKeyListener(new ViewOnKeyListenerC1004bo(this, listView, alphaAnimation2));
            relativeLayout.setOnClickListener(new ViewOnClickListenerC1005bp(this, listView, alphaAnimation2));
        }
    }

    /* renamed from: a */
    public final void m2096a(View view, int i) {
        m2097a(view, i, -300, true);
    }
}
