package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.bb */
/* loaded from: classes.dex */
final class C0031bb extends C0030ba {
    C0031bb() {
    }

    @Override // android.support.v4.app.C0030ba, android.support.v4.app.InterfaceC0026ax
    /* renamed from: a */
    public final Notification mo149a(C0024av c0024av) {
        Notification notification = c0024av.f174B;
        Context context = c0024av.f176a;
        CharSequence charSequence = c0024av.f177b;
        CharSequence charSequence2 = c0024av.f178c;
        PendingIntent pendingIntent = c0024av.f179d;
        PendingIntent pendingIntent2 = c0024av.f180e;
        notification.fullScreenIntent = pendingIntent2;
        if (c0024av.f185j > 0) {
            notification.flags |= 128;
        }
        return notification;
    }
}
