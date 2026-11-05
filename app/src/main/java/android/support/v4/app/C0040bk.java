package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.bk */
/* loaded from: classes.dex */
public final class C0040bk implements InterfaceC0017ao, InterfaceC0018ap {

    /* renamed from: a */
    Notification.Builder f210a;

    public C0040bk(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3) {
        this.f210a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f210a.addPerson((String) it.next());
        }
    }

    @Override // android.support.v4.app.InterfaceC0017ao
    /* renamed from: a */
    public final void mo129a(AbstractC0042bm abstractC0042bm) {
        C0037bh.m150a(this.f210a, abstractC0042bm);
    }

    @Override // android.support.v4.app.InterfaceC0018ap
    /* renamed from: a */
    public final Notification.Builder mo130a() {
        return this.f210a;
    }
}
