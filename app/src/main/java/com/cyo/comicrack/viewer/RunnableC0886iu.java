package com.cyo.comicrack.viewer;

import java.io.IOException;
import java.net.Socket;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.iu */
/* loaded from: classes.dex */
final class RunnableC0886iu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WifiSyncService f2685a;

    RunnableC0886iu(WifiSyncService wifiSyncService) {
        this.f2685a = wifiSyncService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Socket socketAccept = WifiSyncService.m1679e(this.f2685a).accept();
                try {
                    try {
                        WifiSyncService.m1663a(this.f2685a, socketAccept);
                        if (socketAccept != null) {
                            try {
                                socketAccept.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        if (socketAccept != null) {
                            try {
                                socketAccept.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                } finally {
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                return;
            }
        }
    }
}
