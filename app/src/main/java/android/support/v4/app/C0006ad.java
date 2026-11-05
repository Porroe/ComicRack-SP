package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.ad */
/* loaded from: classes.dex */
final class C0006ad extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f119a;

    C0006ad(Rect rect) {
        this.f119a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f119a;
    }
}
