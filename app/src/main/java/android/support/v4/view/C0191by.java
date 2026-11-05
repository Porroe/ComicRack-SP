package android.support.v4.view;

import android.content.res.Resources;
import android.database.DataSetObserver;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.by */
/* loaded from: classes.dex */
final class C0191by extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ViewPager f517a;

    private C0191by(ViewPager viewPager) {
        this.f517a = viewPager;
    }

    /* synthetic */ C0191by(ViewPager viewPager, byte b) {
        this(viewPager);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() throws Resources.NotFoundException {
        this.f517a.m324a();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() throws Resources.NotFoundException {
        this.f517a.m324a();
    }
}
