package android.support.v4.view;

import android.content.res.Resources;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.ag */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0146ag implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PagerTabStrip f476a;

    ViewOnClickListenerC0146ag(PagerTabStrip pagerTabStrip) {
        this.f476a = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        this.f476a.f481a.setCurrentItem(this.f476a.f481a.getCurrentItem() - 1);
    }
}
