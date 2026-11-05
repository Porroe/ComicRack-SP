package android.support.v4.view;

import android.content.res.Resources;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.ah */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0147ah implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PagerTabStrip f477a;

    ViewOnClickListenerC0147ah(PagerTabStrip pagerTabStrip) {
        this.f477a = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        this.f477a.f481a.setCurrentItem(this.f477a.f481a.getCurrentItem() + 1);
    }
}
