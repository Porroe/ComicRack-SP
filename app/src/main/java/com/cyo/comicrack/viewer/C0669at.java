package com.cyo.comicrack.viewer;

import android.widget.RatingBar;
import com.cyo.comicrack.p019a.C0628f;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.at */
/* loaded from: classes.dex */
final class C0669at implements RatingBar.OnRatingBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0906u f2167a;

    C0669at(C0906u c0906u) {
        this.f2167a = c0906u;
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        if (z && C0906u.m1900a(this.f2167a) != null && f != C0906u.m1900a(this.f2167a).f1576h) {
            C0906u.m1900a(this.f2167a).m1122a(f);
            C0628f.m1364b(C0628f.m1354a(C0906u.m1900a(this.f2167a), false));
        }
    }
}
