package com.cyo.comicrack.viewer;

import android.view.View;
import com.cyo.comicrack.p019a.p020a.C0537ce;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.m */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0898m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0896k f2716a;

    /* renamed from: b */
    private final /* synthetic */ ActivityC0881ip f2717b;

    ViewOnClickListenerC0898m(C0896k c0896k, ActivityC0881ip activityC0881ip) {
        this.f2716a = c0896k;
        this.f2717b = activityC0881ip;
    }

    /* renamed from: a */
    static /* synthetic */ C0896k m1895a(ViewOnClickListenerC0898m viewOnClickListenerC0898m) {
        return viewOnClickListenerC0898m.f2716a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean zM1885a = C0896k.m1885a(this.f2716a, C0896k.m1891d(this.f2716a));
        C0537ce c0537ceE = C0896k.m1886b(this.f2716a).m1174e(C0896k.m1891d(this.f2716a));
        if (zM1885a) {
            c0537ceE.f1667e = null;
            C0896k.m1886b(this.f2716a).f1580l = true;
            C0896k.m1886b(this.f2716a).f1588t = true;
            ActivityC0881ip activityC0881ip = this.f2717b;
            ActivityC0881ip.m960a(C0896k.m1882a(), C0896k.m1887b(), null, 0);
            C0896k.m1893e(this.f2716a);
            C0896k.m1890c(this.f2716a);
            return;
        }
        new AlertDialogBuilderC0899n(this, this.f2717b, C0806fv.add_bookmark, this.f2717b.getString(C0806fv.name_of_the_page_d_bookmark, new Object[]{Integer.valueOf(C0896k.m1891d(this.f2716a) + 1)}), this.f2717b.getString(C0806fv.page_d, new Object[]{Integer.valueOf(C0896k.m1891d(this.f2716a) + 1)}), this.f2717b, c0537ceE).show();
    }
}
