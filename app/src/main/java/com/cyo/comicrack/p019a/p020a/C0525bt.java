package com.cyo.comicrack.p019a.p020a;

import com.cyo.common.InterfaceC1085cc;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.bt */
/* loaded from: classes.dex */
final class C0525bt implements InterfaceC1085cc {
    @Override // com.cyo.common.InterfaceC1085cc
    /* renamed from: a */
    public final /* synthetic */ void mo1154a(Object obj, String str, XmlPullParser xmlPullParser) {
        C0505b c0505b = (C0505b) obj;
        if (str.equals("Page")) {
            C0537ce c0537ce = new C0537ce();
            C0505b.m1119s().m2351a(c0537ce, xmlPullParser);
            c0505b.m1165D().add(c0537ce);
        }
    }

    C0525bt() {
    }
}
