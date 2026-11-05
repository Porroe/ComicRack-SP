package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.bi */
/* loaded from: classes.dex */
public final class C0038bi implements InterfaceC0017ao, InterfaceC0018ap {

    /* renamed from: a */
    Notification.Builder f208a;

    /* renamed from: b */
    Bundle f209b;

    public C0038bi(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList arrayList, Bundle bundle, String str, boolean z5, String str2) {
        this.f208a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str).setGroupSummary(z5).setSortKey(str2);
        this.f209b = new Bundle();
        if (bundle != null) {
            this.f209b.putAll(bundle);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f209b.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    @Override // android.support.v4.app.InterfaceC0017ao
    /* renamed from: a */
    public final void mo129a(AbstractC0042bm abstractC0042bm) {
        C0037bh.m150a(this.f208a, abstractC0042bm);
    }

    @Override // android.support.v4.app.InterfaceC0018ap
    /* renamed from: a */
    public final Notification.Builder mo130a() {
        return this.f208a;
    }
}
