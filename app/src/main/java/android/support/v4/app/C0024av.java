package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.av */
/* loaded from: classes.dex */
public final class C0024av {

    /* renamed from: A */
    Notification f173A;

    /* renamed from: C */
    public ArrayList f175C;

    /* renamed from: a */
    Context f176a;

    /* renamed from: b */
    CharSequence f177b;

    /* renamed from: c */
    CharSequence f178c;

    /* renamed from: d */
    PendingIntent f179d;

    /* renamed from: e */
    PendingIntent f180e;

    /* renamed from: f */
    RemoteViews f181f;

    /* renamed from: g */
    Bitmap f182g;

    /* renamed from: h */
    CharSequence f183h;

    /* renamed from: i */
    int f184i;

    /* renamed from: j */
    int f185j;

    /* renamed from: l */
    boolean f187l;

    /* renamed from: m */
    AbstractC0036bg f188m;

    /* renamed from: n */
    CharSequence f189n;

    /* renamed from: o */
    int f190o;

    /* renamed from: p */
    int f191p;

    /* renamed from: q */
    boolean f192q;

    /* renamed from: r */
    String f193r;

    /* renamed from: s */
    boolean f194s;

    /* renamed from: t */
    String f195t;

    /* renamed from: w */
    String f198w;

    /* renamed from: x */
    Bundle f199x;

    /* renamed from: k */
    boolean f186k = true;

    /* renamed from: u */
    ArrayList f196u = new ArrayList();

    /* renamed from: v */
    boolean f197v = false;

    /* renamed from: y */
    int f200y = 0;

    /* renamed from: z */
    int f201z = 0;

    /* renamed from: B */
    Notification f174B = new Notification();

    public C0024av(Context context) {
        this.f176a = context;
        this.f174B.when = System.currentTimeMillis();
        this.f174B.audioStreamType = -1;
        this.f185j = 0;
        this.f175C = new ArrayList();
    }

    /* renamed from: a */
    public final C0024av m141a(int i) {
        this.f174B.icon = i;
        return this;
    }

    /* renamed from: a */
    public final C0024av m145a(CharSequence charSequence) {
        this.f177b = m139d(charSequence);
        return this;
    }

    /* renamed from: b */
    public final C0024av m147b(CharSequence charSequence) {
        this.f178c = m139d(charSequence);
        return this;
    }

    /* renamed from: c */
    public final C0024av m148c(CharSequence charSequence) {
        this.f183h = m139d(charSequence);
        return this;
    }

    /* renamed from: a */
    public final C0024av m143a(int i, boolean z) {
        this.f190o = 100;
        this.f191p = i;
        this.f192q = z;
        return this;
    }

    /* renamed from: a */
    public final C0024av m144a(PendingIntent pendingIntent) {
        this.f179d = pendingIntent;
        return this;
    }

    /* renamed from: a */
    public final C0024av m140a() {
        this.f174B.flags |= 2;
        return this;
    }

    /* renamed from: a */
    public final C0024av m142a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f196u.add(new C0020ar(i, charSequence, pendingIntent));
        return this;
    }

    /* renamed from: b */
    public final Notification m146b() {
        return C0019aq.m131a().mo149a(this);
    }

    /* renamed from: d */
    protected static CharSequence m139d(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }
}
