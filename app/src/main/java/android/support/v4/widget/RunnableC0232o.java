package android.support.v4.widget;

import android.support.v4.view.C0163ax;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.o */
/* loaded from: classes.dex */
final class RunnableC0232o implements Runnable {

    /* renamed from: a */
    final View f617a;

    /* renamed from: b */
    final /* synthetic */ SlidingPaneLayout f618b;

    RunnableC0232o(SlidingPaneLayout slidingPaneLayout, View view) {
        this.f618b = slidingPaneLayout;
        this.f617a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f617a.getParent() == this.f618b) {
            C0163ax.m426a(this.f617a, 0, null);
            SlidingPaneLayout.m517a(this.f618b, this.f617a);
        }
        SlidingPaneLayout.m516a(this.f618b).remove(this);
    }
}
