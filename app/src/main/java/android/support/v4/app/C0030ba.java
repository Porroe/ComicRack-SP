package android.support.v4.app;

import android.app.Notification;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.ba */
/* loaded from: classes.dex */
class C0030ba implements InterfaceC0026ax {
    C0030ba() {
    }

    @Override // android.support.v4.app.InterfaceC0026ax
    /* renamed from: a */
    public Notification mo149a(C0024av c0024av) {
        Notification notification = c0024av.f174B;
        if (c0024av.f185j > 0) {
            notification.flags |= 128;
        }
        return notification;
    }
}
