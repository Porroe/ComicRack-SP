package com.cyo.comicrack.viewer;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ja */
/* loaded from: classes.dex */
final class C0893ja extends FilterInputStream {

    /* renamed from: a */
    final /* synthetic */ WifiSyncService f2699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C0893ja(WifiSyncService wifiSyncService, InputStream inputStream) {
        super(inputStream);
        this.f2699a = wifiSyncService;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            WifiSyncService wifiSyncService = this.f2699a;
            WifiSyncService.m1658a(wifiSyncService, WifiSyncService.m1649a(wifiSyncService) + 1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            WifiSyncService wifiSyncService = this.f2699a;
            WifiSyncService.m1658a(wifiSyncService, WifiSyncService.m1649a(wifiSyncService) + i3);
        }
        return i3;
    }
}
