package com.p004a.p012b.p016b.p017a;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: DontLook */
/* renamed from: com.a.b.b.a.e */
/* loaded from: classes.dex */
final class C0460e implements InterfaceC0458c {

    /* renamed from: a */
    private IBinder f1488a;

    C0460e(IBinder iBinder) {
        this.f1488a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1488a;
    }

    @Override // com.p004a.p012b.p016b.p017a.InterfaceC0458c
    /* renamed from: a */
    public final void mo1059a(int i, String str, String str2) throws android.os.RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f1488a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
