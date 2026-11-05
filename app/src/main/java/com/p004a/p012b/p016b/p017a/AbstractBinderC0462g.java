package com.p004a.p012b.p016b.p017a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.a.b.b.a.g */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0462g extends Binder implements InterfaceC0461f {
    /* renamed from: a */
    public static InterfaceC0461f m1061a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC0461f)) {
            return (InterfaceC0461f) iInterfaceQueryLocalInterface;
        }
        return new C0463h(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws android.os.RemoteException {
        InterfaceC0458c c0460e;
        switch (i) {
            case TwitterResponse.READ /* 1 */:
                parcel.enforceInterface("com.android.vending.licensing.ILicensingService");
                long j = parcel.readLong();
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c0460e = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
                    c0460e = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0458c)) ? new C0460e(strongBinder) : (InterfaceC0458c) iInterfaceQueryLocalInterface;
                }
                mo1060a(j, string, c0460e);
                return true;
            case 1598968902:
                parcel2.writeString("com.android.vending.licensing.ILicensingService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
