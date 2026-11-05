package com.p004a.p012b.p013a.p014a;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.a.b.a.a.s */
/* loaded from: classes.dex */
final class HandlerThreadC0446s extends HandlerThread {

    /* renamed from: a */
    volatile Handler f1435a;

    /* renamed from: b */
    private final C0451x f1436b;

    /* renamed from: c */
    private final String f1437c;

    /* renamed from: d */
    private int f1438d;

    /* renamed from: e */
    private int f1439e;

    /* renamed from: f */
    private long f1440f;

    /* renamed from: g */
    private RunnableC0447t f1441g;

    /* renamed from: h */
    private final InterfaceC0434g f1442h;

    /* renamed from: i */
    private final C0448u f1443i;

    /* renamed from: j */
    private final C0445r f1444j;

    private HandlerThreadC0446s(InterfaceC0434g interfaceC0434g, C0451x c0451x, String str, C0445r c0445r) {
        super("DispatcherThread");
        this.f1439e = 30;
        this.f1441g = null;
        this.f1442h = interfaceC0434g;
        this.f1437c = str;
        this.f1436b = c0451x;
        this.f1443i = new C0448u(this, (byte) 0);
        this.f1436b.f1471b = this.f1443i;
        this.f1444j = c0445r;
    }

    private HandlerThreadC0446s(InterfaceC0434g interfaceC0434g, String str, C0445r c0445r) {
        this(interfaceC0434g, new C0451x(c0445r.f1431a), str, c0445r);
    }

    /* synthetic */ HandlerThreadC0446s(InterfaceC0434g interfaceC0434g, String str, C0445r c0445r, byte b) {
        this(interfaceC0434g, str, c0445r);
    }

    /* renamed from: a */
    static /* synthetic */ int m1005a(HandlerThreadC0446s handlerThreadC0446s) {
        return handlerThreadC0446s.f1438d;
    }

    /* renamed from: a */
    static /* synthetic */ int m1006a(HandlerThreadC0446s handlerThreadC0446s, int i) {
        handlerThreadC0446s.f1438d = i;
        return i;
    }

    /* renamed from: a */
    static /* synthetic */ RunnableC0447t m1007a(HandlerThreadC0446s handlerThreadC0446s, RunnableC0447t runnableC0447t) {
        handlerThreadC0446s.f1441g = runnableC0447t;
        return runnableC0447t;
    }

    /* renamed from: b */
    static /* synthetic */ long m1008b(HandlerThreadC0446s handlerThreadC0446s) {
        return handlerThreadC0446s.f1440f;
    }

    /* renamed from: c */
    static /* synthetic */ long m1009c(HandlerThreadC0446s handlerThreadC0446s) {
        long j = handlerThreadC0446s.f1440f * 2;
        handlerThreadC0446s.f1440f = j;
        return j;
    }

    /* renamed from: d */
    static /* synthetic */ long m1010d(HandlerThreadC0446s handlerThreadC0446s) {
        handlerThreadC0446s.f1440f = 2L;
        return 2L;
    }

    /* renamed from: e */
    static /* synthetic */ C0445r m1011e(HandlerThreadC0446s handlerThreadC0446s) {
        return handlerThreadC0446s.f1444j;
    }

    /* renamed from: f */
    static /* synthetic */ C0451x m1012f(HandlerThreadC0446s handlerThreadC0446s) {
        return handlerThreadC0446s.f1436b;
    }

    /* renamed from: g */
    static /* synthetic */ InterfaceC0434g m1013g(HandlerThreadC0446s handlerThreadC0446s) {
        return handlerThreadC0446s.f1442h;
    }

    /* renamed from: h */
    static /* synthetic */ int m1014h(HandlerThreadC0446s handlerThreadC0446s) {
        return handlerThreadC0446s.f1439e;
    }

    /* renamed from: i */
    static /* synthetic */ String m1015i(HandlerThreadC0446s handlerThreadC0446s) {
        return handlerThreadC0446s.f1437c;
    }

    /* renamed from: j */
    static /* synthetic */ C0448u m1016j(HandlerThreadC0446s handlerThreadC0446s) {
        return handlerThreadC0446s.f1443i;
    }

    /* renamed from: k */
    static /* synthetic */ int m1017k(HandlerThreadC0446s handlerThreadC0446s) {
        handlerThreadC0446s.f1439e = 1;
        return 1;
    }

    /* renamed from: l */
    static /* synthetic */ RunnableC0447t m1018l(HandlerThreadC0446s handlerThreadC0446s) {
        return handlerThreadC0446s.f1441g;
    }

    /* renamed from: a */
    public final void m1019a(C0440m[] c0440mArr) {
        if (this.f1435a == null) {
            return;
        }
        this.f1435a.post(new RunnableC0447t(this, c0440mArr));
    }

    @Override // android.os.HandlerThread
    protected final void onLooperPrepared() {
        this.f1435a = new Handler();
    }
}
