package com.p004a.p005a;

import android.content.Context;
import android.net.Uri;

/* compiled from: DontLook */
/* renamed from: com.a.a.al */
/* loaded from: classes.dex */
public final class C0259al {

    /* renamed from: d */
    private InterfaceC0255ah f672d;

    /* renamed from: b */
    private String f670b = "googleads.g.doubleclick.net";

    /* renamed from: c */
    private String f671c = "/pagead/ads";

    /* renamed from: a */
    String[] f669a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: e */
    private C0254ag f673e = new C0254ag();

    public C0259al(InterfaceC0255ah interfaceC0255ah) {
        this.f672d = interfaceC0255ah;
    }

    /* renamed from: a */
    public final boolean m614a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String str : this.f669a) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final Uri m613a(Uri uri, Context context) throws C0260am {
        try {
            return m612a(uri, context, uri.getQueryParameter("ai"));
        } catch (UnsupportedOperationException e) {
            throw new C0260am("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    private Uri m612a(Uri uri, Context context, String str) throws C0260am {
        try {
            if (uri.getQueryParameter("ms") != null) {
                throw new C0260am("Query parameter already exists: ms");
            }
            String strMo593a = this.f672d.mo593a(context, str);
            String string = uri.toString();
            int iIndexOf = string.indexOf("&adurl");
            if (iIndexOf == -1) {
                iIndexOf = string.indexOf("?adurl");
            }
            return iIndexOf != -1 ? Uri.parse(string.substring(0, iIndexOf + 1) + "ms=" + strMo593a + "&" + string.substring(iIndexOf + 1)) : uri.buildUpon().appendQueryParameter("ms", strMo593a).build();
        } catch (UnsupportedOperationException e) {
            throw new C0260am("Provided Uri is not in a valid state");
        }
    }
}
