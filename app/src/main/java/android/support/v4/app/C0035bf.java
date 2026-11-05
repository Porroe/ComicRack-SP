package android.support.v4.app;

import android.app.Notification;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.bf */
/* loaded from: classes.dex */
class C0035bf extends C0034be {
    C0035bf() {
    }

    @Override // android.support.v4.app.C0034be, android.support.v4.app.C0030ba, android.support.v4.app.InterfaceC0026ax
    /* renamed from: a */
    public Notification mo149a(C0024av c0024av) {
        C0047br c0047br = new C0047br(c0024av.f176a, c0024av.f174B, c0024av.f177b, c0024av.f178c, c0024av.f183h, c0024av.f181f, c0024av.f184i, c0024av.f179d, c0024av.f180e, c0024av.f182g, c0024av.f190o, c0024av.f191p, c0024av.f192q, c0024av.f186k, c0024av.f187l, c0024av.f185j, c0024av.f189n, c0024av.f197v, c0024av.f175C, c0024av.f199x, c0024av.f193r, c0024av.f194s, c0024av.f195t);
        C0019aq.m132a(c0047br, c0024av.f196u);
        C0019aq.m133a(c0047br, c0024av.f188m);
        SparseArray<? extends Parcelable> sparseArrayM153a = C0044bo.m153a(c0047br.f220c);
        if (sparseArrayM153a != null) {
            c0047br.f219b.putSparseParcelableArray("android.support.actionExtras", sparseArrayM153a);
        }
        c0047br.f218a.setExtras(c0047br.f219b);
        return c0047br.f218a.build();
    }
}
