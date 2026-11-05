package com.p004a.p005a.p011e;

import android.view.View;
import android.webkit.WebChromeClient;
import com.p004a.p005a.C0332bu;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.f */
/* loaded from: classes.dex */
public final class C0369f extends C0383t {
    public C0369f(C0332bu c0332bu) {
        super(c0332bu);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
