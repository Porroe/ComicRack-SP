package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.w */
/* loaded from: classes.dex */
final class C0087w implements Parcelable.Creator {
    C0087w() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}
