package com.cyo.common;

import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ListView;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bo */
/* loaded from: classes.dex */
final class ViewOnKeyListenerC1004bo implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ C0999bj f2959a;

    /* renamed from: b */
    private final /* synthetic */ ListView f2960b;

    /* renamed from: c */
    private final /* synthetic */ AlphaAnimation f2961c;

    ViewOnKeyListenerC1004bo(C0999bj c0999bj, ListView listView, AlphaAnimation alphaAnimation) {
        this.f2959a = c0999bj;
        this.f2960b = listView;
        this.f2961c = alphaAnimation;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
            case 82:
                this.f2960b.startAnimation(this.f2961c);
                return true;
            default:
                return false;
        }
    }
}
