package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class MediaSessionCompat {

    /* compiled from: DontLook */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0110a();

        /* renamed from: a */
        private final Parcelable f374a;

        Token(Parcelable parcelable) {
            this.f374a = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return this.f374a.describeContents();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f374a, i);
        }
    }
}
