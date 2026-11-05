package com.p004a.p005a.p007b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.x */
/* loaded from: classes.dex */
public final class C0309x {

    /* renamed from: a */
    public final String f868a;

    /* renamed from: b */
    public HashMap f869b;

    public C0309x(Bundle bundle) {
        this.f868a = bundle.getString("action");
        Serializable serializable = bundle.getSerializable("params");
        this.f869b = serializable instanceof HashMap ? (HashMap) serializable : null;
    }

    public C0309x(String str) {
        this.f868a = str;
    }

    public C0309x(String str, HashMap map) {
        this(str);
        this.f869b = map;
    }
}
