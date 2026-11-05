package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.ae */
/* loaded from: classes.dex */
final class ViewTreeObserverOnPreDrawListenerC0007ae implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f120a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC0011ai f121b;

    /* renamed from: c */
    final /* synthetic */ Map f122c;

    /* renamed from: d */
    final /* synthetic */ Map f123d;

    /* renamed from: e */
    final /* synthetic */ Transition f124e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f125f;

    ViewTreeObserverOnPreDrawListenerC0007ae(View view, InterfaceC0011ai interfaceC0011ai, Map map, Map map2, Transition transition, ArrayList arrayList) {
        this.f120a = view;
        this.f121b = interfaceC0011ai;
        this.f122c = map;
        this.f123d = map2;
        this.f124e = transition;
        this.f125f = arrayList;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f120a.getViewTreeObserver().removeOnPreDrawListener(this);
        View viewMo112a = this.f121b.mo112a();
        if (viewMo112a != null) {
            if (!this.f122c.isEmpty()) {
                C0005ac.m110a(this.f123d, viewMo112a);
                this.f123d.keySet().retainAll(this.f122c.values());
                for (Object valueForentry : this.f122c.entrySet()) {
                    Map.Entry entry = (Map.Entry) valueForentry;
                    View view = (View) this.f123d.get((String) entry.getValue());
                    if (view != null) {
                        view.setTransitionName((String) entry.getKey());
                    }
                }
            }
            if (this.f124e != null) {
                C0005ac.m109a(this.f125f, viewMo112a);
                this.f125f.removeAll(this.f123d.values());
                C0005ac.m111b(this.f124e, this.f125f);
                return true;
            }
            return true;
        }
        return true;
    }
}
