package com.cyo.comicrack.viewer;

import android.content.Intent;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.de */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0735de implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AbstractC0734dd f2298a;

    ViewOnClickListenerC0735de(AbstractC0734dd abstractC0734dd) {
        this.f2298a = abstractC0734dd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", AbstractC0734dd.m1757a(this.f2298a));
        this.f2298a.setResult(-1, intent);
        this.f2298a.finish();
    }
}
