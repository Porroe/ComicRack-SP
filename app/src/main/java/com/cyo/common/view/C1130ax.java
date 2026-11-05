package com.cyo.common.view;

import android.view.MenuItem;
import android.widget.PopupMenu;
import java.io.File;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.ax */
/* loaded from: classes.dex */
final class C1130ax implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnClickListenerC1129aw f3597a;

    /* renamed from: b */
    private final /* synthetic */ File[] f3598b;

    C1130ax(ViewOnClickListenerC1129aw viewOnClickListenerC1129aw, File[] fileArr) {
        this.f3597a = viewOnClickListenerC1129aw;
        this.f3598b = fileArr;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case TwitterResponse.NONE /* 0 */:
                ViewOnClickListenerC1129aw.m2410a(this.f3597a).m2407a(ViewOnClickListenerC1129aw.m2410a(this.f3597a).f3574c);
                break;
            case TwitterResponse.READ /* 1 */:
                ViewOnClickListenerC1129aw.m2410a(this.f3597a).m2407a(ViewOnClickListenerC1129aw.m2410a(this.f3597a).f3575d);
                break;
            default:
                ViewOnClickListenerC1129aw.m2410a(this.f3597a).m2407a(this.f3598b[menuItem.getItemId() - 2].getAbsolutePath());
                break;
        }
        return true;
    }
}
