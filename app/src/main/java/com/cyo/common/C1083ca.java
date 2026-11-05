package com.cyo.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.ca */
/* loaded from: classes.dex */
public class C1083ca {

    /* renamed from: a */
    private Map f3463a;

    /* renamed from: a */
    public final void m2351a(Object obj, XmlPullParser xmlPullParser) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < xmlPullParser.getAttributeCount()) {
                InterfaceC1084cb interfaceC1084cb = (InterfaceC1084cb) m2350a().get("_" + xmlPullParser.getAttributeName(i2));
                if (interfaceC1084cb != null) {
                    interfaceC1084cb.mo1111a(obj, xmlPullParser.getAttributeValue(i2));
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean m2353a(Object obj, XmlPullParser xmlPullParser, InterfaceC1085cc interfaceC1085cc, String str) throws XmlPullParserException, IOException {
        InterfaceC1084cb interfaceC1084cb;
        try {
            int eventType = xmlPullParser.getEventType();
            String name = null;
            while (eventType != 1) {
                switch (eventType) {
                    case TwitterResponse.READ_WRITE /* 2 */:
                        name = xmlPullParser.getName();
                        m2351a(obj, xmlPullParser);
                        if (interfaceC1085cc == null) {
                            break;
                        } else {
                            interfaceC1085cc.mo1154a(obj, name, xmlPullParser);
                            break;
                        }
                    case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                        if (str != null && str.equals(xmlPullParser.getName())) {
                            return true;
                        }
                        name = null;
                        break;
                    case 4:
                        String text = xmlPullParser.getText();
                        if (name != null && (interfaceC1084cb = (InterfaceC1084cb) m2350a().get(name)) != null) {
                            interfaceC1084cb.mo1111a(obj, text);
                        }
                        break;
                }
                eventType = xmlPullParser.next();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m2352a(Object obj, InputStream inputStream, InterfaceC1085cc interfaceC1085cc) throws XmlPullParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = C1086cd.m2354a().newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return m2353a(obj, xmlPullParserNewPullParser, interfaceC1085cc, null);
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    private Map m2350a() {
        if (this.f3463a == null) {
            this.f3463a = new HashMap();
            mo1153a(this.f3463a);
        }
        return this.f3463a;
    }

    /* renamed from: a */
    protected void mo1153a(Map map) {
    }
}
