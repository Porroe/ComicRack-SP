package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.be */
/* loaded from: classes.dex */
class C0034be extends C0030ba {
    C0034be() {
    }

    @Override // android.support.v4.app.C0030ba, android.support.v4.app.InterfaceC0026ax
    /* renamed from: a */
    public Notification mo149a(C0024av c0024av) {
        C0045bp c0045bp = new C0045bp(c0024av.f176a, c0024av.f174B, c0024av.f177b, c0024av.f178c, c0024av.f183h, c0024av.f181f, c0024av.f184i, c0024av.f179d, c0024av.f180e, c0024av.f182g, c0024av.f190o, c0024av.f191p, c0024av.f192q, c0024av.f187l, c0024av.f185j, c0024av.f189n, c0024av.f197v, c0024av.f199x, c0024av.f193r, c0024av.f194s, c0024av.f195t);
        C0019aq.m132a(c0045bp, c0024av.f196u);
        C0019aq.m133a(c0045bp, c0024av.f188m);
        Notification notificationBuild = c0045bp.f215a.build();
        Bundle bundleM152a = C0044bo.m152a(notificationBuild);
        Bundle bundle = new Bundle(c0045bp.f216b);
        for (String str : c0045bp.f216b.keySet()) {
            if (bundleM152a.containsKey(str)) {
                bundle.remove(str);
            }
        }
        bundleM152a.putAll(bundle);
        SparseArray<? extends Parcelable> sparseArrayM153a = C0044bo.m153a(c0045bp.f217c);
        if (sparseArrayM153a != null) {
            C0044bo.m152a(notificationBuild).putSparseParcelableArray("android.support.actionExtras", sparseArrayM153a);
        }
        return notificationBuild;
    }
}
