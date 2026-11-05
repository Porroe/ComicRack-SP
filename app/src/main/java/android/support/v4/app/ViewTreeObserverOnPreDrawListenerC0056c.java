package android.support.v4.app;

import android.support.v4.p002c.C0095a;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.c */
/* loaded from: classes.dex */
final class ViewTreeObserverOnPreDrawListenerC0056c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f228a;

    /* renamed from: b */
    final /* synthetic */ Object f229b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f230c;

    /* renamed from: d */
    final /* synthetic */ C0070f f231d;

    /* renamed from: e */
    final /* synthetic */ boolean f232e;

    /* renamed from: f */
    final /* synthetic */ Fragment f233f;

    /* renamed from: g */
    final /* synthetic */ Fragment f234g;

    /* renamed from: h */
    final /* synthetic */ RunnableC0002a f235h;

    ViewTreeObserverOnPreDrawListenerC0056c(RunnableC0002a runnableC0002a, View view, Object obj, ArrayList arrayList, C0070f c0070f, boolean z, Fragment fragment, Fragment fragment2) {
        this.f235h = runnableC0002a;
        this.f228a = view;
        this.f229b = obj;
        this.f230c = arrayList;
        this.f231d = c0070f;
        this.f232e = z;
        this.f233f = fragment;
        this.f234g = fragment2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f228a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f229b != null) {
            C0005ac.m108a(this.f229b, this.f230c);
            this.f230c.clear();
            C0095a c0095aM72a = RunnableC0002a.m72a(this.f235h, this.f231d, this.f232e, this.f233f);
            if (c0095aM72a.isEmpty()) {
                this.f230c.add(this.f231d.f261d);
            } else {
                this.f230c.addAll(c0095aM72a.values());
            }
            C0005ac.m111b(this.f229b, this.f230c);
            RunnableC0002a.m79a(this.f235h, c0095aM72a, this.f231d);
            RunnableC0002a runnableC0002a = this.f235h;
            C0070f c0070f = this.f231d;
            RunnableC0002a.m77a(this.f233f, this.f234g, this.f232e, c0095aM72a);
            return true;
        }
        return true;
    }
}
