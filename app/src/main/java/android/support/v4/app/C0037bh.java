package android.support.v4.app;

import android.app.Notification;
import android.app.RemoteInput;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.bh */
/* loaded from: classes.dex */
final class C0037bh {
    /* renamed from: a */
    public static void m150a(Notification.Builder builder, AbstractC0042bm abstractC0042bm) {
        Notification.Action.Builder builder2 = new Notification.Action.Builder(abstractC0042bm.mo134a(), abstractC0042bm.mo135b(), abstractC0042bm.mo136c());
        if (abstractC0042bm.mo138e() != null) {
            for (RemoteInput remoteInput : C0054by.m162a(abstractC0042bm.mo138e())) {
                builder2.addRemoteInput(remoteInput);
            }
        }
        if (abstractC0042bm.mo137d() != null) {
            builder2.addExtras(abstractC0042bm.mo137d());
        }
        builder.addAction(builder2.build());
    }
}
