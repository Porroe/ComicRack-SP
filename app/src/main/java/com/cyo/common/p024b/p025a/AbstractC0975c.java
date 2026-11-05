package com.cyo.common.p024b.p025a;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC0975c {
    /* renamed from: a */
    public abstract void mo2065a(C0977e c0977e) throws twitter4j.TwitterException;

    /* renamed from: a */
    public final void m2066a(C0977e c0977e, boolean z) {
        if (!z) {
            mo2067b(c0977e);
        }
        C0973a.m2060a().post(new RunnableC0976d(this, c0977e, z));
    }

    /* renamed from: b */
    public void mo2067b(C0977e c0977e) {
    }

    /* renamed from: b */
    public void mo2068b(C0977e c0977e, boolean z) {
        if (z) {
            mo2069c(c0977e);
        } else {
            mo2064a();
        }
    }

    /* renamed from: a */
    public void mo2064a() {
    }

    /* renamed from: c */
    public void mo2069c(C0977e c0977e) {
    }
}
