package android.support.v4.view;

import android.view.VelocityTracker;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.au */
/* loaded from: classes.dex */
final class C0160au implements InterfaceC0162aw {
    C0160au() {
    }

    @Override // android.support.v4.view.InterfaceC0162aw
    /* renamed from: a */
    public final float mo422a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity();
    }

    @Override // android.support.v4.view.InterfaceC0162aw
    /* renamed from: b */
    public final float mo423b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity();
    }
}
