package com.cyo.comicrack.viewer;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hj */
/* loaded from: classes.dex */
final class C0848hj implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2563a;

    C0848hj(ReaderActivity readerActivity) {
        this.f2563a = readerActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ReaderActivity readerActivity = this.f2563a;
        ReaderActivity.m960a("Reader", "Thumbnail", "Click", i);
        if (ReaderActivity.m1596f(this.f2563a) != null) {
            try {
                if (this.f2563a.m1634n()) {
                    i = (adapterView.getCount() - 1) - i;
                }
                ReaderActivity.m1562a(this.f2563a, true);
                if (i != ReaderActivity.m1599g(this.f2563a)) {
                    ReaderActivity.m1574a(this.f2563a, i, true);
                }
            } finally {
                ReaderActivity.m1562a(this.f2563a, false);
            }
        }
    }
}
