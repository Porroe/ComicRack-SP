package android.support.v4.app;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.bo */
/* loaded from: classes.dex */
final class C0044bo {

    /* renamed from: b */
    private static Field f212b;

    /* renamed from: c */
    private static boolean f213c;

    /* renamed from: a */
    private static final Object f211a = new Object();

    /* renamed from: d */
    private static final Object f214d = new Object();

    /* renamed from: a */
    public static void m155a(InterfaceC0018ap interfaceC0018ap, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC0018ap.mo130a()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigTextStyleBigText.setSummaryText(charSequence2);
        }
    }

    /* renamed from: a */
    public static void m154a(InterfaceC0018ap interfaceC0018ap, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        Notification.BigPictureStyle bigPictureStyleBigPicture = new Notification.BigPictureStyle(interfaceC0018ap.mo130a()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPictureStyleBigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPictureStyleBigPicture.setSummaryText(charSequence2);
        }
    }

    /* renamed from: a */
    public static void m156a(InterfaceC0018ap interfaceC0018ap, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList arrayList) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC0018ap.mo130a()).setBigContentTitle(charSequence);
        if (z) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
        }
    }

    /* renamed from: a */
    public static SparseArray m153a(List list) {
        SparseArray sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m152a(Notification notification) {
        synchronized (f211a) {
            if (f213c) {
                return null;
            }
            try {
                if (f212b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f213c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f212b = declaredField;
                }
                Bundle bundle = (Bundle) f212b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f212b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f213c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f213c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Bundle m151a(Notification.Builder builder, AbstractC0042bm abstractC0042bm) {
        builder.addAction(abstractC0042bm.mo134a(), abstractC0042bm.mo135b(), abstractC0042bm.mo136c());
        Bundle bundle = new Bundle(abstractC0042bm.mo137d());
        if (abstractC0042bm.mo138e() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", C0059cc.m163a(abstractC0042bm.mo138e()));
        }
        return bundle;
    }
}
