package com.p004a.p012b.p013a.p014a;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.a.b.a.a.c */
/* loaded from: classes.dex */
public final class C0430c {
    /* renamed from: a */
    static String m965a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2).replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError("URL encoding failed for: " + str);
        }
    }
}
