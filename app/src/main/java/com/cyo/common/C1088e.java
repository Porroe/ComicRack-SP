package com.cyo.common;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.BufferedOutputStream;
import android.graphics.Bitmap;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.e */
/* loaded from: classes.dex */
public final class C1088e implements InterfaceC1091h {

    /* renamed from: a */
    private Bitmap f3466a;

    /* renamed from: b */
    private int f3467b = 50;

    public C1088e(Bitmap bitmap) {
        this.f3466a = bitmap;
    }

    @Override
    /* renamed from: a */
    public final void mo2358a(File file) {
        BufferedOutputStream output = null;
        try {
            output = new BufferedOutputStream(new FileOutputStream(file), 32768);
            this.f3466a.compress(Bitmap.CompressFormat.JPEG, this.f3467b, output);
        } catch (Exception e) {
            e.printStackTrace();
            file.delete();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.cyo.common.InterfaceC1091h
    /* renamed from: a */
    public final boolean mo2359a() {
        return (this.f3466a == null || this.f3466a.isRecycled()) ? false : true;
    }
}
