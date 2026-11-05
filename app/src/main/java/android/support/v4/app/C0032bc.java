package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.widget.RemoteViews;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.bc */
/* loaded from: classes.dex */
final class C0032bc extends C0030ba {
    C0032bc() {
    }

    @Override // android.support.v4.app.C0030ba, android.support.v4.app.InterfaceC0026ax
    /* renamed from: a */
    public final Notification mo149a(C0024av c0024av) {
        Context context = c0024av.f176a;
        Notification notification = c0024av.f174B;
        CharSequence charSequence = c0024av.f177b;
        CharSequence charSequence2 = c0024av.f178c;
        CharSequence charSequence3 = c0024av.f183h;
        RemoteViews remoteViews = c0024av.f181f;
        int i = c0024av.f184i;
        PendingIntent pendingIntent = c0024av.f179d;
        return new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c0024av.f180e, (notification.flags & 128) != 0).setLargeIcon(c0024av.f182g).setNumber(i).getNotification();
    }
}
