package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0087w();

    /* renamed from: a */
    FragmentState[] f72a;

    /* renamed from: b */
    int[] f73b;

    /* renamed from: c */
    BackStackState[] f74c;

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f72a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f73b = parcel.createIntArray();
        this.f74c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f72a, i);
        parcel.writeIntArray(this.f73b);
        parcel.writeTypedArray(this.f74c, i);
    }
}
