package android.support.v4.app;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.i */
/* loaded from: classes.dex */
final class C0073i implements InterfaceC0080p {

    /* renamed from: a */
    final /* synthetic */ Fragment f272a;

    C0073i(Fragment fragment) {
        this.f272a = fragment;
    }

    @Override // android.support.v4.app.InterfaceC0080p
    /* renamed from: a */
    public final View mo177a(int i) {
        if (this.f272a.f38S == null) {
            throw new IllegalStateException("Fragment does not have a view");
        }
        return this.f272a.f38S.findViewById(i);
    }

    @Override // android.support.v4.app.InterfaceC0080p
    /* renamed from: a */
    public final boolean mo178a() {
        return this.f272a.f38S != null;
    }
}
