package com.cyo.common.view;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.p004a.p005a.C0393i;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.g */
/* loaded from: classes.dex */
final class C1152g extends AbstractC1153h {

    /* renamed from: a */
    private final C0393i f3651a;

    public C1152g(C0393i c0393i) {
        super((byte) 0);
        this.f3651a = c0393i;
    }

    @Override // com.cyo.common.view.AbstractC1153h
    /* renamed from: a */
    public final void mo2421a() {
        ViewParent parent = this.f3651a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f3651a);
        }
        this.f3651a.m935a();
    }
}
