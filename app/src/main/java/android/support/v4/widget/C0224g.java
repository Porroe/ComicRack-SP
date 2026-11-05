package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.DrawerLayout;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.g */
/* loaded from: classes.dex */
final class C0224g implements Parcelable.Creator {
    C0224g() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DrawerLayout.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DrawerLayout.SavedState[i];
    }
}
