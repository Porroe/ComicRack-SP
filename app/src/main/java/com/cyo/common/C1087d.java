package com.cyo.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.d */
/* loaded from: classes.dex */
public final class C1087d implements InterfaceC1090g {

    /* renamed from: a */
    private Bitmap.Config f3465a;

    public C1087d(Bitmap.Config config) {
        this.f3465a = config;
    }

    @Override // com.cyo.common.InterfaceC1090g
    /* renamed from: a */
    public final Object mo2357a(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = this.f3465a;
        options.inPurgeable = false;
        options.inTempStorage = new byte[16384];
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }
}
