package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0071g();

    /* renamed from: a */
    final int[] f7a;

    /* renamed from: b */
    final int f8b;

    /* renamed from: c */
    final int f9c;

    /* renamed from: d */
    final String f10d;

    /* renamed from: e */
    final int f11e;

    /* renamed from: f */
    final int f12f;

    /* renamed from: g */
    final CharSequence f13g;

    /* renamed from: h */
    final int f14h;

    /* renamed from: i */
    final CharSequence f15i;

    /* renamed from: j */
    final ArrayList f16j;

    /* renamed from: k */
    final ArrayList f17k;

    public BackStackState(RunnableC0002a runnableC0002a) {
        int size = 0;
        for (C0069e c0069e = runnableC0002a.f95b; c0069e != null; c0069e = c0069e.f249a) {
            if (c0069e.f257i != null) {
                size += c0069e.f257i.size();
            }
        }
        this.f7a = new int[size + (runnableC0002a.f97d * 7)];
        if (!runnableC0002a.f104k) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (C0069e c0069e2 = runnableC0002a.f95b; c0069e2 != null; c0069e2 = c0069e2.f249a) {
            int i2 = i + 1;
            this.f7a[i] = c0069e2.f251c;
            int i3 = i2 + 1;
            this.f7a[i2] = c0069e2.f252d != null ? c0069e2.f252d.f60p : -1;
            int i4 = i3 + 1;
            this.f7a[i3] = c0069e2.f253e;
            int i5 = i4 + 1;
            this.f7a[i4] = c0069e2.f254f;
            int i6 = i5 + 1;
            this.f7a[i5] = c0069e2.f255g;
            int i7 = i6 + 1;
            this.f7a[i6] = c0069e2.f256h;
            if (c0069e2.f257i != null) {
                int size2 = c0069e2.f257i.size();
                int i8 = i7 + 1;
                this.f7a[i7] = size2;
                int i9 = 0;
                while (i9 < size2) {
                    this.f7a[i8] = ((Fragment) c0069e2.f257i.get(i9)).f60p;
                    i9++;
                    i8++;
                }
                i = i8;
            } else {
                i = i7 + 1;
                this.f7a[i7] = 0;
            }
        }
        this.f8b = runnableC0002a.f102i;
        this.f9c = runnableC0002a.f103j;
        this.f10d = runnableC0002a.f106m;
        this.f11e = runnableC0002a.f108o;
        this.f12f = runnableC0002a.f109p;
        this.f13g = runnableC0002a.f110q;
        this.f14h = runnableC0002a.f111r;
        this.f15i = runnableC0002a.f112s;
        this.f16j = runnableC0002a.f113t;
        this.f17k = runnableC0002a.f114u;
    }

    public BackStackState(Parcel parcel) {
        this.f7a = parcel.createIntArray();
        this.f8b = parcel.readInt();
        this.f9c = parcel.readInt();
        this.f10d = parcel.readString();
        this.f11e = parcel.readInt();
        this.f12f = parcel.readInt();
        this.f13g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14h = parcel.readInt();
        this.f15i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f16j = parcel.createStringArrayList();
        this.f17k = parcel.createStringArrayList();
    }

    /* renamed from: a */
    public final RunnableC0002a m1a(LayoutInflaterFactoryC0082r layoutInflaterFactoryC0082r) {
        RunnableC0002a runnableC0002a = new RunnableC0002a(layoutInflaterFactoryC0082r);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f7a.length) {
            C0069e c0069e = new C0069e();
            int i3 = i2 + 1;
            c0069e.f251c = this.f7a[i2];
            if (LayoutInflaterFactoryC0082r.f296a) {
                Log.v("FragmentManager", "Instantiate " + runnableC0002a + " op #" + i + " base fragment #" + this.f7a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f7a[i3];
            if (i5 >= 0) {
                c0069e.f252d = (Fragment) layoutInflaterFactoryC0082r.f302f.get(i5);
            } else {
                c0069e.f252d = null;
            }
            int i6 = i4 + 1;
            c0069e.f253e = this.f7a[i4];
            int i7 = i6 + 1;
            c0069e.f254f = this.f7a[i6];
            int i8 = i7 + 1;
            c0069e.f255g = this.f7a[i7];
            int i9 = i8 + 1;
            c0069e.f256h = this.f7a[i8];
            int i10 = i9 + 1;
            int i11 = this.f7a[i9];
            if (i11 > 0) {
                c0069e.f257i = new ArrayList(i11);
                int i12 = 0;
                while (i12 < i11) {
                    if (LayoutInflaterFactoryC0082r.f296a) {
                        Log.v("FragmentManager", "Instantiate " + runnableC0002a + " set remove fragment #" + this.f7a[i10]);
                    }
                    c0069e.f257i.add((Fragment) layoutInflaterFactoryC0082r.f302f.get(this.f7a[i10]));
                    i12++;
                    i10++;
                }
            }
            runnableC0002a.m96a(c0069e);
            i++;
            i2 = i10;
        }
        runnableC0002a.f102i = this.f8b;
        runnableC0002a.f103j = this.f9c;
        runnableC0002a.f106m = this.f10d;
        runnableC0002a.f108o = this.f11e;
        runnableC0002a.f104k = true;
        runnableC0002a.f109p = this.f12f;
        runnableC0002a.f110q = this.f13g;
        runnableC0002a.f111r = this.f14h;
        runnableC0002a.f112s = this.f15i;
        runnableC0002a.f113t = this.f16j;
        runnableC0002a.f114u = this.f17k;
        runnableC0002a.m95a(1);
        return runnableC0002a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f7a);
        parcel.writeInt(this.f8b);
        parcel.writeInt(this.f9c);
        parcel.writeString(this.f10d);
        parcel.writeInt(this.f11e);
        parcel.writeInt(this.f12f);
        TextUtils.writeToParcel(this.f13g, parcel, 0);
        parcel.writeInt(this.f14h);
        TextUtils.writeToParcel(this.f15i, parcel, 0);
        parcel.writeStringList(this.f16j);
        parcel.writeStringList(this.f17k);
    }
}
