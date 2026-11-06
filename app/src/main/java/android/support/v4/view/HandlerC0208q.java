package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.q */
/* loaded from: classes.dex */
final class HandlerC0208q extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0207p f549a;

    HandlerC0208q(C0207p c0207p) {
        this.f549a = c0207p;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                C0207p.m486b(this.f549a).onShowPress(C0207p.m485a(this.f549a));
                return;
            case 2:
                C0207p.m487c(this.f549a);
                return;
            case 3:
                if (C0207p.m488d(this.f549a) != null) {
                    if (!C0207p.m489e(this.f549a)) {
                        C0207p.m488d(this.f549a).onSingleTapConfirmed(C0207p.m485a(this.f549a));
                        return;
                    } else {
                        C0207p.m490f(this.f549a);
                        return;
                    }
                }
                return;
            default:
                throw new RuntimeException("Unknown message " + message);
        }
    }
}
