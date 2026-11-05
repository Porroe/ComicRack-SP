package com.p004a.p005a.p008c;

import com.p004a.p005a.p011e.C0372i;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: com.a.a.c.e */
/* loaded from: classes.dex */
public abstract class AbstractC0344e {
    /* renamed from: a */
    public final void m851a(Map map) throws IllegalAccessException, SecurityException, IllegalArgumentException, C0345f {
        String str;
        HashMap map2 = new HashMap();
        for (Field field : getClass().getFields()) {
            InterfaceC0346g interfaceC0346g = (InterfaceC0346g) field.getAnnotation(InterfaceC0346g.class);
            if (interfaceC0346g != null) {
                map2.put(interfaceC0346g.m852a(), field);
            }
        }
        if (map2.isEmpty()) {
            C0372i.m920e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
        }
        for (Object valueForentry : map.entrySet()) {
            Map.Entry entry = (Map.Entry) valueForentry;
            Field field2 = (Field) map2.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    C0372i.m914b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    C0372i.m914b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Bad Type");
                }
            } else {
                C0372i.m920e("Unexpected Server Option: " + ((String) entry.getKey()) + " = '" + ((String) entry.getValue()) + "'");
            }
        }
        String str2 = null;
        for (Object valueForfield3 : map2.values()) {
            Field field3 = (Field) valueForfield3;
            if (((InterfaceC0346g) field3.getAnnotation(InterfaceC0346g.class)).m853b()) {
                C0372i.m914b("Required Server Option missing: " + ((InterfaceC0346g) field3.getAnnotation(InterfaceC0346g.class)).m852a());
                str = (str2 == null ? "" : str2 + ", ") + ((InterfaceC0346g) field3.getAnnotation(InterfaceC0346g.class)).m852a();
            } else {
                str = str2;
            }
            str2 = str;
        }
        if (str2 != null) {
            throw new C0345f("Required Server Option(s) missing: " + str2);
        }
    }
}
