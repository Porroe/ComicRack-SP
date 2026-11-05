package com.cyo.common.p026c.p029c;

import java.io.File;
import java.io.RandomAccessFile;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.c.c */
/* loaded from: classes.dex */
public class C1025c extends RandomAccessFile implements InterfaceC1023a {

    /* renamed from: a */
    static final /* synthetic */ boolean f3020a;

    static {
        f3020a = !C1025c.class.desiredAssertionStatus();
    }

    public C1025c(File file) throws java.io.FileNotFoundException {
        super(file, "r");
    }

    @Override // com.cyo.common.p026c.p029c.InterfaceC1023a
    /* renamed from: a */
    public final int mo2139a(byte[] bArr, int i) throws java.io.IOException {
        if (!f3020a && i <= 0) {
            throw new AssertionError(i);
        }
        readFully(bArr, 0, i);
        return i;
    }

    @Override // com.cyo.common.p026c.p029c.InterfaceC1023a
    /* renamed from: a */
    public final long mo2140a() throws java.io.IOException {
        return getFilePointer();
    }

    @Override // com.cyo.common.p026c.p029c.InterfaceC1023a
    /* renamed from: a */
    public final void mo2141a(long j) throws java.io.IOException {
        seek(j);
    }
}
