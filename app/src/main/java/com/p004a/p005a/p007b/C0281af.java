package com.p004a.p005a.p007b;

import com.p004a.p005a.p011e.C0372i;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.af */
/* loaded from: classes.dex */
public final class C0281af {

    /* renamed from: a */
    private final String f755a;

    public C0281af(String str) {
        this.f755a = str;
    }

    /* renamed from: a */
    public final JSONObject m698a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("debugHeader", this.f755a);
        } catch (JSONException e) {
            C0372i.m915b("Could not build ReportAdJson from inputs.", e);
        }
        return jSONObject;
    }
}
