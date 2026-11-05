package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DontLook */
/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
final class C0111b implements Parcelable.Creator {
    C0111b() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat(parcel, (byte) 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaybackStateCompat[i];
    }
}
