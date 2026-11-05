package com.p004a.p005a;

import android.app.Activity;
import android.os.Handler;
import com.p004a.p005a.p011e.C0370g;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.a.a.be */
/* loaded from: classes.dex */
final class RunnableC0316be implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0312ba f894a;

    /* renamed from: b */
    final /* synthetic */ C0357e f895b;

    /* renamed from: c */
    final /* synthetic */ C0315bd f896c;

    RunnableC0316be(C0315bd c0315bd, C0312ba c0312ba, C0357e c0357e) {
        this.f896c = c0315bd;
        this.f894a = c0312ba;
        this.f895b = c0357e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0315bd c0315bd = this.f896c;
        C0312ba c0312ba = this.f894a;
        C0357e c0357e = this.f895b;
        synchronized (c0315bd.f889c) {
            C0370g.m903a(Thread.currentThread(), c0315bd.f888b);
        }
        List listM812f = c0312ba.m812f();
        long jM808b = c0312ba.m807a() ? c0312ba.m808b() : 10000L;
        Iterator it = listM812f.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                ((Handler) C0330bs.m837a().f946c.m898a()).post(new RunnableC0317bf(c0315bd, c0312ba));
                break;
            }
            C0397m c0397m = (C0397m) it.next();
            C0372i.m911a("Looking to fetch ads from network: " + c0397m.f1108b);
            List<String> list = c0397m.f1109c;
            HashMap map = c0397m.f1111e;
            List listM813g = c0397m.f1110d;
            String str = c0397m.f1107a;
            String str2 = c0397m.f1108b;
            String strM809c = c0312ba.m809c();
            if (listM813g == null) {
                listM813g = c0312ba.m813g();
            }
            C0319bh c0319bh = new C0319bh(str, str2, strM809c, listM813g, c0312ba.m814h(), c0312ba.m815i());
            for (String str3 : list) {
                Activity activity = (Activity) c0315bd.f887a.m783h().f964c.m901a();
                if (activity == null) {
                    C0372i.m911a("Activity is null while mediating.  Terminating mediation thread.");
                    break loop0;
                }
                c0315bd.f887a.m788m().m662c();
                if (!c0315bd.m821a(str3, activity, c0357e, c0319bh, map, jM808b)) {
                    if (c0315bd.m819a()) {
                        C0372i.m911a("GWController.destroy() called. Terminating mediation thread.");
                        break loop0;
                    }
                } else {
                    break loop0;
                }
            }
        }
        synchronized (this.f896c.f889c) {
            this.f896c.f888b = null;
        }
    }
}
