package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0088x();

    /* renamed from: a */
    final String f75a;

    /* renamed from: b */
    final int f76b;

    /* renamed from: c */
    final boolean f77c;

    /* renamed from: d */
    final int f78d;

    /* renamed from: e */
    final int f79e;

    /* renamed from: f */
    final String f80f;

    /* renamed from: g */
    final boolean f81g;

    /* renamed from: h */
    final boolean f82h;

    /* renamed from: i */
    final Bundle f83i;

    /* renamed from: j */
    Bundle f84j;

    /* renamed from: k */
    Fragment f85k;

    public FragmentState(Fragment fragment) {
        this.f75a = fragment.getClass().getName();
        this.f76b = fragment.f60p;
        this.f77c = fragment.f69y;
        this.f78d = fragment.f26G;
        this.f79e = fragment.f27H;
        this.f80f = fragment.f28I;
        this.f81g = fragment.f31L;
        this.f82h = fragment.f30K;
        this.f83i = fragment.f62r;
    }

    public FragmentState(Parcel parcel) {
        this.f75a = parcel.readString();
        this.f76b = parcel.readInt();
        this.f77c = parcel.readInt() != 0;
        this.f78d = parcel.readInt();
        this.f79e = parcel.readInt();
        this.f80f = parcel.readString();
        this.f81g = parcel.readInt() != 0;
        this.f82h = parcel.readInt() != 0;
        this.f83i = parcel.readBundle();
        this.f84j = parcel.readBundle();
    }

    /* renamed from: a */
    public final Fragment m68a(ActivityC0076l activityC0076l, Fragment fragment) {
        if (this.f85k != null) {
            return this.f85k;
        }
        if (this.f83i != null) {
            this.f83i.setClassLoader(activityC0076l.getClassLoader());
        }
        this.f85k = Fragment.m3a(activityC0076l, this.f75a, this.f83i);
        if (this.f84j != null) {
            this.f84j.setClassLoader(activityC0076l.getClassLoader());
            this.f85k.f58n = this.f84j;
        }
        this.f85k.m27a(this.f76b, fragment);
        this.f85k.f69y = this.f77c;
        this.f85k.f20A = true;
        this.f85k.f26G = this.f78d;
        this.f85k.f27H = this.f79e;
        this.f85k.f28I = this.f80f;
        this.f85k.f31L = this.f81g;
        this.f85k.f30K = this.f82h;
        this.f85k.f22C = activityC0076l.f274b;
        if (LayoutInflaterFactoryC0082r.f296a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f85k);
        }
        return this.f85k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f75a);
        parcel.writeInt(this.f76b);
        parcel.writeInt(this.f77c ? 1 : 0);
        parcel.writeInt(this.f78d);
        parcel.writeInt(this.f79e);
        parcel.writeString(this.f80f);
        parcel.writeInt(this.f81g ? 1 : 0);
        parcel.writeInt(this.f82h ? 1 : 0);
        parcel.writeBundle(this.f83i);
        parcel.writeBundle(this.f84j);
    }
}
