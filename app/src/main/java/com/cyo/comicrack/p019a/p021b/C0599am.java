package com.cyo.comicrack.p019a.p021b;

import com.cyo.comicrack.p019a.p020a.C0536cd;
import com.cyo.common.InterfaceC1085cc;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.am */
/* loaded from: classes.dex */
final class C0599am implements InterfaceC1085cc {
    @Override // com.cyo.common.InterfaceC1085cc
    /* renamed from: a */
    public final /* synthetic */ void mo1154a(Object obj, String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        C0591ae c0591ae = (C0591ae) obj;
        if (str.equals("List")) {
            C0536cd c0536cd = new C0536cd();
            C0591ae.m1286a().m2353a(c0536cd, xmlPullParser, null, "List");
            c0591ae.f1789c.add(c0536cd);
        }
    }

    C0599am() {
    }
}
