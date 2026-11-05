package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.ar */
/* loaded from: classes.dex */
public final class C0020ar extends AbstractC0042bm {

    /* renamed from: d */
    public static final InterfaceC0043bn f163d = new C0021as();

    /* renamed from: a */
    public int f164a;

    /* renamed from: b */
    public CharSequence f165b;

    /* renamed from: c */
    public PendingIntent f166c;

    /* renamed from: e */
    private final Bundle f167e;

    /* renamed from: f */
    private final C0048bs[] f168f;

    @Override // android.support.v4.app.AbstractC0042bm
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ AbstractC0057ca[] mo138e() {
        return this.f168f;
    }

    public C0020ar(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle());
    }

    private C0020ar(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f164a = i;
        this.f165b = C0024av.m139d(charSequence);
        this.f166c = pendingIntent;
        this.f167e = bundle == null ? new Bundle() : bundle;
        this.f168f = null;
    }

    @Override // android.support.v4.app.AbstractC0042bm
    /* renamed from: a */
    protected final int mo134a() {
        return this.f164a;
    }

    @Override // android.support.v4.app.AbstractC0042bm
    /* renamed from: b */
    protected final CharSequence mo135b() {
        return this.f165b;
    }

    @Override // android.support.v4.app.AbstractC0042bm
    /* renamed from: c */
    protected final PendingIntent mo136c() {
        return this.f166c;
    }

    @Override // android.support.v4.app.AbstractC0042bm
    /* renamed from: d */
    public final Bundle mo137d() {
        return this.f167e;
    }
}
