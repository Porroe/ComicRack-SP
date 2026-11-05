package com.cyo.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import java.io.File;

/* compiled from: DontLook */
@TargetApi(19)
/* renamed from: com.cyo.common.at */
/* loaded from: classes.dex */
final class C0964at extends C0963as {
    private C0964at() {
        super((byte) 0);
    }

    /* synthetic */ C0964at(byte b) {
        this();
    }

    @Override // com.cyo.common.C0960ap, com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2027a(View view, boolean z) {
        if (view != null) {
            view.setSystemUiVisibility(z ? 4098 : 0);
        }
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: b */
    public final File[] mo2035b(Context context) {
        return context.getExternalFilesDirs(null);
    }
}
