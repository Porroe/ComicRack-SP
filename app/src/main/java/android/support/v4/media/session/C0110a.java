package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* compiled from: DontLook */
/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes.dex */
final class C0110a implements Parcelable.Creator {
    C0110a() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.Token(parcel.readParcelable(null));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaSessionCompat.Token[i];
    }
}
