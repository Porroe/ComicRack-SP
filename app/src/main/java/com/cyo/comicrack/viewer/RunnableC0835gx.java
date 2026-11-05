package com.cyo.comicrack.viewer;

import android.text.format.DateFormat;
import com.cyo.common.C0971b;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gx */
/* loaded from: classes.dex */
final class RunnableC0835gx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2541a;

    RunnableC0835gx(ReaderActivity readerActivity) {
        this.f2541a = readerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReaderActivity.m1615v(this.f2541a).setText(DateFormat.getTimeFormat(this.f2541a).format(C0971b.m2057b()));
    }
}
