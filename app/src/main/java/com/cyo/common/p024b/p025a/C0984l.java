package com.cyo.common.p024b.p025a;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.cyo.comicrack.viewer.C0806fv;
import twitter4j.Twitter;
import twitter4j.auth.RequestToken;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.l */
/* loaded from: classes.dex */
final class C0984l extends AbstractC0975c {

    /* renamed from: a */
    RequestToken f2896a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC0988p f2897b;

    /* renamed from: c */
    private final /* synthetic */ Context f2898c;

    /* renamed from: d */
    private final /* synthetic */ String f2899d;

    /* renamed from: e */
    private final /* synthetic */ C0982j f2900e;

    /* renamed from: f */
    private final /* synthetic */ Twitter f2901f;

    C0984l(InterfaceC0988p interfaceC0988p, Context context, String str, C0982j c0982j, Twitter twitter) {
        this.f2897b = interfaceC0988p;
        this.f2898c = context;
        this.f2899d = str;
        this.f2900e = c0982j;
        this.f2901f = twitter;
    }

    @Override // com.cyo.common.p024b.p025a.AbstractC0975c
    /* renamed from: a */
    public final void mo2065a(C0977e c0977e) throws twitter4j.TwitterException {
        this.f2896a = c0977e.f2880a.getOAuthRequestToken();
    }

    @Override // com.cyo.common.p024b.p025a.AbstractC0975c
    /* renamed from: b */
    public final void mo2067b(C0977e c0977e) {
        super.mo2067b(c0977e);
        this.f2897b.mo2071a(null, null);
    }

    @Override // com.cyo.common.p024b.p025a.AbstractC0975c
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: c */
    public final void mo2069c(C0977e c0977e) {
        super.mo2069c(c0977e);
        C0989q c0989q = new C0989q(this.f2898c);
        c0989q.getSettings().setJavaScriptEnabled(true);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.f2898c).setTitle(this.f2899d).setView(c0989q).setView(c0989q).setNegativeButton(C0806fv.close, (DialogInterface.OnClickListener) null).setOnCancelListener(new DialogInterfaceOnCancelListenerC0985m(this, this.f2897b)).create();
        c0989q.setWebViewClient(new C0986n(this, this.f2900e, this.f2901f, alertDialogCreate, this.f2897b));
        c0989q.loadUrl(this.f2896a.getAuthenticationURL());
        alertDialogCreate.show();
    }
}
