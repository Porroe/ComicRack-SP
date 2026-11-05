package com.p004a.p012b.p013a.p014a;

import java.util.Collections;
import java.util.LinkedList;

/* renamed from: com.a.b.a.a.t */
/* loaded from: classes.dex */
final class RunnableC0447t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ HandlerThreadC0446s f1445a;

    /* renamed from: b */
    private final LinkedList f1446b = new LinkedList();

    public RunnableC0447t(HandlerThreadC0446s handlerThreadC0446s, C0440m[] c0440mArr) {
        this.f1445a = handlerThreadC0446s;
        Collections.addAll(this.f1446b, c0440mArr);
    }

    /* renamed from: a */
    public final C0440m m1020a() {
        return (C0440m) this.f1446b.poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[Catch: InterruptedException -> 0x0129, IOException -> 0x01db, HttpException -> 0x022b, TryCatch #2 {IOException -> 0x01db, InterruptedException -> 0x0129, HttpException -> 0x022b, blocks: (B:8:0x0017, B:10:0x0021, B:39:0x0122, B:15:0x0049, B:18:0x0063, B:20:0x006b, B:22:0x0073, B:24:0x007b, B:28:0x009a, B:30:0x00a2, B:31:0x00aa, B:33:0x00c6, B:34:0x00e9, B:36:0x0103, B:38:0x0110, B:53:0x019a, B:54:0x01b4, B:56:0x01ba, B:57:0x01ca, B:59:0x01d1, B:63:0x01e5, B:65:0x01ef, B:68:0x0220, B:67:0x01f7, B:52:0x0165, B:47:0x014c, B:48:0x0150, B:50:0x0158, B:73:0x0237, B:12:0x002b, B:14:0x0044), top: B:75:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6 A[Catch: InterruptedException -> 0x0129, IOException -> 0x01db, HttpException -> 0x022b, TryCatch #2 {IOException -> 0x01db, InterruptedException -> 0x0129, HttpException -> 0x022b, blocks: (B:8:0x0017, B:10:0x0021, B:39:0x0122, B:15:0x0049, B:18:0x0063, B:20:0x006b, B:22:0x0073, B:24:0x007b, B:28:0x009a, B:30:0x00a2, B:31:0x00aa, B:33:0x00c6, B:34:0x00e9, B:36:0x0103, B:38:0x0110, B:53:0x019a, B:54:0x01b4, B:56:0x01ba, B:57:0x01ca, B:59:0x01d1, B:63:0x01e5, B:65:0x01ef, B:68:0x0220, B:67:0x01f7, B:52:0x0165, B:47:0x014c, B:48:0x0150, B:50:0x0158, B:73:0x0237, B:12:0x002b, B:14:0x0044), top: B:75:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103 A[Catch: InterruptedException -> 0x0129, IOException -> 0x01db, HttpException -> 0x022b, TryCatch #2 {IOException -> 0x01db, InterruptedException -> 0x0129, HttpException -> 0x022b, blocks: (B:8:0x0017, B:10:0x0021, B:39:0x0122, B:15:0x0049, B:18:0x0063, B:20:0x006b, B:22:0x0073, B:24:0x007b, B:28:0x009a, B:30:0x00a2, B:31:0x00aa, B:33:0x00c6, B:34:0x00e9, B:36:0x0103, B:38:0x0110, B:53:0x019a, B:54:0x01b4, B:56:0x01ba, B:57:0x01ca, B:59:0x01d1, B:63:0x01e5, B:65:0x01ef, B:68:0x0220, B:67:0x01f7, B:52:0x0165, B:47:0x014c, B:48:0x0150, B:50:0x0158, B:73:0x0237, B:12:0x002b, B:14:0x0044), top: B:75:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0165 A[Catch: InterruptedException -> 0x0129, IOException -> 0x01db, HttpException -> 0x022b, TryCatch #2 {IOException -> 0x01db, InterruptedException -> 0x0129, HttpException -> 0x022b, blocks: (B:8:0x0017, B:10:0x0021, B:39:0x0122, B:15:0x0049, B:18:0x0063, B:20:0x006b, B:22:0x0073, B:24:0x007b, B:28:0x009a, B:30:0x00a2, B:31:0x00aa, B:33:0x00c6, B:34:0x00e9, B:36:0x0103, B:38:0x0110, B:53:0x019a, B:54:0x01b4, B:56:0x01ba, B:57:0x01ca, B:59:0x01d1, B:63:0x01e5, B:65:0x01ef, B:68:0x0220, B:67:0x01f7, B:52:0x0165, B:47:0x014c, B:48:0x0150, B:50:0x0158, B:73:0x0237, B:12:0x002b, B:14:0x0044), top: B:75:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba A[Catch: InterruptedException -> 0x0129, IOException -> 0x01db, HttpException -> 0x022b, TryCatch #2 {IOException -> 0x01db, InterruptedException -> 0x0129, HttpException -> 0x022b, blocks: (B:8:0x0017, B:10:0x0021, B:39:0x0122, B:15:0x0049, B:18:0x0063, B:20:0x006b, B:22:0x0073, B:24:0x007b, B:28:0x009a, B:30:0x00a2, B:31:0x00aa, B:33:0x00c6, B:34:0x00e9, B:36:0x0103, B:38:0x0110, B:53:0x019a, B:54:0x01b4, B:56:0x01ba, B:57:0x01ca, B:59:0x01d1, B:63:0x01e5, B:65:0x01ef, B:68:0x0220, B:67:0x01f7, B:52:0x0165, B:47:0x014c, B:48:0x0150, B:50:0x0158, B:73:0x0237, B:12:0x002b, B:14:0x0044), top: B:75:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cf  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.RunnableC0447t.run():void");
    }
}
