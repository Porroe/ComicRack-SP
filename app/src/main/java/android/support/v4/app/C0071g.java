package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.g */
/* loaded from: classes.dex */
final class C0071g implements Parcelable.Creator {
    C0071g() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BackStackState[i];
    }
}
