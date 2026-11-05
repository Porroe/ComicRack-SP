package com.cyo.common;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.cd */
/* loaded from: classes.dex */
public final class C1086cd {

    /* renamed from: a */
    private static XmlPullParserFactory f3464a;

    /* renamed from: a */
    public static void m2355a(XmlSerializer xmlSerializer, String str, Object obj, Object obj2) throws IllegalStateException, IOException, IllegalArgumentException {
        if (obj != null) {
            if (obj2 == null || !obj.equals(obj2)) {
                xmlSerializer.startTag(null, str);
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, str);
            }
        }
    }

    /* renamed from: b */
    public static void m2356b(XmlSerializer xmlSerializer, String str, Object obj, Object obj2) throws IllegalStateException, IOException, IllegalArgumentException {
        if (obj != null) {
            if (obj2 == null || !obj.equals(obj2)) {
                xmlSerializer.attribute(null, str, obj.toString());
            }
        }
    }

    /* renamed from: a */
    public static XmlPullParserFactory m2354a() throws org.xmlpull.v1.XmlPullParserException {
        if (f3464a == null) {
            f3464a = XmlPullParserFactory.newInstance();
        }
        return f3464a;
    }
}
