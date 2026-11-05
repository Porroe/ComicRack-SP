package com.cyo.comicrack.viewer;

import android.view.View;
import android.widget.AdapterView;
import com.cyo.comicrack.p019a.p020a.C0537ce;
import com.cyo.comicrack.p019a.p021b.C0622x;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.hl */
/* loaded from: classes.dex */
final class C0850hl implements AdapterView.OnItemLongClickListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2565a;

    C0850hl(ReaderActivity readerActivity) {
        this.f2565a = readerActivity;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f2565a.m1634n()) {
            i = (adapterView.getCount() - 1) - i;
        }
        ReaderActivity readerActivity = this.f2565a;
        ReaderActivity.m960a("Reader", "Thumbnail", "LongTouch", i);
        float fM1601h = ReaderActivity.m1601h(this.f2565a) - view.getLeft();
        C0622x c0622xM1339g = ReaderActivity.m1596f(this.f2565a).m1339g(i);
        float width = fM1601h / view.getWidth();
        C0537ce c0537ce = c0622xM1339g.f1856c == null ? c0622xM1339g.f1857d : c0622xM1339g.f1856c;
        C0537ce c0537ce2 = c0622xM1339g.f1857d == null ? c0622xM1339g.f1856c : c0622xM1339g.f1857d;
        if (c0537ce == null) {
            c0537ce = c0537ce2;
        } else if (c0537ce2 != null && c0622xM1339g.f1859f * width > c0537ce.f1669g) {
            c0537ce = c0537ce2;
        }
        ReaderActivity.m1559a(this.f2565a, ReaderActivity.m1602i(this.f2565a), EnumC0861hw.LongTouch, c0537ce);
        return true;
    }
}
