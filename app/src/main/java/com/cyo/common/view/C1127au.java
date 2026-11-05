package com.cyo.common.view;

import android.view.View;
import android.widget.AdapterView;
import java.io.File;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.au */
/* loaded from: classes.dex */
final class C1127au implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C1120an f3592a;

    C1127au(C1120an c1120an) {
        this.f3592a = c1120an;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        File file = (File) adapterView.getItemAtPosition(i);
        if (file == null) {
            this.f3592a.m2407a(this.f3592a.f3576e.getParent());
        } else if (file.isDirectory()) {
            this.f3592a.m2407a(file.getAbsolutePath());
        }
    }
}
