package android.support.v4.view;

import android.content.res.Resources;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.bq */
/* loaded from: classes.dex */
final class RunnableC0183bq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ViewPager f504a;

    RunnableC0183bq(ViewPager viewPager) {
        this.f504a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        ViewPager.m304a(this.f504a);
        this.f504a.m326b();
    }
}
