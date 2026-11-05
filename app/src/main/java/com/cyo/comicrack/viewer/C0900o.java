package com.cyo.comicrack.viewer;

import android.view.View;
import android.widget.AdapterView;
import com.cyo.comicrack.p019a.p020a.C0478a;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.o */
/* loaded from: classes.dex */
final class C0900o implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C0896k f2721a;

    C0900o(C0896k c0896k) {
        this.f2721a = c0896k;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0896k.m1888b(this.f2721a, ((C0478a) C0896k.m1883a(this.f2721a).get(i)).f1535a);
    }
}
