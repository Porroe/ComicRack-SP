package android.support.v4.app;

import android.view.View;
import android.view.Window;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.n */
/* loaded from: classes.dex */
final class C0078n implements InterfaceC0080p {

    /* renamed from: a */
    final /* synthetic */ ActivityC0076l f287a;

    C0078n(ActivityC0076l activityC0076l) {
        this.f287a = activityC0076l;
    }

    @Override // android.support.v4.app.InterfaceC0080p
    /* renamed from: a */
    public final View mo177a(int i) {
        return this.f287a.findViewById(i);
    }

    @Override // android.support.v4.app.InterfaceC0080p
    /* renamed from: a */
    public final boolean mo178a() {
        Window window = this.f287a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
