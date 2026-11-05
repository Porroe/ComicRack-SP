package com.cyo.common;

import android.annotation.TargetApi;
import android.os.StatFs;

/* compiled from: DontLook */
@TargetApi(18)
/* renamed from: com.cyo.common.as */
/* loaded from: classes.dex */
class C0963as extends C0962ar {
    private C0963as() {
        super((byte) 0);
    }

    /* synthetic */ C0963as(byte b) {
        this();
    }

    /* synthetic */ C0963as(char c) {
        this();
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final long mo2011a(String str) {
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }
}
