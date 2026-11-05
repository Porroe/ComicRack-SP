package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p002c.C0095a;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    /* renamed from: a */
    private static final C0095a f370a;

    /* renamed from: b */
    private final Bundle f371b;

    /* synthetic */ MediaMetadataCompat(Parcel parcel, byte b) {
        this(parcel);
    }

    static {
        C0095a c0095a = new C0095a();
        f370a = c0095a;
        c0095a.put("android.media.metadata.TITLE", 1);
        f370a.put("android.media.metadata.ARTIST", 1);
        f370a.put("android.media.metadata.DURATION", 0);
        f370a.put("android.media.metadata.ALBUM", 1);
        f370a.put("android.media.metadata.AUTHOR", 1);
        f370a.put("android.media.metadata.WRITER", 1);
        f370a.put("android.media.metadata.COMPOSER", 1);
        f370a.put("android.media.metadata.COMPILATION", 1);
        f370a.put("android.media.metadata.DATE", 1);
        f370a.put("android.media.metadata.YEAR", 0);
        f370a.put("android.media.metadata.GENRE", 1);
        f370a.put("android.media.metadata.TRACK_NUMBER", 0);
        f370a.put("android.media.metadata.NUM_TRACKS", 0);
        f370a.put("android.media.metadata.DISC_NUMBER", 0);
        f370a.put("android.media.metadata.ALBUM_ARTIST", 1);
        f370a.put("android.media.metadata.ART", 2);
        f370a.put("android.media.metadata.ART_URI", 1);
        f370a.put("android.media.metadata.ALBUM_ART", 2);
        f370a.put("android.media.metadata.ALBUM_ART_URI", 1);
        f370a.put("android.media.metadata.USER_RATING", 3);
        f370a.put("android.media.metadata.RATING", 3);
        f370a.put("android.media.metadata.DISPLAY_TITLE", 1);
        f370a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f370a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f370a.put("android.media.metadata.DISPLAY_ICON", 2);
        f370a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        CREATOR = new C0108a();
    }

    private MediaMetadataCompat(Parcel parcel) {
        this.f371b = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f371b);
    }
}
