package com.p004a.p005a;

import com.p004a.p005a.p007b.C0278ac;
import com.p004a.p005a.p011e.C0370g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DontLook */
/* renamed from: com.a.a.ba */
/* loaded from: classes.dex */
public final class C0312ba {

    /* renamed from: a */
    private static final Map f876a = Collections.unmodifiableMap(new C0313bb());

    /* renamed from: b */
    private final String f877b;

    /* renamed from: c */
    private final String f878c;

    /* renamed from: d */
    private final List f879d;

    /* renamed from: e */
    private final Integer f880e;

    /* renamed from: f */
    private final Integer f881f;

    /* renamed from: g */
    private final List f882g;

    /* renamed from: h */
    private final List f883h;

    /* renamed from: i */
    private final List f884i;

    /* renamed from: a */
    public static C0312ba m804a(String str) throws JSONException {
        List listM806a;
        List listM806a2;
        List listM806a3;
        Integer num;
        Integer numValueOf;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("qdata");
        String string2 = jSONObject.has("ad_type") ? jSONObject.getString("ad_type") : null;
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m805a(jSONArray.getJSONObject(i)));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            numValueOf = jSONObjectOptJSONObject.has("refresh") ? Integer.valueOf(jSONObjectOptJSONObject.getInt("refresh")) : null;
            Integer numValueOf2 = jSONObjectOptJSONObject.has("ad_network_timeout_millis") ? Integer.valueOf(jSONObjectOptJSONObject.getInt("ad_network_timeout_millis")) : null;
            listM806a2 = m806a(jSONObjectOptJSONObject, "imp_urls");
            listM806a3 = m806a(jSONObjectOptJSONObject, "click_urls");
            listM806a = m806a(jSONObjectOptJSONObject, "nofill_urls");
            num = numValueOf2;
        } else {
            listM806a = null;
            listM806a2 = null;
            listM806a3 = null;
            num = null;
            numValueOf = null;
        }
        return new C0312ba(string, string2, arrayList, numValueOf, num, listM806a2, listM806a3, listM806a);
    }

    /* renamed from: a */
    public final boolean m807a() {
        return this.f881f != null;
    }

    /* renamed from: b */
    public final int m808b() {
        return this.f881f.intValue();
    }

    /* renamed from: c */
    public final String m809c() {
        return this.f877b;
    }

    /* renamed from: d */
    public final boolean m810d() {
        return this.f880e != null;
    }

    /* renamed from: e */
    public final int m811e() {
        return this.f880e.intValue();
    }

    /* renamed from: f */
    public final List m812f() {
        return this.f879d;
    }

    /* renamed from: g */
    public final List m813g() {
        return this.f882g;
    }

    /* renamed from: h */
    public final List m814h() {
        return this.f883h;
    }

    /* renamed from: i */
    public final List m815i() {
        return this.f884i;
    }

    /* renamed from: a */
    private static C0397m m805a(JSONObject jSONObject) throws JSONException {
        HashMap map;
        String string = jSONObject.getString("id");
        String strOptString = jSONObject.optString("allocation_id", null);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        List listM806a = m806a(jSONObject, "imp_urls");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        HashMap map2 = new HashMap(0);
        if (jSONObjectOptJSONObject != null) {
            map = new HashMap(jSONObjectOptJSONObject.length());
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.getString(next));
            }
        } else {
            map = map2;
        }
        return new C0397m(strOptString, string, arrayList, listM806a, map);
    }

    /* renamed from: j */
    public final C0278ac m816j() {
        if (this.f878c == null) {
            return null;
        }
        if ("interstitial".equals(this.f878c)) {
            return C0278ac.f740a;
        }
        C0392h c0392h = (C0392h) f876a.get(this.f878c);
        if (c0392h != null) {
            return C0278ac.m685a(c0392h);
        }
        return null;
    }

    /* renamed from: a */
    private static List m806a(JSONObject jSONObject, String str) throws org.json.JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i));
        }
        return arrayList;
    }

    private C0312ba(String str, String str2, List list, Integer num, Integer num2, List list2, List list3, List list4) {
        C0370g.m904a(str);
        this.f877b = str;
        this.f878c = str2;
        this.f879d = list;
        this.f880e = num;
        this.f881f = num2;
        this.f882g = list2;
        this.f883h = list3;
        this.f884i = list4;
    }
}
