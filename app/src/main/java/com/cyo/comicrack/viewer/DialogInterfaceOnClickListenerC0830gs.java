package com.cyo.comicrack.viewer;

import android.content.DialogInterface;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gs */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0830gs implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2531a;

    /* renamed from: b */
    private final /* synthetic */ List f2532b;

    DialogInterfaceOnClickListenerC0830gs(ReaderActivity readerActivity, List list) {
        this.f2531a = readerActivity;
        this.f2532b = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        EnumC0863hy enumC0863hyValueOf = EnumC0863hy.valueOf((String) this.f2532b.get(i));
        if (enumC0863hyValueOf != ReaderActivity.m1609p(this.f2531a)) {
            ReaderActivity.m1560a(this.f2531a, enumC0863hyValueOf);
            ReaderActivity.m1610q(this.f2531a);
        }
        dialogInterface.dismiss();
    }
}
