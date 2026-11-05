package com.p004a.p012b.p016b.p017a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.a.b.b.a.d */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0459d extends Binder implements InterfaceC0458c {
    public AbstractBinderC0459d() {
        attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case TwitterResponse.READ /* 1 */:
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                mo1059a(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            case 1598968902:
                parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
