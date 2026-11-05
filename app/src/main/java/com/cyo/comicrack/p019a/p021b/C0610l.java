package com.cyo.comicrack.p019a.p021b;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.l */
/* loaded from: classes.dex */
final class C0610l implements InterfaceC0612n {

    /* renamed from: a */
    private final /* synthetic */ File f1825a;

    C0610l(File file) {
        this.f1825a = file;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0612n
    /* renamed from: a */
    public final InputStream mo1321a() {
        try {
            return new BufferedInputStream(new FileInputStream(this.f1825a), 32000);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0612n
    /* renamed from: b */
    public final void mo1322b() {
        if (!this.f1825a.delete()) {
            Log.d("internalGetInputData", "Failed to delete temporary cbr data");
        }
    }
}
