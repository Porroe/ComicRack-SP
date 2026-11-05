package com.cyo.comicrack.viewer;

import java.net.InetAddress;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.jc */
/* loaded from: classes.dex */
final class C0895jc {

    /* renamed from: a */
    public InetAddress f2701a;

    /* renamed from: b */
    public int f2702b;

    public C0895jc(InetAddress inetAddress, int i) {
        this.f2701a = inetAddress;
        this.f2702b = i;
    }

    public final boolean equals(Object obj) {
        C0895jc c0895jc = (C0895jc) obj;
        return this.f2701a.equals(c0895jc.f2701a) && this.f2702b == c0895jc.f2702b;
    }

    public final int hashCode() {
        return this.f2701a.hashCode() ^ this.f2702b;
    }
}
