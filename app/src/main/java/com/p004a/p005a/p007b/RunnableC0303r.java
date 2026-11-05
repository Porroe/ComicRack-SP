package com.p004a.p005a.p007b;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.p004a.p005a.EnumC0390f;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.r */
/* loaded from: classes.dex */
final class RunnableC0303r implements Runnable {

    /* renamed from: a */
    private final C0308w f816a;

    /* renamed from: b */
    private final WebView f817b;

    /* renamed from: c */
    private final RunnableC0310y f818c;

    /* renamed from: d */
    private final EnumC0390f f819d;

    /* renamed from: e */
    private final boolean f820e;

    public RunnableC0303r(C0308w c0308w, WebView webView, RunnableC0310y runnableC0310y, EnumC0390f enumC0390f, boolean z) {
        this.f816a = c0308w;
        this.f817b = webView;
        this.f818c = runnableC0310y;
        this.f819d = enumC0390f;
        this.f820e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f817b != null) {
            this.f817b.stopLoading();
            this.f817b.destroy();
        }
        if (this.f818c != null) {
            this.f818c.f870a = true;
        }
        if (this.f820e) {
            this.f816a.m786k().stopLoading();
            if (this.f816a.m783h().f970i.m898a() != null) {
                ((ViewGroup) this.f816a.m783h().f970i.m898a()).setVisibility(8);
            }
        }
        this.f816a.m767a(this.f819d);
    }
}
