package android.support.v4.p001b;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DontLook */
/* renamed from: android.support.v4.b.b */
/* loaded from: classes.dex */
public final class C0092b implements Parcelable.Creator {

    /* renamed from: a */
    final InterfaceC0093c f334a;

    public C0092b(InterfaceC0093c interfaceC0093c) {
        this.f334a = interfaceC0093c;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return this.f334a.mo256a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return this.f334a.mo257a(i);
    }
}
