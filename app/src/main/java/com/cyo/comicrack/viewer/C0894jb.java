package com.cyo.comicrack.viewer;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.jb */
/* loaded from: classes.dex */
final class C0894jb extends FilterOutputStream {

    /* renamed from: a */
    final /* synthetic */ WifiSyncService f2700a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0894jb(WifiSyncService wifiSyncService, OutputStream outputStream) {
        super(outputStream);
        this.f2700a = wifiSyncService;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        super.write(i);
        WifiSyncService wifiSyncService = this.f2700a;
        WifiSyncService.m1673b(wifiSyncService, WifiSyncService.m1670b(wifiSyncService) + 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
        WifiSyncService wifiSyncService = this.f2700a;
        WifiSyncService.m1673b(wifiSyncService, WifiSyncService.m1670b(wifiSyncService) + i2);
    }
}
