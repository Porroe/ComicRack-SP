package android.support.v4.app;

import android.os.Handler;
import android.os.Message;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.m */
/* loaded from: classes.dex */
final class HandlerC0077m extends Handler {

    /* renamed from: a */
    final /* synthetic */ ActivityC0076l f286a;

    HandlerC0077m(ActivityC0076l activityC0076l) {
        this.f286a = activityC0076l;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case TwitterResponse.READ /* 1 */:
                if (this.f286a.f278f) {
                    this.f286a.m184a(false);
                    break;
                }
                break;
            case TwitterResponse.READ_WRITE /* 2 */:
                this.f286a.m182a();
                this.f286a.f274b.m232d();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
