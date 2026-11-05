package android.support.v4.view.p003a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.a.n */
/* loaded from: classes.dex */
final class C0127n implements InterfaceC0134u {

    /* renamed from: a */
    final /* synthetic */ C0122i f468a;

    /* renamed from: b */
    final /* synthetic */ C0126m f469b;

    C0127n(C0126m c0126m, C0122i c0122i) {
        this.f469b = c0126m;
        this.f468a = c0122i;
    }

    @Override // android.support.v4.view.p003a.InterfaceC0134u
    /* renamed from: a */
    public final boolean mo379a() {
        C0122i c0122i = this.f468a;
        return C0122i.m371c();
    }

    @Override // android.support.v4.view.p003a.InterfaceC0134u
    /* renamed from: b */
    public final List mo380b() {
        List list = null;
        C0122i c0122i = this.f468a;
        C0122i.m372d();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C0113a) list.get(i)).m338a());
        }
        return arrayList;
    }

    @Override // android.support.v4.view.p003a.InterfaceC0134u
    /* renamed from: c */
    public final Object mo381c() {
        C0122i c0122i = this.f468a;
        C0122i.m370b();
        return null;
    }

    @Override // android.support.v4.view.p003a.InterfaceC0134u
    /* renamed from: d */
    public final Object mo382d() {
        C0122i c0122i = this.f468a;
        C0122i.m373e();
        return null;
    }
}
