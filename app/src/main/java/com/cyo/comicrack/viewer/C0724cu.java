package com.cyo.comicrack.viewer;

import com.cyo.common.C0998bi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cu */
/* loaded from: classes.dex */
public final class C0724cu {

    /* renamed from: a */
    public List f2265a = new ArrayList();

    /* renamed from: b */
    public List f2266b = new ArrayList();

    /* renamed from: a */
    public final void m1747a() {
        Iterator it = this.f2265a.iterator();
        while (it.hasNext()) {
            ((C0725cv) it.next()).f2268b = 0;
        }
    }

    public final String toString() {
        Properties properties = new Properties();
        int size = this.f2265a.size();
        properties.setProperty("Lists", Integer.toString(size));
        for (int i = 0; i < size; i++) {
            C0725cv c0725cv = (C0725cv) this.f2265a.get(i);
            String str = "List" + (i + 1);
            properties.setProperty(String.valueOf(str) + ".Id", c0725cv.f2267a);
            if (c0725cv.f2268b != 0) {
                properties.setProperty(String.valueOf(str) + ".CurrentLevel", Integer.toString(c0725cv.f2268b));
            }
            for (int i2 = 0; i2 < 8; i2++) {
                String str2 = String.valueOf(str) + ".Level" + (i2 + 1);
                C0727cx c0727cx = c0725cv.f2269c[i2];
                C0726cw c0726cw = c0727cx.f2277c;
                if (i2 < c0725cv.f2268b) {
                    properties.setProperty(String.valueOf(str2) + ".Id", c0727cx.f2275a);
                    properties.setProperty(String.valueOf(str2) + ".Caption", c0727cx.f2276b);
                }
                if (c0726cw.f2271b != 0) {
                    properties.setProperty(String.valueOf(str2) + ".Filter", Integer.toString(c0726cw.f2271b));
                }
                if (c0726cw.f2272c != 1) {
                    properties.setProperty(String.valueOf(str2) + ".Sort.Id", Integer.toString(c0726cw.f2272c));
                }
                if (c0726cw.f2270a) {
                    properties.setProperty(String.valueOf(str2) + ".Sort.Reverse", "true");
                }
                if (c0726cw.f2273d != 0) {
                    properties.setProperty(String.valueOf(str2) + ".Stack.Id", Integer.toString(c0726cw.f2273d));
                }
                if (c0726cw.f2274e != 0) {
                    properties.setProperty(String.valueOf(str2) + ".DisplayStyle.Id", Integer.toString(c0726cw.f2274e));
                }
            }
        }
        int size2 = this.f2266b.size();
        properties.setProperty("Searches", Integer.toString(size2));
        for (int i3 = 0; i3 < size2; i3++) {
            properties.setProperty("Search" + (i3 + 1), (String) this.f2266b.get(i3));
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            properties.storeToXML(byteArrayOutputStream, "Settings", "UTF-8");
            return new String(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C0724cu m1746a(String str) {
        Properties properties = new Properties();
        C0724cu c0724cu = new C0724cu();
        try {
            properties.loadFromXML(new ByteArrayInputStream(str.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = Integer.parseInt(properties.getProperty("Lists", "0"));
        for (int i2 = 0; i2 < i; i2++) {
            String str2 = "List" + (i2 + 1);
            C0725cv c0725cv = new C0725cv();
            c0725cv.f2267a = properties.getProperty(String.valueOf(str2) + ".Id");
            if (c0725cv.f2267a == null) {
                break;
            }
            c0725cv.f2268b = Integer.parseInt(properties.getProperty(String.valueOf(str2) + ".CurrentLevel", "0"));
            for (int i3 = 0; i3 < 8; i3++) {
                C0727cx c0727cx = c0725cv.f2269c[i3];
                C0726cw c0726cw = c0727cx.f2277c;
                String str3 = String.valueOf(str2) + ".Level" + (i3 + 1);
                c0727cx.f2275a = properties.getProperty(String.valueOf(str3) + ".Id", null);
                c0727cx.f2276b = properties.getProperty(String.valueOf(str3) + ".Caption", null);
                Integer num = 1;
                c0726cw.f2272c = Integer.parseInt(properties.getProperty(String.valueOf(str3) + ".Sort.Id", num.toString()));
                c0726cw.f2270a = Boolean.parseBoolean(properties.getProperty(String.valueOf(str3) + ".Sort.Reverse", "false"));
                Integer num2 = 0;
                c0726cw.f2273d = Integer.parseInt(properties.getProperty(String.valueOf(str3) + ".Stack.Id", num2.toString()));
                c0726cw.f2271b = Integer.parseInt(properties.getProperty(String.valueOf(str3) + ".Filter", "0"));
                c0726cw.f2274e = Integer.parseInt(properties.getProperty(String.valueOf(str3) + ".DisplayStyle.Id", "0"));
            }
            c0724cu.f2265a.add(c0725cv);
        }
        int i4 = Integer.parseInt(properties.getProperty("Searches", "0"));
        for (int i5 = 0; i5 < i4; i5++) {
            String property = properties.getProperty("Search" + (i5 + 1));
            if (!C0998bi.m2081a(property)) {
                c0724cu.f2266b.add(property);
            }
        }
        return c0724cu;
    }
}
