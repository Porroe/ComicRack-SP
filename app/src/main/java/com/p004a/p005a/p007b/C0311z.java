package com.p004a.p005a.p007b;

import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.z */
/* loaded from: classes.dex */
final class C0311z implements InterfaceC0276aa {
    C0311z() {
    }

    @Override // com.p004a.p005a.p007b.InterfaceC0276aa
    /* renamed from: a */
    public final HttpURLConnection mo651a(URL url) throws java.io.IOException {
        return (HttpURLConnection) url.openConnection();
    }
}
