package com.cyo.common;

import android.content.Context;
import android.media.MediaScannerConnection;
import java.util.TimerTask;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.y */
/* loaded from: classes.dex */
final class C1174y extends TimerTask {

    /* renamed from: a */
    private final /* synthetic */ Context f3728a;

    C1174y(Context context) {
        this.f3728a = context;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        MediaScannerConnection.scanFile(this.f3728a, (String[]) C1173x.f3727d.toArray(new String[0]), null, null);
        C1173x.f3727d.clear();
    }
}
