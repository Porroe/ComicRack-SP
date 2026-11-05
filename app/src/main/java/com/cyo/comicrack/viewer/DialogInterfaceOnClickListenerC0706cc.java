package com.cyo.comicrack.viewer;

import android.content.DialogInterface;
import android.widget.Toast;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.comicrack.p019a.p020a.C0505b;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cc */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0706cc implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0681be f2227a;

    /* renamed from: b */
    private final /* synthetic */ List f2228b;

    DialogInterfaceOnClickListenerC0706cc(C0681be c0681be, List list) {
        this.f2227a = c0681be;
        this.f2228b = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0575ak c0575akAb = this.f2227a.m1836ab();
        boolean z = false;
        for (Object valueForc0572ah : this.f2228b) {
            C0572ah c0572ah = (C0572ah) valueForc0572ah;
            boolean z2 = true;
            boolean z3 = z;
            for (Object valueForc0505b : c0572ah.m1231t()) {
                C0505b c0505b = (C0505b) valueForc0505b;
                if (C0628f.m1359a(c0505b)) {
                    ComicRackApplication.f1954i.m1438c().m1396a(c0505b);
                } else {
                    z2 = false;
                    z3 = true;
                }
            }
            if (z2) {
                c0575akAb.m1982c(c0572ah);
            }
            z = z3;
        }
        if (z) {
            Toast.makeText(this.f2227a.m55i(), C0806fv.failed_to_delete_ecomics, 1).show();
        }
        C0725cv c0725cvM1715R = this.f2227a.m1715R();
        if (c0725cvM1715R.f2268b > 0 && c0575akAb.m1987y() > 0) {
            c0725cvM1715R.f2269c[c0725cvM1715R.f2268b - 1].f2275a = ((InterfaceC0571ag) c0575akAb.m1983d(0)).mo1208c();
        }
        this.f2227a.m1833Z();
    }
}
