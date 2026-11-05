package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.ag */
/* loaded from: classes.dex */
final class ViewTreeObserverOnPreDrawListenerC0009ag implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f128a;

    /* renamed from: b */
    final /* synthetic */ Transition f129b;

    /* renamed from: c */
    final /* synthetic */ View f130c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f131d;

    /* renamed from: e */
    final /* synthetic */ Transition f132e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f133f;

    /* renamed from: g */
    final /* synthetic */ Transition f134g;

    /* renamed from: h */
    final /* synthetic */ ArrayList f135h;

    /* renamed from: i */
    final /* synthetic */ Map f136i;

    /* renamed from: j */
    final /* synthetic */ ArrayList f137j;

    /* renamed from: k */
    final /* synthetic */ Transition f138k;

    ViewTreeObserverOnPreDrawListenerC0009ag(View view, Transition transition, View view2, ArrayList arrayList, Transition transition2, ArrayList arrayList2, Transition transition3, ArrayList arrayList3, Map map, ArrayList arrayList4, Transition transition4) {
        this.f128a = view;
        this.f129b = transition;
        this.f130c = view2;
        this.f131d = arrayList;
        this.f132e = transition2;
        this.f133f = arrayList2;
        this.f134g = transition3;
        this.f135h = arrayList3;
        this.f136i = map;
        this.f137j = arrayList4;
        this.f138k = transition4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f128a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f129b != null) {
            this.f129b.removeTarget(this.f130c);
            C0005ac.m108a(this.f129b, this.f131d);
        }
        if (this.f132e != null) {
            C0005ac.m108a(this.f132e, this.f133f);
        }
        if (this.f134g != null) {
            C0005ac.m108a(this.f134g, this.f135h);
        }
        for (Object valueForentry : this.f136i.entrySet()) {
            Map.Entry entry = (Map.Entry) valueForentry;
            ((View) entry.getValue()).setTransitionName((String) entry.getKey());
        }
        int size = this.f137j.size();
        for (int i = 0; i < size; i++) {
            this.f138k.excludeTarget((View) this.f137j.get(i), false);
        }
        this.f138k.excludeTarget(this.f130c, false);
        return true;
    }
}
