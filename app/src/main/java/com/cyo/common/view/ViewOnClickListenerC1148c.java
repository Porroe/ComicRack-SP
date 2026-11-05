package com.cyo.common.view;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.c */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1148c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1106a f3635a;

    /* renamed from: b */
    private final /* synthetic */ C1151f f3636b;

    ViewOnClickListenerC1148c(C1106a c1106a, C1151f c1151f) {
        this.f3635a = c1106a;
        this.f3636b = c1151f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3636b.f3644e = false;
        this.f3636b.f3647h.setVisibility(8);
    }
}
