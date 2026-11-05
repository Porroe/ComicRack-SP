package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.af */
/* loaded from: classes.dex */
final class C0008af extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ C0010ah f126a;

    /* renamed from: b */
    private Rect f127b;

    C0008af(C0010ah c0010ah) {
        this.f126a = c0010ah;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        if (this.f127b == null && this.f126a.f139a != null) {
            this.f127b = C0005ac.m104a(this.f126a.f139a);
        }
        return this.f127b;
    }
}
