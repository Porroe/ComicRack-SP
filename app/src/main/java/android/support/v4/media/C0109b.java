package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DontLook */
/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
final class C0109b implements Parcelable.Creator {
    C0109b() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat(), (byte) 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RatingCompat[i];
    }
}
