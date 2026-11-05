package com.cyo.common.view;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.b */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1133b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1106a f3600a;

    /* renamed from: b */
    private final /* synthetic */ C1151f f3601b;

    ViewOnClickListenerC1133b(C1106a c1106a, C1151f c1151f) {
        this.f3600a = c1106a;
        this.f3601b = c1151f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f3601b.f3650k != null) {
            this.f3601b.f3650k.onClick(view);
        }
    }
}
