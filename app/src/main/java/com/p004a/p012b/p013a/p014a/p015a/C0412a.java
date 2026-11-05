package com.p004a.p012b.p013a.p014a.p015a;

import android.content.Context;
import android.util.Log;

/* compiled from: DontLook */
/* renamed from: com.a.b.a.a.a.a */
/* loaded from: classes.dex */
public final class C0412a implements InterfaceC0422k {

    /* renamed from: a */
    private final Context f1319a;

    public C0412a(Context context) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        this.f1319a = context;
    }

    /* renamed from: a */
    private int m940a(String str, String str2) {
        if (this.f1319a == null) {
            return 0;
        }
        return this.f1319a.getResources().getIdentifier(str, str2, this.f1319a.getPackageName());
    }

    @Override // com.p004a.p012b.p013a.p014a.p015a.InterfaceC0422k
    /* renamed from: a */
    public final String mo942a(String str) {
        int iM940a = m940a(str, "string");
        if (iM940a == 0) {
            return null;
        }
        return this.f1319a.getString(iM940a);
    }

    @Override // com.p004a.p012b.p013a.p014a.p015a.InterfaceC0422k
    /* renamed from: b */
    public final boolean mo943b(String str) {
        int iM940a = m940a(str, "bool");
        if (iM940a == 0) {
            return false;
        }
        return "true".equalsIgnoreCase(this.f1319a.getString(iM940a));
    }

    @Override // com.p004a.p012b.p013a.p014a.p015a.InterfaceC0422k
    /* renamed from: a */
    public final int mo941a(String str, int i) {
        int iM940a = m940a(str, "integer");
        if (iM940a != 0) {
            try {
                return Integer.parseInt(this.f1319a.getString(iM940a));
            } catch (NumberFormatException e) {
                Log.w("EZTracker", "NumberFormatException parsing " + this.f1319a.getString(iM940a));
                return i;
            }
        }
        return i;
    }
}
