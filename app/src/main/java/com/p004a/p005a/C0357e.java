package com.p004a.p005a;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.p004a.p005a.p006a.C0245b;
import com.p004a.p005a.p008c.p009a.C0340a;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: DontLook */
/* renamed from: com.a.a.e */
/* loaded from: classes.dex */
public class C0357e {

    /* renamed from: b */
    public static final String f1008b;

    /* renamed from: c */
    private static final SimpleDateFormat f1009c = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: d */
    private static Method f1010d;

    /* renamed from: e */
    private static Method f1011e;

    /* renamed from: f */
    private EnumC0391g f1013f = null;

    /* renamed from: g */
    private Date f1014g = null;

    /* renamed from: h */
    private Set f1015h = null;

    /* renamed from: i */
    private Map f1016i = null;

    /* renamed from: a */
    public final Map f1012a = new HashMap();

    /* renamed from: j */
    private Location f1017j = null;

    /* renamed from: k */
    private boolean f1018k = false;

    /* renamed from: l */
    private boolean f1019l = false;

    /* renamed from: m */
    private Set f1020m = null;

    static {
        f1010d = null;
        f1011e = null;
        try {
            for (Method method : Class.forName("com.google.analytics.tracking.android.AdMobInfo").getMethods()) {
                if (method.getName().equals("getInstance") && method.getParameterTypes().length == 0) {
                    f1010d = method;
                } else if (method.getName().equals("getJoinIds") && method.getParameterTypes().length == 0) {
                    f1011e = method;
                }
            }
            if (f1010d == null || f1011e == null) {
                f1010d = null;
                f1011e = null;
                C0372i.m920e("No Google Analytics: Library Incompatible.");
            }
        } catch (ClassNotFoundException e) {
            C0372i.m911a("No Google Analytics: Library Not Found.");
        } catch (Throwable th) {
            C0372i.m911a("No Google Analytics: Error Loading Library");
        }
        f1008b = C0358a.m870a("emulator");
    }

    /* renamed from: a */
    public final Object m862a(Class cls) {
        return this.f1012a.get(cls);
    }

    /* renamed from: a */
    public Map mo861a(Context context) {
        String str;
        HashMap map = new HashMap();
        if (this.f1015h != null) {
            map.put("kw", this.f1015h);
        }
        if (this.f1013f != null) {
            map.put("cust_gender", Integer.valueOf(this.f1013f.ordinal()));
        }
        if (this.f1014g != null) {
            map.put("cust_age", f1009c.format(this.f1014g));
        }
        if (this.f1017j != null) {
            map.put("uule", C0358a.m872a(this.f1017j));
        }
        if (this.f1018k) {
            map.put("testing", 1);
        }
        if (m863b(context)) {
            map.put("adtest", "on");
        } else if (!this.f1019l) {
            if (C0358a.m887c()) {
                str = "AdRequest.TEST_EMULATOR";
            } else {
                str = "\"" + C0358a.m868a(context) + "\"";
            }
            C0372i.m916c("To get test ads on this device, call adRequest.addTestDevice(" + str + ");");
            this.f1019l = true;
        }
        C0340a c0340a = (C0340a) m862a(C0340a.class);
        C0245b c0245b = (C0245b) m862a(C0245b.class);
        if (c0245b != null && c0245b.m844c() != null && !c0245b.m844c().isEmpty()) {
            map.put("extras", c0245b.m844c());
        } else if (c0340a != null && c0340a.m844c() != null && !c0340a.m844c().isEmpty()) {
            map.put("extras", c0340a.m844c());
        }
        if (c0245b != null) {
            String strM590a = c0245b.m590a();
            if (!TextUtils.isEmpty(strM590a)) {
                map.put("ppid", strM590a);
            }
        }
        if (this.f1016i != null) {
            map.put("mediation_extras", this.f1016i);
        }
        try {
            if (f1010d != null) {
                Map map2 = (Map) f1011e.invoke(f1010d.invoke(null, new Object[0]), new Object[0]);
                if (map2 != null && map2.size() > 0) {
                    map.put("analytics_join_id", map2);
                }
            }
        } catch (Throwable th) {
            C0372i.m917c("Internal Analytics Error:", th);
        }
        return map;
    }

    /* renamed from: b */
    public final boolean m863b(Context context) {
        String strM868a;
        return (this.f1020m == null || (strM868a = C0358a.m868a(context)) == null || !this.f1020m.contains(strM868a)) ? false : true;
    }
}
