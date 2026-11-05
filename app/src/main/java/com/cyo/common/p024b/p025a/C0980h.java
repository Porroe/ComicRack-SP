package com.cyo.common.p024b.p025a;

import android.content.Context;
import android.widget.Toast;
import com.cyo.comicrack.viewer.C0806fv;
import java.io.InputStream;
import twitter4j.StatusUpdate;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.h */
/* loaded from: classes.dex */
final class C0980h extends AbstractC0975c {

    /* renamed from: a */
    final /* synthetic */ C0978f f2886a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC0981i f2887b;

    /* renamed from: c */
    private final /* synthetic */ InputStream f2888c;

    /* renamed from: d */
    private final /* synthetic */ Context f2889d;

    C0980h(C0978f c0978f, InterfaceC0981i interfaceC0981i, InputStream inputStream, Context context) {
        this.f2886a = c0978f;
        this.f2887b = interfaceC0981i;
        this.f2888c = inputStream;
        this.f2889d = context;
    }

    @Override // com.cyo.common.p024b.p025a.AbstractC0975c
    /* renamed from: a */
    public final void mo2065a(C0977e c0977e) throws twitter4j.TwitterException {
        StatusUpdate statusUpdate = new StatusUpdate(this.f2887b.mo1744a());
        if (this.f2888c != null) {
            statusUpdate.setMedia("Cover", this.f2888c);
        }
        c0977e.f2880a.updateStatus(statusUpdate);
    }

    @Override // com.cyo.common.p024b.p025a.AbstractC0975c
    /* renamed from: c */
    public final void mo2069c(C0977e c0977e) {
        Toast.makeText(this.f2889d, C0806fv.tweet_sent, 0).show();
    }

    @Override // com.cyo.common.p024b.p025a.AbstractC0975c
    /* renamed from: a */
    public final void mo2064a() {
        Toast.makeText(this.f2889d, C0806fv.tweet_failed, 0).show();
    }
}
