package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0109b();

    /* renamed from: a */
    private final int f372a;

    /* renamed from: b */
    private final float f373b;

    /* synthetic */ RatingCompat(int i, float f, byte b) {
        this(i, f);
    }

    private RatingCompat(int i, float f) {
        this.f372a = i;
        this.f373b = f;
    }

    public final String toString() {
        return "Rating:style=" + this.f372a + " rating=" + (this.f373b < 0.0f ? "unrated" : String.valueOf(this.f373b));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f372a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f372a);
        parcel.writeFloat(this.f373b);
    }
}
