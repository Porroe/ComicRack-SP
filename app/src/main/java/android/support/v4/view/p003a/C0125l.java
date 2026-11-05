package android.support.v4.view.p003a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.a.l */
/* loaded from: classes.dex */
final class C0125l implements InterfaceC0131r {

    /* renamed from: a */
    final /* synthetic */ C0122i f466a;

    /* renamed from: b */
    final /* synthetic */ C0124k f467b;

    C0125l(C0124k c0124k, C0122i c0122i) {
        this.f467b = c0124k;
        this.f466a = c0122i;
    }

    @Override // android.support.v4.view.p003a.InterfaceC0131r
    /* renamed from: a */
    public final boolean mo376a() {
        C0122i c0122i = this.f466a;
        return C0122i.m371c();
    }

    @Override // android.support.v4.view.p003a.InterfaceC0131r
    /* renamed from: b */
    public final List mo377b() {
        List list = null;
        C0122i c0122i = this.f466a;
        C0122i.m372d();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C0113a) list.get(i)).m338a());
        }
        return arrayList;
    }

    @Override // android.support.v4.view.p003a.InterfaceC0131r
    /* renamed from: c */
    public final Object mo378c() {
        C0122i c0122i = this.f466a;
        C0122i.m370b();
        return null;
    }
}
