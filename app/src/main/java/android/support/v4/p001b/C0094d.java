package android.support.v4.p001b;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DontLook */
/* renamed from: android.support.v4.b.d */
/* loaded from: classes.dex */
public final class C0094d implements Parcelable.ClassLoaderCreator {

    /* renamed from: a */
    private final InterfaceC0093c f335a;

    public C0094d(InterfaceC0093c interfaceC0093c) {
        this.f335a = interfaceC0093c;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return this.f335a.mo256a(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f335a.mo256a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return this.f335a.mo257a(i);
    }
}
