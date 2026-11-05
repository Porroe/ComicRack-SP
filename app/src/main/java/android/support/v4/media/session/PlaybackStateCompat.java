package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0111b();

    /* renamed from: a */
    private final int f375a;

    /* renamed from: b */
    private final long f376b;

    /* renamed from: c */
    private final long f377c;

    /* renamed from: d */
    private final float f378d;

    /* renamed from: e */
    private final long f379e;

    /* renamed from: f */
    private final CharSequence f380f;

    /* renamed from: g */
    private final long f381g;

    /* synthetic */ PlaybackStateCompat(Parcel parcel, byte b) {
        this(parcel);
    }

    private PlaybackStateCompat(Parcel parcel) {
        this.f375a = parcel.readInt();
        this.f376b = parcel.readLong();
        this.f378d = parcel.readFloat();
        this.f381g = parcel.readLong();
        this.f377c = parcel.readLong();
        this.f379e = parcel.readLong();
        this.f380f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=").append(this.f375a);
        sb.append(", position=").append(this.f376b);
        sb.append(", buffered position=").append(this.f377c);
        sb.append(", speed=").append(this.f378d);
        sb.append(", updated=").append(this.f381g);
        sb.append(", actions=").append(this.f379e);
        sb.append(", error=").append(this.f380f);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f375a);
        parcel.writeLong(this.f376b);
        parcel.writeFloat(this.f378d);
        parcel.writeLong(this.f381g);
        parcel.writeLong(this.f377c);
        parcel.writeLong(this.f379e);
        TextUtils.writeToParcel(this.f380f, parcel, i);
    }
}
