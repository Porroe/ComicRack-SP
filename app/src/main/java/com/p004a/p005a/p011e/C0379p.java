package com.p004a.p005a.p011e;

import android.annotation.TargetApi;
import android.content.Context;

/* compiled from: DontLook */
@TargetApi(4)
/* renamed from: com.a.a.e.p */
/* loaded from: classes.dex */
public final class C0379p {
    /* renamed from: a */
    static int m924a(Context context, float f, int i) {
        if ((context.getApplicationInfo().flags & 8192) != 0) {
            return (int) (i / f);
        }
        return i;
    }
}
