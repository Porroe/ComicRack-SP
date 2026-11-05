package com.cyo.comicrack.viewer;

import com.cyo.common.C0998bi;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.iy */
/* loaded from: classes.dex */
final class C0890iy implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ WifiSyncService f2695a;

    C0890iy(WifiSyncService wifiSyncService) {
        this.f2695a = wifiSyncService;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(C0998bi.f2929a);
        if (lowerCase.startsWith(".")) {
            return false;
        }
        return lowerCase.endsWith(".cbp.xml") || lowerCase.endsWith(".cbp");
    }
}
