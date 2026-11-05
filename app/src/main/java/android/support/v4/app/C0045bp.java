package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.bp */
/* loaded from: classes.dex */
public final class C0045bp implements InterfaceC0017ao, InterfaceC0018ap {

    /* renamed from: a */
    Notification.Builder f215a;

    /* renamed from: b */
    final Bundle f216b;

    /* renamed from: c */
    List f217c = new ArrayList();

    public C0045bp(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2) {
        this.f215a = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
        this.f216b = new Bundle();
        if (bundle != null) {
            this.f216b.putAll(bundle);
        }
        if (z3) {
            this.f216b.putBoolean("android.support.localOnly", true);
        }
        if (str != null) {
            this.f216b.putString("android.support.groupKey", str);
            if (z4) {
                this.f216b.putBoolean("android.support.isGroupSummary", true);
            } else {
                this.f216b.putBoolean("android.support.useSideChannel", true);
            }
        }
        if (str2 != null) {
            this.f216b.putString("android.support.sortKey", str2);
        }
    }

    @Override // android.support.v4.app.InterfaceC0017ao
    /* renamed from: a */
    public final void mo129a(AbstractC0042bm abstractC0042bm) {
        this.f217c.add(C0044bo.m151a(this.f215a, abstractC0042bm));
    }

    @Override // android.support.v4.app.InterfaceC0018ap
    /* renamed from: a */
    public final Notification.Builder mo130a() {
        return this.f215a;
    }
}
