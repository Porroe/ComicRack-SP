package com.cyo.common.p024b;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b.a */
/* loaded from: classes.dex */
public final class C0972a {

    /* renamed from: b */
    private final String f2867b;

    /* renamed from: c */
    private int f2868c;

    /* renamed from: e */
    private int f2870e;

    /* renamed from: f */
    private String f2871f;

    /* renamed from: g */
    private String f2872g;

    /* renamed from: d */
    private int f2869d = -1;

    /* renamed from: a */
    public Map f2866a = new HashMap();

    public C0972a(String str) {
        this.f2867b = str;
        while (m2058a()) {
            Map map = this.f2866a;
            if (this.f2871f == null) {
                this.f2871f = this.f2867b.substring(this.f2868c, this.f2870e);
            }
            map.put(this.f2871f, m2059b());
        }
    }

    /* renamed from: a */
    private boolean m2058a() {
        int length = this.f2867b.length();
        while (this.f2869d != length) {
            this.f2868c = this.f2869d == -1 ? 0 : this.f2869d + 1;
            int iIndexOf = this.f2867b.indexOf(38, this.f2868c);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            this.f2869d = iIndexOf;
            if (this.f2869d > this.f2868c) {
                int iIndexOf2 = this.f2867b.indexOf(61, this.f2868c);
                if (iIndexOf2 == -1 || iIndexOf2 > this.f2869d) {
                    iIndexOf2 = this.f2869d;
                }
                this.f2870e = iIndexOf2;
                this.f2871f = null;
                this.f2872g = null;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private String m2059b() {
        if (this.f2872g == null) {
            if (this.f2870e == this.f2869d) {
                return null;
            }
            try {
                this.f2872g = URLDecoder.decode(this.f2867b.substring(this.f2870e + 1, this.f2869d), "UTF-8");
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        return this.f2872g;
    }
}
