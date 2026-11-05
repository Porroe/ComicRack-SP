package com.cyo.comicrack.viewer;

import android.app.Notification;
import com.cyo.common.C0951ag;
import com.cyo.common.C0998bi;
import java.util.TimerTask;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ix */
/* loaded from: classes.dex */
final class C0889ix extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ WifiSyncService f2689a;

    /* renamed from: b */
    private long f2690b = -1;

    /* renamed from: c */
    private long f2691c;

    /* renamed from: d */
    private long f2692d;

    /* renamed from: e */
    private int f2693e;

    /* renamed from: f */
    private boolean f2694f;

    C0889ix(WifiSyncService wifiSyncService) {
        this.f2689a = wifiSyncService;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM1649a = WifiSyncService.m1649a(this.f2689a) + WifiSyncService.m1670b(this.f2689a);
        long j = jM1649a - this.f2690b;
        float f = (jCurrentTimeMillis - this.f2691c) / 1000.0f;
        if (j == 0 && !WifiSyncService.m1684g(this.f2689a)) {
            int i = this.f2693e + 1;
            this.f2693e = i;
            if (i > 180) {
                WifiSyncService.m1685h(this.f2689a);
                return;
            }
        } else {
            this.f2693e = 0;
        }
        if (this.f2690b != jM1649a || this.f2692d != j || WifiSyncService.m1686i(this.f2689a) != this.f2694f) {
            Object[] objArr = new Object[2];
            objArr[0] = C0998bi.m2077a(jM1649a);
            objArr[1] = j <= 0 ? this.f2689a.getString(C0806fv.waiting) : String.valueOf(C0998bi.m2077a((long) (j / f))) + "/s";
            String str = String.format("%s (%s)", objArr);
            if (WifiSyncService.m1687j(this.f2689a) != null) {
                String strReplace = WifiSyncService.m1687j(this.f2689a).replace(".cbp", "").replace(".xml", "");
                if (!C0951ag.m2004d() && WifiSyncService.m1688k(this.f2689a) >= 0) {
                    strReplace = String.valueOf(WifiSyncService.m1688k(this.f2689a)) + "%/" + str + " - " + strReplace;
                }
                WifiSyncService.m1689l(this.f2689a).m147b(strReplace);
            }
            WifiSyncService.m1689l(this.f2689a).m148c(WifiSyncService.m1686i(this.f2689a) ? this.f2689a.getString(C0806fv.aborting) : str);
            WifiSyncService.m1689l(this.f2689a).m143a(WifiSyncService.m1688k(this.f2689a), !WifiSyncService.m1690m(this.f2689a));
            Notification notificationM146b = WifiSyncService.m1689l(this.f2689a).m146b();
            WifiSyncService.m1691n(this.f2689a).notify(1, notificationM146b);
            this.f2689a.startForeground(1, notificationM146b);
        }
        this.f2691c = jCurrentTimeMillis;
        this.f2690b = jM1649a;
        this.f2692d = j;
        this.f2694f = WifiSyncService.m1686i(this.f2689a);
    }
}
