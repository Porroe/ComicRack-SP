package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.ca */
/* loaded from: classes.dex */
final class C0194ca implements Comparator {
    C0194ca() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C0186bt c0186bt = (C0186bt) ((View) obj).getLayoutParams();
        C0186bt c0186bt2 = (C0186bt) ((View) obj2).getLayoutParams();
        return c0186bt.f510a != c0186bt2.f510a ? c0186bt.f510a ? 1 : -1 : c0186bt.f514e - c0186bt2.f514e;
    }
}
