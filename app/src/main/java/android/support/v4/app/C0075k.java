package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.k */
/* loaded from: classes.dex */
final class C0075k implements Parcelable.Creator {
    C0075k() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Fragment.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Fragment.SavedState[i];
    }
}
