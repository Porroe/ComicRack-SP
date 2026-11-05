package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.p001b.InterfaceC0093c;
import android.support.v4.view.ViewPager;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.bz */
/* loaded from: classes.dex */
final class C0192bz implements InterfaceC0093c {
    C0192bz() {
    }

    @Override // android.support.v4.p001b.InterfaceC0093c
    /* renamed from: a */
    public final /* synthetic */ Object mo256a(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager.SavedState(parcel, classLoader);
    }

    @Override // android.support.v4.p001b.InterfaceC0093c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object[] mo257a(int i) {
        return new ViewPager.SavedState[i];
    }
}
