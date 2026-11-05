package com.cyo.comicrack.viewer;

import android.content.DialogInterface;
import com.cyo.comicrack.p019a.p020a.C0537ce;
import com.cyo.comicrack.p019a.p020a.EnumC0539cg;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gt */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0831gt implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2533a;

    /* renamed from: b */
    private final /* synthetic */ List f2534b;

    /* renamed from: c */
    private final /* synthetic */ C0537ce f2535c;

    DialogInterfaceOnClickListenerC0831gt(ReaderActivity readerActivity, List list, C0537ce c0537ce) {
        this.f2533a = readerActivity;
        this.f2534b = list;
        this.f2535c = c0537ce;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        EnumC0539cg enumC0539cgValueOf = EnumC0539cg.valueOf((String) this.f2534b.get(i));
        if (enumC0539cgValueOf != this.f2535c.mo1193f()) {
            this.f2535c.mo1184a(enumC0539cgValueOf);
            ReaderActivity.m1596f(this.f2533a).mo1298a().f1583o = true;
            ReaderActivity.m1596f(this.f2533a).mo1298a().m1162A();
            ReaderActivity.m1596f(this.f2533a).mo1298a().f1588t = true;
            ReaderActivity.m1611r(this.f2533a);
        }
        dialogInterface.dismiss();
    }
}
