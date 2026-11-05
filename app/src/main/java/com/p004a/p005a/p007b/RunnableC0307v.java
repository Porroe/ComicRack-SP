package com.p004a.p005a.p007b;

import android.webkit.WebView;
import com.p004a.p005a.C0332bu;
import com.p004a.p005a.C0392h;
import java.util.LinkedList;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.v */
/* loaded from: classes.dex */
final class RunnableC0307v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC0299n f832a;

    /* renamed from: b */
    private final C0308w f833b;

    /* renamed from: c */
    private final WebView f834c;

    /* renamed from: d */
    private final LinkedList f835d;

    /* renamed from: e */
    private final int f836e;

    /* renamed from: f */
    private final boolean f837f;

    /* renamed from: g */
    private final String f838g;

    /* renamed from: h */
    private final C0392h f839h;

    public RunnableC0307v(RunnableC0299n runnableC0299n, C0308w c0308w, WebView webView, LinkedList linkedList, int i, boolean z, String str, C0392h c0392h) {
        this.f832a = runnableC0299n;
        this.f833b = c0308w;
        this.f834c = webView;
        this.f835d = linkedList;
        this.f836e = i;
        this.f837f = z;
        this.f838g = str;
        this.f839h = c0392h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f834c != null) {
            this.f834c.stopLoading();
            this.f834c.destroy();
        }
        this.f833b.m769a(this.f835d);
        this.f833b.m761a(this.f836e);
        this.f833b.m770a(this.f837f);
        this.f833b.m768a(this.f838g);
        if (this.f839h != null) {
            ((C0278ac) ((C0332bu) this.f832a.f789b.f940a.m898a()).f968g.m898a()).m688b(this.f839h);
            this.f833b.m786k().setAdSize(this.f839h);
        }
        this.f833b.m801z();
    }
}
