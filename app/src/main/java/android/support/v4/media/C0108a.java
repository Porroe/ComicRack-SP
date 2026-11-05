package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DontLook */
/* renamed from: android.support.v4.media.a */
/* loaded from: classes.dex */
final class C0108a implements Parcelable.Creator {
    C0108a() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MediaMetadataCompat(parcel, (byte) 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaMetadataCompat[i];
    }
}
