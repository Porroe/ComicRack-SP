package com.cyo.common.view;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.k */
/* loaded from: classes.dex */
final class C1156k extends ClickableSpan {

    /* renamed from: a */
    private InterfaceC1157l f3654a;

    public C1156k(InterfaceC1157l interfaceC1157l) {
        this.f3654a = interfaceC1157l;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.f3654a != null) {
            this.f3654a.mo2423a();
        }
    }
}
